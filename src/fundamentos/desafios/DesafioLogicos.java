package fundamentos.desafios;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça e na quinta
        boolean trabalhoTerça = true;   // Altere para false para testar diferentes cenários
        boolean trabalhoQuinta = true;

        // Compras e resultados
        boolean comprouTV50 = trabalhoTerca && trabalhoQuinta;
        boolean comprouTV32 = trabalhoTerca ^ trabalhoQuinta;
        boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;

        // Operador Unário!
        boolean maisSaudavel = !comprouSorvete;

        // Saídas formatadas
        System.out.printf("Trabalhou na terça? %b%n", trabalhoTerça);
        System.out.printf("Trabalhou na quinta? %b%n", trabalhoQuinta);

        System.out.println("");

        System.out.printf("Comprou TV 50\"? %b%n", comprouTV50);
        System.out.printf("Comprou TV 32\"? %b%n", comprouTV32);
        System.out.printf("Tomou sorvete? %b%n", tomouSorvete);
        System.out.printf("Mais saudável? %b%n", ficouSaudavel);
    }
}


// %b
//Significa: boolean
//Serve para imprimir valores true ou false.