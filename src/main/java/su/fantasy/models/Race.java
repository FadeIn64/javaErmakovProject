package su.fantasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Table("RACES")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Race {

    @Id
    int id;
    int championship;
    String location;
    String name;
    Date startPredictDate;
    Date endPredictDate;
}
