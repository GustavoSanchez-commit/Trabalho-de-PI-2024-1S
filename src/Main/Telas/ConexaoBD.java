package Main.Telas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModuloConexao;

public class ConexaoBD {
    public static boolean inserirJogo(Jogos jogo) {
        Connection conexao = ModuloConexao.conectar();
        if (conexao == null) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        String dataString = jogo.getData().toString();
        String horarioString = jogo.getHorario().toString();
            
        String sql = "INSERT INTO jogos_brasileirao (data, horario, campeonato, preco, estadio, time_casa, time_visitante) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, dataString);
            pstmt.setString(2, horarioString);
            pstmt.setString(3, jogo.getCampeonato());
            pstmt.setString(4, jogo.getPreco());
            pstmt.setString(5, jogo.getEstadio());
            pstmt.setString(6, jogo.getTimeCasa());
            pstmt.setString(7, jogo.getTimeVisitante());
                
            int linhasAfetadas = pstmt.executeUpdate();
            if (linhasAfetadas > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }
}
