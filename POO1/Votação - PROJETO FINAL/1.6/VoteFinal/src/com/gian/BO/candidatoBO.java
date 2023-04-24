package com.gian.BO;

import com.gian.DAO.candidatosDAO;
import com.gian.DTO.Candidatos;
import java.util.List;


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
    
    public List<Candidatos> pesquisarTodos(){
        candidatosDAO CDAO = new candidatosDAO();
        return CDAO.pesquisarTodos();
    }
}
