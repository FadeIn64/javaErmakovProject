package su.fantasy.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import su.fantasy.models.Race;

import java.util.List;

@Repository
public interface RaceRepo extends CrudRepository<Race, Integer> {

    List<Race> findAll();

    @Query("SELECT * FROM ACTUAL_RACES")
    List<Race> findActual();

    @Query("SELECT * FROM ACTUAL_RACES" +
            "WHERE CHAMPIONSHIP = :championshipId" )
    List<Race> findActualById(@Param("championshipId") int championshipId);

    @Query("""
        SELECT * FROM RACES_PREDICTED_BY_USERS_FULL
        WHERE LOGIN = :login
""")
    List<Race> findPredictedByUserLogin(@Param("login") String login);

}
