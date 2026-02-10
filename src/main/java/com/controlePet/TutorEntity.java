package com.controlePet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TutorEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private int datanasc;

	public TutorEntity() {
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getDatanasc() {
		return datanasc;
	}
	
}
