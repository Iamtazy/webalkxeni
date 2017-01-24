package webalkxeni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import webalkxeni.model.Konyv;

@Component
public class KonyvConverter implements org.springframework.core.convert.converter.Converter<Integer, Konyv> {

	@Autowired
	private KonyvManager konyvManager;
	
	@Override
	public Konyv convert(Integer id) {
		Konyv konyv = konyvManager.getKonyv(id);
		return konyv;
	}

}
