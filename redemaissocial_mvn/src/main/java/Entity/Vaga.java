package Entity;

public class Vaga {
    String titulo;
    String campanha;
    int qtd;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(String qtd) {
        this.qtd = 0;
    }
    public String getCampanha() {
        return campanha;
    }

    public void setCampanha(String campanha) {
        this.campanha = campanha;
    }


	public Vaga(String titulo, int quantidade, String campanha) {
		this.titulo = titulo;
		this.qtd = quantidade;
		this.campanha = campanha;
	}
	
	@Override
    public String toString() {
        return "Vaga [titulo=" + titulo + ", qtd=" + qtd + ", campanha=" + campanha + "]";
    }
	
}