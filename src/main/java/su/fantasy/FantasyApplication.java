package su.fantasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FantasyApplication {

    public static void main(String[] args) {
        ApplicationContext context =
        SpringApplication.run(FantasyApplication.class, args);

        System.out.println(context);
    }

}
