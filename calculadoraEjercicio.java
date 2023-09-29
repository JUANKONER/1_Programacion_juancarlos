import java.util.Scanner;

public class calculadoraEjercicio {

    public static void main(String[] args) {
        Scanner scanerCal = new Scanner(System.in);

        System.out.println("Calculadora de Java");
        System.out.println("Introduca el primer número");
        Integer numero1 = scanerCal.nextInt();
        scanerCal.nextLine();
        System.out.println("Introduzca el tipo de calculo");
        String operador = scanerCal.nextLine();
        System.out.println("Introduzca el segundo número");
        Integer numero2 = scanerCal.nextInt();
        

    if(operador.equals("+")){
     
        Integer resultado = numero1 + numero2;
        System.out.println("Resultado: "+ resultado);
    }  
    else if(operador.equals("-")){
     Integer resultado = numero1 - numero2;
      System.out.println("Resultado: "+ resultado);
    }
    else if(operador.equals("*")){
     Integer resultado = numero1 * numero2;
      System.out.println("Resultado: "+ resultado);
    }
    else if(operador.equals("/")){
        if (numero2 != 0) {
            Integer resultado = numero1 / numero2;
             System.out.println("Resultado: "+ resultado);
        } else {
            System.out.println("Error: División por cero no permitida.");
            return;
        }
    }else
    {
        System.out.println("Operador no válido");

        return;
    }

}

}