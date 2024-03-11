package ArrayList;

import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        var thing = new Thing();
        System.out.println("Please scannf the id of the thing ");
        String id = on.nextLine();
        thing.setEventId(id);
        // System.out.println(thing.getEventId());

        System.out.println("Please scannf the name of the thing ");
        String name = on.nextLine();
        thing.setEventNamw(name);
        System.out.println("PLease scannf the venue of the thing ");
        String venue = on.nextLine();
        System.out.println("Please scannf the time of the thing ");
        int year = on.nextInt();
        int month = on.nextInt();
        int day = on.nextInt();
        thing.setEventDate(year, month, day);
        System.out.println("Now it's for you to set the name of the people who attend the thing ");
        on.nextLine();
        thing.organizeEvent();
        // on.nextLine();
        thing = new Thing(id, name, venue, year, month, day);
        System.out.println(thing.toString() + thing.getName());
        // on.close();

        Thing thing_1 = new Thing();
        // Scanner in = new Scanner(System.in);
        int history = 0;
        do {

            System.out.println("Here are the choices you can choose in the program");
            System.out.println("Type 1 to enter the event details ");
            System.out.println("Type 2 to enter a attendee's name that are coming to the event ");
            System.out.println("Type 3  to remove a attendee of the list");
            System.out.println("Type 4 to update a attendee from the lis t");
            System.out.println("Type 5 to search a attendee from the list ");

            System.out.println("Type 6 to display a attendee from the list ");
            // System.out.println("");
            // on.next();
            history = on.nextInt();
            thing.organevent(history);
            // System.out.println("/////");

            System.out.println("Please enter the ");

        } while (history != 7);
        on.close();
    }

}
