import java.util.ArrayList;
import java.util.List;

public class Encryption {
    public String alpha="abcdefghijklmnopqrstuvwxyz";
    public String encryAlpha = "xyzabcdefghijklmnopqrstuvw";
    public String[] encryAlphab = encryAlpha.split("");
    public String plainText;
    public String[] plainArr = plainText.split("");
    private int key;
    public List<String> encrypted = new ArrayList<String>();
    public List<String> encryptedText(String plainText, int key){
        for (int i=0; i<alpha.length(); i++){
            for(int j=0; j<plainText.length(); j++){
                if (plainArr[j].equals(alpha.charAt(i))){
                  encrypted.add(encryAlphab[i]);
                }
        }
        }
        return encrypted;

    }
}
