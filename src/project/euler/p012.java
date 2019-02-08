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
public class p012 {
    
    public String run() {
        int triangle = 1;
        int i = 1;
        while (true) {
            if (div500(triangle)) {
                return Integer.toString(triangle);
            }
            i++;
            triangle += i; 
        }
    }
    
    private static boolean div500 (int triangle) {
        int count = 0;
        int end = (int) Math.sqrt(triangle);
        for (int i = 1; i < end; i++) {
            if (triangle % i == 0) {
                count += 2;
            }
        }
        if (end * end == triangle) {
            count++;
        }
        if (count > 500) {
            return true;
        }
        else {
            return false;
        }
    }
}
