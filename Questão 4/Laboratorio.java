package senai;

public class Laboratorio extends Sala {
	private LaboratorioTipos tipo;

	public Laboratorio(String identificacao, int capacidade, String apelido, String titulo, LaboratorioTipos tipo) {
		super(identificacao, capacidade, apelido, titulo);
		this.tipo = tipo;
	}

	public LaboratorioTipos getTipo() {
		return tipo;
	}

	public void setTipo(LaboratorioTipos tipo) {
		this.tipo = tipo;
	}
}
