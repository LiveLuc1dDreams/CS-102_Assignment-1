package UniversityDatabase;

/**
 * Created by brandon on 4/8/17.
 * This class implements methods to search for student and course objects from their respective arrays, which are also created in this class
 **
 */
public class UniversityDatabase implements UniversityDatabaseInterface{

    private StudentDatabase students = null;
    private CourseDatabase courses = null;

    //Default constructor
    public UniversityDatabase() {
        students = new StudentDatabase();
        courses = new CourseDatabase();
    }

    public void addCourse(Course course) {
        courses.addCourse(course);
    }

    //recursive method to search for a Student object
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

    //recursive method to search for a Course object
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

    @Override
    public void loadFromFile(String fileName) throws UniversityDatabaseException {

    }

    @Override
    public void printAllStudents() throws UniversityDatabaseException {
        this.students.printAllStudents();
    }

    @Override
    public void printAllCourses() throws UniversityDatabaseException {
        this.courses.printAllCourses();
    }

    @Override
    public void printAllCoursesOfAStudent(String studentId) throws UniversityDatabaseException {
        this.students.getStudent( studentId ).getStudentCompletions().toString();
    }

    @Override
    public void printAllStudentsOfACourse(String courseId) throws UniversityDatabaseException {
        this.courses.getCourse( courseId ).getCourseCompletions().toString();
    }

    @Override
    public void addStudent(String id, String firstName, String lastName, int yearBirth, String country) throws UniversityDatabaseException {

        //Forward this call to the student database
        this.students.addStudent(id, firstName, lastName, yearBirth, country);
    }

    @Override
    public void addCourse(String id, String name, int credits) {
        this.courses.addCourse( id, name, credits );
    }

    @Override
    public void addCompletionEvent(String studentId, String courseId, float grade, int dateYears, int dateMonths, int dateDays) {

    }

    //Converts a grade in letter-format int a grade in number-format
    //Note: client-code doesn't need a database instance to call this
    //Note: call this function using UniversityDatabase.gradeToFloat( "B+" );
    public static float gradeToFloat( String grade ) {
        // ...
        return 0.0F;
    }

    //Resets the database, making it empty
    public void reset() {
        this.students.removeAll();
        this.courses.removeAll();
    }


    public void addStudent(String currLine) {

        //Forward the adding of student to the student database.
        this.students.addStudent( currLine.split("/")[1],
                currLine.split("/")[2],
                currLine.split("/")[3],
                Integer.parseInt( currLine.split("/")[4] ),
                currLine.split("/")[5]);
    }

    public void addCourse(String currLine) {
        Course course = new Course( currLine.split("/")[1],
                currLine.split("/")[2],
                currLine.split("/")[3] );

        this.courses.addCourse(course);
    }

    //Method to add a completion event to a student in the University Database
    public void addCompletionEvent(String currLine) {

        //Create a date object to be used in the constructor for the Completion Event Object
        Date newDate = new Date( currLine.split( "/" )[4] );

        //Forward the adding of the CompletionEvent object to the StudentDatabase.
        this.students.addCompletionEvent( currLine.split( "/" )[1],
                currLine.split( "/" )[2],
                Float.parseFloat( currLine.split( "/" )[3] ),
                newDate.getDays(), newDate.getMonths(), newDate.getYears() );
    }
}
