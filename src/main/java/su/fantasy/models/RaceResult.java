package su.fantasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("RACE_RESULTS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RaceResult {
    @Id
    int id;
    int race;
    int raceParticipant;
    int position;
    double points;
}
