/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapidfastner;

public class Add extends Thread {
    public void run() {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
            System.out.println("sum = " + sum);
        }
        
    }
}
