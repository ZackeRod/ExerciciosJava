package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        System.out.print("Bom");
        System.out.print(" dia!\n\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d %n",
                1, 2, 3, 4, 5, 6);

        System.out.printf("Salário: %,1f %n", 1234.5678);
        System.out.printf("Nome: %s%n", "....");
        System.out.println("\n\n_____________________________");
        System.out.println("Sistema de Cadastro.");
        System.out.println("\n");


        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu Sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine(); // Lê o "\\\\n" que a entrada.nexInt() deixa

        System.out.print("Digite seu e-mail: ");
        String email = entrada.nextLine();

        System.out.print("Digite seu endereço ");
        String endereco = entrada.nextLine();

//        System.out.printf("%s %s tem %d anos.%n",
//                nome, sobrenome, idade);

        System.out.println("\n\nCadastro efetuado com sucesso!!");
        System.out.println("\nNome: " + nome + " " + sobrenome +
                "\nIdade: " + idade +
                "\nE-mail: " + email +
                "\nEndereço: " + endereco);

        entrada.close();
    }
}


//           %f = ponto flutuante
//           %d = inteiro
//           %s = texto
//           %n = quebra linha
//           \n = quebra linha