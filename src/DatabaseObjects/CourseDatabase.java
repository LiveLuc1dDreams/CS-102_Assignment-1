package DatabaseObjects;

import ProjectObjects.Course;

/**
 * Created by brandon on 4/11/17.
 */
public class CourseDatabase {
    public static final int maxCourseArraySize = 100;
    private static Course[] CourseDatabase;

    public static int getMaxCourseArraySize() {
        return maxCourseArraySize;
    }
}
