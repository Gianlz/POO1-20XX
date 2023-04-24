package com.gian.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gian.verifica.Verificacao;
import com.gian.DTO.Pessoas;
import com.gian.Conexao.Conexao;



public class pessoasDAO {
	final String NOMEDATABELA = "pessoas";
	Verificacao ver = new Verificacao();
    public boolean inserir(Pessoas pessoas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome,nascimento,sexo,cpf,voto)  VALUES (?,?,?,?,?);";
            		
            PreparedStatement ps = conn.prepareStatement(sql);
            //ps.setInt(1, 1);
            ps.setString(1, pessoas.getNome());
            ps.setString(2, pessoas.getNascimento());
            ps.setString(3, pessoas.getSexo());
            ps.setString(4, pessoas.getCpf());
            ps.setInt(5, pessoas.getVoto());
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
                ps.setString(1, pessoas.getCpf());
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
        public boolean alterar(Pessoas pessoas) {
            try {
                Connection conn = Conexao.conectar();

                //SET SQL_SAFE_UPDATES = 0;
                String sql = "UPDATE " + NOMEDATABELA + " SET nome = ?, nascimento = ?, sexo = ?, voto = ? WHERE cpf = ?;";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, pessoas.getNome());
                ps.setString(2, pessoas.getNascimento());
                ps.setString(3, pessoas.getSexo());
                ps.setInt(4, pessoas.getVoto());
                ps.setString(5, pessoas.getCpf());
                ps.executeUpdate();
                ps.close();
                conn.close();
                return true;
            } catch (Exception e) {
            	 e.printStackTrace();
                 return false;
            }
        }
        
        public boolean excluir(Pessoas pessoas) {
            try {
                Connection conn = Conexao.conectar();
                String sql = "DELETE FROM " + NOMEDATABELA + " WHERE cpf = ?;";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, pessoas.getCpf());
                ps.executeUpdate();
                ps.close();
                conn.close();
                return true;
            } catch (Exception e) {
            	 e.printStackTrace();
                 return false;
            }
        }

}
