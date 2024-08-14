package com.ust.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.security.model.UserDetails;

import java.util.Optional;


@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, String> {
	
	
	Optional<UserDetails>findByUsername(String username);
	

}
