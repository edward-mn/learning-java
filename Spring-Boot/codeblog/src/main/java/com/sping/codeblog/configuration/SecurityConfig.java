package com.sping.codeblog.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

//  Não peçam Autenticação
  private static final String[] AUTH_LIST = {
      "/",
      "/posts",
      "/posts/{id}"
  };

  @Override
  protected void configure(HttpSecurity http) throws Exception{
    http.csrf().disable().authorizeRequests()
        .antMatchers(AUTH_LIST).permitAll() // Sem autenticação
        .anyRequest().authenticated() // Com autenticação
        .and().formLogin().permitAll() // Permitir ao acesso a página de login
        .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")); // Instância
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception{
    auth.inMemoryAuthentication()
        .withUser("edward").password("{noop}123").roles("ADMIN");
  }

  @Override
  public void configure(WebSecurity web){
    web.ignoring().antMatchers("/bootstrap/**"); // Ingonre static folders
    //web.ignoring().antMatchers("/bootstrap/**", "/style/**"); // Exemple
  }
}
