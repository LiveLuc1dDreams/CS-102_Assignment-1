package UniversityDatabase;

/**
 * Created by brandon on 4/8/17.
 * This class implements the Student object that will be used in the University database
 */

//TODO: Add method to get the gpa
//TODO: Have each letter grade = a gpa i.e. A = 4.0 etc

public class Student {
    
    private String uniqueId;
    private String firstName;
    private String lastName;
    private String birthyear;
    private String country;

    private StudentDatabaseArrayBasedList studentCompletions = null;

    //Student object constructor

    Student(String uniqueId, String firstName, String lastName, String birthyear, String country) {
        this.uniqueId = uniqueId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthyear = birthyear;
        this.country = country;

        this.studentCompletions = new StudentDatabaseArrayBasedList();
    }

    //Adds a completion event to a student object's list
    void addCompletionEvent(CompletionEvent completion) throws StudentException {

        //When the completion is added it will decide where to put it based upon the date
        if ( completion.getStudentId().equals( this.getUniqueId() ) ) {

            //Add "completion" tto the internal list of completion events.
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

    public void setBirthyear(String birthyear) {
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

    public String getBirthyear() {
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
}
