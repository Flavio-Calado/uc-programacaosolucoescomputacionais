package JFo;

import java.util.Scanner;

public class JFoPratica4a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double farenheit = teclado.nextDouble();
        double celsius = converteFtoC(farenheit);
        System.out.println(celsius);
    }

    static double converteFtoC(double f) {
        double c;
        c =  ((5 / 9) * (f - 32));
        return c;
    }
}
