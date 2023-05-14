package su.fantasy.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import su.fantasy.models.Racer;

@Repository
public interface RacerRepo extends CrudRepository<Racer, Integer> {
}
