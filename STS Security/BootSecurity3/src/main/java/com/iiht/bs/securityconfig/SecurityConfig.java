package com.iiht.bs.securityconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.iiht.bs.Repository.AdminDetailsRepository;
import com.iiht.bs.Repository.UserDetailsRepository;

@Configuration
@EnableMethodSecurity
public class SecurityConfig{
	
	
	
	
	@Bean
	public static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http.csrf(csrf->csrf.disable()).
		authorizeHttpRequests((authorize)-> authorize.anyRequest().authenticated()).
		httpBasic(Customizer.withDefaults());
		
	return http.build();
}
	
	
	@Bean
	InMemoryUserDetailsManager userDetailsService()
	{
		UserDetails userDetails = User.builder().
							username("user").
							password(passwordEncoder().
							encode("mister")).
							roles("USER").
							build();
		
		UserDetails adminDetails = User.builder().
				username("bond").
				password(passwordEncoder().
				encode("james")).
				roles("ADMIN").
				build();
		
		
		return new InMemoryUserDetailsManager(userDetails,adminDetails);
	}
	
}
