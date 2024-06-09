package com.microsoft.projectmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsoft.projectmanagement.entity.Cliente;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByEmail(String email);
}
