package su.fantasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("USER_PREDICT_RESULTS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserPredictResult {
    @Id
    int id;
    int userPredict;
    double sumPoints;
    int race;
}
