public class Decryption {
    public String decryptedText(String toDecrypt, int key) {
        String original = " ";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int k = 0;
        for (int i = 0; i < toDecrypt.length(); i++) {
            int charPosition = alphabet.indexOf(toDecrypt.charAt(i));
            int keyVal = (charPosition - key) % 26;
            char replaceVal = alphabet.charAt(keyVal);
            original += replaceVal;
        }
        return original;
    }
}
