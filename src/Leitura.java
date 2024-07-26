import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite alguma coisa");
        String algumacoisa = leitura.next();
        System.out.println(algumacoisa);
    }
}
