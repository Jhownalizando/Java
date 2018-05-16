package com.yourcodelab.app;

import java.util.Date;
import java.util.Scanner;

import com.yourcodelab.model.Cliente;

public class AppUnicesumar {
	public static void main(String[] args) {
		Cliente cliente01 = new Cliente(1, "Alex", "123.321.456-90", "alex@uni.com", new Date());
		
		Scanner in = new Scanner(System.in);
		
		//Obter um valor digitado pelo usuário
		String novoNome = "";
		System.out.println("Digite um nome:");
		novoNome = in.nextLine();
		
		//Alterar o nome para o recebido
		///cliente01.setNomeCompleto(novoNome);
		
		//Exibir na tela o novo valor
		//System.out.println("Nome: " + cliente01.getNomeCompleto());
	}
}
