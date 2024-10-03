public class Agenda {
    private int dia;
    private int turno;
    private Paciente [][] matriz;

    public  Agenda(){
        // recordar que los arreglos en java comienzan desde cero
        this.dia = 5;
        this.turno = 6;
        this.matriz  = new Paciente[dia][turno];
    }

   public  void agendarPaciente(Paciente paciente, int dia, int hora){
       // Ajustar el día y la hora para que sean índices basados en 0
       dia--;
       hora--;
       matriz[dia][hora] = paciente;

   }

   public void liberarTurnos(String nombre){
       for (int dia = 0; dia < matriz.length; dia++) {
           for (int hora = 0; hora < matriz[dia].length; hora++) {

               if (this.matriz[dia][hora] != null && this.matriz[dia][hora].getNombre().equals(nombre))
                   this.matriz[dia][hora] = null;
           }

       }
   }

   public boolean tieneTurnoAgendado(String nombre, int dia){
        dia--;
        int hora = 0;
        boolean exite = false;

        while (hora < matriz[dia].length && !exite){

            if(matriz[dia][hora] != null && matriz[dia][hora].getNombre().equals(nombre))
                exite = true;
            else{
                exite = false;
                hora++;
            }

        }

        return exite;
   }

}
