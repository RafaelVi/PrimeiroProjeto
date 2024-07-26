public class Condicional {
    public static void main(String[] args) {
        int ano = 2022;
        double notaDoFilme = 9.2;
        boolean incluidoNoPlano = true;
        String tipoPlano = "a";

        if (ano >= 2022) {
            System.out.println("Lançado após 2022");
        } else {
            System.out.println("Antes de 2022");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.err.println("Acesso Negado");
        }
    }
}
