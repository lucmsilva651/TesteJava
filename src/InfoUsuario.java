public class InfoUsuario {
    public static String gerarString(int i, String n, double a, String c) {
        return String.format("Nome: %s\nIdade: %d\nAltura: %1sm\nCidade: %s", n, i, a, c);
    }
}
