package webalkxeni.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import webalkxeni.model.Olvaso;

@Repository
public interface OlvasoRepository extends CrudRepository<Olvaso, Integer> {

}
