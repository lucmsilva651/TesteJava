public class Teste {
    public static int seila(int a, int b) {
        return a + b;
    }

    public static int calcularHash(String s) {
        return s.hashCode();
    }

    public static String gay(boolean a, String b) {
        if (a) {
            return b + " é gay";
        } else {
            return b + " hetero sexxual";
        }
    }

    public static String infoUsuario(int i, String n, double a, String c) {
        return String.format("Nome: %s\nIdade: %d\nAltura: %1s\nCidade: %s", n, i, a, c);
    }

    public static void main(String[] args) {
        int numero = 2;
        char caractere = 'a';
        String seila = "sei nao";
        int seilaHash = calcularHash(seila);
        int soma = seila(5, 6);

        String boolGay = gay(true, "sexman");

        String eu = infoUsuario(16, "Lucas", 1.80, "Piquete");

        System.out.printf("Sei nao\n\nCaractere: %s\nNumero: %d\nString: %s\nHash: %d\nSoma: %d\nGay: %s\n\nMinhas info:\n%s", caractere, numero, seila, seilaHash, soma, boolGay, eu);
    }
}