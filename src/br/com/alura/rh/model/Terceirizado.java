package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado{

	private String empresa;
	
	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}	
	
}
