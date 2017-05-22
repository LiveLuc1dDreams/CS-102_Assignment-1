package UniversityDatabase;

/**
 * Created by brandon on 4/11/17.
 */
class CourseDatabase {
    private StudentDatabaseArrayBasedList courses = null;

    CourseDatabase() {
        courses = new StudentDatabaseArrayBasedList();
    }

    boolean addCourse(Course course) {
        try {
            courses.add(courses.size(), course);
        } catch( CompletionArrayBasedListException e ) {
            return false;
        }
        return true;
    }

    public Course searchCourseById(String id) {

        //Search in the arraybasedlist from index 0 to size - 1, get all items and check if their ID matches the parameter id.
        //If the id is not found then throw an exception.
        try {
            for (int i = 0; i < courses.size(); i++) {
                Course currCourse =  courses.get(i);

                if ( currCourse.getUniqueId().equals(id) ) {
                    return currCourse;
                }
            }
        } catch (CompletionArrayBasedListException completionArrayBasedListException) {

        }
        return null;
    }

    void removeAll() {
        this.courses.removeAll();
    }




}
