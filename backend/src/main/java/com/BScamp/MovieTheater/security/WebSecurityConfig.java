package com.BScamp.MovieTheater.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().mvcMatchers("/**").permitAll()

//		.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//		.mvcMatchers("/", "/user/register", "/user/login").permitAll()
//		.mvcMatchers("/logout", "/admin/**").hasRole("ADMIN")
//		.anyRequest().authenticated().and()
//		.formLogin().loginPage("/user/login").defaultSuccessUrl("/").and()
//		.logout().invalidateHttpSession(true).logoutSuccessUrl("/")
		;
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.debug(false).ignoring().antMatchers("/images/**", "/js/**", "/css/**");
	}

//	private final UserDetailsService userDetailsService = null;
//
//	private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		super.configure(http);
//	}
//
//	@Bean
//	PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}

}