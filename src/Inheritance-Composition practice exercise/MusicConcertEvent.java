package Inheritance;

import java.util.Objects;

public class MusicConcertEvent extends Event {
    private boolean merchandiseRequired;
    private double merchandiseCost;

    MusicConcertEvent(String eventID, String eventName,
            String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays,
            double merchandiseCost) {
        super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays);

        this.merchandiseCost = (double) Objects.requireNonNullElse(merchandiseCost, 0);

    }

    public boolean getmerchandiseRequired() {

        return this.merchandiseRequired;

    }

    public void setmerchandiseRequired(double merchandiseRequired) {

        this.merchandiseCost = merchandiseRequired;
    }

    public double getmerchandiseCost() {

        return this.merchandiseCost;
    }

    public void setmerchandiseCost(double merchandiseCost) {

        this.merchandiseCost = merchandiseCost;
    }

    public String toString() {
        return " merchandiseRequired: " + this.merchandiseRequired + " merchandiseCost: " + this.merchandiseCost;
    }

    public void calculateEventCost() {
        System.out.println("The whole cost of the event is " + this.merchandiseCost);
    }

}
