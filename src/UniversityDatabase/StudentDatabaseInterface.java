package UniversityDatabase;

// Interface providing the specifications for the StudentDatabase class.
interface StudentDatabaseInterface {

   // Adds a student to the database.
   // Note: Student class is package-private.
   // StudentDatabaseException: if student id is already in database etc.
   void addStudent( String id,
                           String firstName, 
                           String lastName, 
                           int yearBirth, 
                           String country ) throws StudentDatabaseException;
   
   // Gets a student from the database.
   // Note: Student class is package-private.
   // StudentDatabaseException: if student id is not in database.
   Student getStudent( String id ) throws StudentDatabaseException;
                           
   // Adds a completion event to the database.
   // Note: CompletionEvent class is package-private.
   // ...
   // grade: grade converted accordingly to ...
   // StudentDatabaseException: if ...
   void addCompletionEvent(  String studentId,
                                    String courseId, 
                                    float grade, 
                                    int dateYears, 
                                    int dateMonths, 
                                    int dateDays ) throws StudentDatabaseException;
                           
   // Prints all the students in the database on the console.
   // Note: prints sorted by student id.
   // StudentDatabaseException: if database empty.
   void printAllStudents() throws StudentDatabaseException;
   
   // Prints all the courses (completion events) of a student on the console.
   // Note: prints sorted by date.
   // studentId: id (unique) of target student.
   // StudentDatabaseException: if student not in database OR student has no completion events.
   void printAllCoursesOfAStudent( String studentId ) throws StudentDatabaseException;

   // Returns the completion event related to the input student id and the input course id.
   // Note: returns null if student is in database but has no completion event for that course id.
   // studentId: id (unique) of target student.
   // courseId: id (unique) of target course.
   // StudentDatabaseException: if student not in database.
   CompletionEvent hasStudentCompletedCourse( String studentId, String courseId ) throws StudentDatabaseException;
   
}


