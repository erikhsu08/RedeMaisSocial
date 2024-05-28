package control;

import Entity.Candidatura;
import Entity.BDCandidaturas;

import java.util.LinkedList;

public class CtrlCandidaturas {

    public LinkedList<Candidatura> listarCandidaturas(){
    	return BDCandidaturas.getInstance().listarCandidaturas();
    }
    
    public void solicitaCandidatura(String nome, String data_nascimento, String descricao){
        Candidatura cand = new Candidatura(nome,data_nascimento,descricao);
        BDCandidaturas.getInstance().adicionaCandidatura(cand);
    }
    //implementar rejeita candidatura(remove candidatura sem diminuir vagas da campanha).
    public void aceitaCandidatura(Candidatura cand) {
    	BDCandidaturas.getInstance().removeCandidatura(cand);
    }
    //diminuir numero de vagas da campanha.
    public void rejeitaCandidatura(Candidatura cand) {
        BDCandidaturas.getInstance().removeCandidatura(cand);
    }
}
