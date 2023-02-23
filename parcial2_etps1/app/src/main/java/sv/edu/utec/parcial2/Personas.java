package sv.edu.utec.parcial2;

public class Personas {
    private String nombre;
    private String cargo;
    private String compa;
    public Personas(String nombre, String cargo, String compa) {
        this.nombre=nombre;
        this.cargo=cargo;
        this.compa=compa;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCargo() {
        return cargo;
    }
    public String getCompa() {
        return compa;
    }
}
