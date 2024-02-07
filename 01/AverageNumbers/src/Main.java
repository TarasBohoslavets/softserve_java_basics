import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main ( String[] args ) throws IOException {
        BufferedReader bufferedReader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "Enter first number:" );
        double number1 = Double.parseDouble ( bufferedReader.readLine ( ) );
        System.out.println ( "Enter second number:" );
        double number2 = Double.parseDouble ( bufferedReader.readLine ( ) );
        System.out.println ( "Enter third number number:" );
        double number3 = Double.parseDouble ( bufferedReader.readLine ( ) );
        System.out.println ( (number1 + number2 + number3) / 3 );
        bufferedReader.close ( );
    }
}