package su.fantasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RaceProtocolComponent {
    @Column("ID")
    int raceId;
    String racerName;
    String teamName;
    int car;
    int racerId;
    int position;
    double points;
}
