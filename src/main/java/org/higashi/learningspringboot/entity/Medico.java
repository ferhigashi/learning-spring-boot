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
public class Medico {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long id;
	
	@Column(name="nome", nullable=false)
    private String nome;
     
    @Column(name="titulo", nullable=false)
    private String especialidade; 

    @Column(name="crm", nullable=false, unique=true)
    private String crm;
    
    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Consulta> consultas = new ArrayList<Consulta>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void addConsultas(Consulta consulta) {
		this.consultas.add(consulta);
	} 
}
