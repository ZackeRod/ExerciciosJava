package fundamentos.desafios;

public class DesafioAritmeticos {
    public static void main(String[] args) {


        // Primeira parte: [(6 * (3 + 2))²] / (3 * 2)
        int resultado1 = (int) Math.pow(6 * (3 + 2), 2) / (3 * 2);


        // Segunda parte: [(1 - 5) * (2 - 7) / 2]²
        int resultado2 = (int) Math.pow(((1 - 5) * (2 - 7)) / 2, 2);


        // Diferença entre as duas expressões
        int diferenca = resultado1 - resultado2;


        // Resultado final: (diferença³) / (10³)
        int resultadoFinal = (int) Math.pow(diferenca, 3) / (int) Math.pow(10, 3);


        // Exibição formatada do resultado
        System.out.println("📐 Resultado do Desafio: " + resultadoFinal);

    }
}