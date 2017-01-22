package webalkxeni.controller;

import java.util.Date;
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
public class MainController {
	
	@Autowired
	private KolcsonzesManager kolcsonManager;
	@Autowired
	private OlvasoManager olvasoManager;
	@Autowired
	private KonyvManager konyvManager;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/kolcsonzes")
	public String kolcsonzesek(Model model) {
		//kolcsonManager.saveKolcsonzes();
		List<Kolcsonzes> kolcsonzesek = kolcsonManager.getAllKolcsonzes();
		model.addAttribute("kolcsonzesek", kolcsonzesek);
		return "kolcsonzesek";
	}
	
	@RequestMapping("/olvaso")
	public String olvasok(Model model) {
		//olvasoManager.saveOlvaso();
		List<Olvaso> olvasok = olvasoManager.getAllOlvaso();
		model.addAttribute("olvasok", olvasok);
		return "olvasok";
	}
	
	@RequestMapping("/konyv")
	public String konyvek(Model model) {
		//konyvManager.saveKonyv(new Konyv(1, "asdasd", "qwerty"));
		List<Konyv> konyvek = konyvManager.getAllKonyv();
		model.addAttribute("konyvek", konyvek);
		return "konyvek";
	}
	
	/*@RequestMapping("/kolcsonzesDelete")
	public String kolcsonzesDelete(@ModelAttribute("kolcsonzes") Kolcsonzes kolcsonzes) {
		
	}*/
}
