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
public final class p001 {
    
    public String run() {
        int sum = 0;
        for (int i = 0; i < 1000; i += 3) {
            if (i % 3 ==0 && i % 5 == 0) {
                sum += i;
            }
        }
        
        return Integer.toString(sum);
    }

}
