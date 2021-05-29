package modelo;

public class Usuarios extends Cargos {

    private int codUsu;
    private String nomUsu;
    private String claUsu;
    private String Sueldo;

    public Usuarios() {
    }

    public Usuarios(String nomUsu, String claUsu, String nomCar) {
        super(nomCar);
        this.nomUsu = nomUsu;
        this.claUsu = claUsu;
    }

    public Usuarios(int codUsu, String nomUsu, String claUsu) {
        this.codUsu = codUsu;
        this.nomUsu = nomUsu;
        this.claUsu = claUsu;
    }

    public Usuarios(int codUsu, String nomUsu, String claUsu, String Sueldo, String nomCar) {
        super(nomCar);
        this.codUsu = codUsu;
        this.nomUsu = nomUsu;
        this.claUsu = claUsu;
        this.Sueldo = Sueldo;
    }

    public Usuarios(int codUsu, String nomUsu, String Sueldo, String nomCar) {
        super(nomCar);
        this.codUsu = codUsu;
        this.nomUsu = nomUsu;
        this.Sueldo = Sueldo;
    }

    public int getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(int codUsu) {
        this.codUsu = codUsu;
    }

    public String getNomUsu() {
        return nomUsu;
    }

    public void setNomUsu(String nomUsu) {
        this.nomUsu = nomUsu;
    }

    public String getClaUsu() {
        return claUsu;
    }

    public void setClaUsu(String claUsu) {
        this.claUsu = claUsu;
    }

    public String getSueldo() {
        return Sueldo;
    }

    public void setSueldo(String Sueldo) {
        this.Sueldo = Sueldo;
    }

}
