public class Main {
    public static void main(String[] args) {
        Agenda unaAgenda = new Agenda();
        Paciente juan, pedro, fran, lucas;

        //
        juan = new Paciente("Juan",false, 5000);
        pedro = new Paciente("Pedro", true,10000);
        fran = new Paciente("Fran", true, 5600);
        lucas = new Paciente("Lucas", false, 17000);

        // turnos 5 dias 6 turnos
        unaAgenda.agendarPaciente(juan,1,1);
        unaAgenda.agendarPaciente(pedro,2,2);
        unaAgenda.agendarPaciente(fran,2,3);
        unaAgenda.agendarPaciente(lucas, 5,5);



        if(unaAgenda.tieneTurnoAgendado("Juan",1))
            System.out.println("Juan tiene un turno el dia 1");
        else
            System.out.println("Juan no tiene un turno agendado el dia 1");


    }
}