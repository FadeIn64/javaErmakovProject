package su.fantasy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import su.fantasy.repositories.PositionRepo;

import java.util.HashMap;
import java.util.Map;

@Service
public class PositionService {
    public static Map<Integer, String> positions = new HashMap<>();

    private PositionRepo positionRepo;

    @Autowired
    public PositionService(PositionRepo positionRepo) {
        this.positionRepo = positionRepo;
        this.positionRepo.findAll().forEach(x-> positions.put(x.getId(), x.getName()));
    }
}
