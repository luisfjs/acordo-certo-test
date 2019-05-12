package br.com.acordocerto.domain.repository;

import br.com.acordocerto.domain.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesaRepository extends JpaRepository<Despesa, Long> {}
