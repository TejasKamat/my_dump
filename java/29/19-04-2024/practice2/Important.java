package practice2;

import java.util.Scanner;

public class Important {
    public static void main(String[] args) {
        final int a = 5;
        System.out.println("It's \"hello world\"");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
        int[] h = {1, 4, 6, 3, 5, 8};
        for(int i : h) {
            System.out.println(i);
        }
        {
            int x =  3;
            System.out.println(x);
        }
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println(x + 5);
    }
}
