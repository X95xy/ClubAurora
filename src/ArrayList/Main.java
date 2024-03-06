package ArrayList;

import java.util.*;

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
        on.close();
    }

}
