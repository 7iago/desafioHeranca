package oo.heranca.desafio;

public class Ferrari extends Carro{

	public Ferrari(int velocidadeAtual) {
		super(velocidadeAtual);
	}
	
	@Override
	void acelerar() {
		setVelocidadeAtual(getVelocidadeAtual() + 15);
		System.out.println("O veiculo aumentou a velocidade");
	}

	@Override
	void frear() {
		setVelocidadeAtual(getVelocidadeAtual() - 15);
		if (getVelocidadeAtual() > 0) {
			System.out.println("A Ferrari esta diminunto a velociade");
		}else if (getVelocidadeAtual() <= 0){
			setVelocidadeAtual(0);
			System.out.println("A Ferrari parou");
			}
		}
}