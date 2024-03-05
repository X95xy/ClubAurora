package theClassOfTheStudent;

import java.util.*;

public class Student {

    private String studentID;
    private String studentName;
    private String[] extraActivities;
    private int theNumberOfTheAct;

    Student(String studentID, String studentName, int l) {
        this.studentID = studentID;// Objects.requireNonNull(studentID, "Unknown");// requireNonNull, studentID);//
                                   // studentID;
        // Student(String studentID, String studentName, int l) {
        this.studentName = studentName;// Objects.requireNonNull(null, studentName);
        this.theNumberOfTheAct = l;
    }

    public void addExtraActivity(int i, String[] hehe) {
        for (String he : hehe)
            this.setActivities(i, he);

    }

    public String toString() {

        return "the ID of the student is :" + this.getStudentID() + "  the name of the student is:"
                + this.studentName + "    the activities the student attend are :" + this.getAct();// +
        // this.getActivities();

    }

    public String getStudentID() {
        return this.studentID;
    }

    public String getName() {
        return this.studentName;
    }

    /*
     * public String getActivities() {
     * String u;
     * // StringBuilder in;
     * String oo=this.extraActivities
     * for (String jj : this.extraActivities) {
     * 
     * /// u = "the first actviityis" + jj;
     * }
     * 
     * return u;// this.extraActivities;
     * 
     * }
     */
    public String getAct() {

        int i = this.extraActivities.length;
        String[] ii = new String[i];
        ii = this.extraActivities.clone();
        // String o = ii.toString();
        StringBuilder iu = new StringBuilder();
        for (String pp : ii) {
            iu.append(pp);
        }
        String o = iu.toString();
        return o;
    }

    public void setstudentID(String in) {
        this.studentID = in;
    }

    public void setstudentName(String k) {
        this.studentName = k;
    }

    public void setActivities(int i, String o) {

        this.extraActivities[i] = o;
    }

}
