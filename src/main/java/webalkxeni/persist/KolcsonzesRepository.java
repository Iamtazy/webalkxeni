package webalkxeni.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import webalkxeni.model.Kolcsonzes;

@Repository
public interface KolcsonzesRepository extends CrudRepository<Kolcsonzes, Integer> {

}
