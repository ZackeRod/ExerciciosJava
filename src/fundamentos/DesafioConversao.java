package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        System.out.println(Locale.getDefault());

        Scanner entrada = new Scanner(System.in);
        System.out.println("_____________________________________");
        System.out.println("\nDesafio de Conversão...");


        System.out.print("\nDigite o primeiro salário: ");
        String valor1 = entrada.nextLine().replace(",", ".");

        System.out.print("Digite o segundo salário: ");
        String valor2 = entrada.nextLine().replace(",", ".");

        System.out.print("Digite o terceiro salário: ");
        String valor3 = entrada.nextLine().replace(",", ".");

        // Converte os textos para double
        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;

        System.out.println("\n_____________________________________");
        System.out.println("A média dos salários é: " + media);
        System.out.println("_____________________________________");

        entrada.close();
    }
}
