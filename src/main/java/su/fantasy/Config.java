package su.fantasy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import su.fantasy.parameterhandlers.congigurer.ControllerParameterHandlersChain;

@Configuration
public class Config {

    @Bean()
    String hello(){
        return "HELOOOOOOOOO!!!";
    }

    @Autowired
    void init(ControllerParameterHandlersChain chain){
        chain.annotatedMethods(GetMapping.class).parameterType(String.class).addHandler(x-> {
            System.out.println(x);
            return true;
        });
    }
}
