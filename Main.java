import java.util.Scanner;

// Main class to execute the menu-driven card deck program
public class Main {
    public static void main(String[] args) {
        // Program Information
        /*
         * Name: Your Name
         * PRN: Your PRN
         * Batch: Your Batch
         */

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create a Deck object to manage the card operations
        Deck deck = new Deck();

        // Main loop for menu-driven operations
        while (true) {
            // Display available card deck operations to the user
            System.out.println("\nCard Deck Operations:");
            System.out.println("1. Print Deck");
            System.out.println("2. Print Specific Card");
            System.out.println("3. Cards with Same Suit");
            System.out.println("4. Cards with Same Rank");
            System.out.println("5. Find Card");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");

            // Prompt the user to enter a choice
            System.out.print("Enter your choice (1-8): ");
            int choice = scanner.nextInt();

            // Perform the chosen operation based on user input
            switch (choice) {
                case 1:
                    // Option 1: Print the entire deck
                    deck.printDeck();
                    break;
                case 2:
                    // Option 2: Print a specific card by index
                    System.out.print("Enter the index of the card: ");
                    int cardIndex = scanner.nextInt();
                    deck.printCard(cardIndex);
                    break;
                case 3:
                    // Option 3: Print cards with the same suit
                    System.out.print("Enter the suit: ");
                    String suitSame = scanner.next();
                    deck.sameCard(suitSame);
                    break;
                case 4:
                    // Option 4: Print cards with the same rank
                    System.out.print("Enter the rank: ");
                    String rankSame = scanner.next();
                    deck.compareCard(rankSame);
                    break;
                case 5:
                    // Option 5: Find a specific card in the deck
                    System.out.print("Enter the suit: ");
                    String suitFind = scanner.next();
                    System.out.print("Enter the rank: ");
                    String rankFind = scanner.next();
                    deck.findCard(suitFind, rankFind);
                    break;
                case 6:
                    // Option 6: Deal 5 random cards
                    deck.dealCard();
                    break;
                case 7:
                    // Option 7: Shuffle the deck
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled.");
                    break;
                case 8:
                    // Option 8: Exit the program
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    // Handle invalid choices
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        }
    }
}
