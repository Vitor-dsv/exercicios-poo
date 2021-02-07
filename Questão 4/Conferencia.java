package senai;

public class Conferencia extends Sala {
	private ConferenciaTipos tipo;

	public Conferencia(String identificacao, int capacidade, String apelido, String titulo, ConferenciaTipos tipo) {
		super(identificacao, capacidade, apelido, titulo);
		this.tipo = tipo;
	}

	public ConferenciaTipos getTipo() {
		return tipo;
	}

	public void setTipo(ConferenciaTipos tipo) {
		this.tipo = tipo;
	}
}
