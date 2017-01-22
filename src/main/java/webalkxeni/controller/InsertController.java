package webalkxeni.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import webalkxeni.model.Konyv;
import webalkxeni.model.Olvaso;
import webalkxeni.persist.KonyvRepository;
import webalkxeni.service.KonyvManager;
import webalkxeni.service.OlvasoManager;

@Controller
public class InsertController {
	
	@Autowired
	private KonyvManager konyvManager;
	@Autowired
	private OlvasoManager olvasoManager;
	
	@RequestMapping("/konyvForm")
	public String konyvForm(@RequestParam(required=false) Integer id, @ModelAttribute("konyv") Konyv konyv) {
		if (id == null) {
			konyv.setKkod(0);
			konyv.setCim("");
			konyv.setSzerzo("");
		} else {
			Konyv k = konyvManager.getKonyv(id);
			konyv.setKkod(k.getKkod());
			konyv.setCim(k.getCim());
			konyv.setSzerzo(k.getSzerzo());
		}
		return "konyvform";
	}
	
	@RequestMapping("/insertKonyv")
	public String insertKonyv(@Valid @ModelAttribute("konyv") Konyv k, BindingResult bindigRes) {
		if (bindigRes.hasErrors())
			return "konyvform";
		konyvManager.saveKonyv(k);	
		return "redirect:/konyv";
	}
	
	@RequestMapping("/olvasoForm")
	public String olvasoForm(@RequestParam(required=false) Integer id, @ModelAttribute("olvaso") Olvaso olvaso) {
		if (id == null) {
			olvaso.setOkod(0);
			olvaso.setLakcim("");
			olvaso.setNev("");
		} else {
			Olvaso tempOlvaso = olvasoManager.getOlvaso(id);
			olvaso.setOkod(tempOlvaso.getOkod());
			olvaso.setNev(tempOlvaso.getNev());
			olvaso.setLakcim(tempOlvaso.getLakcim());
		}
		return "olvasoform";
	}
	
	@RequestMapping("/insertOlvaso")
	public String insertKonyv(@Valid @ModelAttribute("olvaso") Olvaso o, BindingResult bindigRes) {
		if (bindigRes.hasErrors())
			return "olvasoform";
		olvasoManager.saveOlvaso(o);	
		return "redirect:/olvaso";
	}

}
