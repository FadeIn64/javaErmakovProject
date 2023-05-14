package su.fantasy.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import su.fantasy.models.Race;

import java.util.List;

@Repository
public interface RaceRepo extends CrudRepository<Race, Integer> {

    List<Race> findAll();
}
