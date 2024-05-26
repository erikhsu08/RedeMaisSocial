package Entity;

import java.util.LinkedList;


public class Campanha {
	String nome;
	String descricao;
	String local;
	String data;
	int num_vagas;
	LinkedList<Vaga> vagas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getNumVagas() {
		return num_vagas;
	}
	public void setNumVagas(int num_vagas) {
		this.num_vagas = num_vagas;
	}
	
	public Campanha(String nome, String descricao, String local, String data, int num_vagas) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.local = local;
		this.data = data;
		this.num_vagas = num_vagas;
		this.vagas = new LinkedList<>();
	}
	public Campanha() {
		this.vagas = new LinkedList<>();
	}
	
	public void adicionarVaga(Vaga vaga) {
        this.vagas.add(vaga);
    }
	
	public LinkedList<Vaga> getVagas() {
        return vagas;
    }
	
	@Override
    public String toString() {
        return "Campanha [nome=" + nome + ", descricao=" + descricao + ", local=" + local + ", data=" + data
                + ", num_vagas=" + num_vagas + ", vagas=" + vagas + "]";
    }
	
}