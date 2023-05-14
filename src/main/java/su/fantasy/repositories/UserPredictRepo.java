package su.fantasy.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import su.fantasy.models.RaceResult;

@Repository
public interface UserPredictRepo extends CrudRepository<RaceResult, Integer> {
}
