package JAVA;

public class ejemplo {
    public static void main(String[] args) {
        calculadoraConNumerosPares(2, 2);
    }

    public static void calculadoraConNumerosPares(int numero1, int numero2){
        int resultado;

        resultado = numero1 + numero2;

        boolean var_result = esPar(resultado);

        if(var_result == true){
            System.out.println(resultado);
        }else{
            System.out.println(0);
        }
    }

    public static boolean esPar(int numero){
        //ALGORITMO QUE CALCULA SI UN NUMERO ES PAR

        boolean esPar = false;
        return esPar;
    }


}
