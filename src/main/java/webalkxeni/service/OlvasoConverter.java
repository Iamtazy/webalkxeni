package webalkxeni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import webalkxeni.model.Olvaso;

@Component
public class OlvasoConverter implements org.springframework.core.convert.converter.Converter<Integer, Olvaso> {

	@Autowired
	private OlvasoManager olvasoManager;
	
	@Override
	public Olvaso convert(Integer id) {
		Olvaso o = olvasoManager.getOlvaso(id);
		return o;
	}

}
