public class Main {
    public static void main(String[] args) {
        Recital unEvento = new EventoOcasional("EL zar",5,"Beneficencia","JUan","27/07/2024");
        Gira unaGira = new Gira("The cure",10,"Giraaa",10);

        unEvento.agregarTema("Tema 1");
        unEvento.agregarTema("Tema 2");

        unaGira.agregarTema("Tema 1");
        unaGira.agregarTema("Tema 2");
        unaGira.agregarTema("Tema 3");

        Fecha f = new Fecha("Ciudaddd", "12/4/2023");

        unaGira.agregarFecha(f);

        System.out.println(unEvento.calcularCosto());
        System.out.println(unaGira.calcularCosto());

        unEvento.actuar();
        unaGira.actuar();
    }
}