import java.io.*;

public class Main {
    public static void main(String[] args) {
        Practice p = new Practice();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int val = Integer.parseInt(br.readLine());
            System.out.println(p.calculateFactorial(val));
        } catch(IOException | NumberFormatException m) {
            System.out.println("Error reading input. Please enter a valid number.");
        }
    }
}