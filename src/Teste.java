public class Teste {
    public static void mostrarStrings() {
        int numero = 2;
        char caractere = 'a';
        String seila = "sei nao";
        int seilaHash = ContasUtil.calcularHash(seila);
        int soma = ContasUtil.seila(5, 6);

        String boolGay = DiversaoUtil.gay(true, "sexman");

        String eu = InfoUsuario.gerarString(16, "Lucas", 1.80, "Piquete");

        System.out.printf("Sei nao\n\nCaractere: %s\nNumero: %d\nString: %s\nHash: %d\nSoma: %d\nGay: %s\n\nMinhas info:\n%s", caractere, numero, seila, seilaHash, soma, boolGay, eu);
    }
}
