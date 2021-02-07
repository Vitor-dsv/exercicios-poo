package senai;

public class Sala {
	private String identificacao;
	private int capacidade;
	private String apelido;
	private String titulo;
	
	public Sala(String identificacao, int capacidade, String apelido, String titulo) {
		this.identificacao = identificacao;
		this.capacidade = capacidade;
		this.apelido = apelido;
		this.titulo = titulo;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
