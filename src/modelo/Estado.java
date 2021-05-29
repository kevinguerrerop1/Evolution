package modelo;

public class Estado {

    private int codEs;
    private String nomes;

    public Estado() {
    }

    public Estado(int codEs, String nomes) {
        this.codEs = codEs;
        this.nomes = nomes;
    }

    public Estado(String nomes) {
        this.nomes = nomes;
    }

    public int getCodEs() {
        return codEs;
    }

    public void setCodEs(int codEs) {
        this.codEs = codEs;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    @Override
    public String toString() {
        return nomes;
    }

}
