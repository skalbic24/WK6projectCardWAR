package cardGameWAR;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand; //List to hold the player's cards
    private int score;      //Player's score, set to 0
    private String name;    //Player's name

    //Constructor to start the player's name, hand, and score
    public Player(String name) {
        this.name = name;				//Sets players name
        this.hand = new ArrayList<>();  //starts the players hand
        this.score = 0;					//sets score to 0
    }
    
    //Getter for the players name
    public String getName() {
        return name;
    }
    
    //Method to describe the players hand
    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe();
        }
    }
    
    //Method to flip (remove and return) the top card from the hand
    public Card flip() {
        return hand.remove(0);
    }
    
    //Method to draw a card from the deck and add it to the players hand
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    // Method to increment the players score by 1
    public void incrementScore() {
        score++;
    }

    //Getter for returning the current players score 
    public int getScore() {
        return score;
    }
}