Desafio 03 - Programação Orientada a Objetos (POO)
Objetivo
Desenvolver um programa em Java que calcule o Índice de Massa Corporal (IMC) de uma pessoa, aplicando os conceitos fundamentais da Programação Orientada a Objetos: encapsulamento, herança e polimorfismo.

Especificações:
1. Classe Pessoa
Crie uma classe base chamada Pessoa, que encapsula as informações de uma pessoa, como:
nome (String)
peso (double)
altura (double)
Implementar um método para calcular o IMC utilizando a fórmula:
makefile
Copiar código
IMC = peso / (altura * altura)

3. Classe Atleta
Crie uma subclasse chamada Atleta, que herda de Pessoa, e adicione o atributo esportePraticado (String).
Sobrescreva o método de cálculo do IMC para ajustar o cálculo de acordo com atletas de alto rendimento. Para atletas, o valor do IMC deve ser reduzido em 5%.

5. Encapsulamento
Utilize o encapsulamento para proteger os atributos de Pessoa (nome, peso, altura), criando métodos get e set apropriados.

7. Polimorfismo
Demonstre o uso de polimorfismo instanciando objetos do tipo Pessoa e Atleta, e chamando o método calcularIMC() de forma polimórfica.
Regras
Utilize os conceitos de POO:
Encapsulamento: Proteja os atributos com métodos get e set.
Herança: A classe Atleta deve herdar de Pessoa.
Polimorfismo: O método de cálculo do IMC deve ser chamado polimorficamente para objetos de Pessoa e Atleta.
