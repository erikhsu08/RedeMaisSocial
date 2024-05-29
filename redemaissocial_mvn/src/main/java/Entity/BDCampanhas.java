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
	
	public Campanha buscarCampanha(int id) {
		for (Campanha campanha : listaCampanhas) {
			if (campanha.getId() == id) {
				return campanha;
			}
		}
		return null;
	}
	
	
}
