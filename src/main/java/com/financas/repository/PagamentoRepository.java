package com.financas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.financas.model.Pagamento;

public interface PagamentoRepository  extends JpaRepository<Pagamento, Long> {

}
