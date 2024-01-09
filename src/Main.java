import java.util.*;

public class Main  {

    public static Scanner in = new Scanner(System.in);

    public static void main(String [] args) {
            // eliminatedInFirstTour is an interger because, it will automatically round up the number of eliminated players.
            int playerCount, eliminatedInFirstTour, eliminatedInSecondTour;

            System.out.print("Enter player count: ");
            playerCount = in.nextInt();

            eliminatedInFirstTour = playerCount / 7;
            System.out.println("Players eliminated in first tour: " + eliminatedInFirstTour);
            playerCount = playerCount - eliminatedInFirstTour;
            eliminatedInSecondTour = playerCount / 7;
            playerCount = playerCount - eliminatedInSecondTour;

            System.out.println("Players left after the second tour: " + playerCount);

    }

}