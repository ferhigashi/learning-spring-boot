package org.higashi.learningspringboot.repository;

import java.util.List;

import org.higashi.learningspringboot.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
	
	List<Paciente> findByNome(String nome);
	
	Paciente findByCpf(String cpf);
 
}
