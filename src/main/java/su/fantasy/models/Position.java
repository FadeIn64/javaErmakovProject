package su.fantasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("POSITIONS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Position {
    @Id
    int id;
    String name;
}
