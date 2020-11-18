/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhaNavalSimplesP71;

/**
 *
 * @author HP
 */
public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        SimpleDotComTestDrive dot = new SimpleDotComTestDrive();
        int[] locationCells = {2, 3, 4};

        dot.setLocationCells(locations);
        String userGuess = "2";

        String result = dot.checkyYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
            testeResult = "passed";
        }
        System.out.println(testResult);
    }


}
