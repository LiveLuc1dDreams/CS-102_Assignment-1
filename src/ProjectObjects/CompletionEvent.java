package ProjectObjects;

/**
 * Created by brandon on 4/8/17.
 * This class implements the CompletionEvent object that will be used in the University database
 */
public class CompletionEvent{

    private String finalGrade;
    private int dateYears;
    private int dateDays;
    private int dateMonths;
    private String courseId;
    private String studentId;

    //CompletionEvent object constructor

    public CompletionEvent(String finalGrade, int dateDays, int dateMonths, int dateYears, String courseId, String studentId) {
        this.finalGrade = finalGrade;
        this.dateDays = dateDays;
        this.dateMonths = dateMonths;
        this.dateYears = dateYears;
        this.courseId = courseId;
        this.studentId = studentId;
    }

    //Getter methods


    public int getDateYears() {
        return dateYears;
    }

    public int getDateDays() {
        return dateDays;
    }

    public int getDateMonths() {
        return dateMonths;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    //Setter methods


    public void setDateYears(int dateYears) {
        this.dateYears = dateYears;
    }

    public void setDateDays(int dateDays) {
        this.dateDays = dateDays;
    }

    public void setDateMonths(int dateMonths) {
        this.dateMonths = dateMonths;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    public void setCourseId(String courseId) {
        this.courseId =  courseId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
