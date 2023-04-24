package com.gian.BO;

import com.gian.DAO.candidatosDAO;
import com.gian.DTO.Candidatos;

public class candidatoBO {
    public boolean inserir(Candidatos candidato){
        if (existe(candidato) != true) {
        	candidatosDAO pessoasDAO = new candidatosDAO();
            return pessoasDAO.inserir(candidato);
        }
        return false;
    }

    public boolean existe(Candidatos pessoas){
        candidatosDAO PD = new candidatosDAO();
        return PD.existe(pessoas);
    }
}
