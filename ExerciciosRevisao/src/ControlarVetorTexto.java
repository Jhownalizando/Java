import java.util.Scanner;

public class ControlarVetorTexto {

	int TAM = 1;
	String nome[] = new String[TAM];

	public void carregarVetor() {
		Scanner leitor = new Scanner(System.in);

		for(int i = 0; i < TAM; i++) {
			System.out.print("Digite o nome: ");
			nome[i] = leitor.nextLine();
		}
	}

	public void exibirVetor() {
		for(int i = 0; i < TAM; i++) {
			System.out.println("");
			System.out.println("Nome: " + nome[i]);
		}
	}

	public void exibirMaiusculo() {
		for(int i = 0; i < TAM; i++) {
			System.out.println("");
			System.out.println("Nome: " + nome[i].toUpperCase());
		}
	}

	public void exibirSobrenome() {
		for(int i = 0; i < TAM; i++) {
			System.out.println("");
			System.out.println("Nome: " + nome[i].split(" ")[nome[i].split(" ").length - 1]);
		}
	}

}
