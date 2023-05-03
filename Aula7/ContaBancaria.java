package Aula7;

public class ContaBancaria {
    
    int agencia;
    int numeroConta;
    String cpfCliente;
    double saldo;

    double depositar(double deposito) {
        saldo = saldo + deposito;
        return saldo;
    }

}
