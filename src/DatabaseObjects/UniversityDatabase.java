package DatabaseObjects;

import Project.CompletionEvent;
import Project.Course;
import Project.Student;

/**
 * Created by brandon on 4/8/17.
 * This class implements methods to search for student and course objects from their respective arrays, which are also created in this class
 *
 * ACTUALLY DEFINES THE UNIVERSITY DATABASE OBJECT TYPES
 */
public class UniversityDatabase {

    private Student StudentDatabase[];
    private Course CourseDatabase[];
    private CompletionEvent CompletionEventDatabase[];
    public static final int maxCourseArraySize = 100;
    public static final int maxStudentArraySize = 100;

     //Getter methods for max array sizes

    public int getMaxCourseArraySize() {
        return maxCourseArraySize;
    }

    public int getMaxStudentArraySize() {
        return maxStudentArraySize;
    }

    //recursive method to search for a Student object
    public static int searchStudents(Student StudentDatabase[], int first, int last, Student value) {
        int index;
        //Check if the range is still valid
        if ( first > last) {
            index = -1;
        }

        else {

            //if the value is in the array, then it is in between array first and array last
            int mid = ( first + last ) / 2;

            //Check if the value is at mid or decide which half of StudentDatabase the value is in
            if ( StudentDatabase[mid].getUniqueId() == value.getUniqueId() ) {
                index = mid;
            }

            //
            else if ( Integer.getInteger( value.getUniqueId() ) < Integer.getInteger( StudentDatabase[mid].getUniqueId() ) ) {
                index = searchStudents(StudentDatabase, first, mid, value);
            }


            else {
                index = searchStudents(StudentDatabase, mid+1, last, value);
            }
        }

        //return the index of where the Student Object was stored, or return that it was not found
        return index;
    }

    //recursive method to search for a Course object
    public static int searchCourses(Course CourseDatabase[], int first, int last, Course value) {
        int index;
        //Check if the range is still valid
        if ( first > last) {
            index = -1;
        }

        else {

            //if the value is in the array, then it is in between array first and array last
            int mid = ( first + last ) / 2;

            //Check if the value is at mid or decide which half of CourseDatabase the value is in
            if ( CourseDatabase[mid].getUniqueId() == value.getUniqueId() ) {
                index = mid;
            }

            //
            else if ( Integer.getInteger( value.getUniqueId() ) < Integer.getInteger( CourseDatabase[mid].getUniqueId() ) ) {
                index = searchCourses(CourseDatabase, first, mid, value);
            }


            else {
                index = searchCourses(CourseDatabase, mid+1, last, value);
            }
        }

        //return the index of where the Course Object was stored, or return that it was not found
        return index;
    }
}
