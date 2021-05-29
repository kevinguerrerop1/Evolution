package modelo;

public class clientes extends Plan {

    private int n_socio;
    private String nombre;
    private String apellido;
    private String n_con;
    private String rut;
    private String f_inicio;
    private String f_termino;
    private String vpla;

    public clientes() {
    }

    public clientes(int n_socio, String nombre, String apellido, String n_con, String rut, String f_inicio, String f_termino, String plan, String estado, String vpla) {
        this.n_socio = n_socio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.n_con = n_con;
        this.rut = rut;
        this.f_inicio = f_inicio;
        this.f_termino = f_termino;
        this.vpla = vpla;

    }

    public clientes(int n_socio, String nombre, String apellido, String n_con, String rut, String f_inicio, String f_termino, String vpla, String nompl, String nomsx, String nomes) {
        super(nompl, nomsx, nomes);
        this.n_socio = n_socio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.n_con = n_con;
        this.rut = rut;
        this.f_inicio = f_inicio;
        this.f_termino = f_termino;
        this.vpla = vpla;
    }

    public clientes(int n_socio, String nombre, String apellido, String rut, String f_inicio, String f_termino) {
        this.n_socio = n_socio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.f_inicio = f_inicio;
        this.f_termino = f_termino;
    }

    

   

    public int getN_socio() {
        return n_socio;
    }

    public void setN_socio(int n_socio) {
        this.n_socio = n_socio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getN_con() {
        return n_con;
    }

    public void setN_con(String n_con) {
        this.n_con = n_con;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getF_inicio() {
        return f_inicio;
    }

    public void setF_inicio(String f_inicio) {
        this.f_inicio = f_inicio;
    }

    public String getF_termino() {
        return f_termino;
    }

    public void setF_termino(String f_termino) {
        this.f_termino = f_termino;
    }

    public String getVpla() {
        return vpla;
    }

    public void setVpla(String vpla) {
        this.vpla = vpla;
    }

    @Override
    public String toString() {
        return rut;

    }
}
