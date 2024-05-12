class XOREncryption
{
	static String encryptDecrypt(String inputString)
	{
		char Key = 'E';

		String outputString = "";

		int len = inputString.length();


		for (int i = 0; i < len; i++)
		{
			outputString = outputString +
			Character.toString((char) (inputString.charAt(i) ^ Key));
		}

		System.out.println(outputString);
		return outputString;
	}

	public static void main(String[] args)
	{
		String sampleString = "EXOR ENCRYPTION";
		System.out.println("Encrypted String");
		String encryptedString = encryptDecrypt(sampleString);

		System.out.println("Decrypted String");
		encryptDecrypt(encryptedString);
	}
}
