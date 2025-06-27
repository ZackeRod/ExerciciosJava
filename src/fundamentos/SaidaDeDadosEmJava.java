package fundamentos;

import java.util.Locale;

public class SaidaDeDadosEmJava {
    public static void main(String[] args) {

        System.out.print("Olá mundo! "); // Não tem quebra de linha!
        System.out.println("Bom dia!");

        int y = 32;
        int idade = 23;
        int idade2 = 29;
        double x = 10.35784;
        double renda = 9582.4;
        double renda2 = 13659.1;
        String nome = "Giovanna";
        String nome2 = "Zacker";
        String cargo = "Desenvolvedor";

        // Locale dos EUA (ponto como separador decimal)
        Locale.setDefault(Locale.US);
        System.out.println("Locale atual (US): " + Locale.getDefault());

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f\n", x); // %.2f ->  Delimita 2 casas decimais
        System.out.printf("%.4f\n", x); // %.4f -> Delimita 4 casas decimais
        System.out.printf("%.4f\n", x); // Locale trocou a "," por "."
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f Metros%n", x + y);

        // Agora muda para Brasil (vírgula como separador decimal)
        Locale.setDefault(new Locale("pt", "BR"));
        System.out.println("\n|---------- Locale alterado (BR): " + Locale.getDefault() + " ---------|");
        System.out.println("|------------------------------------------------|");
        System.out.println("|---------------- ADMINISTRAÇÃO -----------------|");
        System.out.println("|------------------------------------------------|");
        System.out.printf("| %s tem %d anos e ganha R$ %.2f reais. |%n", nome, idade, renda);
        System.out.println("|------------------------------------------------|");
        System.out.printf("|                  Nome: %s %n|" +
                "                    Idade: %d %n|" +
                "             Profissão: %s %n|" +
                "            Salário: R$ %.2f Reais%n", nome2, idade2, cargo, renda2);
        System.out.println("|------------------------------------------------|");

    }
}

/*

| Método    | Significado fácil                       |
| --------- | --------------------------------------- |
| `println` | "print line" – imprime e pula linha     |
| `print`   | imprime na mesma linha                  |
| `printf`  | imprime com formatação                  |



 %f = ponto flutuante
 %d = inteiro
 %s = texto
 %n = quebra de linha

*/