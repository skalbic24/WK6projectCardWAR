package cardGameWAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards; // List to hold the cards in the deck

    // Constructor to initialize the deck with 52 cards
    public Deck() {
        cards = new ArrayList<>(); // initialize the list of cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; //Array of suits
        for (String suit : suits) {
            for (int value = 2; value <= 14; value++) {
                String cardName = value <= 10 ? value + " of " + suit : 
                                (value == 11 ? "Jack of " : value == 12 ? "Queen of " : 
                                value == 13 ? "King of " : "Ace of ") + suit;
                cards.add(new Card(value, cardName)); //Create and add each card to the list
            }
        }
    }

    // Method to shuffle the cards in the deck
    public void shuffle() {
        Collections.shuffle(cards); //Randomly rearranges the cards
    }

    //Method to draw the top card from teh deck
    public Card draw() {
        return cards.remove(0); //Remove and return the top card
    }
}
