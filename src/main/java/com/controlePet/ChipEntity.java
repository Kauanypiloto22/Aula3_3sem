package com.controlePet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChipEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int codigo;
	private String aplicacao;
	private String status;
	
	public ChipEntity() {
	}
	
	public ChipEntity(int codigo, String aplicacao, String status) {
		this.codigo = codigo;
		this.aplicacao = aplicacao;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getAplicacao() {
		return aplicacao;
	}

	public String getStatus() {
		return status;
	}

}
