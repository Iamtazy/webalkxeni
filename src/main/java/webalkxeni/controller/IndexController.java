package webalkxeni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import webalkxeni.model.Kolcsonzes;
import webalkxeni.model.Konyv;
import webalkxeni.model.Olvaso;
import webalkxeni.service.KolcsonzesManager;
import webalkxeni.service.KonyvManager;
import webalkxeni.service.OlvasoManager;

@Controller
public class IndexController {
	
	@Autowired
	private KolcsonzesManager kolcsonManager;
	@Autowired
	private OlvasoManager olvasoManager;
	@Autowired
	private KonyvManager konyvManager;
	
	@RequestMapping(value={"", "/", "/index"})
	public String index() {
		return "index";
	}
	
	@RequestMapping("/kolcsonzes")
	public String kolcsonzesek(Model model) {
		List<Kolcsonzes> kolcsonzesek = kolcsonManager.getAllKolcsonzes();
		model.addAttribute("kolcsonzesek", kolcsonzesek);
		return "kolcsonzesek";
	}
	
	@RequestMapping("/olvaso")
	public String olvasok(Model model) {
		List<Olvaso> olvasok = olvasoManager.getAllOlvaso();
		model.addAttribute("olvasok", olvasok);
		return "olvasok";
	}
	
	@RequestMapping("/konyv")
	public String konyvek(Model model) {
		List<Konyv> konyvek = konyvManager.getAllKonyv();
		model.addAttribute("konyvek", konyvek);
		return "konyvek";
	}
	
}
