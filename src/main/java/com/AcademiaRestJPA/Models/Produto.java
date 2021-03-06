package com.AcademiaRestJPA.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long id;
	@Column(nullable = false)
	private String nome;
	
	public Produto () {
		this.id = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public Produto(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

}
