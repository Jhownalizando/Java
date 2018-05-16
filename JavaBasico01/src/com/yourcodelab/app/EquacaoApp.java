package com.yourcodelab.app;

import java.util.Scanner;

import com.yourcodelab.util.EquacaoSegundoGrau;

public class EquacaoApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Obter A
		System.out.println("Digite A: ");
		int a = scan.nextInt();
		
		//Obter B
		System.out.println("Digite B: ");
		int b = scan.nextInt();
		
		//Obter C
		System.out.println("Digite C: ");
		int c = scan.nextInt();

		EquacaoSegundoGrau eq = new EquacaoSegundoGrau();
		int d = eq.delta(a, b, c);
		
		//Se delta for positivo
		if(d >= 0){
			double x1 = eq.x1(a, b, c);
			System.out.println("X1 = " + x1);
			
			double x2 = eq.x2(a, b, c);
			System.out.println("X2 = " + x2);
		}else{
			System.out.println("Delta Negativo!!!");
		}	
	}
}
