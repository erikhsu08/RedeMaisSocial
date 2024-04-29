
public class Candidatura {
	String nome;
	int data_nascimento;
	String descricao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(int data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Candidatura(String nome, int data_nascimento, String descricao) {
		super();
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.descricao = descricao;
	}
	public Candidatura() {
		nome = "";
		data_nascimento = 0;
		descricao = "";
	}
	
}
