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
public class p005 {
    
    public String run() {
        long allLcm = 1L;
        for (long i = 1; i <= 20; i++) {
            allLcm = lcm(i, allLcm);
        }
        return Long.toString(allLcm);
    }
    
    public long lcm(long x, long y) {
        return x / gcd(x, y) * y;
    }
    
    // Returns largest non-negative long that divides bot x and y.
    public long gcd(long x, long y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        while (y != 0) {
            long z = x % y;
            x = y;
            y = z;
        }
        return x;
    }
}
