import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mediaAv = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual a nota do filme?");
            nota = in.nextDouble();

            mediaAv += nota;

        }


        System.out.println("Média: " + mediaAv / 3);

    }
}
