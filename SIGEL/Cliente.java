package SIGEL;

import java.time.LocalDate;

public class Cliente extends Pessoa {

    private LocalDate   dataNascimento; 

    Endereco            enderecoCliente;

    public Cliente() {
        enderecoCliente = new Endereco();
        codigo = 0;
    }

}
