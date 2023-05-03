package Pratica5;

public class Pratica5Tarefa3 {

    public static void main(String[] args) {
        System.out.println( intMax(1, 2, 3) );
        System.out.println( intMax(1, 3, 2) );
        System.out.println( intMax(3, 2, 1) );
        System.out.println( intMax(2, 2, 2) );
    }

    public static int intMax(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        }
        else 
        if (b >= a && b >= c) {
            return b;
        }
        else 
        if (c >= b && c >= a) {
            return c;
        }

        return 0;
    }
    
}
