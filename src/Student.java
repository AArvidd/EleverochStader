public class Student {

    //Attributes
    private Student buddy;
    private City homeTown;
    private String name;
    private int studentId;

    //Constructor
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    //Methods
    public String reportBuddyName() {
        return buddy.getName();
    }

    //Getters
    public Student getBuddy() {
        return buddy;
    }

    public City getHomeTown() {
        return homeTown;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    //Setter
    public void setBuddy(Student buddy) {
        this.buddy = buddy;
    }

    public void setHomeTown(City homeTown) {
        this.homeTown = homeTown;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
