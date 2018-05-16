package com.yourcodelab.model;

public class Veiculo {
	private String chassi;
	private String placa;
	private String cor;
	private String marca;
	
	private int anoFabricacao;
	private float valor;
	
	public Veiculo(String chassi, String placa, String cor, String marca, int anoFabricacao, float valor){
		this.chassi = chassi;
		this.placa = placa;
		this.cor = cor;
		this.marca = marca;
		
		this.anoFabricacao = anoFabricacao;
		this.valor = valor;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}
