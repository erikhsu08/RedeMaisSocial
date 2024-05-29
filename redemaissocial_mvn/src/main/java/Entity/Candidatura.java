package Entity;

public class Candidatura {
	int id;
    String nome;
    String data_nascimento;
    String descricao;
    Vaga vaga;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Vaga getVaga() {
    	return vaga;
    }
    public void setVaga(Vaga vaga) {
    	this.vaga = vaga;
    }
    
    public Candidatura(int id, String nome, String data_nascimento, String descricao, Vaga vaga) {
        super();
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.descricao = descricao;
        this.vaga = vaga;
    }
    public Candidatura() {
    	id = 0;
        nome = "";
        data_nascimento = "";
        descricao = "";
    }
    @Override
    public String toString() {
        return "Canditatura [Id=" + id + " Nome do voluntário=" + nome + ", Descrição=" + descricao + ", Data de nascimento=" + data_nascimento + "]";
    }

    

}