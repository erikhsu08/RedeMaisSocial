package control;

import Entity.BDVagas;
import Entity.Campanha;
import Entity.Vaga;
import Entity.BDCampanhas;

import java.util.LinkedList;


public class CtrlCampanhas {
	
	
	public void criarCampanha(String nome, String descricao, String local, String data, int num_vagas) {
		Campanha campanha = new Campanha(nome, descricao, local, data, num_vagas);
		BDCampanhas.getInstance().adicionarCampanha(campanha);
	}
	
	public Campanha buscarCampanha(String nome) {
        return BDCampanhas.getInstance().buscarCampanha(nome);
    }
	
	public void addVagaCampanha(Campanha campanha, String tipo, int quantidade) {
        Vaga vaga = new Vaga(tipo, quantidade, campanha.getNome());
        campanha.adicionarVaga(vaga);
        BDVagas.getInstance().adicionarVaga(vaga);
    }
	
	public LinkedList<Campanha> listarCampanhas() {
        return BDCampanhas.getInstance().listarCampanhas();
    }
}
