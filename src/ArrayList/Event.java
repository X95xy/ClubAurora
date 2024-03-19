
package ArrayList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Event {
    private String eventid;
    private String eventName;
    private String eventVenue;
    private LocalDate eventDate;
    private final int capacity = 200;
    Scanner in = new Scanner(System.in);
    HashMap<String, Attendee> seatDetails = new HashMap<String, Attendee>(capacity, (float) 0.6);

    @SuppressWarnings("rawtypes")
    private ArrayList eventAttendees = new ArrayList<>(1000);

    @SuppressWarnings("unchecked")
    public void setSeatDeails(String a, Attendee b) {

        seatDetails.put(a, b);

    }

    public Attendee getSeatDetails(String s) {

        return (Attendee) seatDetails.get(s);

    }

    Event(String eventid, String eventName, String eventVenue, int year, int month, int day) {
        this.eventid = eventid;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = LocalDate.of(year, month, day);
        // this.eventAttendees = new ArrayList<>(1000);
    }

    Event() {

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

    public void organizeEvent(int w) {

        switch (w) {

            case 1:
                // in.nextLine();
                // in.next();
                System.out.println("Please scannf the number of the prople ");
                int number = in.nextInt();

                for (int cnt = 0; cnt < number; cnt++) {
                    System.out.println("scannf the name of the people");
                    in.nextLine();
                    String name = in.nextLine();
                    System.out.println("Enter the gender of the attendee");
                    char gender = in.nextLine().charAt(0);
                    System.out.println("Enter the Email of the attendee");
                    String email = in.nextLine();
                    System.out.println("Enter the age of the people ");
                    int age = in.nextInt();
                    System.out.println("Enter the seatNo of the attendee");
                    in.nextLine();
                    String seatNo = in.nextLine();

                    this.eventAttendees.add(new Attendee(name, gender, email, age));
                    this.seatDetails.put(seatNo, new Attendee(name, gender, email, age));
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
        /*
         * System.out.println("The end of the switch");
         * in.close();
         * System.out.println("the size of the event people attend is:" +
         * this.eventAttendees.size());
         * System.out.println("The seat numbers of the event are:");
         * /*
         * seatDetails.forEach((seatNo, Attendee) -> {
         * System.out.println("The seat is :" + seatNo.toString());
         * System.out.println("The message of the  attendee " + Attendee.toString());
         * });
         */

        // while(seatDetails.)

    }

}