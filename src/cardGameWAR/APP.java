package cardGameWAR;

public class APP {

	public static void main(String[] args) {
        Deck deck = new Deck();   //Create a new deck of cards
        deck.shuffle();   //Shuffle the deck

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Each player draws 26 cards
        for (int i = 0; i < 26; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        // Players flip cards and compare values
        for (int i = 0; i < 26; i++) {
            Card p1Card = player1.flip();
            Card p2Card = player2.flip();
            
            //Describes the flipped cards
            System.out.print(player1.getName() + " flips: ");
            p1Card.describe();
            System.out.print(player2.getName() + " flips: ");
            p2Card.describe();

            //Compare the cards values and updates the score
            if (p1Card.getValue() > p2Card.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins this round!");
            } else if (p1Card.getValue() < p2Card.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins this round!");
            } else {
                System.out.println("It's a tie!"); //No points awarded for ties
            }
            //Prints the current score after each round
            System.out.println("Current Score: " + player1.getName() + " " + player1.getScore() + " - " + player2.getName() + " " + player2.getScore());
            System.out.println();
        }

        // Prints the final score and determines the winner
        System.out.println("Final Score:");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        //Determines and prints the overall winner
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
