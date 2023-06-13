package su.fantasy.security;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .cors().disable()
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/").permitAll()
                        .anyRequest().authenticated()
                )
                .logout().permitAll().and()
                .httpBasic(Customizer.withDefaults())
//                .formLogin(Customizer.withDefaults())
                ;

        return http.build();
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    UserDetailsService userDetailsService(DataSource dataSource,
                                          @Qualifier("usersQuery") String usersQuery,
                                          @Qualifier("rolesQuery") String rolesQuery){
        JdbcUserDetailsManager uds = new JdbcUserDetailsManager(dataSource);
        uds.setUsersByUsernameQuery(usersQuery);
        uds.setAuthoritiesByUsernameQuery(rolesQuery);
        return uds;
    }


    @Bean
    @Qualifier("usersQuery")
    String usersQuery(){
        return "SELECT LOGIN, PASSWORD, 'true' FROM USERS WHERE LOGIN = ?";
    }

    @Bean
    @Qualifier("rolesQuery")
    String rolesQuery(){
        return "SELECT LOGIN, NAME FROM USERS_ROLES WHERE LOGIN = ?";
    }

}
