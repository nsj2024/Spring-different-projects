package com.iiht.bs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.bs.model.AdminDetails;

import java.util.Optional;


@Repository
public interface AdminDetailsRepository extends JpaRepository<AdminDetails, String> {
	
	Optional<AdminDetails> findByUser_admin(String user_admin);
	
}
