/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author HP
 */
public class DogP54 {

    int size;
    String name;

    void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            if (size > 60) {
                System.out.println("Wooof! Wooof!");
            } else if (size > 14) {
                System.out.println("Ruff!, Ruff!");
            } else {
                System.out.println("Yip!, Yip!");
            }
            numOfBarks --;
        }
    }
}
