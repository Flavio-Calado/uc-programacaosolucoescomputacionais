import java.util.Scanner;

/* Nome do Aluno:  Flavio Calado
 * RA: 300009030
 * Nome do Programa: Pratica2Atividade3 
 * Descrição: Faça um programa que leia um número inteiro e 
 * mostre uma mensagem indicando se este número é par ou ímpar 
 * e se é positivo ou negativo.
 * Data: 04/04/2023
 */

public class Pratica2Atividade3 {
    public static void main(String[] args) {

        int a;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero");
        a = teclado.nextInt();
        teclado.close();
        
        if (a % 2 == 0) {
            System.out.print("Par");
        } else {
            System.out.print("Impar");
        }

        if (a >= 0) {
            System.out.print(" e positivo");
        } else {
            System.out.print(" e negativo");
        }
    }

}
