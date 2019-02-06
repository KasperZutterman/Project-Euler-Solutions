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
public class p002 {
    
    public String run() {
        int sum = 0;
        int x = 1;
        int y = 2;
        while (x <= 4000000) {
            if (x % 2 ==0) {
                sum += x;
            }
            y += x;
            x = y - x;
        }
        return Integer.toString(sum);
    }
}
