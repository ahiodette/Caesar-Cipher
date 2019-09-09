public class Decryption {

    public String decryptedText(String toDecrypt, int key) {
        String plainText = " ";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
//        int k = 0;
        Encryption enc = new Encryption();
        String cip = enc.encryptedText(toDecrypt,key);
        System.out.println(cip);
        for (int i = 0; i<cip.length(); i++) {
            int charPosition = alphabet.indexOf(cip.charAt(i));
            int keyVal = (charPosition - key) % 26;
            char replaceVal = alphabet.charAt(keyVal);
            plainText += replaceVal;
        }
        return plainText;
    }
}
