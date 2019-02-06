/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler;

/**
 *
 * @author kaspe
 */
public class p004 {
    
    public String run() {
        int maxPal = -1;
        
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int prod = i * j;
                if (isPalindrome(prod) && prod > maxPal) {
                    maxPal = prod;
                }
            }
        }
        
        return Integer.toString(maxPal);
    }
    
    public boolean isPalindrome(int i) {
        String pal = Integer.toString(i);
        String lap = new StringBuilder(pal).reverse().toString();
        return pal.equals(lap);
    }
}
