package com.gian.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.gian.Conexao.Conexao;
import com.gian.DTO.Pessoas;


public class pessoasDAO {
	final String NOMEDATABELA = "pessoas";
    public boolean inserir(Pessoas pessoas) {
        try {
            Connection conn = Conexao.conectar();
            String sql_nome = "INSERT INTO " + NOMEDATABELA + " (nome) VALUES (?);";
            String sql_idade = "INSERT INTO " + NOMEDATABELA + " (idade) VALUES (?);";
            String sql_sexo = "INSERT INTO " + NOMEDATABELA + " (sexo) VALUES (?);";
            String sql_cpf = "INSERT INTO " + NOMEDATABELA + " (cpf) VALUES (?);";
            String sql_data = "INSERT INTO " + NOMEDATABELA + " (data_acesso) VALUES (?);";
            PreparedStatement pn = conn.prepareStatement(sql_nome);
            PreparedStatement pi = conn.prepareStatement(sql_idade);
            PreparedStatement ps = conn.prepareStatement(sql_sexo);
            PreparedStatement pc = conn.prepareStatement(sql_cpf);
            PreparedStatement pd = conn.prepareStatement(sql_data);
            pn.setString(1, pessoas.getNome());
            pn.executeUpdate();
            pi.setInt(1, pessoas.getIdade());
            pi.executeUpdate();
            ps.setString(1, pessoas.getSexo());
            ps.executeUpdate();
            pc.setString(1, pessoas.getCpf());
            pc.executeUpdate();
            //pd.setDate(1, pessoas.getData());
            pd.executeUpdate();
            pn.close();
            pi.close();
            ps.close();
            pc.close();
            pd.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
        // add delete, update, and view and fix date
    }
}
