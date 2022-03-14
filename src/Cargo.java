
import java.util.Scanner;

public class Cargo {

    public static void main(String[] args) {
        LuggageList luggageList = new LuggageList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Luggage no. " + (i + 1) + ": ");

            System.out.println("Belongs to: ");
            String belongsTo = scanner.nextLine();

            System.out.println("Enter weight in kilos: ");
            int weightKilo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter capacity like Width:Height:Length ");
            String stringCapacity = scanner.nextLine();
            String[] bol = stringCapacity.split(":");
            int width = Integer.parseInt(bol[0]);
            int height = Integer.parseInt(bol[1]);
            int length = Integer.parseInt(bol[2]);
            double capacity = (width * height * length) / 1000.0;

            Luggage luggage = new Luggage(belongsTo, weightKilo, capacity);

            luggageList.addLuggage(luggage);
            System.out.println("The luggage belonging to: " + belongsTo + " is added to the list.");
        }
        System.out.println("-----------------");
        System.out.println("Here is a list of the luggages (using toString() method of list object)...");
        luggageList.display();

        System.out.println("-----------------");
        System.out.println("Which luggage would you like to delete?");
        String deleteLuggage = scanner.nextLine();
        luggageList.removeLuggage(deleteLuggage);
        luggageList.display();

        System.out.println("-----------------");
        System.out.println("Whose luggage would you like to search? ");
        String searchLuggage = scanner.nextLine();
        System.out.println("Here is the luggage you were looking for...");
        System.out.println(luggageList.getLuggage(searchLuggage).toString());

        System.out.println("-----------------");
        System.out.println("The luggage belonging to: " + luggageList.getHighestCapacityLuggage().getBelongsTo() + " has the highest capacity of " + luggageList.getHighestCapacityLuggage().getCapacity_lt() + " liters.");
        System.out.println("-----------------");

    }

}
