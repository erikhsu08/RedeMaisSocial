package control;

import Entity.Candidatura;
import Entity.BDCandidaturas;
import Entity.BDVagas;
import Entity.Vaga;

import java.util.LinkedList;

public class CtrlCandidaturas {

    public LinkedList<Candidatura> listarCandidaturas(){
    	return BDCandidaturas.getInstance().listarCandidaturas();
    }
    
    public Candidatura GetCandPorId(LinkedList<Candidatura> candidaturas, int id) {
    	for (Candidatura cand: candidaturas) {
    		if (cand.getId() == id) {
    			return cand;
    		}
    	}
    	return null;
    }
    
    public boolean validaCandidatura(int id) {
    	Candidatura cand = GetCandPorId(listarCandidaturas(), id);
    	if (cand == null) {
    		return false;
    	}
    	return true;
    }
    
    public void solicitaCandidatura(int id_cand, String nome, String data_nascimento, String descricao, int id_vaga){
    	for (Vaga vaga : BDVagas.getInstance().listarVagas()) {
              if (vaga.getId() == id_vaga) {
            	  Candidatura cand = new Candidatura(id_cand, nome,data_nascimento,descricao,vaga);
                  BDCandidaturas.getInstance().adicionaCandidatura(cand);
                  break;
              }
        }
    }
    
    public void aceitaCandidatura(Candidatura cand) {
    	//Diminui em 1 a quantidades de espacos na vaga
    	cand.getVaga().setQtd(cand.getVaga().getQtd() - 1);
    	
    	//Deleta a candidatura
    	BDCandidaturas.getInstance().removeCandidatura(cand);
    	
    }
    
    public void rejeitaCandidatura(Candidatura cand) {
    	//Deleta a candidatura
    	BDCandidaturas.getInstance().removeCandidatura(cand);
    }
}