import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringa="ciao";
        while (!stringa.equals(":q")) {
            System.out.println("Inserisci :q per terminare il loop");
            System.out.println("Inserisci una stringa");
            stringa = scanner.nextLine();
        }
    }
}
