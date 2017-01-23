package webalkxeni.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webalkxeni.model.Kolcsonzes;
import webalkxeni.model.Konyv;
import webalkxeni.model.Olvaso;
import webalkxeni.persist.KolcsonzesRepository;
import webalkxeni.persist.KonyvRepository;
import webalkxeni.persist.OlvasoRepository;

@Service
public class KolcsonzesManager {
	
	@Autowired
	private KolcsonzesRepository kolcsonRepo;
	@Autowired
	private OlvasoRepository olvasoRepo;
	@Autowired
	private KonyvRepository konyvRepo;
	
	public Kolcsonzes saveKolcsonzes(Kolcsonzes kolcsonzes) {
		return this.kolcsonRepo.save(kolcsonzes);
	}
	
	public void deleteById(int id) {
		kolcsonRepo.delete(id);
	}
	
	public Kolcsonzes getKolcsonzes(int id) {
		return kolcsonRepo.findOne(id);
	}
	
	public List<Kolcsonzes> getAllKolcsonzes()
	{
		Iterable<Kolcsonzes> it = this.kolcsonRepo.findAll();
		List<Kolcsonzes> lista = new ArrayList<>();
		for(Kolcsonzes kolcson : it)
		{
			lista.add(kolcson);
		}
		return lista;
	}

}
