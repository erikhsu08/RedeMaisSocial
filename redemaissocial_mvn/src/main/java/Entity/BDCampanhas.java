package Entity;

import java.util.LinkedList;


public class BDCampanhas {
	private static BDCampanhas instance;
	LinkedList<Campanha> listaCampanhas = new LinkedList<>();
	
	private BDCampanhas() {}
	
	public static BDCampanhas getInstance() {
		if (instance == null) {
			instance = new BDCampanhas();
		}
		return instance;
	}
	
	public void adicionarCampanha(Campanha campanha) {
		listaCampanhas.add(campanha);
	}
	
	public LinkedList<Campanha> listarCampanhas(){
		return this.listaCampanhas;
	}
	
	public Campanha buscarCampanha(String nome) {
		for (Campanha campanha : listaCampanhas) {
			if (campanha.getNome().equalsIgnoreCase(nome)) {
				return campanha;
			}
		}
		return null;
	}
	
	
}
