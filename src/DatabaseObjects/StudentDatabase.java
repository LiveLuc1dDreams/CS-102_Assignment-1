package DatabaseObjects;

import ArrayBasedList.ListArrayBased;
import ArrayBasedList.ListException;
import ProjectObjects.Course;
import ProjectObjects.Student;

/**
 * Created by brandon on 4/11/17.
 * Can have one object of type ListArrayBased
 */

public class StudentDatabase {

    private ListArrayBased students = null;

    public StudentDatabase() {
        students = new ListArrayBased();
    }

    public boolean addStudent(Student student) {
        try {
            students.add( students.size(), student );
        } catch (ListException e) {
            return false;
        }
        return true;
    }

    public Student searchStudentsById(String id) {
        //Search in the arraybasedlist from index 0 to size - 1, get all items and check if their ID matches the paramater id.
        //If the id is not found then return exception.

        try {
            for (int i = 0; i < students.size(); i++) {
                Student currStudent = (Student) students.get(i);

                if ( currStudent.getUniqueId().equals(id) ) {
                    return currStudent;
                }
            }
        } catch (ListException e) {
            throw new ListException("ListException id not found");
        }
        return null;
    }

}
