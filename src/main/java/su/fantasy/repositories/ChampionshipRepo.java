package su.fantasy.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import su.fantasy.models.Championship;

import java.util.List;

@Repository
public interface ChampionshipRepo extends CrudRepository<Championship, Integer> {

    List<Championship> findAll();

}
