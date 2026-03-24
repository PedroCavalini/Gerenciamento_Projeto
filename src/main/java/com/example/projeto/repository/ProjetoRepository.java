package com.example.projeto.repository;

import com.example.projeto.model.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<ProjetoModel, Long> {
}