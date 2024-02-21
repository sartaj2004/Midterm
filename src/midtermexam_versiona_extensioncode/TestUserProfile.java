
import midtermexam_versiona_extensioncode.UserProfile;
import java.util.Scanner;

public class TestUserProfile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Display available genres
        System.out.println("Choose your favorite genre from the following options:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // Prompt user to choose genre
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int choice = input.nextInt();
        input.nextLine(); // Consume newline character

        // Validate genre choice
        if (choice < 1 || choice > genres.length) {
            System.out.println("Invalid choice! Exiting...");
            return;
        }

        // Create UserProfile object
        UserProfile userProfile = new UserProfile(name, genres[choice - 1]);

        // Display confirmation message
        System.out.println("\nUser Profile created successfully!");
        System.out.println("Name: " + userProfile.getUserID());
        System.out.println("Favorite Genre: " + userProfile.getGenre());
    }
}
