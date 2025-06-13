package fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        // (ºF - 32) x 5/9 = ºC    |      32 e 5/9 Constante. |  (ºF e ºC Variáveis)  |  32 é AJUSTE e 5/9 FATOR.

        final double AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;

        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;

        System.out.println("O resultado é " + celsius + "ºC.");


    }
}
