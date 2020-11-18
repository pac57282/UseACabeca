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
public class Books {
    String titulo;
    String autor;
}

class BooksTestDrive{
    public static void main(String[] args) {
        
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        
        myBooks[0].titulo = "The Grapes of Java";
        myBooks[1].titulo = "The Java Gatsby";
        myBooks[2].titulo = "The Java Cookbook";
        myBooks[0].autor = "bob";
        myBooks[1].autor = "sue";
        myBooks[2].autor = "ian";
        
        while (x < myBooks.length){
            System.out.print(myBooks[x].titulo);
            System.out.print(" by ");
            System.out.print(myBooks[x].autor);
            System.out.println("");
            x++;
        }
    }
}
