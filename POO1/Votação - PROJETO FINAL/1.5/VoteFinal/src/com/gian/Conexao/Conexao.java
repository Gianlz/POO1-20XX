package com.gian.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	final static String BD = "votebcc";
	
	public static Connection conectar() {
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/" + BD; // Ip do BD
            return DriverManager.getConnection(url,"root",""); // Em projetos mais sérios mudar senha
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
	
}
