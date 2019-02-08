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
public class p010 {

    public String run() {
        long sum = 0;
        for (long i = 2; i < 2000000; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        
        return Long.toString(sum);
    }
    
    public boolean isPrime(long x) {
        if (x < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        else if (x == 0 || x == 1) {
            return false;
        }
        else if (x == 2) {
            return true;
        }
        else {
            if (x % 2 == 0) {
                return false;
            }
            long end = (long) Math.sqrt(x);
            for (int i = 3; i <= end; i += 2) {
                if (x % i == 0) { 
                    return false;
                }
            }
            return true;
        }
    }
}
