package br.com.alura.investimento.main;

import br.com.alura.investimento.modelo.Arrojado;
import br.com.alura.investimento.modelo.Conservador;
import br.com.alura.investimento.modelo.Conta;
import br.com.alura.investimento.modelo.Investimento;
import br.com.alura.investimento.modelo.Moderado;
import br.com.alura.investimento.modelo.RealizadorDeInvestimentos;

public class TestaInvestimento {

	public static void main(String[] args) {

		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();

		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		Investimento arrojado = new Arrojado();

		Conta conta = new Conta();
		conta.deposita(1000.00);
		realizadorDeInvestimentos.realiza(conta, conservador);

		conta = new Conta();
		conta.deposita(1000.00);
		realizadorDeInvestimentos.realiza(conta, moderado);

		conta = new Conta();
		conta.deposita(1000.00);
		realizadorDeInvestimentos.realiza(conta, arrojado);

	}

}
