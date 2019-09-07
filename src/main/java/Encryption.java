import java.util.ArrayList;
import java.util.List;

public class Encryption {

    public String encryptedText(String plainText, int key  ){

        String cipherText= " ";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int k= 0;
        for(int i=0; i<plainText.length(); i++){
            int charPosition = alphabet.indexOf(plainText.charAt(i));
            int keyVal = (key + charPosition) % 26;
            char replaceVal = alphabet.charAt(keyVal);
            cipherText += replaceVal;
        }
        return  cipherText;

    }
}
