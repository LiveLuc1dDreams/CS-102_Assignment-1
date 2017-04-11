package Project;

/**
 * Created by brandon on 4/8/17.
 * This class implements the CompletionEvent object that will be used in the University database
 */
public class CompletionEvent{

    private String finalGrade;
    private int finalGradeAssignmentDate;
    private String courseId;
    private String studentId;

    //CompletionEvent object constructor

    public CompletionEvent(String finalGrade, int finalGradeAssignmentDate, String courseId, String studentId) {
        this.finalGrade = finalGrade;
        this.finalGradeAssignmentDate = finalGradeAssignmentDate;
        this.courseId = courseId;
        this.studentId = studentId;
    }

    //Getter methods

    public String getFinalGrade() {
        return finalGrade;
    }

    public int getFinalGradeAssignmentDate() {
        return finalGradeAssignmentDate;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    //Setter methods

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    public void setFinalGradeAssignmentDate(int finalGradeAssignmentDate) {
        this.finalGradeAssignmentDate = finalGradeAssignmentDate;
    }

    public void setCourseId(String courseId) {
        this.courseId =  courseId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
