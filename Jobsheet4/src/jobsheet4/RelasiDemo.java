/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet4;

/**
 *
 * @Created by Alkindi Syamsi 21343003
 */
public class RelasiDemo {
    public static void main(String[]args){
        int i = 37;
        int j = 42;
        int k = 42;
        
        System.out.println("Nilai variabel...");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        
        //lebih besar dari
        System.out.println("Lebih besar dari...");
        System.out.println("i > j = " + (i > j)); // false
        System.out.println("j > i = " + (j > i)); // true
        System.out.println("k > j = " + (k > j)); // false
        
        //lebih besar atau sama dengan
        System.out.println("Lebih besar dari...");
        System.out.println("i >= j = " + (i >= j)); // false
        System.out.println("j >= i = " + (j >= i)); // true
        System.out.println("k >= j = " + (k >= j)); // true
        
        //lebih kecil dari
        System.out.println("Lebih besar dari...");
        System.out.println("i < j = " + (i < j)); // true
        System.out.println("j < i = " + (j < i)); // false
        System.out.println("k < j = " + (k < j)); // false
        
        //lebih kecil atau sama dengan
        System.out.println("Lebih besar dari...");
        System.out.println("i <= j = " + (i <= j)); // true
        System.out.println("j <= i = " + (j <= i)); // false
        System.out.println("k <= j = " + (k <= j)); // true
        
        //sama dengan
        System.out.println("Lebih besar dari...");
        System.out.println("i == j = " + (i == j)); // false
        System.out.println("k == j = " + (j == i)); // true
        
        //tidak sama dengan
        System.out.println("Lebih besar dari...");
        System.out.println("i != j = " + (i != j)); // false
        System.out.println("k != j = " + (j != i)); // true
    }
}
