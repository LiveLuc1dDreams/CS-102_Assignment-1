package UniversityDatabase;

// Interface providing the specifications for the CourseDatabase class.
interface CourseDatabaseInterface {

   // Adds a course to the database.
   // Note: Course class is package-private.
   // CourseDatabaseException: if course id is already in database etc.
   void addCourse( String id,
                          String name, 
                          int credits ) throws CourseDatabaseException;

   // Gets a course from the database.
   // Note: Course class is package-private.
   // CourseDatabaseException: if course id is not in database.
   Course getCourse( String id ) throws CourseDatabaseException;

   // Prints all the courses in the database on the console.
   // Note: prints sorted by course id.
   // CourseDatabaseException: if database empty.
   void printAllCourses() throws CourseDatabaseException;
   
}


