package cinemagnc;

public class Ator {
	private String identificacao;
	private String nome;
	private String nacionalidade;
	private int idade;
	
	public Ator(String identificacao, String nome, String nacionalidade, int idade) {
		this.identificacao = identificacao;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
	}
	
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
