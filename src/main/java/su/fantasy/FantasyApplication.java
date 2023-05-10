package su.fantasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import su.fantasy.repositories.UserRoleRepo;

@SpringBootApplication
public class FantasyApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FantasyApplication.class, args);

        UserRoleRepo userRoleRepo = context.getBean(UserRoleRepo.class);
        System.out.println(userRoleRepo.findById(1));
    }

}
