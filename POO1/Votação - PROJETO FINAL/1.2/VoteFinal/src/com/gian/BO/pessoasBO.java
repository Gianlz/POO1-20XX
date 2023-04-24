package com.gian.BO;

import java.util.List;

import com.gian.DAO.pessoasDAO;
import com.gian.DTO.Pessoas;

public class pessoasBO {

    public boolean inserir(Pessoas pessoas){
        if (existe(pessoas) != true) {
        	pessoasDAO pessoasDAO = new pessoasDAO();
            return pessoasDAO.inserir(pessoas);
        }
        return false;
    }
    public boolean alterar(Pessoas pessoas){
    	pessoasDAO pessoasDAO = new pessoasDAO();
        return false;//marcasDAO.alterar(pessoas);
    }
    public boolean excluir(Pessoas pessoas){
        PessoasDAO pessoasDAO = new pessoasDAO();
        return false;//marcasDAO.excluir(pessoas);
    }
    public Pessoas procurarPorCodigo(Pessoas pessoas){
    	PessoasDAO pessoasDAO = new pessoasDAO();
        //return pessoasDAO.procurarPorCodigo(pessoas);
    }
    public Pessoas procurarPorDescricao(Pessoas pessoas){
        Pessoas pessoasDAO = new PessoasDAO();
        //return pessoasDAO.procurarPorDescricao(pessoas);
    }
    public boolean existe(Pessoas marca){
        PessoasDAO pessoasDAO = new PessoasDAO();
        return false;//pessoasDAO.existe(pessoas);
    }
    public List<Pessoas> pesquisarTodos(){
        PessoasDAO pessoasDAO = new PessoasDAO();
        return pessoasDAO.pesquisarTodos();
    }
    
    // Create the other CRUD func to fix the errors
}
