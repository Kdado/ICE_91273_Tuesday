/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author Revenger Mini
 date 24, sep 2019
 ice 1 test*/

public class CardGame {

  private String suit; // spades, diamonds, clubs, hearts
  private int value; // 1 to 13 
  public static final String[] Suits = {"clubs", "hearts", "diamonds", "spades"};

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
//2 methods for random generation of suits and value 
    public int ranSuit(){
        int value = (int)(Math.random()*3)+0;
        return value;
    }
    public int ranValue(){
        int value = (int) (Math.random()*13)+1;
        return value;
    }
}
