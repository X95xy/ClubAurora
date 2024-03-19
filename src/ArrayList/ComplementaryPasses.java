package ArrayList;

public class ComplementaryPasses {

    private String passID;
    private String accessLevel;

    ComplementaryPasses(String passID, String accessLevel) {
        this.passID = passID;
        this.accessLevel = accessLevel;
    }

    ComplementaryPasses() {

    }

    public void setPassID(String passID) {
        this.passID = passID;
    }

    public String getPassID() {
        return this.passID;
    }

    public void setAccessLevel(String accessLevel) {

        this.accessLevel = accessLevel;
    }

    public String getAccessLevel() {

        return this.accessLevel;
    }

    public String toString() {

        return "ComplementaryPasses{PassID=" + passID + ",AccessLevel=" + accessLevel + "}";
    }
}
