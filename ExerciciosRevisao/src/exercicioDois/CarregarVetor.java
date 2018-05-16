package exercicioDois;

import java.util.Scanner;

public class CarregarVetor {
	
	int TAM = 5;
	int vetor[] = new int[TAM];
	
	// Carregar o vetor
	public void carregarVetor() {
		
		for(int i = 0; i < TAM; i++) {
			Scanner leitor = new Scanner(System.in);
			
			System.out.print("Digite numero: ");
			vetor[i] = leitor.nextInt();
		}
	}
	
	// Exibir o conteúdo do vetor
	public void exibirVetor() {
		
		System.out.println("*****************");
		for(int i = 0; i < TAM; i++) {
			System.out.println(i + 1 + "º Numero: " + vetor[i]);
		}
	}
	
	// Exibir a média dos valores
	public float mediaVetor() {
		float soma = 0;
		float media = 0;
		
		System.out.println("*****************");
		for(int i = 0; i < TAM; i++) {
			soma += vetor[i];
		}
		
		media = soma / TAM;
		System.out.println("Media: " + media);
		
		return media;
	}
	
	// Exibir o menor valor
	public int menorVetor() {
		
		int menor = vetor[0];
		
		System.out.println("*****************");
		for(int i = 0; i < TAM; i++) {
			if(vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		System.out.println("Menor: " + menor);
		
		return menor;
	}
	
	// Exibir o maior valor
	public int maiorVetor() {
		
		int maior = vetor[0];
		
		System.out.println("*****************");
		for(int i = 0; i < TAM; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		
		System.out.println("Maior: " + maior);
		
		return maior;
	}
	
	// Exibir os números pares
	public int numeroPar() {
		int i;
		
		System.out.println("*****************");
		for(i = 0; i < TAM; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.println("Numero Par: " + vetor[i]);
			}
		}
		return i;
	}
	
	//Exibir os números ímpares
	public int numeroImpar() {
		int i;
		
		System.out.println("*****************");
		for(i = 0; i < TAM; i++) {
			if(vetor[i] % 2 != 0) {
				System.out.println("Numero Impar: " + vetor[i]);
			}
		}
		return i;
	}

}
