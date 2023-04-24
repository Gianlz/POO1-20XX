package com.gian.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
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
        public List<Candidatos> pesquisarTodos() {
            try {
                Connection conn = Conexao.conectar();
                String sql = "SELECT * FROM " + NOMEDATABELA + ";";
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                List<Candidatos> listObj = montarLista(rs);
                return listObj;
            } catch (Exception e) {
                //System.err.println("Erro: " + e.toString());
                //e.printStackTrace();
                return null;
            }
        }
        
        public List<Candidatos> montarLista(ResultSet rs) {
            List<Candidatos> listObj = new ArrayList<Candidatos>();
            try {
                while (rs.next()) {
                    Candidatos obj = new Candidatos();
                    obj.setId(rs.getInt(1));
                    obj.setCandidato(rs.getString(2));
                    listObj.add(obj);
                }
                return listObj;
            } catch (Exception e) {
                //System.err.println("Erro: " + e.toString());
                //e.printStackTrace();
                return null;
            }
        }
        

}
