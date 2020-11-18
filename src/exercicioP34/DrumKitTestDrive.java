/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioP34;

/**
 *
 * @author HP
 */
public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();
        
        if(d.snare == true){
            d.playSnare();
        }
    }
}
