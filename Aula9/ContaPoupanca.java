public class ContaPoupanca extends ContaBancaria {
    
    double rendimento = 0.5;

    public double visualizarSaldo() {
        return this.saldo = this.saldo + (this.saldo * rendimento); 
    }
}
