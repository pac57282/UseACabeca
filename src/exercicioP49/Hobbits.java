/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioP49;

/**
 *
 * @author HP
 */
public class Hobbits {
    String name;
    
    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;
        
        while(z < h.length){
            
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            
            if(z==1){
                h[z].name = "frodo";
            }
            if(z==2){
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.print("good Hobit name");
            System.out.println("");
            
            z=z+1;
        }
    }
}
