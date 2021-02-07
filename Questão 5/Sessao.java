package cinemagnc;

import java.time.LocalDateTime;

public class Sessao {
	private LocalDateTime horarioInicio;
	private LocalDateTime horarioFim;
	private Filme filme;
	private Sala sala;
	private int publico;
	
	public Sessao(LocalDateTime horarioInicio, LocalDateTime horarioFim, Filme filme, Sala sala) {
		this.horarioInicio = horarioInicio;
		this.horarioFim = horarioFim;
		this.filme = filme;
		this.sala = sala;
	}

	public LocalDateTime getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(LocalDateTime horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public LocalDateTime getHorarioFim() {
		return horarioFim;
	}

	public void setHorarioFim(LocalDateTime horarioFim) {
		this.horarioFim = horarioFim;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public int getPublico() {
		return publico;
	}

	public void setPublico(int publico) {
		this.publico = publico;
	}
}
