public class Gira extends Recital{
    private String nombre;
    private Fecha[] fechas;
    private int fechaActual;
    private int dimL;
    private int dimF;

        public Gira(String nombreBanda, int cantTemas, String nombre, int cantFechas){
            super(nombreBanda,cantTemas);
            this.nombre = nombre;
            this.fechas = new Fecha[cantFechas];
            this.dimL = 0;
            this.dimF = cantFechas;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha[] getFechas() {
        return fechas;
    }

    public void setFechas(Fecha[] fechas) {
        this.fechas = fechas;
    }

    public int getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(int fechaActual) {
        this.fechaActual = fechaActual;
    }

    public void agregarFecha(Fecha fecha){
        this.fechas[dimL] = fecha;
        this.dimL++;
    }

    public void actuar(){
            System.out.println("Buenas noches ..." + this.fechas[this.fechaActual].getCiudad());
            super.actuar();
            this.setFechaActual(this.getFechaActual() + 1);
    }

    public double calcularCosto(){
            return this.dimL * 30000;
    }

}
