package com.yourcodelab.app;

import java.util.Scanner;

import com.yourcodelab.model.Veiculo;

public class Aplicacao {

	public static void main(String[] args) {
		String a, b, c, d;
		int e;
		float f;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o Chassi: ");
		a = scan.next();
		
		System.out.println("Digite a Placa: ");
		b = scan.next();
		
		System.out.println("Digite a Cor: ");
		c = scan.next();
		
		System.out.println("Digite a Marca: ");
		d = scan.next();
		
		System.out.println("Digite o Ano: ");
		e = scan.nextInt();
		
		System.out.println("Digite o Valor: ");
		f = scan.nextFloat();
		
		Veiculo v = new Veiculo(a, b, c, d, e, f);
		
		System.out.println("Dados do Veiculo: " + v.getChassi() 
							+ " " + v.getPlaca() 
							+ " " + v.getCor() 
							+ " " + v.getMarca());
		
	}

}
