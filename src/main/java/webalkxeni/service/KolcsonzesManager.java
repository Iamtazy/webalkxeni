package webalkxeni.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webalkxeni.model.Kolcsonzes;
import webalkxeni.persist.KolcsonzesRepository;

@Service
public class KolcsonzesManager {
	
	@Autowired
	private KolcsonzesRepository kolcsonRepo;
	
	public Kolcsonzes saveKolcsonzes(Kolcsonzes kolcsonzes) {
		return this.kolcsonRepo.save(kolcsonzes);
	}
	
	public void deleteById(int id) {
		kolcsonRepo.delete(id);
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
