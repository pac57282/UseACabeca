/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhaNavalSimplesP71;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    
    private void setUpGame(){
        //primeiro cria alguns objetos DotCom e fornece seus locais
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        
        System.out.println("Seu objetivo é eliminar três dot.coms");
        System.out.println("Pets.com, eToys.com e Go2.com");
        System.out.println("Tente eliminar todos com o menor número de palpites");
        
        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    
    private void startPlaying(){
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Insira um palpite");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    
    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "errado";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if(result.equals("correto")){
                break;
            }
            if(result.equals("eliminar")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    
    private void finishGame(){
        System.out.println("Todas as dot.coms foram eliminadas! Agora seu conjunto está vazio");
        if(numOfGuesses <= 18){
            System.out.println("Você só usou " + numOfGuesses + " palpites");
            System.out.println("Você saiu antes de eliminar suas opções");
        } else {
            System.out.println("Demorou demais. " + numOfGuesses + " palpites");
            System.out.println("não haverá pesca com essas opções");
        }
    }
    
    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
