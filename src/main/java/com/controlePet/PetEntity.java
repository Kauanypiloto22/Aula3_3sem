package com.controlePet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PetEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
	private String nome;
	private String tamanho;
	private int datanasc;
	
	public PetEntity() {
	}
	
	public PetEntity(String nome, String tamanho, int datanasc) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.datanasc = datanasc;
    }

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getTamanho() {
		return tamanho;
	}

	public int getDatanasc() {
		return datanasc;
	}
	
	
}




