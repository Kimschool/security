package com.example.jaego.config;

import com.example.jaego.service.MyUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private MyUserDetailsService myUserDetailService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests((authorizeRequests) -> authorizeRequests
                        .requestMatchers("/", "/login").permitAll()
                        .requestMatchers("/test", "test1").authenticated()
                        .anyRequest().authenticated())
//                .formLogin((formLogin) ->
//                        formLogin.loginPage("/login")
//                                .usernameParameter("id")
//                                .passwordParameter("password")
//                                .loginProcessingUrl("/loginproc")
//                                .defaultSuccessUrl("/success", true))
//                .logout((logoutConfig) ->
//                        logoutConfig.logoutSuccessUrl("/"))
//                .userDetailsService(myUserDetailService)
        ;

        return http.build();
    }

}
