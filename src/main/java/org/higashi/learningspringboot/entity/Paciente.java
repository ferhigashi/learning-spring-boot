package org.higashi.learningspringboot.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Paciente {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
	private String id;
	
	@Column(name="nome", nullable=false)
	private String nome;
	
	@Column(name="telefone", nullable=true)
	private String telefone;
	
	@Column(name="cpf", nullable=false, unique=true)
	private String cpf;
	
	@OneToMany(mappedBy="paciente", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<Consulta> consultas = new ArrayList<Consulta>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void addConsultas(Consulta consulta) {
		this.consultas.add(consulta);
	}
	
}
