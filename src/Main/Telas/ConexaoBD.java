package Main.Telas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import model.ModuloConexao;

public class ConexaoBD {
    
    public static boolean inserirJogo(Jogos jogo, int idUsuario) throws SQLException { // Adicionando idUsuario como parâmetro
        Connection conexao = ModuloConexao.conectar();
        if (conexao == null) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        String dataString = jogo.getData().toString();
        String horarioString = jogo.getHorario().toString();
            
        String sql = "INSERT INTO jogos_brasileirao (data, horario, campeonato, preco, estadio, time_casa, time_visitante) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, dataString);
            pstmt.setString(2, horarioString);
            pstmt.setString(3, jogo.getCampeonato());
            pstmt.setString(4, jogo.getPreco());
            pstmt.setString(5, jogo.getEstadio());
            pstmt.setString(6, jogo.getTimeCasa());
            pstmt.setString(7, jogo.getTimeVisitante());
                
            int linhasAfetadas = pstmt.executeUpdate();
            if (linhasAfetadas > 0) {
                ResultSet generatedKeys = pstmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idJogo = generatedKeys.getInt(1);
                    if (adicionarAoHistorico(idUsuario, idJogo)) {
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao adicionar jogo ao histórico do usuário.", "Erro", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao obter o ID do jogo inserido.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir jogo no banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private static boolean adicionarAoHistorico(int idUsuario, int idJogo) throws SQLException {
        Connection conexao = ModuloConexao.conectar();
        if (conexao == null) {
            return false;
        }
        
        String sql = "INSERT INTO historico_ingressos (id_usuario, id_jogo, data_compra) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, idUsuario);
            pstmt.setInt(2, idJogo);
            pstmt.setDate(3, java.sql.Date.valueOf(LocalDate.now()));
                
            int linhasAfetadas = pstmt.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar ao histórico do usuário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
