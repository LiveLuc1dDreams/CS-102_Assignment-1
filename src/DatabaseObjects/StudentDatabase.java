package DatabaseObjects;

import ProjectObjects.Student;

/**
 * Created by brandon on 4/11/17.
 * Can have one object of type ListArrayBased
 */

public class StudentDatabase {

    public static final int MAXSTUDENTARRAYSIZE = 100;

    public static int getMaxStudentArraySize() {
        return MAXSTUDENTARRAYSIZE;
    }

    public StudentDatabase() {
        Student database[] = new Student[MAXSTUDENTARRAYSIZE];
    }
}
