import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
        String parola;
        int lunghezza;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la tua parola ");
        parola = scanner.nextLine();
        lunghezza = parola.length();
        result = lunghezza %2;
        if (result == 0){
            System.out.println("true");
        }
        else{
            System.out.println("false ");
        }


        int anno;
        System.out.println("Inserisci l'anno d'interesse ");
        anno = scanner.nextInt();
        result = anno%4;
        if (result == 0){
            System.out.println("true");
        }
        else{
            System.out.println("false ");
        }


    }

}