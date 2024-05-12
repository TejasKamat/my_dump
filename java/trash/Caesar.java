
class Caesar {
    // Encrypts text using shift
    public static StringBuffer encrypt(String text, int shift) {
        StringBuffer result = new StringBuffer();
 
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) +
                        shift - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) +
                        shift - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
 
    // Decrypts cipher using shift
    public static StringBuffer decrypt(String cipher, int shift) {
        StringBuffer result = new StringBuffer();
 
        for (int i = 0; i < cipher.length(); i++) {
            if (Character.isUpperCase(cipher.charAt(i))) {
                char ch = (char) (((int) cipher.charAt(i) +
                        shift - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) cipher.charAt(i) +
                        shift - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
 
    public static void main(String[] args) {
        String originalText = "Lenovo";
        int shiftCount = 1;
        System.out.println("Caesar Cipher Example");
        System.out.println("Encryption");
        System.out.println("Text  : " + originalText);
        System.out.println("Shift : " + shiftCount);
        String cipher = encrypt(originalText, shiftCount).toString();
        System.out.println("Encrypted Cipher: " + cipher);
        System.out.println("Decryption");
        System.out.println("Encrypted Cipher: " + cipher);
        System.out.println("Shift : " + shiftCount);
        String decryptedPlainText = decrypt(cipher, 26 - shiftCount).toString();
        System.out.println("Decrypted Plain Text  : " + decryptedPlainText);
    }
}
