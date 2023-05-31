public class ContaBancaria {
    Titular titular;
    double  saldo;
    int     agencia;
    int     conta;

    public int getAgencia() {   return agencia;    }
    public int getConta() {     return conta;    }
    public double getSaldo() {  return saldo;    }
    public Titular getTitular() { return titular;    }

    public void setAgencia(int agencia) {  this.agencia = agencia;    }
    public void setConta(int conta) {  this.conta = conta;    }
    public void setSaldo(double saldo) {  this.saldo = saldo;    }
    public void setTitular(Titular titular) {   this.titular = titular;    }

    public double visualizarSaldo() {
        return saldo;
    }

    public double visualizarSaldo(double cotacao) {        
        return saldo * cotacao;
    }    

    public void sacar(double retirada) {
        this.saldo -= retirada;
    }

    public static void imprimirVersaoClasse() {
        System.out.println("Classe ContaBancaria v1.0");
    }
}