package br.com.IMC;

public class Atleta extends Pessoa {
	
	private String esportePraticado;

	public Atleta(String nome, double peso, double altura, String esportePraticado) {
		super(nome, peso, altura);
		this.esportePraticado = esportePraticado;
	}

	public String getEsportePraticado() {
		return esportePraticado;
	}

	public void setEsportePraticado(String esportePraticado) {
		this.esportePraticado = esportePraticado;
	}

	@Override
	public double calculoIMC() {
		// TODO Auto-generated method stub
		return super.calculoIMC() * 0.95;
		
	}
	
	

}
