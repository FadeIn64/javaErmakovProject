package su.fantasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import su.fantasy.repositories.RaceRepo;
import su.fantasy.parameterhandlers.congigurer.ControllerParameterHandlersChain;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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

        ControllerParameterHandlersChain chain = context.getBean(ControllerParameterHandlersChain.class);

        Map<String, String> map = new HashMap<>();
        map.put("hello", "hello");
        System.out.println(map.get("hello"));
    }

}
