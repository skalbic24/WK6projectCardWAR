package cardGameWAR;

public class Card {
    private int value; // 2-14 (2-10, J=11, Q=12, K=13, A=14)
    private String name; //The name of the card (ace of diamonds, 2 of hearts, etc..)

    //Constructor to initialize the card's value and name
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // Getter for the card's value
    public int getValue() {
        return value;
    }

    // Getter for the card's name
    public String getName() {
        return name;
    }

    // Method to print the card's name, providing a description of it
    public void describe() {
        System.out.println(name);
    }
}