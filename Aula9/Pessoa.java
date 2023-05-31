public class Pessoa {

    protected String cpf;
    protected String nome;

    public boolean validaCPF() {
        return true;
    }
    
    public boolean validaNome() {
        return true;
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
