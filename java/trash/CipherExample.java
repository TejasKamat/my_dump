public class CipherExample {
    public static void main(String[] args) {
        String plainText = "Hello, World!";
        int shift = 3; // Number of positions to shift each character
        
        String cipherText = encrypt(plainText, shift);
        System.out.println("Cipher Text: " + cipherText);
    }
    
    public static String encrypt(String plainText, int shift) {
        StringBuilder cipherText = new StringBuilder();
        
        for (char ch ; plainText.toCharArray();) 
		{
            if (Character.isLetter(ch)) {
                char shifted = (char) (ch + shift);
                cipherText.append(shifted);
            } else {
                cipherText.append(ch);
            }
        }
        
        return cipherText.toString();
    }
}