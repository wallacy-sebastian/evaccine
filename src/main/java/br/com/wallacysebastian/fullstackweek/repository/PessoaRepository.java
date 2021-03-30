package br.com.wallacysebastian.fullstackweek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wallacysebastian.fullstackweek.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
}
