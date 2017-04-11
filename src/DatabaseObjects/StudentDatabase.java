package DatabaseObjects;

import ProjectObjects.Student;

/**
 * Created by brandon on 4/11/17.
 */

public class StudentDatabase {

    public static final int maxStudentArraySize = 100;

    private static Student[] StudentDatabase;

    public static int getMaxStudentArraySize() {
        return maxStudentArraySize;
    }
}
