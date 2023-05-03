package Pratica5;

public class Pratica5Tarefa4 {

    public static void main(String[] args) {
        System.out.println( close10 (11, -11) );
        System.out.println( close10 (3, 8) );        
    }

    public static int close10(int a, int b) {
        int distanciaA, distanciaB;

        distanciaA = a - 10;
        distanciaB = b - 10;

        if (a < 10) {
            distanciaA = -1*distanciaA;
        }

        if (b < 10) {
            distanciaB = -1*distanciaB;
        }

        if (distanciaA > distanciaB) {
            return b;            
        } else {
            return a;
        }
    }
    
}
