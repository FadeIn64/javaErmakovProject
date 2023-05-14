package su.fantasy.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import su.fantasy.models.Championship;

@Repository
public interface ChampionshipRepo extends CrudRepository<Championship, Integer> {
}
