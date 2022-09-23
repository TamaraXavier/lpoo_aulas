package dao;
import model.Participante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ParticipanteDAO extends BaseDAO {
    public static List<Participante> selectParticipantes() {
        final String sql = "SELECT * FROM participante";
        try
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                        ResultSet rs = pstmt.executeQuery()
                )
        {
            List<Participante> participantes = new ArrayList<>();
            while (rs.next()) {
                participantes.add(resultsetToParticipante(rs));
            }
            return participantes;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Participante> selectParticipantesByName(String nome) {
        final String sql = "SELECT * FROM participante WHERE nome LIKE ? ORDER BY nome";
        try
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
            pstmt.setString(1, nome.toLowerCase() + "%");
            ResultSet rs = pstmt.executeQuery();
            List<Participante> participantes = new ArrayList<>();
            while (rs.next()) {
                participantes.add(resultsetToParticipante(rs));
            }
            return participantes;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Participante selectParticipanteById(int id_part) {
        final String sql = "SELECT * FROM participante WHERE id_part=?";
        try
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
            pstmt.setInt(1, id_part);
            ResultSet rs = pstmt.executeQuery();
            Participante participante = null;
            if(rs.next()) {
                participante = resultsetToParticipante(rs);
            }
            rs.close();
            return participante;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean insertParticipante(Participante participante) {
        final String sql = "INSERT INTO participante (nome, login, senha, email, endereco, telefone) VALUES (?, ?, ?, ?, ?, ?)";
        try
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
            pstmt.setString(1, participante.getNome());
            pstmt.setString(2, participante.getLogin());
            pstmt.setString(3, participante.getSenha());
            pstmt.setString(4, participante.getEmail());
            pstmt.setString(5, participante.getEndereco());
            pstmt.setString(6, participante.getTelefone());
            //pstmt.setBoolean(7, participante.getSituacao());
            int count = pstmt.executeUpdate();
            return count > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updateParticipante(Participante participante) {
        final String sql = "UPDATE participante SET nome=?, login=?, senha=?, email=?, endereco=?, telefone=? WHERE id_part=?";
        try
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
            pstmt.setString(1, participante.getNome());
            pstmt.setString(2, participante.getLogin());
            pstmt.setString(3, participante.getSenha());
            pstmt.setString(4, participante.getEmail());
            pstmt.setString(5, participante.getEndereco());
            pstmt.setString(6, participante.getTelefone());
            pstmt.setLong(7, participante.getId_part());
            int count = pstmt.executeUpdate();
            return count > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean DeleteParticipante(int id_part) {
        final String sql = "DELETE FROM participante WHERE id_part=?";
        try
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
            pstmt.setInt(1, id_part);
            int deletado = pstmt.executeUpdate();
            if (deletado == 0) {
                return false;
            } else return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static Participante resultsetToParticipante(ResultSet rs) throws SQLException {
        Participante p = new Participante();
        p.setId_part(rs.getInt("id_part"));
        p.setNome(rs.getString("nome"));
        p.setLogin(rs.getString("login"));
        p.setSenha(rs.getString("senha"));
        p.setEmail(rs.getString("email"));
        p.setEndereco(rs.getString("endereco"));

        return p;
    }

    public static void main(String[] args) {
        System.out.println(selectParticipantes());
    }
}














