package br.edu.unievangelica.ftt.treinamento;

public class  Curso {
	
	private String nome;
	private int duracao;
	private String descricao;
	private String palestrante;
	
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
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

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
