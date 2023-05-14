package su.fantasy.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import su.fantasy.models.UserPredictResult;

@Repository
public interface UserPredictResultRepo extends CrudRepository<UserPredictResult, Integer> {
}
