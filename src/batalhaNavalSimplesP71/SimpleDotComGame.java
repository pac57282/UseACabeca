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
public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        
        GameHelper helper = new GameHelper();
        
        DotCom theDotCom = new DotCom();
        int randomNum = (int) (Math.random() * 5);
        
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        
        while(isAlive = true){
            String guess = helper.getUserInput("insira um número");
            String result = theDotCom.checkYourself(guess);
            
            numOfGuesses++;
            if(result.equals("kill")){
                isAlive = false;
                
                System.out.println("Você usou " + numOfGuesses + " palpites");
            }
        }
    }
}
