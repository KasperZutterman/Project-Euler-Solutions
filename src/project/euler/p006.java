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
public class p006 {
    
    public String run() {
        int sumOfSquares = 0;
        int squareOfSum = 0;
        
        for (int i = 0; i <= 100; i++) {
            sumOfSquares += i*i;
            squareOfSum += i;
        }
        
        return Integer.toString(squareOfSum * squareOfSum - sumOfSquares);
    }
}
