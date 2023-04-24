package com.gian.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gian.DTO.Votantes;
import com.gian.Conexao.Conexao;


public class votantesDAO {
	final String NOMEDATABELA = "votantes";
    public boolean inserir(Votantes voto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (votoFem, votoMasc) VALUES (?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, voto.getVotoFem());
            ps.setInt(2, voto.getVotoMasc());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean existeMasc(Votantes voto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE votoMasc = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, voto.getVotoMasc());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ps.close();
                rs.close();
                conn.close();
                return true;
            }
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
        return false;
    

}
    public boolean existeFem(Votantes voto) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE votoFem = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, voto.getVotoFem());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ps.close();
                rs.close();
                conn.close();
                return true;
            }
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
        return false;
    

}
    
}
