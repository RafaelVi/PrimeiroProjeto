import java.util.Random;
import java.util.Scanner;

public class JogoDeAdvinhacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        System.out.println(numero);

        for (int i = 0; i < 5; i++) {
            System.out.println("Qual seu palpite?");
            int palpite = in.nextInt();
            if (palpite == numero) {
                System.out.println("Acertou");
                break;
            } else if (palpite > numero) System.out.println("Numero menor");
            else if (palpite < numero) System.out.println("Numero maior");
        }
    }
}

