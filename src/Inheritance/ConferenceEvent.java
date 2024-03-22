package Inheritance;

//
import java.util.Objects;

public class ConferenceEvent extends Event {

    private boolean breakfastRequired;
    private double brefakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;

    ConferenceEvent(String eventID, String eventName, String eventLocation,
            String pointOfContact, int totalParticipants, int totalEventDays,
            double breakfastCost, double lunchCost, double dinnerCost) {
        super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays);
        this.brefakfastCost = (double) Objects.requireNonNullElse(breakfastCost, 0);// .breakfastCost;
        this.lunchCost = (double) Objects.requireNonNullElse(lunchCost, 0);
        this.dinnerCost = (double) Objects.requireNonNullElse(dinnerCost, 0);
    }

    public String toString() {

        return " breakfastCost: " + this.brefakfastCost + " lunchCost: " + this.lunchCost + " dinnerCost: "
                + this.dinnerCost;
    }

    public boolean getbreakfastRequired() {

        return this.breakfastRequired;
    }

    public double brefakfastCost() {
        return this.brefakfastCost;
    }

    public boolean lunchRequired() {

        return this.lunchRequired;
    }

    public double lunchCost() {

        return this.lunchCost;
    }

    public boolean dinnerRequired() {

        return this.dinnerRequired;
    }

    public double dinnerCost() {
        return this.dinnerCost;
    }

    public void setbreakfastRequired(boolean breakfastRequired) {

        this.breakfastRequired = breakfastRequired;
    }

    public void setbrefakfastCost(double brefakfastCost) {
        this.brefakfastCost = brefakfastCost;
    }

    public void setlunchRequired(boolean lunchRequired) {

        this.lunchRequired = lunchRequired;
    }

    public void setlunchCost(double lunchCost) {

        this.lunchCost = lunchCost;
    }

    public void setdinnerRequired(boolean dinnerRequired) {

        this.lunchRequired = dinnerRequired;
    }

    public void setdinnerCost(double dinnerCost) {

        this.dinnerCost = dinnerCost;
    }

    public void calculateEventCost() {

        System.out.println(" The whole cost of the event is " + (this.brefakfastCost
                + this.lunchCost + this.dinnerCost));

    }

}