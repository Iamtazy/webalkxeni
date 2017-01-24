package webalkxeni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import webalkxeni.service.KolcsonzesManager;
import webalkxeni.service.KonyvManager;
import webalkxeni.service.OlvasoManager;

@Controller
public class DeleteController {
	
	@Autowired
	private KonyvManager konyvManager;
	@Autowired
	private OlvasoManager olvasoManager;
	@Autowired
	private KolcsonzesManager kolcsonManager;
	
	@RequestMapping("/konyvDelete")
	public String konyvDelete(@RequestParam(required=true) Integer id) {
		konyvManager.deleteKonyv(id);
		return "redirect:/konyv";
	}
	
	@RequestMapping("/olvasoDelete")
	public String olvasoDelete(@RequestParam(required=true) Integer id){
		olvasoManager.deleteOlvaso(id);
		return "redirect:/olvaso";
	}
	
	@RequestMapping("/kolcsonzesDelete")
	public String kolcsonzesDelete(@RequestParam(required=true) Integer id){
		kolcsonManager.deleteById(id);
		return "redirect:/kolcsonzes";
	}

}
