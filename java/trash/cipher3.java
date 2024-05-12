public class LetterShiftExample {
    public static void main(String[] args) {
        String word = "Hello";
        int shift = 3; // Number of positions to shift each letter
        
        String shiftedWord = shiftLetters(word, shift);
        System.out.println("Shifted Word: " + shiftedWord);
    }
    
    public static String shiftLetters(String word, int shift) {
        StringBuilder shiftedWord = new StringBuilder();
        
        for (char ch : word.toCharArray()) {
            char shifted = (char) (ch + shift);
            shiftedWord.append(shifted);
        }
        
        return shiftedWord.toString();
    }
}
