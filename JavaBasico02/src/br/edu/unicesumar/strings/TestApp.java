package br.edu.unicesumar.strings;

public class TestApp {

	public static void main(String[] args) {
		String nome = "Alex Silva Costa Xavier";
		
		//Retornar o tamanho
		System.out.println("Tamanho = " + nome.length());
		
		//Retornar tudo maiusculo
		System.out.println("Maiúsculo = " + nome.toUpperCase());
		
		//Retornar tudo minusculo
		System.out.println("Maiúsculo = " + nome.toLowerCase());
		
		//Retornar a posição
		System.out.println("Posição = " + nome.indexOf("ex"));
		
		//Quebrar String em pedaços menores
		String palavras[] = nome.split(" ");
		System.out.println("Boa Noite, Senhor " + palavras[palavras.length - 1]);
		
		String email = "alex#gmail.com";
		String dados[] = email.split("@");
		
		if(email.indexOf("@") > 0)
			System.out.println("Dominio = " + dados[1]);
		else
			System.out.println("Email Inválido");
		
		//Trim Simples
		String endereco = "           Rua Itajuba          ";
		System.out.println("Endereço = " + endereco.trim());
		
		
		//Trim Composto
		String nomeCompleto = "Alex   Jose da Silva ";
		String partes[] = nomeCompleto.split(" ");
		
		System.out.println("Depois: " + partes.length + " "
				+ partes[0].trim() + " " 
				+ partes[1].trim() + " " 
				+ partes[2].trim() + " " 
				+ partes[3].trim() + " "
				+ partes[4].trim() + " "
				+ partes[5].trim() + " ");
	}

}
