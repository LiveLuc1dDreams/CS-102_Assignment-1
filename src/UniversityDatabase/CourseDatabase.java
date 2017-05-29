package UniversityDatabase;

import java.util.ArrayList;

/**
 * Created by brandon on 4/11/17.
 */
class CourseDatabase implements CourseDatabaseInterface{
    private ArrayList<Course> courses = null;

    CourseDatabase() {
        this.courses = new ArrayList<Course>();
    }

    void addCourse(Course course) {
        courses.add(courses.size(), course);
    }

    public Course searchCourseById(String id) {

        //Search in the arraybasedlist from index 0 to size - 1, get all items and check if their ID matches the parameter id.
        //If the id is not found then throw an exception.
        for (int i = 0; i < courses.size(); i++) {
            Course currCourse =  courses.get(i);

            if ( currCourse.getUniqueId().equals(id) ) {
                return currCourse;
            }
        }
        return null;
    }

    void removeAll() {
        this.courses.clear();
    }

    int getSize() {
        return this.courses.size();
    }

    @Override
    public void addCourse(String id, String name, int credits) throws CourseDatabaseException {

    }

    @Override
    public Course getCourse(String id) throws CourseDatabaseException {
        return null;
    }

    public void printAllCourses() {
    }
}
