package SIGEL;

public class Funcionario extends Pessoa {
    
    private String cargo;
    private Endereco enderecoFuncionario;

    public Funcionario() {
        enderecoFuncionario = new Endereco();
    }

}
