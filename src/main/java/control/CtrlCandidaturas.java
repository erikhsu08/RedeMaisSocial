package control;

import Entity.Candidatura;
import Entity.BDCandidaturas;

public class CtrlCandidaturas {

    BDCandidaturas BD = new BDCandidaturas();

    public void solicitaCandidatura(String nome, String data_nascimento, String descricao){
        Candidatura cand = new Candidatura(nome,data_nascimento,descricao);
        BD.adcionaCandidatura(cand);
    }

}