import java.util.Scanner;

/* Nome do Aluno:  Flavio Calado
 * RA: 300009030
 * Nome do Programa: Pratica2Atividade3 
 * Descrição: 7.	Crie um programa que lê um número entre 1 e 12, 
 * correspondendo a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro. 
 * Ao final, o programa deve imprimir uma mensagem identificando, 
 * com base no número digitado, o nome do mês e a estação.
 * Data: 04/04/2023
 */

public class Pratica2Atividade7 {
    public static void main(String[] args) {
        int a;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o mês");
        a = teclado.nextInt();

        switch(a) {
            case 1: System.out.println("Janeiro - Verão");
                    break;
            case 2: System.out.println("Fevereiro - Verão");
                    break;
            case 3: System.out.println("Março - Verão");
                    break;
            case 4: System.out.println("Abril - Outono");
                    break;
            default: System.out.println("Não existe esse mês");
        }

    }
}
