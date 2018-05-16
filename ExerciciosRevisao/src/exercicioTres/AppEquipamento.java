package exercicioTres;

import java.util.Scanner;

public class AppEquipamento {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		ShowEquipamento equip = new ShowEquipamento();
		
		int opcao = 1;
		
		while(opcao != 0) {
			System.out.println("********** M E N U **********");
			System.out.println("");
			System.out.println("1 - Inserir Equipamento");
			System.out.println("2 - Remover Equipamento");
			System.out.println("3 - Alterar Equipamento");
			System.out.println("4 - Pesquisar Equipamento");
			System.out.println("5 - Listar Equipamento");
			System.out.println("6 - Sair");
			System.out.println("");
			System.out.print("Selecione a opção: ");
			
			opcao = leitor.nextInt();
			
			switch(opcao) {
				case 1:
					equip.inserirEquipamento();
					break;
				case 2:
					equip.removerEquipamento();
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					equip.listarEquipamento();
					break;
				default:
					System.out.println("Finalizando");
					return;
			}
			
		} // Fim while
	}

}
