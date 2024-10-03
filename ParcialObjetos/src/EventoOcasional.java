public class EventoOcasional extends Recital{
    private String motivo;
    private String nombreContratante;
    private String dia;

    public EventoOcasional(String nombreBanda, int cantTemas, String motivo, String nombreContratante, String dia){
        super(nombreBanda,cantTemas);
        this.motivo = motivo;
        this.nombreContratante = nombreContratante;
        this.dia = dia;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getNombreContratante() {
        return nombreContratante;
    }

    public void setNombreContratante(String nombreContratante) {
        this.nombreContratante = nombreContratante;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void actuar(){
        if (this.getMotivo() == "Beneficiencia"){
            System.out.println("Recuerden colaborar con " + this.getNombreContratante());
        } else if (this.getMotivo() == "Show TV") {
            System.out.println("Saludos amigos televidentes");
        } else if (this.getMotivo() == "Show privado"){
            System.out.println("Un saludo para ..." + this.getNombreContratante());
        }
        super.actuar();
    }

    public double calcularCosto(){
        if (this.getMotivo() == "Beneficencia"){
            return 0;
        } else if (this.getMotivo() == "Show TV") {
            return 50000;
        } else if (this.getMotivo() == "Show privado"){
            return 150000;
        }
        return -1;
    }

}
