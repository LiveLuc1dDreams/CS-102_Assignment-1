package ProjectExecute;

/**
 * Created by brandon on 4/25/17.
 */

//Interface providing the specifications for the UniversityDatabase class
public interface UniversityDatabaseInterface {

    //Load database from the file, adding new data to the current database.
    //fileName: filename of the input database file
    //UniversityDatabaseException: if file not found or file too big
    public void loadFromFile( String fileName ) throws UniversityDatabaseException;

    //Prints all the students in the database on the console
    //Note: prints sorted by student ID
    public void printAllStudents() throws UniversityDatabaseException;

    //Prints all the courses in the database on the console
    //Note: prints sorted by course id
    public void printAllCourses();

    //Prints all the courses (completion events) of a student on the console
    //Note: prints sorted by date
    //studentId: id (unique) of a target student
    //UniversityDatabaseException: if student not in database OR student has no completion events
}
