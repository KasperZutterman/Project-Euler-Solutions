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
public class p007 {
    
    public String run() {
        int count = 0;
        int i = 2;
        while (count != 10001) {
            if (isPrime(i)) {
                count++;
            }
            i++;
        }
        return Integer.toString(i - 1);
    }
    
    public boolean isPrime(int x) {
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
            int end = (int) Math.sqrt(x);
            for (int i = 3; i <= end; i += 2) {
                if (x % i == 0) { 
                    return false;
                }
            }
            return true;
        }
    }
}
