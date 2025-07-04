package fundamentos.operadores;

import java.util.Scanner;

public class Ternario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a média total: ");
        String valor = entrada.nextLine();

        double media = Double.parseDouble(valor);

        String resultadoParcial = media >= 5.0 ? "em recuperação!" : "Reprovado!";
        String resultadoFinal = media >= 7.0 ? "Aprovado!!": resultadoParcial;

        System.out.println("O aluno está " + resultadoFinal);

        entrada.close();
    }
}
