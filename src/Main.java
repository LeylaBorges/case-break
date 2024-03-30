import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o nome do produto: ");
        Scanner s = new Scanner(System.in);
        String nomeProduto = s.next();

        switch (nomeProduto) {
            case "banana ":
                System.out.println("R$ 9,50");
                break;
            case "manga":
                System.out.println("R$ 12,60");
                break;
            case "abacaxi":
                System.out.println("R$ 10,00");
        }
    }
}