package UniversityDatabase;

/**
 * Created by brandon on 4/8/17.
 * This class implements methods to search for student and course objects from their respective arrays, which are also created in this class
 **
 */
public class UniversityDatabase implements UniversityDatabaseInterface{

    //Initialize the sub-databases
    private StudentDatabase studentDatabase = null;
    private CourseDatabase courseDatabase = null;

    //Default constructor.
    public UniversityDatabase() {
        studentDatabase = new StudentDatabase();
        courseDatabase = new CourseDatabase();
    }

    //recursive method to search for a Student object.
    private static int searchStudents(Student StudentDatabase[], int first, int last, Student value) {
        int index;
        //Check if the range is still valid
        if ( first > last) {
            index = -1;
        }

        else {

            //if the value is in the array, then it is in between array first and array last
            int mid = ( first + last ) / 2;

            //Check if the value is at mid or decide which half of StudentDatabase the value is in
            if ( StudentDatabase[mid].getUniqueId() == value.getUniqueId() ) {
                index = mid;
            }

            //First half check
            else if ( Integer.getInteger( value.getUniqueId() ) < Integer.getInteger( StudentDatabase[mid].getUniqueId() ) ) {
                index = searchStudents(StudentDatabase, first, mid, value);
            }

            //Seconds Half Check
            else {
                index = searchStudents(StudentDatabase, mid+1, last, value);
            }
        }

        //return the index of where the Student Object was stored, or return that it was not found
        return index;
    }

    //recursive method to search for a Course object.
    private static int searchCourses(Course CourseDatabase[], int first, int last, Course value) {
        int index;
        //Check if the range is still valid
        if ( first > last) {
            index = -1;
        }

        else {

            //if the value is in the array, then it is in between array first and array last
            int mid = ( first + last ) / 2;

            //Check if the value is at mid or decide which half of CourseDatabase the value is in
            if ( CourseDatabase[mid].getUniqueId() == value.getUniqueId() ) {
                index = mid;
            }

            //First half check
            else if ( Integer.getInteger( value.getUniqueId() ) < Integer.getInteger( CourseDatabase[mid].getUniqueId() ) ) {
                index = searchCourses(CourseDatabase, first, mid, value);
            }

            //Second half check
            else {
                index = searchCourses(CourseDatabase, mid+1, last, value);
            }
        }

        //return the index of where the Course Object was stored, or return that it was not found
        return index;
    }

    //Load a University Database from a file.
    public void loadFromFile(String fileName) throws UniversityDatabaseException {

    }

    //Print out all of the students currently in the University Database.
    public void printAllStudents() throws UniversityDatabaseException {
        this.studentDatabase.printAllStudents();
    }

    //Print all of the courses currently in the University Database.
    public void printAllCourses() throws UniversityDatabaseException {
        this.courseDatabase.printAllCourses();
    }

    //Print all of the courses that a student has completed.
    public void printAllCoursesOfAStudent(String studentId) throws UniversityDatabaseException {
        this.studentDatabase.getStudent( studentId ).getStudentCompletions().toString();
    }

    //Print all the students that completed a certain course.
    public void printAllStudentsOfACourse(String courseId) throws UniversityDatabaseException {
        //Find the course specified in the database and
        this.courseDatabase.getCourse( courseId ).getCourseCompletions().toString();
    }

    //Forwards the adding of a student to the StudentDatabase class
    public void addStudent(String id, String firstName, String lastName, int yearBirth, String country) throws UniversityDatabaseException {

        //Forward this call to the student database
        this.studentDatabase.addStudent(id, firstName, lastName, yearBirth, country);
    }

    //Forward the adding of a course object to the course database.
    public void addCourse(String id, String name, int credits) {
        this.courseDatabase.addCourse( id, name, credits );
    }

    //Add a completion event to a student and course.
    public void addCompletionEvent(String studentId, String courseId, float grade, int dateYears, int dateMonths, int dateDays) {

    }

    //Converts a grade in letter-format int a grade in number-format
    //Note: client-code doesn't need a database instance to call this
    //Note: call this function using UniversityDatabase.gradeToFloat( "B+" );
    public static float gradeToFloat( String grade ) {
        // ...
        return 0.0F;
    }

    //Resets the database, making it empty.
    public void reset() {
        this.studentDatabase.removeAll();
        this.courseDatabase.removeAll();
    }
}
