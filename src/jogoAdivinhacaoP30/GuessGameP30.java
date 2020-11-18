/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoAdivinhacaoP30;

/**
 *
 * @author HP
 */
public class GuessGameP30 {
    PlayerP31 p1;
    PlayerP31 p2;
    PlayerP31 p3;

    public void startGame(){
        p1 = new PlayerP31();
        p2 = new PlayerP31();
        p3 = new PlayerP31();
        
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Estou pensando em um número entre 0 e 9...");
        
        while(true){
            System.out.println("O número a adivinhar é " + targetNumber);
            
            p1.guess();
            p2.guess();
            p3.guess();
            
            guessp1 = p1.number;
            System.out.println("O jogador forneceu o palpite " + guessp1);
            guessp2 = p2.number;
            System.out.println("O jogador forneceu o palpite " + guessp2);
            guessp3 = p3.number;
            System.out.println("O jogador forneceu o palpite " + guessp3);
            
            if (guessp1 == targetNumber){
                p1isRight = true;
            }
            if (guessp2 == targetNumber){
                p2isRight = true;
            }
            if (guessp3 == targetNumber){
                p3isRight = true;
            }
            
            if (p1isRight || p2isRight || p3isRight){
                System.out.println("Temos um vencedor");
                System.out.println("O jogador um ecertou? " + p1isRight);
                System.out.println("O jogador dois ecertou? " + p2isRight);
                System.out.println("O jogador três ecertou? " + p3isRight);
                System.out.println("Fim de jogo.");
                break; //fim do jogo, portanto saia do loop
            }else{
                //devemos continuar porque ninguém acertou!
                System.out.println("Os jogadores terão que tentar novamente.");
            }
        }
    }
}
