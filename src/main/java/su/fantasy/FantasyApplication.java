package su.fantasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import su.fantasy.repositories.RaceRepo;
import su.parameterhandlers.ControllerParameterHandlersChain;

import java.util.Date;

@SpringBootApplication
public class FantasyApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FantasyApplication.class, args);

//        UserRoleRepo userRoleRepo = context.getBean(UserRoleRepo.class);
//        System.out.println(userRoleRepo.findById(1));

        RaceRepo raceRepo = context.getBean(RaceRepo.class);

        Date date = new Date();
        System.out.println(context.getBean(JdbcUserDetailsManager.class).loadUserByUsername("danila")
                .getAuthorities());

        ControllerParameterHandlersChain chain = null;

        chain.annotatedMethods(GetMapping.class).parameterType(String.class).addHandler(x->true).addHandler(x->true);

    }

}
