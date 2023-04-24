package com.gian.BO;

import com.gian.DAO.votantesDAO;
import com.gian.DTO.Votantes;

public class votantesBO {
    public boolean inserir(Votantes votantes){
        if (existeFem(votantes) && existeMasc(votantes) != true) {
        	votantesDAO pessoasDAO = new votantesDAO();
            return pessoasDAO.inserir(votantes);
        }
        return false;
    }

    public boolean existeFem(Votantes votantes){
        votantesDAO PD = new votantesDAO();
        return PD.existeFem(votantes);
    }
    
    public boolean existeMasc(Votantes votantes){
        votantesDAO PD = new votantesDAO();
        return PD.existeMasc(votantes);
    }
    
    
}
