package DatabaseObjects;

import ProjectObjects.Course;

/**
 * Created by brandon on 4/11/17.
 */
public class CourseDatabase {
    public static final int MAXCOURSEARRAYSIZE = 100;

    public static int getMaxcoursearraysize() {
        return MAXCOURSEARRAYSIZE;
    }

    public CourseDatabase() {
        Course database[] = new Course[MAXCOURSEARRAYSIZE];
    }
}
