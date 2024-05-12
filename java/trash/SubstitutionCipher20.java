public class SubstitutionCipher20 
{
    public static String encrypt(String plainText) 
    {
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) 
        {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) 
            {
                char encryptedChar = (char) ((ch - 'A' + 3) % 26 + 'A');
                cipherText.append(encryptedChar);
            } else {
                cipherText.append(ch);
            }
        }
        return cipherText.toString();
    }

    public static void main(String[] args)
     {
        String text = "Hello, World!";
        String encryptedText = encrypt(text);
        System.out.println("Encrypted text: " + encryptedText);
    }
}
