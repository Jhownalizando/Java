package exercicioTres;

public class Equipamento {
	
	private int numeroPatrimonio;
	private int dataAquisicao;
	private String tipoEquipamento;
	private String descricao;
	
	public Equipamento(int numeroPatrimonio, int dataAquisicao, String tipoEquipamento, String descricao) {

		this.numeroPatrimonio = numeroPatrimonio;
		this.dataAquisicao = dataAquisicao;
		this.tipoEquipamento = tipoEquipamento;
		this.descricao = descricao;
	}

	public int getNumeroPatrimonio() {
		return numeroPatrimonio;
	}

	public void setNumeroPatrimonio(int numeroPatrimonio) {
		this.numeroPatrimonio = numeroPatrimonio;
	}

	public int getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(int dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public String getTipoEquipamento() {
		return tipoEquipamento;
	}

	public void setTipoEquipamento(String tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
