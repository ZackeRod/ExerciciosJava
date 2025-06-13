package fundamentos;

public class AreaCircunferencia {

    public static void main(String[] args) {
        double raio = 3.4;  // Isso é uma variável!! Pode ser mudada !!
        final double PI = 3.14159;  // "final" double = valor não poderá se mudado dentro do programa. (Valor Fixado!) <<   Isso é uma Constante!

        double area = PI * raio * raio;
        System.out.println(area);

        // EXEMPLO DE ATRIBUIÇÃO DE NOVOS VALORES DENTRO DO PROGRAMA
        raio = 10; // Valor alterado!!
        area = PI * raio * raio;
        System.out.println("Área = " + area + "m2."); // Texto associado com variável, o nome dado a esse processo é concatenar.

    }
}

/*
          ### 🧠 Resumo prático:

        | Característica          | Variável                       | Constante (`final`)        |
        | ----------------------- | ------------------------------ | -------------------------- |
        | Valor pode mudar?       | Sim                            | Não                        |
        | Palavra-chave especial? | Não                            | `final`                    |
        | Convenção de nome       | CamelCase (ex: `idadeUsuario`) | MAIÚSCULO\_COM\_UNDERSCORE |
        | Exemplo                 | `int x = 5;`                   | `final int LIMITE = 10;`   |


*/