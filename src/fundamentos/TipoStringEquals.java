package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {

        System.out.println("2" == "2"); // Não comparar Strings com "==" usar sempre o equals

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next(); // Next tira os espaços em branco automaticamente, já o nextLine não tira!
        System.out.println("2" == s2.trim()); // .trim tira os espaços em branco
        System.out.println("2".equals(s2);

        entrada.close();


    }
}
