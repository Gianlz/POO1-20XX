package com.gian.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.gian.Conexao.Conexao;
import com.gian.DTO.Candidatos;

public class candidatosDAO {
	final String NOMEDATABELA = "candidatos";
    public boolean inserir(Candidatos cand) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (cand) VALUES (?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            //ps.setArray(1, cand.getCandidato());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
     // add delete, update, and view and fix setArray
    }
}
