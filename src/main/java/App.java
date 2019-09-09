import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nEncryption/Decryption of messages. Choose the action: ");
        System.out.println("=====================================================");
        System.out.println("1. Encrypt\n2. Decrypt\n3. Exit");
        String choose = bufferedReader.readLine();
        if (choose.equals("1")) {
            System.out.println("Enter a word to be encrypted: ");
            String word = bufferedReader.readLine();
            Encryption encrypt = new Encryption();
            System.out.println("Enter the Shift key: ");
            String stringKey = bufferedReader.readLine();
            int intKey = Integer.parseInt(stringKey);
            System.out.println("The encrypted message is: " + encrypt.encryptedText(word, intKey));
            System.out.println("Thank you!");
        } else if (choose.equals("2")) {
            System.out.println("Enter a word to be decrypted: ");
            String ibanga = bufferedReader.readLine();
            Decryption decr = new Decryption();
            System.out.println("Enter the Shift key: ");
            String stringKey = bufferedReader.readLine();
            int intKey = Integer.parseInt(stringKey);
            System.out.println("Your original message was: " + decr.decryptedText(ibanga, intKey));
            System.out.println("Thank you!");
        }
        else if (choose.equals("3")){
            System.out.println("Oooops! Thank you!");
        }
        else{
            System.out.println("Ooooop! Invalid session");
        }
    }
}
