package su.fantasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("RACERS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Racer {
    @Id
    int id;
    int team;
    String name;
    int car;
}
