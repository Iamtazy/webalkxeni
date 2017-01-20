package webalkxeni.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webalkxeni.model.Konyv;
import webalkxeni.persist.KonyvRepository;

@Service
public class KonyvManager {
	
	@Autowired
	private KonyvRepository konyvRepo;
	
	public Konyv saveKonyv(Konyv konyv) {
		return this.konyvRepo.save(konyv);
	}
	
	public List<Konyv> getAllKonyv()
	{
		Iterable<Konyv> it = this.konyvRepo.findAll();
		List<Konyv> lista = new ArrayList<>();
		for(Konyv konyv : it)
		{
			lista.add(konyv);
		}
		return lista;
	}


}
