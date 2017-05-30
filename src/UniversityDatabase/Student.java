package UniversityDatabase;

import java.util.ArrayList;

/**
 * Created by brandon on 4/8/17.
 * This class implements the Student object that will be used in the University database
 */

//TODO: Add method to get the gpa
//TODO: Have each letter grade = a gpa i.e. A = 4.0 etc

class Student {

    //Members to store various data relating to students
    private String uniqueId;
    private String firstName;
    private String lastName;
    private int birthyear;
    private String country;

    //ArrayList to store the completions
    private ArrayList<CompletionEvent> studentCompletions = null;

    //Student object constructor
    Student(String uniqueId, String firstName, String lastName, int birthyear, String country) {
        this.uniqueId = uniqueId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthyear = birthyear;
        this.country = country;
    }

    //Adds a completion event to a student object's list
    void addCompletionEvent(CompletionEvent completion) throws StudentException {

        //When the completion is added it will decide where to put it based upon the date
        if ( completion.getStudentId().equals( this.getUniqueId() ) ) {

            //Add "completion" to the internal list of completion events.
            this.studentCompletions.add(studentCompletions.size(), completion);

        //If the check returns not valid throw an exception
        } else {
            throw new StudentException("StudentException");
        }
    }

    //Setter methods for vars

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //Getter methods for vars

    String getUniqueId() {
        return uniqueId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public String getCountry() {
        return country;
    }

    public int getGPA() {
        int GPA = -1;

        return GPA; //TODO: make this a calculation based upon studentCompletions
        //TODO: Take the average gpa of all the courses a student has completed and divide by the number of courses
    }

    ArrayList<CompletionEvent> getStudentCompletions() {
        return this.studentCompletions;
    }
}
