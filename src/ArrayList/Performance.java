package ArrayList;

public class Performance {

    private String performanceID;
    private String performanceName;
    private String performanceLeadName;
    private char performanceGroup;

    Performance(String a, String b, String c, char performanceGroup) {

        this.performanceID = a;
        this.performanceName = b;
        this.performanceLeadName = c;
        this.performanceGroup = performanceGroup;

    }

    public void setPerformanceGroup(char a) {
        this.performanceGroup = a;
    }

    public char getPerformanceGroup() {
        return this.performanceGroup;
    }

    public void setPerformanceID(String a) {
        this.performanceID = a;
    }

    public void setPerformanceName(String a) {
        this.performanceName = a;

    }

    public void setPerformanceLeadName(String a) {
        this.performanceLeadName = a;
    }

    public String getPerformaenceID() {
        return this.performanceID;
    }

    public String getPerformanceName() {
        return this.performanceName;
    }

    public String getPerformanceLeadName() {
        return this.performanceLeadName;
    }

    public String toString() {

        return "The performanceID is :" + this.performanceID + "performanceName is :" + this.performanceName
                + "performanceLeadName is:" + this.performanceLeadName + " The performanceGroup is : "
                + this.performanceGroup;
    }

}
