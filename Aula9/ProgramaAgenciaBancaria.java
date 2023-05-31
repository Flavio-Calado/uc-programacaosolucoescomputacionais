import java.util.ArrayList;

public class ProgramaAgenciaBancaria {
    public static void main(String[] args) {

        ContaBancaria contaLuiz = new ContaBancaria();
        ContaBancaria contaWagner = new ContaBancaria();
        ContaBancaria contaSandra = new ContaBancaria();

        ContaBancaria contaFlavio = new ContaBancaria();
        ContaBancaria contaPoupancaFlavio = new ContaPoupanca();
        ContaBancaria contaInvestimentoFlavio = new ContaInvestimento();

        contaFlavio.setSaldo(100);
        contaPoupancaFlavio.setSaldo(100);
        contaInvestimentoFlavio.setSaldo(100);

        double saldo    = contaFlavio.visualizarSaldo();
        double saldoPoupanca = contaPoupancaFlavio.visualizarSaldo(); 
        double saldoInvestimento = contaInvestimentoFlavio.visualizarSaldo(); 
       
        System.out.println(saldo); 
        System.out.println(saldoPoupanca); 
        System.out.println(saldoInvestimento); 

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<ContaBancaria>();
        listaDeContas.add(contaFlavio);
        listaDeContas.add(contaLuiz);
        listaDeContas.add(contaSandra);
        listaDeContas.add(contaWagner);
        listaDeContas.add(contaPoupancaFlavio);

    }
}
