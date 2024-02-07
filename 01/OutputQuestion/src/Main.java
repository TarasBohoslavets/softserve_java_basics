import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main ( String[] args ) {
        BufferedReader bufferedReader = new BufferedReader ( new InputStreamReader ( System.in ) );
        try {
            System.out.print ( "How are you? " );
            String answer = bufferedReader.readLine ( );
            System.out.println ( "You are " + answer );
        } catch (IOException exception) {
            exception.printStackTrace ( );
        } finally {
            try {
                bufferedReader.close ( );
            } catch (IOException exception) {
                exception.printStackTrace ( );
            }
        }
    }
}
