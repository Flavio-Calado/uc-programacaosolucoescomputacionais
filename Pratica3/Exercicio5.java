package Pratica3;

/* Nome do Aluno: Flavio Calado
* RA:
* Nome do Programa: 
* Descrição: Faça um programa que some os números de 1 a 100 e imprima
somente o valor total da soma
* Data: 18/04/2023
*/

public class Exercicio5 {
    public static void main(String[] args) {

        // 5! = 1 * 2 * 3 * 4 * 5

        int fatorial = 0;
        int n = 100;
        int i;

        for (i = 1; i <= n; i = i + 1) {
            fatorial = fatorial * i; // 100
        }

        System.out.println(fatorial); // 1


    }
}
