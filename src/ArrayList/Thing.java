package ArrayList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Thing {
    private String eventid;
    private String eventName;
    private String eventVenue;
    private LocalDate eventDate;
    @SuppressWarnings("rawtypes")
    private ArrayList eventAttendees = new ArrayList<>(1000);

    Thing(String eventid, String eventName, String eventVenue, int year, int month, int day) {
        this.eventid = eventid;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = LocalDate.of(year, month, day);
        // this.eventAttendees = new ArrayList<>(1000);
    }

    Thing() {

    }

    public String toString() {

        return "Name:" + this.eventName + " " + "Venue:" + this.eventVenue + "  " + "ID:" + this.eventid + "  "
                + " Date:"
                + this.eventDate.toString();
    }

    public String getName() {

        return this.eventAttendees.toString();
    }

    public String getEventId() {
        return eventid;
    }

    public String getEventNmae() {
        return eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public String getEventDate() {
        return eventDate.toString();
    }

    public void setEventId(String id) {
        this.eventid = id;
    }

    public void setEventNamw(String name) {
        this.eventName = name;
    }

    public void setEventVenue(String venue) {
        this.eventVenue = venue;
    }

    public void setEventDate(int year, int month, int day) {
        this.eventDate = LocalDate.of(year, month, day);
    }

    @SuppressWarnings("unchecked")
    public void organizeEvent() {
        Scanner in = new Scanner(System.in);
        int i = 0;
        System.out.println(
                "enter 1 to add people \nenter 2 to remove people \n   enter 3 to updating people \nenter 4 to finding people");
        i = in.nextInt();
        switch (i) {
            case 1:
                // in.nextLine();
                // in.next();
                System.out.println("Please scannf the number of the prople ");
                int number = in.nextInt();

                for (int cnt = 0; cnt < number; cnt++) {
                    System.out.println("scannf the name of the people");
                    in.nextLine();
                    String message = in.nextLine();
                    this.eventAttendees.add(message);
                }
                break;
            case 2:
                System.out.println("Please scannf the serial number of the people you want remove");
                int serialnumber = in.nextInt();
                this.eventAttendees.remove(serialnumber);

                break;
            case 3:
                System.out.println("PLease scannf the number of the people you want to renew");
                int thenumber = in.nextInt();
                System.out.println("Scannf the name of the people ");
                String mss = in.nextLine();

                // int thenumber=in.nextInt();

                this.eventAttendees.set(thenumber, mss);
                break;
            case 4:
                System.out.println("Please scannf the number the people you want to get");
                int number_2 = in.nextInt();
                String message_2 = (String) this.eventAttendees.get(number_2);
                System.out.println("the name of the people you want to get is :" + message_2);
                break;
            default:
                break;

        }
        in.close();
        System.out.println("the size of the event people attend is:" +
                this.eventAttendees.size());

    }

}
