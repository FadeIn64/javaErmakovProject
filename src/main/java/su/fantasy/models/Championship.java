package su.fantasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("CHAMPIONSHIPS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Championship {
    @Id
    int id;
    String name;
    int pointsZone;
}
