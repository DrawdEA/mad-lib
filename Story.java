/**
 * The Story class.
 * 
 * @author Edward Joshua M. Diesta (241571)
 * @version January 30, 2025
 * 
 * I have not discussed the Java language code in my program 
 * with anyone other than my instructor or the teaching assistants 
 * assigned to this course.
 * 
 * I have not used Java language code obtained from another student, 
 * or any other unauthorized source, either modified or unmodified.
 * 
 * If any Java language code or documentation used in my program 
 * was obtained from another source, such as a textbook or website, 
 * that has been clearly noted with a proper citation in the comments 
 * of my program.
 */

import java.util.Scanner;

public class Story {
    private Scanner scanner;
    private String username;
    private String[] words;
    private int counter;

    public Story() {
        scanner = new Scanner(System.in);

        System.out.print("Welcome to Mad Lib Java!\nWhat is your name?\n");
        username = scanner.nextLine();
        words = new String[3];
        counter = 0;
    }

    public void CreateAndPrintStory() {
        String character;
        do {
            // Promps for words.
            if (counter == 0) {
                System.out.print("\nBefore we can complete the story, you'll need to give us some words.\n\n");
            } else {
                System.out.print("\nWelcome back! More words please!\n\n");
            }
            
            System.out.print("Name one of your favorite foods:\n");
            words[0] = scanner.nextLine();
            System.out.print("\nA word you would use to describe a soda drink:\n");
            words[1] = scanner.nextLine();
            System.out.print("\nName of a chemical element:\n");
            words[2] = scanner.nextLine();

            System.out.println("\nThose are all the words we need to finish your story. Press enter to continue.");
            scanner.nextLine();

            // Prints out the story.
            System.out.printf("\nThe Smelly Princess\nBy %s\n\n", username);
            System.out.printf("Once upon a time, there lived a princess named %s. She was very\npretty, but was also slightly %s. And she smelled like %s.\n\n", words[0], words[1], words[2]);
            System.out.print("The end.\n\n");

            // Prompts to play again.
            System.out.print("Would you like to play again? Type Y to make another story. Type any other \ncharacter to exit.\n");
            character = scanner.nextLine();
            counter++;
        } while (character.equalsIgnoreCase("Y"));

        System.out.print("\nGoodbye! Thanks for playing!\n");
    }
}