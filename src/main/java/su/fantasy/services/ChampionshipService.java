package su.fantasy.services;

import org.springframework.stereotype.Service;
import su.fantasy.models.Championship;
import su.fantasy.repositories.ChampionshipRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ChampionshipService {
    public static Map<Integer, String> championships = new HashMap<>();

    private ChampionshipRepo repo;

    public ChampionshipService(ChampionshipRepo repo) {
        this.repo = repo;
        repo.findAll().forEach(x->championships.put(x.getId(), x.getName()));
    }
}
