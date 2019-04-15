package br.edu.unievangelica.ftt.treinamento;

public class Disciplina {
	private String nome;
	private int credito;
	private String descricao;
	private String palestrante;
	private int horas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCredito() {
		return credito;
	}
	public void setCredito(int credito) {
		this.credito = credito;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPalestrante() {
		return palestrante;
	}
	public void setPalestrante(String palestrante) {
		this.palestrante = palestrante;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}

}
