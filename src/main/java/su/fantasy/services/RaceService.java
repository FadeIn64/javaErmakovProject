package su.fantasy.services;

import lombok.AllArgsConstructor;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import su.fantasy.models.Race;
import su.fantasy.repositories.RaceRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class RaceService {
    private RaceRepo repo;

    public List<Race> findAll(){
        return repo.findAll();
    }

    public List<Race> findActual(){
        return repo.findActual();
    }

    public List<Race> findActualById(int championshipId){
        return repo.findActualById(championshipId);
    };


    public List<Race> findPredictedByUser(int userId){
        return repo.findPredictedByUser(userId);
    }
}
