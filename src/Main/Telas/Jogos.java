package Main.Telas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Jogos {
    private LocalDate data;
    private LocalTime horario;
    private String preco;
    private String estadio;
    private String timeCasa;
    private String timeVisitante;
    private String campeonato;

    public Jogos(LocalDate data, LocalTime horario, String campeonato, String preco, String estadio, String timeCasa, String timeVisitante) {
        this.data = data;
        this.horario = horario;
        this.preco = preco;
        this.estadio = estadio;
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.campeonato = campeonato;
    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(String timeCasa) {
        this.timeCasa = timeCasa;
    }

    public String getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }
}
