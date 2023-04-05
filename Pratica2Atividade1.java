/* Nome do Aluno:  Flavio Calado
 * RA: 300009030
 * Nome do Programa: Pratica2Atividade1 
 * Descrição: Faça um programa que leia dois números A e B e imprima o maior deles.
 * Data: 04/04/2023
 */
import java.util.Scanner;

public class Pratica2Atividade1 {

    public static void main(String[] args) {
        int a, b;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        a = teclado.nextInt();
        System.out.println("Digite o segundo numero:");
        b = teclado.nextInt();
        teclado.close();

        if (a > b) {
            System.out.println(a);
        } 
        else if (b > a) {
            System.out.println(b);
        }
        else {
            System.out.println("São iguais");
        }
    }

}