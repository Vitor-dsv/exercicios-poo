package cinemagnc;

import java.util.List;

public class Filme {
	private String genero;
	private String tituloOriginal;
	private String tituloAdaptado;
	private int duracao;
	private int faixaEtaria;
	private String paisOrigem;
	private List<Ator> atores;
	private String diretor;
	private String tipoExibicao;
	
	public Filme(String genero, String tituloOriginal, String tituloAdaptado, int duracao, int faixaEtaria,
			String paisOrigem, List<Ator> atores, String diretor, String tipoExibicao) {
		this.genero = genero;
		this.tituloOriginal = tituloOriginal;
		this.tituloAdaptado = tituloAdaptado;
		this.duracao = duracao;
		this.faixaEtaria = faixaEtaria;
		this.paisOrigem = paisOrigem;
		this.atores = atores;
		this.diretor = diretor;
		this.tipoExibicao = tipoExibicao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public String getTituloAdaptado() {
		return tituloAdaptado;
	}

	public void setTituloAdaptado(String tituloAdaptado) {
		this.tituloAdaptado = tituloAdaptado;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public List<Ator> getAtores() {
		return atores;
	}

	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getTipoExibicao() {
		return tipoExibicao;
	}

	public void setTipoExibicao(String tipoExibicao) {
		this.tipoExibicao = tipoExibicao;
	}
}
