package com.gian.BO;

import com.gian.DAO.pessoasDAO;
import com.gian.DTO.Pessoas;
import java.util.List;

public class pessoasBO {

    public boolean inserir(Pessoas pessoas){
        if (existe(pessoas) != true) {
        	pessoasDAO pessoasDAO = new pessoasDAO();
            return pessoasDAO.inserir(pessoas);
        }
        return false;
    }

    public boolean existe(Pessoas pessoas){
        pessoasDAO PD = new pessoasDAO();
        return PD.existe(pessoas);
    }

    public boolean alterar(Pessoas pessoas){
        pessoasDAO PD = new pessoasDAO();
        return PD.alterar(pessoas);
    }
    public boolean excluir(Pessoas pessoas){
        pessoasDAO PD = new pessoasDAO();
        return PD.excluir(pessoas);
    }
    
    public List<Pessoas> pesquisarTodos(){
        pessoasDAO PDAO = new pessoasDAO();
        return PDAO.pesquisarTodos();
    }
  
}
