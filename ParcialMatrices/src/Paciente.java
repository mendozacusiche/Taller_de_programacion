public class Paciente {
    private String nombre;
    private boolean obraSocial;
    private double costo;

    public Paciente(String nombre, boolean abraSocial, double costo){
        this.nombre = nombre;
        this.obraSocial = abraSocial;
        this.costo = costo;
    }

    public String getNombre(){
        return nombre;
    }

}
