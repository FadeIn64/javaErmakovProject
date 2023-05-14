package su.fantasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Table("USER_PREDICTS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserPredict {
    int id;
    int userId;
    int raceParticipant;
    int position;
}
