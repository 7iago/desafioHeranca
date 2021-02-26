package oo.heranca.desafio;

public class TesteCarro {

	public static void main(String[] args) {
		Civic civic = new Civic(50);
		Ferrari ferrari = new Ferrari(50);
		
		System.out.println("veliocidade do civic= " + civic.velocidadeAtual);
		System.out.println("velocidade Ferrari= " + ferrari.velocidadeAtual);
		
		
		
		civic.acelerar();
		ferrari.acelerar();
		System.out.println("veliocidade do civic= " + civic.velocidadeAtual);
		System.out.println("velocidade Ferrari= " + ferrari.velocidadeAtual);
		
		civic.frear();
		civic.frear();
		civic.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		
		System.out.println("veliocidade do civic= " + civic.velocidadeAtual);
		System.out.println("velocidade Ferrari= " + ferrari.velocidadeAtual);
		
		
		
		
		
	}

}
