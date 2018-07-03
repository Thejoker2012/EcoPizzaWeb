package com.pizzaweb.models;

public class Pedido extends ItensPedido{
	
	private String idPedido;
	private String itensPedido;
	private float valorPedido;
	
	
	public float getValorPedido() {
		return valorPedido;
	}
	public void setValorPedido(float valorPedido) {
		this.valorPedido = valorPedido;
	}
	public String getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}
	public String getItensPedido() {
		return itensPedido;
	}
	public void setItensPedido(String itensPedido) {
		this.itensPedido = itensPedido;
	}
}
