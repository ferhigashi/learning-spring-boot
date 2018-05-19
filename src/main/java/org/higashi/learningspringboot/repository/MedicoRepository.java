package org.higashi.learningspringboot.repository;

import java.util.List;

import org.higashi.learningspringboot.entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

	List<Medico> findByNome(String nome);
	
	List<Medico> findByEspecialidade(String especialidade);
	
	Medico findByCrm(String crm);
}
