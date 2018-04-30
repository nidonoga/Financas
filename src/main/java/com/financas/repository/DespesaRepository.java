package com.financas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financas.model.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Long> {

}
