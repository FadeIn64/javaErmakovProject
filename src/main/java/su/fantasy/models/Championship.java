package su.fantasy.models;

import org.springframework.data.annotation.Id;

public class Championship {
    @Id
    int id;
    String name;
    int pointsZone;
}
