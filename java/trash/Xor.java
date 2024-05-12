
// Java program to implement XOR - Encryption
class Xor
{
    // The same function is used to encrypt and
    // decrypt
    static String encryptDecrypt(String inputString)
    {
        // Define XOR key
        // Any character value will work
        char xorKey = 'P';
 
        // Define String to store encrypted/decrypted String
        String outputString = "";
 
        // calculate length of input string
        int len = inputString.length();
 
        // perform XOR operation of key
        // with every character in string
        for (int i = 0; i < len; i++)
        {
            outputString = outputString +
            Character.toString((char) (inputString.charAt(i) ^ xorKey));
        }
 
        System.out.println(outputString);
        return outputString;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String sampleString = "Parrot is Pink in colour";
 
        // Encrypt the string
        System.out.println("Encrypted String");
        String encryptedString = encryptDecrypt(sampleString);
 
        // Decrypt the string
        System.out.println("Decrypted String");
        encryptDecrypt(encryptedString);
    }
}
 
// This code is contributed by astal and akash