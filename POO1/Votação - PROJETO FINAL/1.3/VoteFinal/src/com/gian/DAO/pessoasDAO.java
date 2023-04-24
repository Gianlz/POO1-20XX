package com.gian.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gian.DTO.Pessoas;
import com.gian.Conexao.Conexao;



public class pessoasDAO {
	final String NOMEDATABELA = "pessoas";
    public boolean inserir(Pessoas pessoas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (id, nome,nascimento,sexo,cpf)  VALUES (?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            //ps.setInt(1, 1);
            ps.setString(2, pessoas.getNome());
            ps.setString(3, Pessoas.dateToString(pessoas.getNascimento()));
            ps.setString(4, pessoas.getSexo());
            ps.setString(5, pessoas.getCpf());
            ps.executeUpdate();
            ps.close();
            conn.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }}
        
        public boolean existe(Pessoas pessoas) {
            try {
                Connection conn = Conexao.conectar();
                String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cpf = ?;";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(5, pessoas.getCpf());
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
        
        // add delete, update, and view and fix date
    }
}
