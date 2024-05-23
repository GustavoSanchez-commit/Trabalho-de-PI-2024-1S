package Main.Telas;

import Main.VerificadorLogin;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    @Override
    public String toString() {
        return "Jogos{" + "data=" + data + ", horario=" + horario + ", preco=" + preco + ", estadio=" + estadio + ", timeCasa=" + timeCasa + ", timeVisitante=" + timeVisitante + ", campeonato=" + campeonato + '}';
    }
    public static void adicionar(Jogos jogo, String metodoPagamento) {
        try {
            int idUsuario = VerificadorLogin.getUsuarioLogado().getId();

            if (ConexaoBD.inserirJogo(jogo, idUsuario)) {
                JOptionPane.showMessageDialog(null, "Pagamento Concluído com " + metodoPagamento + ". Verifique seu ingresso em 'Seus ingressos'");
            } else {
                JOptionPane.showMessageDialog(null, "Erro no Pagamento.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Jogos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
