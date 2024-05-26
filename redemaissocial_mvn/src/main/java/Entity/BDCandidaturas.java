package Entity;

import java.util.LinkedList;
public class BDCandidaturas {
	private static BDCandidaturas instance;
    LinkedList<Candidatura> listaCandidaturas = new LinkedList<Candidatura>();
    
    public static BDCandidaturas getInstance(){
    	if (instance == null) {
              instance = new BDCandidaturas();
          }
    	return instance;
    }
    
    public void adicionaCandidatura(Candidatura candidatura){
        listaCandidaturas.add(candidatura);
    }
    public void removeCandidatura(Candidatura candidatura){
        listaCandidaturas.remove(candidatura);
    }
    
    public LinkedList<Candidatura> listarCandidaturas(){
    	return this.listaCandidaturas;
    }
}