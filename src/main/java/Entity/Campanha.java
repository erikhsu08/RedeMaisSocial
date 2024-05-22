package Entity;
public class Campanha {
	String nome;
	String descricao;
	String local;
	String data;
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
	public Campanha(String nome, String descricao, String local, String data) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.local = local;
		this.data = data;
	}
	public Campanha() {
		nome = "";
		descricao = "";
		local = "";
		data = "";
	}
	
}