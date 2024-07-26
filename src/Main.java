public class Main {
    public static void main(String[] args) {

        System.out.print("Bem vindo ao screen match");

        System.out.println("Filme: Interstellar");

        int ano = 2022;

        System.out.println("Ano de lançamento: " + ano);
        double notaDoFilme = 9.2;

        double media = Math.round((9.1 + 6.4 + notaDoFilme) / 3);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

        System.out.println(media);

    }
}