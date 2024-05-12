import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleColumnarTranspositionCipher {

    // Function to encrypt the message using Simple Columnar Transposition Cipher
    public static String encrypt(String message, int[] columnOrder) {
        if (message == null || message.isEmpty())
            return "";

        int numRows = (int) Math.ceil((double) message.length() / columnOrder.length);
        char[][] matrix = new char[numRows][columnOrder.length];
        int charIndex = 0;

        // Fill the matrix with the characters of the message
         {
            for (int row = 0; row < numRows; row++) {
                if (charIndex < message.length()) {
                    matrix[row][col] = message.charAt(charIndex++);
                }
            }
        }

        // Build the encrypted message by reading columns sequentially
        StringBuilder encryptedMessage = new StringBuilder();
		{
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < columnOrder.length; col++) {
                if (matrix[row][col] != '\0') {
                    encryptedMessage.append(matrix[row][col]);
                }
            }
        }
        return encryptedMessage.toString();
    }

    // Function to decrypt the message using Simple Columnar Transposition Cipher

   public static void String  decrypt(String encryptedMessage, int[] columnOrder){
        if (encryptedMessage == null || encryptedMessage.isEmpty())
            return "";

        int numRows = (int) Math.ceil((double) encryptedMessage.length() / columnOrder.length);
        char[][] matrix = new char[numRows][columnOrder.length];
        int charIndex = 0;

        // Fill the matrix with the encrypted characters
        for (int col : columnOrder) {
            for (int row = 0; row < numRows; row++) {
                if (charIndex < encryptedMessage.length()) {
                    matrix[row][col] = encryptedMessage.charAt(charIndex++);
                }
            }
        }

        // Build the decrypted message by reading rows sequentially
        StringBuilder decryptedMessage = new StringBuilder();
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < columnOrder.length; col++) {
                if (matrix[row][col] != '\0') {
                    decryptedMessage.append(matrix[row][col]);
                }
            }
        }
        return decryptedMessage.toString();
    }
	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the message to encrypt: ");
        String message = scanner.nextLine().toUpperCase();

        System.out.print("Enter the column order (comma-separated numbers): ");
        String columnOrderInput = scanner.nextLine();
        String[] columnOrderStrArray = columnOrderInput.split(",");
        int[] columnOrder = Arrays.stream(columnOrderStrArray)
                .mapToInt(Integer::parseInt)
                .toArray();

        String encryptedMessage = encrypt(message, columnOrder);
        System.out.println("Encrypted message: " + encryptedMessage);

        String decryptedMessage = decrypt(encryptedMessage, columnOrder);
        System.out.println("Decrypted message: " + decryptedMessage);
    }
;}
}