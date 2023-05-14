package su.fantasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("TEAMS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Team {
    @Id
    int championship;
    String name;
}
