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

    public boolean existe(Pessoas pessoas){
        pessoasDAO PD = new pessoasDAO();
        return PD.existe(pessoas);
    }

    
    // Create the other CRUD func to fix the errors
}
