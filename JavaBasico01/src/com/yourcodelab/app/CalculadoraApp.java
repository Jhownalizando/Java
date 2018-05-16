package com.yourcodelab.app;

import java.util.Scanner;

import com.yourcodelab.util.Calculadora;

public class CalculadoraApp {

	public static void main(String[] args) {
		//Criar um objeto Calculadora
		Calculadora calc = new Calculadora();
		
		Scanner scan = new Scanner(System.in);
		
		//Solicitar valor de A
		System.out.println("Digite A: ");
		int a = scan.nextInt();
		
		//Solicitar valor de B
		System.out.println("Digite B: ");
		int b = scan.nextInt();
		
		//Exibir a Soma A + B
		int soma = calc.somar(a, b);
		System.out.println("Soma: " + soma);
		
		//Exibir a Subtração A - B
		int sub = calc.subtrair(a, b);
		System.out.println("Subtração: " + sub);
	}

}
