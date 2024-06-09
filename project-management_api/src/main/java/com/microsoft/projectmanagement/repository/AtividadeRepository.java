package com.microsoft.projectmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsoft.projectmanagement.entity.Atividade;

import java.util.List;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
    List<Atividade> findByProjetoId(Long projetoId);
    List<Atividade> findByStatus(String status);
}
