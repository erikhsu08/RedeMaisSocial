package control;

import Entity.BDVagas;
import Entity.Campanha;
import Entity.Vaga;
import Entity.BDCampanhas;

import java.util.LinkedList;


public class CtrlCampanhas {
	
	
	public void criarCampanha(int id, String nome, String descricao, String local, String data, int num_vagas) {
		Campanha campanha = new Campanha(id, nome, descricao, local, data, num_vagas);
		BDCampanhas.getInstance().adicionarCampanha(campanha);
	}
	
	public Campanha buscarCampanha(int id) {
        return BDCampanhas.getInstance().buscarCampanha(id);
    }
	
	public void addVagaCampanha(int id, Campanha campanha, String tipo, int quantidade) {
        Vaga vaga = new Vaga(id, tipo, quantidade, campanha);
        campanha.adicionarVaga(vaga);
        BDVagas.getInstance().adicionarVaga(vaga);
    }
	
	public LinkedList<Campanha> listarCampanhas() {
        return BDCampanhas.getInstance().listarCampanhas();
    }
}
