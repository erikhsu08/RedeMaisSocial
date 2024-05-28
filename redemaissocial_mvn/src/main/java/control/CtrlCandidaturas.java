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
    
    public void solicitaCandidatura(String nome, String data_nascimento, String descricao, String tituloDaVaga){
    	for (Vaga vaga : BDVagas.getInstance().listarVagas()) {
              if (vaga.getTitulo().equalsIgnoreCase(tituloDaVaga)) {
            	  Candidatura cand = new Candidatura(nome,data_nascimento,descricao, vaga);
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