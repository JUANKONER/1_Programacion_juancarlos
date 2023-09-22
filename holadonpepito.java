package JAVA;

public class holadonpepito {

    public static void main(String[] args) {
        String resultado; 
        resultado = obtenerSaludoDeDonPepito("Pepito");
        System.out.println(resultado);

        obtenerSaludoDeDonJose("Jose");
    }

    public static String obtenerSaludoDeDonPepito(String nombre) {
        String saludo;
        saludo  = "Hola Don " + nombre;
        return saludo;
    }

    public static void obtenerSaludoDeDonJose(String nombre) {
        String saludo;
        saludo = "Hola Don " + nombre;
        System.out.println(saludo);
    }
}