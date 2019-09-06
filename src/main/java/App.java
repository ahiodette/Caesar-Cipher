import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word to be encrypted: ");
        String word = bufferedReader.readLine();
        Encryption encrypt = new Encryption();

    }
}
