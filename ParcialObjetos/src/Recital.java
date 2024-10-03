public abstract class Recital {
    private String nombreBanda;
    private String[] temas;
    private int dimL;
    private int dimF;

    public Recital(String nombreBanda, int cantTemas){
        this.nombreBanda = nombreBanda;
        this.temas = new String[cantTemas];
        this.dimL = 0;
        this.dimF = cantTemas;
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public String[] getTemas() {
        return temas;
    }

    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    public void agregarTema(String nombre){
        this.temas[dimL] = nombre;
        this.dimL++;
    }

    public void actuar(){
        for (int i = 0; i < this.dimL; i++) {
            System.out.println("y ahora tocaremos ..." + this.temas[i]);
        }
    }
    public abstract double calcularCosto();
}
