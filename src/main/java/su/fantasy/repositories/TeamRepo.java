package su.fantasy.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import su.fantasy.models.Team;

@Repository
public interface TeamRepo extends CrudRepository<Team, Integer> {
}
