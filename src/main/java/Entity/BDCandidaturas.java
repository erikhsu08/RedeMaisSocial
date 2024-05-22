package Entity;

import java.util.LinkedList;
public class BDCandidaturas {

    LinkedList<Candidatura> listaCandidaturas = new LinkedList<Candidatura>();
    
    public void adcionaCandidatura(Candidatura candidatura){
        listaCandidaturas.add(candidatura);
    }
}