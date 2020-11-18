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
public class GoodDogTestDriveP61 {

    public static void main(String[] args) {
        GoodDogP61 one = new GoodDogP61();
        one.setSize(70);
        GoodDogP61 two = new GoodDogP61();
        two.setSize(8);
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        one.bark();
        two.bark();
    }
}
