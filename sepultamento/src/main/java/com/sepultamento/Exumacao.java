package com.sepultamento;

public class Exumacao {
  private int idExumacao;
	private String data; 
	private Sepultamento sepultamento;
	
	public Exumacao(int idExumacao, String data, Sepultamento sepultamento) {
		super();
		this.idExumacao = idExumacao;
		this.data = data;
		this.sepultamento = sepultamento;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Sepultamento getSepultamento() {
		return sepultamento;
	}
	public void setSepultamento(Sepultamento sepultamento) {
		this.sepultamento = sepultamento;
	}
	public int getIdExumacao() {
		return idExumacao;
	}
	
	public void exumar(){
    this.sepultamento.getCorpo().exumar();
    this.sepultamento.getTumulo().desoculpar();
  }
    
	
}
