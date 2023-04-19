package Pratica3;

/* Nome do Aluno: Flavio Calado
* RA:
* Nome do Programa: 
* Descrição: Faça um programa que some os números de 1 a 100 e imprima
somente o valor total da soma
* Data: 18/04/2023
*/

public class Exercicio3 {
    public static void main(String[] args) {

        int soma = 0;
        int i;

        i = 1; // 1

        while (i <= 1000) {
            soma = i + soma; // 101
            i = i + 1; // 101
        }
        
        System.out.println(soma); // 1
    }
}
