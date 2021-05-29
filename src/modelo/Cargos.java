package modelo;

public class Cargos {

    private int codCargo;
    private String nomCar;

    public Cargos() {
    }

    public Cargos(String nomCar) {
        this.nomCar = nomCar;
    }

    public Cargos(int codCargo, String nomCar) {
        this.codCargo = codCargo;
        this.nomCar = nomCar;
    }

    public int getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(int codCargo) {
        this.codCargo = codCargo;
    }

    public String getNomCar() {
        return nomCar;
    }

    public void setNomCar(String nomCar) {
        this.nomCar = nomCar;
    }

    @Override
    public String toString() {
        return nomCar;
    }

}
