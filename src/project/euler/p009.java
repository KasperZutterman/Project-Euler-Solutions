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
public class p009 {
    
    public String run() {
        final int PER = 1000;
        for (int a = 1; a < PER; a++) {
            for (int b = a + 1; b < PER - a; b++) {
                int c = PER - a - b;
                if (a*a + b*b == c*c) {
                    return Integer.toString(a * b * c);
                }
            }
        }
        throw new AssertionError("Not found");
    }
}
