package Project;

/**
 * Created by brandon on 4/8/17.
 * This class implements the Student object that will be used in the University database
 */

public class Student {

    private int GPA;
    private String uniqueId;
    private String firstName;
    private String lastName;
    private String birthyear;

    //Student object constructor

    public Student(int GPA, String uniqueId, String firstName, String lastName, String birthyear, String country) {
        this.GPA = GPA;
        this.uniqueId = uniqueId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthyear = birthyear;
        this.country = country;
    }


    //Setter methods for vars

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthyear(String birthyear) {
        this.birthyear = birthyear;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //Getter methods for vars

    public String getUniqueId() {
        return uniqueId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public String getCountry() {
        return country;
    }

    private String country;


    public int getGPA() {
        return GPA;
    }
}
