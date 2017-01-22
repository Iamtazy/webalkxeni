package webalkxeni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import webalkxeni.service.KonyvManager;
import webalkxeni.service.OlvasoManager;

@Controller
public class DeleteController {
	
	@Autowired
	private KonyvManager konyvManager;
	@Autowired
	private OlvasoManager olvasoManager;
	
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

}
