package org.library.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.inject.Inject;
import javax.inject.Named;

@EnableWebSecurity
@ComponentScan(basePackages = { "org.library" })
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
   @Inject
   AuthenticationProvider authenticationProvider;
   @Inject
   PasswordEncoder passwordEncoder;

   @Override
   protected void configure(AuthenticationManagerBuilder auth) throws Exception {

      auth.authenticationProvider(authenticationProvider);/*
      auth.inMemoryAuthentication().withUser("user").password("123").roles("ADMIN");*//*

       auth.inMemoryAuthentication()
               .withUser("memuser")
               .password("pass")
               .roles("USER");*/
 /*     auth.inMemoryAuthentication()
         .withUser("user").password("{noop}123").roles("USER")
         .and()
         .withUser("admin").password("{noop}123").roles("ADMIN");*/
    /*   auth.inMemoryAuthentication()
               .withUser("sunil").password("{noop}pass123").roles("USER")
               .and()
               .withUser("admin").password("{noop}pass123").roles("ADMIN");*/
   }

   @Override
   protected void configure(HttpSecurity http) throws Exception {
       System.out.println("http: "+http);
      http.authorizeRequests().antMatchers("/").authenticated()
      .and()
      .authorizeRequests().antMatchers("/user**").authenticated()
      .and()
      .formLogin()
      .and()
      .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
   }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
