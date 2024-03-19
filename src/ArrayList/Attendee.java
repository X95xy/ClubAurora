package ArrayList;

import java.util.Objects;

public class Attendee {
    private String name;
    private char gender;
    private String email;
    private int age;
    private String seatNo;

    public Attendee(String name, char gender, String email, int age) {

        this.name = Objects.requireNonNull(name, "Unknown");
        this.gender = gender;
        this.email = email;
        this.age = age;
        // this.seatNo = seatNo;

    }

    public String getSeatNo() {

        return this.seatNo;

    }

    public void setSeatNo(String seatNo) {

        this.seatNo = seatNo;
    }

    public String toString() {

        return "name: " + this.name + " gender: " + this.gender + " email: " + this.email + " age: " + this.age
                + "  seatNo: " + this.seatNo;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setGender(char name) {

        this.gender = name;

    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getAge() {

        return this.age;

    }

    public char getGender() {

        return this.gender;
    }

    public String getName() {

        return this.name;
    }

    public String getEmail() {

        return this.email;
    }
}
