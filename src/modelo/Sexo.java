package modelo;

public class Sexo extends Estado {

    private int codsx;
    private String nomsx;

    public Sexo() {
    }

    public Sexo(int codsx, String nomsx) {
        this.codsx = codsx;
        this.nomsx = nomsx;
    }

    public Sexo(String nomsx, String nomes) {
        super(nomes);
        this.nomsx = nomsx;
    }

    public int getCodsx() {
        return codsx;
    }

    public void setCodsx(int codsx) {
        this.codsx = codsx;
    }

    public String getNomsx() {
        return nomsx;
    }

    public void setNomsx(String nomsx) {
        this.nomsx = nomsx;
    }

    @Override
    public String toString() {
        return nomsx;
    }

}
