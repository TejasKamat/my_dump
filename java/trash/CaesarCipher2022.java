class CaesarCipher2022
 {
    public static StringBuffer encrypt(String plaintext, int shift) 
    {
        StringBuffer result = new StringBuffer();
 
        for (int i = 0; i < plaintext.length(); i++) 
        {
            if (Character.isUpperCase(plaintext.charAt(i))) 
            {
                char ch = (char)(((int)plaintext.charAt(i) +
                                  shift - 65) % 26 + 65);
                result.append(ch);
            } 
            else 
            {
                char ch = (char)(((int)plaintext.charAt(i) +
                                  shift - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
 
    public static void main(String[] args)
     {
        String plaintext = "THE ENGINEERS";
        int shift = 3;
        System.out.println("Plaintext  : " + plaintext + "\n");
        System.out.println("Shift : " + shift + "\n");
        System.out.println("Ciphertext: " + encrypt(plaintext, shift));
    }
}