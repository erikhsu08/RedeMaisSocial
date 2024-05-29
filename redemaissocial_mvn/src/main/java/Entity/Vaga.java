package Entity;

public class Vaga {
	int id;
    String titulo;
    Campanha campanha;
    int qtd;
    
    public int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public Campanha getCampanha() {
        return campanha;
    }

    public void setCampanha(Campanha campanha) {
        this.campanha = campanha;
    }


	public Vaga(int id, String titulo, int quantidade, Campanha campanha) {
		this.id = id;
		this.titulo = titulo;
		this.qtd = quantidade;
		this.campanha = campanha;
	}
	
	@Override
    public String toString() {
        return "Vaga [id=" + id + " titulo=" + titulo + ", qtd=" + qtd + ", campanha=" + campanha.getNome() + ", id da campanha=" + campanha.getId() + "]";
    }
	
}