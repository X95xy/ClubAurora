
package ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        var event = new Event();
        System.out.println("Please scannf the id of the thing ");
        String id = on.nextLine();
        event.setEventId(id);
        // System.out.println(thing.getEventId());

        System.out.println("Please scannf the name of the thing ");
        String name = on.nextLine();
        event.setEventNamw(name);
        System.out.println("PLease scannf the venue of the thing ");
        String venue = on.nextLine();
        System.out.println("Please scannf the time of the thing ");
        System.out.println("Enter the year of the time ");

        int year = on.nextInt();
        System.out.println("Enter the month of the time ");

        int month = on.nextInt();
        System.out.println("Enter the day of the time ");
        int day = on.nextInt();
        event.setEventDate(year, month, day);
        System.out.println("Now it's for you to set the name of the people who attend the thing ");
        System.out.println(
                "enter 1 to add people \nenter 2 to remove people \nenter 3 to updating people \nenter 4 to finding people");
        on.nextLine();

        int e = on.nextInt();
        event.organizeEvent(e);
        // on.nextLine();
        event = new Event(id, name, venue, year, month, day);
        System.out.println(event.toString() + event.getName());
        // on.close();

        System.out.println(
                "Enter 1 to Handle complementary passes, Enter 2 to Handle performances, and Enter 3 to  Get seat details");
        // on.close();

        System.out.println("Enter the value of your choice ");
        int p = on.nextInt();
        HandleComplementaryPasses i = new HandleComplementaryPasses();
        HandlePerformances o = new HandlePerformances();
        switch (p) {

            case 1:

                i.handleComplementaryPasses();

                break;
            case 2:

                o.handlePerformances();
                break;
            case 3:
                System.out.println("The details about the seat is ");
                //
                break;
            default:
                break;
        }// the end of the try loop
         // in.close();
        on.close();
    }
    //// the end of the main
}

// the en of the class
