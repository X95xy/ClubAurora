package Inheritance;

import java.util.Objects;

  public abstract class Event /* implements interfice */ {
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;

    public void pr() {

    }

    Event(String a, String b, String c, String d, int f, int r) {

        this.eventID = a;
        this.eventName = b;
        this.eventLocation = c;
        this.eventPointOfContact = d;

        this.totalParticipants = f;
        this.totalEventDays = r;

        // this.totalEventDays=t;
    }

    Event() {

    }

    public String toString() {

        return "EventID: " + this.eventID + " EventName :" + this.eventName + " EventLocation : " + this.eventLocation
                + " eventPointOfContact: " + this.eventPointOfContact + " totalParticipants: " + this.totalParticipants
                + " totalEventDays: " + this.totalEventDays;

    }

    public void settotalEventDays(int p) {

        this.totalEventDays = p;
    }

    public void settotalParticipants(int a) {
        this.totalParticipants = a;
    }

    public void seteventCost(double a) {

        this.eventCost = (double) Objects.requireNonNullElse(a, 0);
    }

    public void setName(String g) {

        this.eventName = g;
    }

    public void setLocation(String u) {
        this.eventLocation = u;
    }

    public void setId(String a) {
        this.eventID = a;

    }

    public String getID() {
        return this.eventID;

    }

    public String getName() {
        return this.eventName;
    }

    public String getLocation() {
        return this.eventLocation;
    }

    public String getPartOfcontract() {

        return this.eventPointOfContact;

    }

    public double getCost() {
        return this.eventCost;
    }

    public int getP() {
        return this.totalParticipants;
    }

   public  void calculateEventCost() {
      //  System.out.println("The whole cost of the event is " + this.eventCost);
    }
}
