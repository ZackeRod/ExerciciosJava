package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7; // FALSE

        System.out.println(condicao1 && condicao2);   // F
        System.out.println(condicao1 && !condicao2);  // V
        System.out.println(condicao1 || condicao2);   // V
        System.out.println(condicao1 ^ condicao2);    // V
        System.out.println(!!condicao1);              // V                // CONVERTEU 2 VEZES
        System.out.println(!condicao1);               // F
        System.out.println(!condicao2);               // V

        // Tabela verdade E (AND)
        System.out.println("\nTabela verdade E (AND)");
        System.out.println(true && true);   // V
        System.out.println(true && false);  // F
        System.out.println(false && true);  // F
        System.out.println(false && false); // F


        // Tabela verdade OU (OR)
        System.out.println("\nTabela verdade OU (OR)");
        System.out.println(true || true);   // V
        System.out.println(true || false);  // V
        System.out.println(false || true);  // V
        System.out.println(false || false); // F

        // Tabela verdade OU Exclusivo (XOR)
        System.out.println("\nTabela verdade OU Exclusivo (XOR)");
        System.out.println(true ^ true);   // F
        System.out.println(true ^ false);  // V
        System.out.println(false ^ true);  // V
        System.out.println(false ^ false); // F

        // Tabela verdade NOT
        System.out.println("\nTabela verdade NOT");
        System.out.println(!true);  // F
        System.out.println(!false); // V


    }

}
