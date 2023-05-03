package Pratica5;

public class Pratica5Tarefa2 {
    
    public static void main(String[] args) {
        
        int soma1 = sumDouble(1, 2);
        int soma2 = sumDouble(3, 2);
        int soma3 = sumDouble(2, 2);

        System.out.println(soma1);
        System.out.println(soma2);
        System.out.println(soma3);
    }

    public static int sumDouble(int a, int b) {
        int soma = a + b;

        if (a == b) {
            soma = soma * 2;
        }

        return soma;
    }
    
}
