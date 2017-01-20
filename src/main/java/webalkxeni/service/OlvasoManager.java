package webalkxeni.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webalkxeni.model.Olvaso;
import webalkxeni.persist.OlvasoRepository;

@Service
public class OlvasoManager {
	
	@Autowired
	private OlvasoRepository olvasoRepo;
	
	public Olvaso saveOlvaso(Olvaso olvaso) {
		return this.olvasoRepo.save(olvaso);
	}
	
	public List<Olvaso> getAllOlvaso()
	{
		Iterable<Olvaso> it = this.olvasoRepo.findAll();
		List<Olvaso> lista = new ArrayList<>();
		for(Olvaso olvaso : it)
		{
			lista.add(olvaso);
		}
		return lista;
	}

}
