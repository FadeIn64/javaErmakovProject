package su.fantasy.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import su.fantasy.models.RaceProtocolComponent;
import su.fantasy.models.RaceResult;

import java.util.List;

@Repository
public interface RaceResultRepo extends CrudRepository<RaceResult, Integer> {
    @Query("SELECT * FROM RACE_PROTOCOLS WHERE ID = :race ORDER BY POSITION")
    List<RaceProtocolComponent> findRaceRequestByRaceId(@Param("race") int race);
}
