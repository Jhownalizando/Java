package com.yourcodelab.util;

import java.util.Scanner;

import com.yourcodelab.model.Veiculo;

public class ControlarVeiculo {
	private Veiculo[] listaVeiculos;
	
	//Método para listar Veiculos de um ano
	public void listarPorAno(int ano){
		
	}
	
	//Retornar o Veiculo mais caro
	
	
	//Retornar a Media dos valores
	
	
	//Retornar a Soma dos valores
	
	
	//Método que carrega os Veiculos digitados
	public void carregarVetorVeiculo(int tamanho){
		//Instanciar um veículo com tamanho N
		listaVeiculos = new Veiculo[tamanho];
		
		//Loop para carregar os N Veiculos
		for(int i = 0; i < tamanho; i++){
			System.out.println("Digite os Dados Veiculo[" + i + "]");
			listaVeiculos[i] = digitarVeiculo();
		}
	}
	
	//Solicitar os dados do Veiculo
	private Veiculo digitarVeiculo(){
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
		
		return v;
	}
}
