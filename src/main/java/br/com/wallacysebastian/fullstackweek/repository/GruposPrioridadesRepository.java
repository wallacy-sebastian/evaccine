package br.com.wallacysebastian.fullstackweek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wallacysebastian.fullstackweek.domain.GruposPrioridades;

public interface GruposPrioridadesRepository extends JpaRepository<GruposPrioridades, Long> {
	
}
