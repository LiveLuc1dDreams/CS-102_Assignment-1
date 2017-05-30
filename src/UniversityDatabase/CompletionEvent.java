package UniversityDatabase;

/**
 * Created by brandon on 4/8/17.
 * This class implements the CompletionEvent object that will be used in the University database
 */

public class CompletionEvent{

    private Float finalGrade;
    private Date date;
    private String courseId;
    private String studentId;

    //CompletionEvent object constructor

    public CompletionEvent(String studentId, String courseId, Float finalGrade, Date date ) {
        this.finalGrade = finalGrade;
        this.date = date;
        this.courseId = courseId;
        this.studentId = studentId;
    }

    public CompletionEvent(String studentId, String courseId, float grade, int dateYears, int dateMonths, int dateDays) {

    }

    //Method used in the comparison of completion events by date.
    boolean isOlder(CompletionEvent completionEvent) {
        return this.date.isOlder( completionEvent ); //Forward call to Date Class
    }

    //toString method to print out the completion event in a readable format.
    public String toString() {
        return finalGrade +
                "\n" + Integer.toString( date.getDays() ) + " " +
                Integer.toString( date.getMonths() ) + " " +
                Integer.toString( date.getYears() ) +
                "\n" + courseId +
                "\n" + studentId;
    }

    //Getter methods
    public Float getFinalGrade() {
        return finalGrade;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    public Date getDate() {
        return date;
    }

    //Setter methods
    private void setFinalGrade(Float finalGrade) {
        this.finalGrade = finalGrade;
    }

    void setCourseId(String courseId) {
        this.courseId =  courseId;
    }

    private void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    private void setDate(Date date) {
        this.date = date;
    }
}
