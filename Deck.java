import java.util.ArrayList;
import java.util.Collections;

// Deck class representing a deck of playing cards
public class Deck {
    // ArrayList to store Card objects representing the deck
    private ArrayList<Card> cards;

    // Constructor to create a deck of cards
    public Deck() {
        createDeck(); // Initialize the deck when a Deck object is created
    }

    // Method to create a deck of 52 cards
    public void createDeck() {
        // Arrays defining possible suits and ranks of cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Initialize the ArrayList to store Card objects
        cards = new ArrayList<>();

        // Nested loops to create cards with all combinations of suits and ranks
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank)); // Add a new Card to the deck
            }
        }
    }

    // Method to print the entire deck
    public void printDeck() {
        // Iterate through the cards and print each card
        for (Card card : cards) {
            card.printCard();
        }
    }

    // Method to print a specific card by index
    public void printCard(int index) {
        // Check if the index is within valid bounds
        if (index >= 0 && index < cards.size()) {
            cards.get(index).printCard(); // Print the card at the specified index
        } else {
            System.out.println("Invalid card index.");
        }
    }

    // Method to find cards with the same suit
    public void sameCard(String suit) {
        // Iterate through the cards and print those with the specified suit
        for (Card card : cards) {
            if (card.getSuit().equalsIgnoreCase(suit)) {
                card.printCard();
            }
        }
    }

    // Method to compare cards with the same rank
    public void compareCard(String rank) {
        // Iterate through the cards and print those with the specified rank
        for (Card card : cards) {
            if (card.getRank().equalsIgnoreCase(rank)) {
                card.printCard();
            }
        }
    }

    // Method to find a specific card in the deck
    public void findCard(String suit, String rank) {
        // Iterate through the cards and print the specified card if found
        for (Card card : cards) {
            if (card.getSuit().equalsIgnoreCase(suit) && card.getRank().equalsIgnoreCase(rank)) {
                card.printCard();
                return; // Found the card, so exit the loop
            }
        }
        System.out.println("Card not found in the deck.");
    }

    // Method to deal 5 random cards
    public void dealCard() {
        Collections.shuffle(cards); // Shuffle the deck
        for (int i = 0; i < 5; i++) {
            cards.get(i).printCard(); // Print the first 5 cards after shuffling
        }
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(cards); // Shuffle the deck
    }
}
