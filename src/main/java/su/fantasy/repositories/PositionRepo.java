package su.fantasy.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import su.fantasy.models.Position;

@Repository
public interface PositionRepo extends CrudRepository<Position, Integer> {
}
