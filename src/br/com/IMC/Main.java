package br.com.IMC;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa objpessoa = new Pessoa ("Gabriel", 75.0 , 1.83);
		Atleta objatleta = new Atleta ("Fulano", 70.0, 1.75, "Futebol");		
		
		
		System.out.println("O IMC de " + objpessoa.getNome() + " eh de " + objpessoa.calculoIMC());
		System.out.println("O IMC de " + objatleta.getNome() + " eh de " + objatleta.calculoIMC());

	}

}
