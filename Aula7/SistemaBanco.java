package Aula7;

import java.util.Scanner;

public class SistemaBanco {
    public static void main(String[] args) {
        int             soma = 0;
        String          nome = "Flavio";
        ContaBancaria   conta;
        double          deposito;

        Scanner teclado = new Scanner(System.in);
        deposito = teclado.nextDouble();        

        conta = new ContaBancaria();

        conta.agencia = 0001;
        conta.cpfCliente = "000.000.000/00";
        conta.saldo = 1000.0;

        conta.depositar(deposito);
    }
}
