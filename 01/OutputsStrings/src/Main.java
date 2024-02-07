import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        String word1, word2, word3;
        Scanner scanner = new Scanner ( System.in );
        word1 = scanner.nextLine ( );
        word2 = scanner.nextLine ( );
        word3 = scanner.nextLine ( );
        System.out.println ( word3 + " " + word2 + " " + word1 );
        scanner.close ( );
    }
}