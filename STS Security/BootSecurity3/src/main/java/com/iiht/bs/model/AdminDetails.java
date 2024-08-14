package com.iiht.bs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class AdminDetails {
	
	
	@Id
	private String user_admin;
	private String pass_admin;

}
