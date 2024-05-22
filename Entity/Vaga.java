package Entity;

public class Vaga {
    String titulo;
    String ong;
    String local;
    String campanha;
    String descricao;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getOng() {
        return ong;
    }
    public void setOng(String ong) {
        this.ong = ong;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getCampanha() {
        return campanha;
    }
    public void setCampanha(String campanha) {
        this.campanha = campanha;
    }


    public Vaga(String titulo, String ong, String local, String campanha) {
        super();
        this.titulo = titulo;
        this.ong = ong;
        this.local = local;
        this.campanha = campanha;
    }
}
