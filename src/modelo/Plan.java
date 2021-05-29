package modelo;

public class Plan extends Sexo {

    private int codpl;
    private String nompl;

    public Plan() {
    }

    public Plan(int codpl, String nompl) {
        this.codpl = codpl;
        this.nompl = nompl;
    }

    public Plan(String nompl, String nomsx, String nomes) {
        super(nomsx, nomes);
        this.nompl = nompl;
    }

    public int getCodpl() {
        return codpl;
    }

    public void setCodpl(int codpl) {
        this.codpl = codpl;
    }

    public String getNompl() {
        return nompl;
    }

    public void setNompl(String nompl) {
        this.nompl = nompl;
    }

    @Override
    public String toString() {
        return nompl;
    }

}
