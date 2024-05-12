public class RailFenceCipher {
    // Function to encrypt the message using Rail Fence Cipher
    public static String encrypt(String message, int rails) 
	{
        if (message == null )
            return "";

        char[] encryptedMessage = new char[message.length()];
        int n = 0;

        for (int i = 0; i < rails; i++) {
            int step1 = (rails - i - 1) * 2;
            int step2 = i * 2;

            int pos = i;
            boolean alternate = true;

            while (pos < message.length()) {
                encryptedMessage[n++] = message.charAt(pos);

                if (i == 0 || i == rails - 1) {
                    pos += (rails - 1) * 2;
                } else {
                    if (alternate)
                        pos += step1;
                    else
                        pos += step2;
                    alternate = !alternate;
                }
            }
        }
        return new String(encryptedMessage);
    }

    // Function to decrypt the message using Rail Fence Cipher
    public static String decrypt(String message, int rails) {
        if (message == null )
            return "";

        char[] decryptedMessage = new char[message.length()];
        int n = 0;

        for (int i = 0; i < rails; i++) {
            int step1 = (rails - i - 1) * 2;
            int step2 = i * 2;

            int pos = i;
            boolean alternate = true;

            while (pos < message.length()) {
                decryptedMessage[pos] = message.charAt(n++);
                if (i == 0 || i == rails - 1) {
                    pos += (rails - 1) * 2;
                } else {
                    if (alternate)
                        pos += step1;
                    else
                        pos += step2;
                    alternate = !alternate;
                }
            }
        }
        return new String(decryptedMessage);
    }

    public static void main(String[] args) {
        String message = "HELLOWORLD";
        int rails = 3;

        System.out.println("Original message: " + message);

        String encryptedMessage = encrypt(message, rails);
        System.out.println("Encrypted message: " + encryptedMessage);

        String decryptedMessage = decrypt(encryptedMessage, rails);
        System.out.println("Decrypted message: " + decryptedMessage);
    }
}