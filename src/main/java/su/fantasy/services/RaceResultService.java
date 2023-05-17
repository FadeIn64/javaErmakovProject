package su.fantasy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import su.fantasy.models.Race;
import su.fantasy.models.RaceProtocolComponent;
import su.fantasy.repositories.RaceResultRepo;

import java.util.List;

@Service
public class RaceResultService {

    @Autowired
    RaceResultRepo raceResultRepo;

    @Autowired
    RaceService raceService;

    public List<RaceProtocolComponent> findRaceProtocolByRaceId(int race){
        return raceResultRepo.findRaceRequestByRaceId(race);
    }

    public Race findRaceById(int i){
        return raceService.findById(i);
    }

}
