/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioP65;

/**
 *
 * @author HP
 */
public class ClockTestDrive {
    public static void main(String[] args) {
        
        Clock c = new Clock();
        
        c.setTime("12345");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
