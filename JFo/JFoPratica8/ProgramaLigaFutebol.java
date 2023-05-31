import java.util.Scanner;

public class ProgramaLigaFutebol {
    public static void main(String[] args) {

        Equipe barcelona = new Equipe();
        Equipe realmadrid = new Equipe();
        Equipe valladolid = new Equipe();
        Equipe valencia = new Equipe();

        barcelona.setNome("Barcelona");
        realmadrid.setNome("Real Madrid");
        valladolid.setNome("Valladolid");
        valencia.setNome("Valencia");

        LigaFutebol liga = new LigaFutebol();

        Scanner teclado = new Scanner(System.in);

        double temperatura;
        int p1, p2;
        
        do {

            System.out.println("Digite a temperatura da semana");
            temperatura = teclado.nextDouble();
            System.out.println("Digite o placar do time 1");
            p1 = teclado.nextInt();
            System.out.println("Digite o placar do time 2");
            p2 = teclado.nextInt();

            Jogo jogoSemana = new Jogo();

            jogoSemana.setPlacarTime1(p1);
            jogoSemana.setPlacarTime2(p2);
            jogoSemana.setTemperatura(temperatura);

            liga.tabelaDeJogos.add(jogoSemana);

        } while (temperatura > 0);

        Jogo jogoDeAbertura = new Jogo();

        jogoDeAbertura.setTemperatura(30);
        jogoDeAbertura.setTime1(barcelona);
        jogoDeAbertura.setTime2(realmadrid);
        jogoDeAbertura.setPlacarTime1(5);
        jogoDeAbertura.setPlacarTime2(0);
        
        liga.tabelaDeJogos.add(jogoDeAbertura);

        System.out.println(jogoDeAbertura.getTime1().getNome()
            +" "+          jogoDeAbertura.getPlacarTime1() +"x"+ jogoDeAbertura.getPlacarTime2()
            +" "+          jogoDeAbertura.getTime2().getNome());
    }
}
