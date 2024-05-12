package raidq29;
import java.util.*;
public class SumOfNumbers extends Thread {
    int SumOfNumbers(int num) {
        int sum = 0, digit;
        try {
            while(num != 0){
                digit = num%10;
                System.out.println("1 The Number is : " + num + " The digit is : " + digit);
                Thread.sleep(0);
                sum += digit;
                num /= 10;
                System.out.println("2 The Number is : " + num + " The sum is : " + sum);
            }  
        } catch(InterruptedException e) {
            System.err.println(e.getMessage());
        }
        
        return sum;
    }
    public static void main(String args[]) {
        SumOfNumbers s = new SumOfNumbers();
        
//        System.out.println(s.SumOfNumbers(462876543));
//        int sum = 0, num, digit;
//        num = 1234;
//        while(num != 0) {
//            digit = num%10;
//            sum = sum + digit;
//            num /= 10;
//        }
        
//        System.out.println(sum);
//        int elements[] = new int[9];
//        Scanner c = new Scanner(System.in);
//        for(int i = 0; i < elements.length; i++) {
//            elements[i] = c.nextInt();
//        }
        Scanner c = new Scanner(System.in);
        int a[] = new int[3];
        
        for(int i = 0; i < a.length; i++) {
            a[i] = c.nextInt();
        }
//        int small = 999999;
//        
//        for(int i = 0; i < elements.length; i++) {
//            if(elements[i] < small) {
//                small = elements[i];
//            }
//        }
//        System.out.println("The smallest number is : " + small);
        int small = a[0];
        for(int i = 0; i < a.length; i++) {
            if(small > a[i]) {
                small = a[i];
            }
        }
        System.out.println("The smallest number is : " + small);
    }
    
}
