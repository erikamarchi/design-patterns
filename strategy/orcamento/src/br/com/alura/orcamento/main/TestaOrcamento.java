package br.com.alura.orcamento.main;

import br.com.alura.orcamento.modelo.CalculadorDeImpostos;
import br.com.alura.orcamento.modelo.ICCC;
import br.com.alura.orcamento.modelo.ICMS;
import br.com.alura.orcamento.modelo.ISS;
import br.com.alura.orcamento.modelo.Imposto;
import br.com.alura.orcamento.modelo.Orcamento;

public class TestaOrcamento {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();

		Orcamento orcamento = new Orcamento(4000.0);

		CalculadorDeImpostos calculador = new CalculadorDeImpostos();

		
		calculador.realizaCalculo(orcamento, iss);

		
		calculador.realizaCalculo(orcamento, icms);
		
		calculador.realizaCalculo(orcamento, iccc);
	}

}
