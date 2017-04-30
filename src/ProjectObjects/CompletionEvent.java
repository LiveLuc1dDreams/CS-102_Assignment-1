package ProjectObjects;

/**
 * Created by brandon on 4/8/17.
 * This class implements the CompletionEvent object that will be used in the University database
 */
public class CompletionEvent{

    private String finalGrade;
    private int date;
    private String courseId;
    private String studentId;

    //CompletionEvent object constructor

    public CompletionEvent(String studentId, String courseId, String finalGrade, int date ) {
        this.finalGrade = finalGrade;
        this.date = date;
        this.courseId = courseId;
        this.studentId = studentId;
    }

    //Getter methods


    public String getFinalGrade() {
        return finalGrade;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getDate() {
        return date;
    }

    //Setter methods

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    public void setCourseId(String courseId) {
        this.courseId =  courseId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
