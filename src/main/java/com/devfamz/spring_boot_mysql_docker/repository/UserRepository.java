package com.devfamz.spring_boot_mysql_docker.repository;

import com.devfamz.spring_boot_mysql_docker.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
