package UniversityDatabase;

/**
 * Created by brandon on 4/8/17.
 * This class implements the Course object that will be used in the University database
 */
public class Course {

    private String course;
    private String credits;
    private String uniqueId;
    private String name;

    //Course object constructor

    Course(String uniqueId, String name, String credits) {
        this.credits = credits;
        this.uniqueId = uniqueId;
        this.name = name;
    }

    //Getter methods
    public String getCourse() {
        return course;
    }

    public String getCredits() {
        return credits;
    }

    String getUniqueId() {
        return uniqueId;
    }

    public String getName() {
        return name;
    }

    //Setter methods

    public void setCourse(String course) {
        this.course = course;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
