package UniversityDatabase;

/**
 * Created by brandon on 4/8/17.
 * This class implements methods to search for student and course objects from their respective arrays, which are also created in this class
 **
 */
public class UniversityDatabase {

    private StudentDatabase students = null;
    private CourseDatabase courses = null;

    //Default constructor
    public UniversityDatabase() {
        students = new StudentDatabase();
        courses = new CourseDatabase();
    }

    public boolean addCourse(Course course) {
        return courses.addCourse(course);
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

        //
        Student student = new Student( currLine.split("/")[1],
                currLine.split("/")[2],
                currLine.split("/")[3],
                currLine.split("/")[4],
                currLine.split("/")[5] );

        this.students.addStudent(student);
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
        Date newDate = new Date( currLine.split("/")[4] );

        //Call the constructor for the Completion Event Object
        CompletionEvent completion = new CompletionEvent( currLine.split("/")[1],
                currLine.split("/")[2],
                currLine.split("/")[3],
                newDate);

        //Forward the adding of the CompletionEvent object to the StudentDatabase.
        this.students.addCompletionEvent(completion);
    }
}
