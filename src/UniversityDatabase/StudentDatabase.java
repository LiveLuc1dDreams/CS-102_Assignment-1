package UniversityDatabase;

/**
 * Created by brandon on 4/11/17.
 * Can have one object of type StudentDatabaseArrayBasedList
 */

//TODO: Add method to resize the database
//TODO: add a check to see if the student database needs to be resized

class StudentDatabase {

    //Instantiate a variable of type StudentDatabaseArrayBasedList to be used to reference the Student Database
    private StudentDatabaseArrayBasedList students = null;

    //Default constructor for the student
    StudentDatabase() {
        students = new StudentDatabaseArrayBasedList();
    }

    boolean addStudent(Student student) {
        try {
            students.add(students.size(), student);
        } catch (CompletionArrayBasedListException e) {
            return false;
        }
        return true;
    }

    private Student searchStudentsById(String id) {

        //Search in the array based list from index 0 to index size - 1,
        // get all items and check if their ID matches the parameter id.
        for (int i = 0; i < students.size(); i++) {

            //Set temporary variable currStudent to the student that is at the current index that the loop is at.
            Student currStudent = null;
            try {
                currStudent = (Student) students.get(i);
            } catch (UniversityDatabase.CompletionArrayBasedListException completionArrayBasedListException) {
                completionArrayBasedListException.printStackTrace();
            }

            //Check if this student is the one that is has the same id as the one being searched for.
            if (currStudent.getUniqueId().equals(id)) {

                System.out.println("ID being searched for: " + id + "\nFOUND A STUDENT OBJECT WITH ID " + currStudent.getUniqueId());
                return currStudent;
            }

        }

        //A Student with an id matching the given id wasn't found so throw a new exception saying that it wasn't found.
        throw new StudentDatabaseException("StudentDatabaseException Student Not Found");
    }

    //
    void addCompletionEvent(CompletionEvent completion) {

        //Try/catch block to handle the event in which the student isn't found in the StudentDatabase.
        try {

            //Search through the students in the StudentDatabase, and if the student object is found, then call the method
            // to add the completion event to that student object.
            searchStudentsById(completion.getStudentId()).addCompletionEvent(completion);

        } catch (StudentDatabaseException e) {

            //Print an error message
            System.out.println("The student with completion " + completion.toString() + " wasn't found so the completion event won't be added");
        }
    }

    //Calls the method from the StudentDatabase class to remove all of the items from the database
    void removeAll() {
        this.students.removeAll();
    }
}
