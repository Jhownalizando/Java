package exercicioTres;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ControlarEquipamento {
	
	private ArrayList<Equipamento> listaEquipamento;
	
	public ControlarEquipamento() {
		listaEquipamento = new ArrayList<Equipamento>();
	}
	
	// void inserir(Equipamento a)
	public void inserirEquip(Equipamento e) {
		listaEquipamento.add(e);
	}
	
	// void alterar(Equipamento a)
	
	
	// void excluir(Equipamento a)
	public void excluir(int numeroPatrimonio) {
		
		for(int i = 0; i < listaEquipamento.size(); i++) {
			// função get() pesquisa dentro da lista.
			if(listaEquipamento.get(i).getNumeroPatrimonio() == numeroPatrimonio) {
				listaEquipamento.remove(listaEquipamento.get(i));
			} else {
				System.out.println("");
				System.out.println("Codigo Invalido!");
				System.out.println("");
			}
		}
	}
	
	// Equipamento pesquisar(int numeroSerie)
	
	// Listar Equipamento
	public void exibir() {
		for(Equipamento e : listaEquipamento) {
			if(listaEquipamento != null && listaEquipamento.size() > 0) {
				System.out.println("Nº Patrimonio: " + e.getNumeroPatrimonio());
				System.out.println("Data Aquisição: " + e.getDataAquisicao());
				System.out.println("Tipo Equipamento: " + e.getTipoEquipamento());
				System.out.println("Descrição: " + e.getDescricao());
			} else {
				System.out.println("Lista vazia!");
		    }
		}
	}
	
}
