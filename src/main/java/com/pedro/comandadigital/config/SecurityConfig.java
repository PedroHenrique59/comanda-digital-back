package com.pedro.comandadigital.config;

import org.springframework.context.annotation.Configuration;

//@Configuration
public class SecurityConfig {

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(AbstractHttpConfigurer::disable) // Desativa CSRF para simplificar (não recomendado em produção)
//                .authorizeHttpRequests(auth -> auth
//                        .anyRequest().permitAll() // Permite todas as requisições sem autenticação
//                )
//                .httpBasic(AbstractHttpConfigurer::disable) // Desabilita autenticação HTTP Basic
//                .formLogin(AbstractHttpConfigurer::disable) // Desabilita autenticação baseada em formulário
//                .cors(cors -> cors.configurationSource(new CorsConfig().corsConfigurationSource()));
//
//        return http.build();
//    }

}
