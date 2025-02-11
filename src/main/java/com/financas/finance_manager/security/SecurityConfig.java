package com.financas.finance_manager.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desativa CSRF para permitir requisições sem token
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)) // API stateless
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").permitAll() // Libera Swagger
                        .requestMatchers("/users").permitAll() // Permite cadastro de usuários sem autenticação
                        .anyRequest().authenticated() // Exige autenticação para o restante das rotas
                )
                .httpBasic(withDefaults()) // Substitui .httpBasic() para versões novas

                .formLogin(login -> login
                        .defaultSuccessUrl("/swagger-ui/index.html", true)
                        .permitAll()
                );

        return http.build();
    }
}
