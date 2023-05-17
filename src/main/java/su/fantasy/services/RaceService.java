package su.fantasy.services;

import lombok.AllArgsConstructor;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import su.fantasy.models.Race;
import su.fantasy.repositories.RaceRepo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    public void endPredict(int id){
        Optional<Race> race = repo.findById(id);
        System.out.println(race);
        if (race.isEmpty()) return;
        race.get().setEndPredictDate(new Date(System.currentTimeMillis()));
        repo.save(race.get());
    }

    public List<Race> findNotResulted(){
        return repo.findNotResulted();
    }


    public List<Race> findPredictedByUser(int userId){
        return repo.findPredictedByUser(userId);
    }
}
