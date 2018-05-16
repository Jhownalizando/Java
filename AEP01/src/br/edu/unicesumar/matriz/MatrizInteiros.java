package br.edu.unicesumar.matriz;

import java.util.Scanner;

public class MatrizInteiros {
	private int matriz[3][3];
	private int linhas;
	private int colunas;
	
	//Construtor que gera a matriz
	public gerarMatriz(int linhas, int colunas){
		this.linhas = linhas;
		this.colunas = colunas;
		
		matriz = new int[linhas][colunas];
	}
	
	//Exibir conteudo da Matriz
	public void exibirMatriz(){
		for(int i = 0; i < linhas; i++){
			for(int j = 0; j < colunas; j++){
				System.out.println("Matriz = " + matriz[i][j]);
			}
		}
			
	}
	
	public void carregarMatriz(){
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < linhas; i++){
			for(int j = 0; j < colunas; j++){
				System.out.println("Digite = ");
				matriz[i][j] = scan.nextInt();
			}
		}
	}
	
	public int calcularSoma(){
		int soma = 0;
		
		for(int i = 0; i < linhas; i++){
			for(int j = 0; j < colunas; j++){
				soma+= matriz[i][j];
			}
		}
		
		
		return soma;		
	}
	
	public float calcularMedia(){
		float media = 0;
		
		
		media += ()/2;
	}
	
	public int maior(){
		
		
	}
	
	public int menor(){
		
	}
	
	public int qtdPares(){
		
	}
	
	public int qtdImpares(){
		
	}
}
