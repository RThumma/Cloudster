package com.cloudster.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloudster.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
