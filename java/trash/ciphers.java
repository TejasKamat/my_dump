public class ciphers 
{
    public static void main(String[] args) 
	{
        String word = "Hello";
        int shift = 3; 
        String shiftedWord = shiftLetters(word, shift);
        System.out.println("Shifted Word: " + shiftedWord);
    }
    
}