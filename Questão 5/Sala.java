package cinemagnc;

public class Sala {
	private String identificacao;
	private int capacidade;
	
	public Sala(String identificacao, int capacidade) {
		this.identificacao = identificacao;
		this.capacidade = capacidade;
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
}
