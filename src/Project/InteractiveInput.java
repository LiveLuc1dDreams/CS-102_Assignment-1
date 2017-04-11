package Project;

/**
 * Created by brandon on 4/8/17.
 * This class stores all of the code required to run the interactive input prompt from the terminal that is required to interact with the University Database
 */
public class InteractiveInput {

    private String instructions = "Welcome to the CS-102 Project University Database\n" +
            "";

    //Strings to store the course and student lists in the correct formatting that will be displayed in the interactive input
    private String courseList = "Course List:\n" +
            Sorting.sortCoursesById( UniversityDatabase.CourseDatabase[] )
    private String studentList = "";


    public String printStudentList( Student studentList ){
        String formattedStudentList;

        return formattedStudentList;
        }


    public String printCourseList( Course courseList ){
        String formattedCourseList;

        return formattedCourseList;
    }


    public String printStudenLog( Course courseList ){

        return null;
    }


    public String printCourseLog( Student studentList ){

        return null;
    }

    public String printInstructions() {
        return instructions;
    }


    public void exitProgram(){

    }
}
