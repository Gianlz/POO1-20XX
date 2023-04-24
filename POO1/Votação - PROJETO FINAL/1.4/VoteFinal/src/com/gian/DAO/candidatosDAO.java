package com.gian.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gian.Conexao.Conexao;
import com.gian.DTO.Candidatos;


public class candidatosDAO {
	final String NOMEDATABELA = "candidato";
    public boolean inserir(Candidatos cand) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (cand) VALUES (?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cand.getCandidato());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
        
        public boolean existe(Candidatos pessoas) {
            try {
                Connection conn = Conexao.conectar();
                String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cand = ?;";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, pessoas.getCandidato());
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
