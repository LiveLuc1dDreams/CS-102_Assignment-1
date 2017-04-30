package DatabaseObjects;

import ArrayBasedList.ListArrayBased;
import ArrayBasedList.ListException;
import ProjectObjects.Course;

/**
 * Created by brandon on 4/11/17.
 */
public class CourseDatabase {
    private ListArrayBased courses = null;

    public CourseDatabase() {
        courses = new ListArrayBased();
    }

    public boolean addCourse(Course course) {
        try {
            courses.add(courses.size(), course);
        } catch( ListException e ) {
            return false;
        }
        return true;
    }

    public Course searchCourseById(String id) {
        //Search in the arraybasedlist from index 0 to size - 1, get all items and check if their ID matches the paramater id.
        //If the id is not found then return exception.

        try {
            for (int i = 0; i < courses.size(); i++) {
                Course currCourse = (Course) courses.get(i);

                if ( currCourse.getUniqueId().equals(id) ) {
                    return currCourse;
                }
            }
        } catch (ListException e) {
            throw new ListException("ListException id not found");
        }
        return null;
    }

    //TODO:User input interaction needs an interface


}
