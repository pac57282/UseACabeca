/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioP33;

/**
 *
 * @author HP
 */
public class TapeDeckTestDrive {
    public static void main(String[] args) {
        
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();
        
        if (t.canRecord == true){
            t.recordTape();
        }
    }
}
