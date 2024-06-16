/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardgame;

/**
 *
 *  @author Kritish Soni/ Student ID: 991720996
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       GameFactory game = new GameFactory("Mannan", "Pankaj");
       game.playGame();
    }
    
}
