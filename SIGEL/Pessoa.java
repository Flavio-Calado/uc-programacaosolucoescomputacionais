package SIGEL;

public class Pessoa {
    protected int        codigo;
    protected String     nome; 
    protected String     cpf; 
    protected String     telefone; 
    protected String     email;    

    
    public String getCPF() {
        return cpf;
    }

    public void setCPF(String c) {
        if (c != null) {
            cpf = c;
        }
    }
}
