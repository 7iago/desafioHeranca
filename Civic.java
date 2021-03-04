package oo.heranca.desafio;

public class Civic extends Carro{

	public Civic(int velocidadeAtual) {
		super(velocidadeAtual);
		
	}

	@Override
	void acelerar() {
		setVelocidadeAtual(getVelocidadeAtual() + 5);
		System.out.println("O veiculo aumentou a velocidade");
	}

	@Override
	void frear() {
		setVelocidadeAtual(getVelocidadeAtual() - 10);
		if (getVelocidadeAtual() > 0) {
			System.out.println("O Civic esta diminunto a velociade");
		}else if (getVelocidadeAtual() <= 0){
			setVelocidadeAtual(0);
			System.out.println("O Civic parou");
			}
		}
	
}
