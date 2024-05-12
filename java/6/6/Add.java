/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapidfastner;

/**
 *
 * @author User
 */
public class Add extends Mul{
    public Add() {
        System.out.println("Iam in add");
    }
    
    public static int addition(int a, int b) {
        return a + b;
    }
    public static float addition(float a, float b) {
        return a+b;
    }
}
