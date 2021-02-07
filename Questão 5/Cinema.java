package cinemagnc;

public class Cinema {
	private String identificacao;
	private String nomeFantasia;
	private Endereco endereco;
	private int capacidadeTotal;
	private int qtdSalas;
	private int qtdSalasDisponiveis;
	private String telefone;
	
	public Cinema(String identificacao, String nomeFantasia, Endereco endereco, int capacidadeTotal, int qtdSalas,
			int qtdSalasDisponiveis, String telefone) {
		this.identificacao = identificacao;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		this.capacidadeTotal = capacidadeTotal;
		this.qtdSalas = qtdSalas;
		this.qtdSalasDisponiveis = qtdSalasDisponiveis;
		this.telefone = telefone;
	}

	public String getIdentificacao() {
		return identificacao;
	}
	
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}
	
	public void setCapacidadeTotal(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}
	
	public int getQtdSalas() {
		return qtdSalas;
	}
	
	public void setQtdSalas(int qtdSalas) {
		this.qtdSalas = qtdSalas;
	}
	
	public int getQtdSalasDisponiveis() {
		return qtdSalasDisponiveis;
	}
	
	public void setQtdSalasDisponiveis(int qtdSalasDisponiveis) {
		this.qtdSalasDisponiveis = qtdSalasDisponiveis;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
