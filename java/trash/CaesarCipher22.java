public class CaesarCipher22 {
    public static String encrypt(String plainText, int shiftKey) {
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                char encryptedChar = (char) (((ch - 'A') + shiftKey) % 26 + 'A');
                cipherText.append(encryptedChar);
            } else {
                cipherText.append(ch);
            }
        }
        return cipherText.toString();
    }

    public static String decrypt(String cipherText, int shiftKey) {
        StringBuilder plainText = new StringBuilder();
        for (int i = 0; i < cipherText.length(); i++) {
            char ch = cipherText.charAt(i);
            if (Character.isLetter(ch)) {
                char decryptedChar = (char) (((ch - 'A' - shiftKey) + 26) % 26 + 'A');
                plainText.append(decryptedChar);
            } else {
                plainText.append(ch);
            }
        }
        return plainText.toString();
    }

    public static void main(String[] args) {
        String text = "Hello, World!";
        int shiftKey = 3;

        String encryptedText = encrypt(text, shiftKey);
        System.out.println("Encrypted text: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shiftKey);
        System.out.println("Decrypted text: " + decryptedText);
    }
}
