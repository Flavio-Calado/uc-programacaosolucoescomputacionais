package JFo;

import javax.swing.JOptionPane;

public class JFoPratica3 {
    public static void main(String[] args) {
        
        String nome, idade, salario;
        
        int idadeNum;
        
        double salarioNum;
        
        nome = JOptionPane.showInputDialog("Digite seu nome");
        
        idade = JOptionPane.showInputDialog("Qual a sua idade");
        // conversao dos dados de String -> Int
        idadeNum = Integer.parseInt(idade);

        salario = JOptionPane.showInputDialog("Qual o seu salario");
        // conversao dos dados de String -> double
        salarioNum = Double.parseDouble(salario);
        
        JOptionPane.showMessageDialog(null, "Hello World "+nome);
    }
}

