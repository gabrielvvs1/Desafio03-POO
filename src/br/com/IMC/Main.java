package br.com.IMC;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa objpessoa = new Pessoa ("Gabriel", 75.0 , 1.83);
		Atleta objatleta = new Atleta ("Fulano", 70.0, 1.75, "Futebol");		
		
		System.out.println(String.format("O IMC de %s eh %.2f", objpessoa.getNome(), objpessoa.calculoIMC()));
        
        	System.out.println(String.format("O IMC de %s que eh atleta, eh de %.2f", objatleta.getNome(), objatleta.calculoIMC()));

	}

}
