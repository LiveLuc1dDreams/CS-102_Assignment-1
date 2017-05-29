package UniversityDatabase;

import java.util.ArrayList;

/**
 * Created by brandon on 4/11/17.
 * Can have one object of type StudentDatabaseArrayBasedList
 */

//TODO: Add method to resize the database
//TODO: add a check to see if the student database needs to be resized

class StudentDatabase implements StudentDatabaseInterface{

    //Instantiate a variable of type StudentDatabaseArrayBasedList to be used to reference the Student Database.
    private ArrayList<Student> students = null;

    //Default constructor for the student.
    StudentDatabase() {
        students = new ArrayList<Student>();
    }

    //Search through the students in the database by comparing the ids.
    int searchStudentsById(String id) throws StudentDatabaseException {

        //Search in the array based list from index 0 to index size - 1,
        // get all items and check if their ID matches the parameter id.
        for (int i = 0; i < this.students.size(); i++) {

            System.out.println("ID being searched for: " + id);
            //Set temporary variable currStudent to the student that is at the current index that the loop is at.
            Student currStudent = this.students.get(i);


            //Check if this student is the one that is has the same id as the one being searched for.
            if (currStudent.getUniqueId().equals(id)) {
                //A student was found so return the location of the student found
                System.out.println("\nFOUND A STUDENT OBJECT WITH ID " + currStudent.getUniqueId());
                return i;
            }
        }

        //Student wasn't found so return -1 to signify this.
        return -1;
    }

    //Add a completion event to a student in the database.
    void addCompletionEvent(CompletionEvent completion) throws StudentDatabaseException{

        //Try/catch block to handle the event in which the student isn't found in the StudentDatabase.
        try {

            //Search through the students in the StudentDatabase, and if the student object is found, then call the method
            // to add the completion event to that student object.
            searchStudentsById(completion.getStudentId()).addCompletionEvent(completion);

        } catch (StudentDatabaseException e) {

            //Print an error message
            System.out.println("The student with completion " + completion.toString() + " wasn't found so the completion event won't be added");
        }
    }

    //Calls the method from the StudentDatabase class to remove all of the items from the database
    void removeAll() {
        this.students.clear();
    }

    //Return the current size of the student database array list.
    int getSize() {
        return this.students.size();
    }


    public void addStudent(String id, String firstName, String lastName, int yearBirth, String country) throws StudentDatabaseException {

        //TODO: Duplicate items need to be handled
        //Instantiate a new student object with parameters taken from the input string.
        Student student = new Student(id, firstName, lastName, yearBirth, country);

        //Check if the student object is already in the database, search by the id.
        if ( this.students.searchStudentById( student.getUniqueId() ) > -1 ) {

            //If the student was found in the database then replace that student with the one just created.
            Student oldStudent = this.students.getStudent( student.getUniqueId() );

        }

        //Add the newly created student object to the database
        this.students.addStudent(student);
    }


    public Student getStudent(String id) throws StudentDatabaseException {
        return this.students.get( searchStudentsById( id ) );
    }


    public void addCompletionEvent(String studentId, String courseId, float grade, int dateYears, int dateMonths, int dateDays) throws StudentDatabaseException {

    }


    public void printAllStudents() throws StudentDatabaseException {

        //Loop through the student database.
        for (int i = 0; i < getSize(); i++) {

            //Print out each object at the current index of the student database.
            System.out.println(students.get(i).toString());
        }
    }


    public void printAllCoursesOfAStudent(String studentId) throws StudentDatabaseException {

    }


    public CompletionEvent hasStudentCompletedCourse(String studentId, String courseId) throws StudentDatabaseException {
        return null;
    }
}
