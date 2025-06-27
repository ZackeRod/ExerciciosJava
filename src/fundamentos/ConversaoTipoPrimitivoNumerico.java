package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; // Conversão Implícita onde não á risco de perder informação! < Converteu número inteiro para ponto flutuante!
        System.out.println(a);

        float b = (float) 1.123456788888; // Conversão explícita (CAST) << Perdeu informações!
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // Explícita (CAST)
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e; // Explícita (CAST)
        System.out.println(f);
    }
}
