package br.com.alura.rh.service.promocao;

import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;

public class PromocaoService {
	
	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
		if(cargoAtual == Cargo.GERENTE) {
			throw new ValidacaoException("Gerentes não podem ser promovidos!");
		} else if(metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionário não bateu a meta!");
		}
	}

}
