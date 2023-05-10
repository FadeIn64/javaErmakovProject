package su.fantasy.repositories;

import org.springframework.data.repository.CrudRepository;
import su.fantasy.models.UserRole;

public interface UserRoleRepo extends CrudRepository<UserRole, Integer> {
}
