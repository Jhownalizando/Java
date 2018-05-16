package exercicioTres;

import java.util.Scanner;

public class ShowEquipamento {
	
	private ControlarEquipamento controlar;
	
	public ShowEquipamento() {
		
		controlar = new ControlarEquipamento();
	}
	
	// Inserir Equipamento
	public void inserirEquipamento() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o N� Patrimonio: ");
		int numeroPatrimonio = leitor.nextInt();
		
		System.out.print("Digite a Data de Aquisi��o: ");
		int dataAquisicao = leitor.nextInt();
		
		System.out.print("Tipo de equipamento: ");
		String tipoEquipamento = leitor.next();
		
		System.out.print("Descri��o: ");
		String descricao = leitor.next();
		
		Equipamento equip = new Equipamento(numeroPatrimonio, dataAquisicao, tipoEquipamento, descricao);
		
		controlar.inserirEquip(equip);
	}
	
	// Remover Equipamento
	public void removerEquipamento() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o N� Patrimonio para excluir: ");
		int numeroPatrimonio = leitor.nextInt();
		
		controlar.excluir(numeroPatrimonio);
	}
	
	// Alterar Equipamento
	
	// Pesquisar Equipamento
	
	// listar Equipamento
	public void listarEquipamento() {
		controlar.exibir();
	}
	
}
	