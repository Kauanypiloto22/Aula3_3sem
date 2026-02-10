package com.controlePet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VacinacaoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int codigo;
	private int validade;
	private int periodo;
	
	public VacinacaoEntity() {
	}
	
	public VacinacaoEntity(int codigo, int validade, int periodo) {
		this.codigo = codigo;
		this.validade = validade;
		this.periodo = periodo;
	}

	public Long getId() {
		return id;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getValidade() {
		return validade;
	}

	public int getPeriodo() {
		return periodo;
	}

}
