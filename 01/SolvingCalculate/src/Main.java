import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) throws IOException {
        Scanner scanner = new Scanner ( System.in );

        System.out.print ( "Enter the value for 'a': " );
        int a = scanner.nextInt ( );

        System.out.print ( "Enter the value for 'b': " );
        int b = scanner.nextInt ( );

        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        double quotient;
        if ( b != 0 ) {
            quotient = (double) a / b;
        } else {
            quotient = Double.NaN;
        }

        System.out.println ( "Sum (a + b): " + sum );
        System.out.println ( "Difference (a - b): " + difference );
        System.out.println ( "Product (a * b): " + product );

        if ( !Double.isNaN ( quotient ) ) {
            System.out.println ( "Quotient (a / b): " + quotient );
        } else {
            System.out.println ( "Cannot divide by zero. Quotient is undefined." );
        }
        scanner.close ( );
    }
}