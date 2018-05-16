package com.yourcodelab.app;

import java.util.Scanner;

import com.yourcodelab.util.Calculadora;

public class ExemploApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Obter o valor de A
		System.out.println("Digite A: ");
		int a = scan.nextInt();
		
		//Obter o valor de B
		System.out.println("Digite B: ");
		int b = scan.nextInt();
		
		//Instanciar um objeto da classe Calculadora
		Calculadora calc = new Calculadora();
		
		//Apresentar o resultado da Soma
		System.out.println("Soma = " + calc.somar(a, b));
		
		//Apresentar o resultado da Subtração
		System.out.println("Subtração = " + calc.subtrair(a, b));
		
		//Apresentar o resultado da Multiplicação
		System.out.println("Multiplicação = " + calc.multiplicar(a, b));
		
		//Apresentar o resultado da Divisão
		System.out.println("Divisão = " + calc.dividir(a, b));

	}

}
