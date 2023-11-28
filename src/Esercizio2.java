import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        int numero = 1;
        String numeroscritto = "zero";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da 0 a 3 ");
        numero = scanner.nextInt();
        switch (numero) {
            case 0:
                numeroscritto = "zero";
                break;
            case 1:
                numeroscritto = "uno";
                break;
            case 2:
                numeroscritto = "due";
                break;
            case 3:
                numeroscritto = "tre";
                break;
            default:
                System.out.println("Hai inserito un numero maggiore di" + numero);
        }
        System.out.println("Hai inserito il numero " + numeroscritto);

    }
}
