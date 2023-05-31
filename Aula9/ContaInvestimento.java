public class ContaInvestimento extends ContaBancaria {

    double valorInvestido;
    double cotacaoDiaria = 1.5;

    @Override
    public double visualizarSaldo() {                
        return this.saldo += (this.saldo * cotacaoDiaria);
    }
    
}
