package com.ust.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.security.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
