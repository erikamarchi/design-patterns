package br.com.alura.investimento.modelo;

import java.util.Random;

public class Arrojado implements Investimento {
	private Random random;

	public Arrojado() {
		this.random = new Random();
	}

	public double calcula(Conta conta) {
		int aleatoriedade = random.nextInt(10);
		
		if (aleatoriedade >= 0 && aleatoriedade <= 1)
			return conta.getSaldo() * 0.05;
		else if (aleatoriedade >= 2 && aleatoriedade <= 4)
			return conta.getSaldo() * 0.03;
		else
			return conta.getSaldo() * 0.006;
	}
}
