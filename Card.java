// Card class representing a playing card
public class Card {
    // Private instance variables to store the suit and rank of the card
    private String suit;
    private String rank;

    // Constructor to initialize the card with suit and rank
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getter method to retrieve the suit of the card
    public String getSuit() {
        return suit;
    }

    // Getter method to retrieve the rank of the card
    public String getRank() {
        return rank;
    }

    // Method to print the card details
    public void printCard() {
        System.out.println(rank + " of " + suit);
    }
}

