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
public class p003 {
    
    public String run() {
        long n = 600851475143L;
        while (true) {
            long p = smallestFactor(n);
            if (p < n) {
                n /= p;
            }
            else {
                return Long.toString(n);
            }
        }
    }
    
    private static long smallestFactor(long n) {
        if (n <= 1) {
            System.out.println("Illegal argument");
        }
        long end = (long) Math.sqrt(n);
        for (long i = 2; i <= end; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }
}
