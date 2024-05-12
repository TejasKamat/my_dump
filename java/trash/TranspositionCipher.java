public class TranspositionCipher {
    
    public static String encrypt(String message, int key) 
	{
        char[] encryptedMessage = new char[message.length()];
        
        for (int i = 0; i < key; i++) 
		{
            for (int j = i; j < message.length(); j += key) 
			{
                encryptedMessage[j] = message.charAt(j);
            }
        }
        
        return new String(encryptedMessage);
    }
    
    public static void main(String[] args) 
	{
        String message = "Hello, world!";
        int key = 4;
        
        String encryptedMessage = encrypt(message, key);
        
        System.out.println("Encrypted message: " + encryptedMessage);
    }
}
