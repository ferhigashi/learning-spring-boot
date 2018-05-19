package org.higashi.learningspringboot.repository;

import java.util.List;

import org.higashi.learningspringboot.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

	List<Livro> findByAutor(String autor);
	
	List<Livro> findByTitulo(String titulo);
	
	Livro findByIsbn(String isbn);
}
