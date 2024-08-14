package com.iiht.bs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.bs.model.UserDetails;
import java.util.Optional;


@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, String> {
	
	
	Optional<UserDetails>findByUsername(String username);
	

}
