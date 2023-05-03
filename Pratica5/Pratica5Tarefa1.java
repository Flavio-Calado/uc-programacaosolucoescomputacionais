package Pratica5;

/*
 * Tarefa 1. Dado dois valores int não negativos, retornar verdadeiro se eles tiverem o mesmo último dígito, como com 27 e 57. 
 * Observe que o operador % "mod" calcula os restos, então 17 % 10 é 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true

public boolean lastDigit(int a, int b) {
  
}
 */

public class Pratica5Tarefa1 {

    public static void main(String[] args) {
        boolean resultado;
        resultado = lastDigit(6, 17);
        System.out.println(resultado);
    }

    public static boolean lastDigit(int a, int b) {
        int restoA = a % 10;
        int restoB = b % 10;

        if (restoA == restoB) {
            return true;
        } else {
            return false;
        }
    }  

}
