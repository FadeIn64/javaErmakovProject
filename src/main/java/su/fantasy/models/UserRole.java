package su.fantasy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("USER_ROLE")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRole {
    @Id
    int id;

    String name;
}

