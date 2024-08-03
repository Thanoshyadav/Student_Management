package com.Student.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import jakarta.servlet.Filter;

@EnableWebSecurity
public class SecurityConfig {
 @Bean
 public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
     http
         .csrf().disable()
         .authorizeRequests()
         .requestMatchers("/api/auth/**").permitAll()
         .requestMatchers("/api/students/**").hasRole("STUDENT")
         .requestMatchers("/api/subjects/**").hasRole("ADMIN")
         .anyRequest().authenticated()
         .and()
         .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
         .and()
         .addFilterBefore((Filter) jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
     return http.build();
 }

 @Bean
 public JwtAuthenticationFilter jwtAuthenticationFilter() {
     return new JwtAuthenticationFilter();
 }
}

