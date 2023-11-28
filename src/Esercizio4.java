import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Inserisci il tuo numero per il conto alla rovescia");
        numero=scanner.nextInt();
        for (int i=numero; i>0; i--){
            System.out.println(i);
        }
    }
}
