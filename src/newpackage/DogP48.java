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
public class DogP48 {

    String name;

    public static void main(String[] args) {
        //cria o acesso a Dog e o acessa
        DogP48 dog1 = new DogP48();
        dog1.bark();
        dog1.name = "Bart";
        //agora cria uma matriz Dog
        DogP48[] myDogs = new DogP48[3];
        myDogs[0] = new DogP48();
        myDogs[1] = new DogP48();
        myDogs[2] = dog1;
        //agora acessa os objetos Dog
        //usando as referências da matriz
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        //qual é o nome do myDogs{2}?
        System.out.print("o nome do último cão é ");
        System.out.println(myDogs[2].name);
        //agora executa um loop pela matriz
        //e pede a todos os cães para latirem
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x++;
        }
    }
    public void bark(){
        System.out.println(name + " diz Late!");
    }
    public void eat(){
        
    }
    public void chaseCat(){
        
    }
}
