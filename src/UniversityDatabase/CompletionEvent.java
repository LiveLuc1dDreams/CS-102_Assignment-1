package UniversityDatabase;

/**
 * Created by brandon on 4/8/17.
 * This class implements the CompletionEvent object that will be used in the University database
 */

public class CompletionEvent{

    private String finalGrade;
    private Date date;
    private String courseId;
    private String studentId;

    //CompletionEvent object constructor

    public CompletionEvent(String studentId, String courseId, String finalGrade, Date date ) {
        this.finalGrade = finalGrade;
        this.date = date;
        this.courseId = courseId;
        this.studentId = studentId;
    }

    private boolean isOlder( CompletionEvent completionEvent ) {
        return this.date.isOlder( completionEvent ); //Forward call to Date Class
    }


    //toString method to print out the completion event
    public String toString() {
        return finalGrade +
                "\n" + Integer.toString( date.getDays() ) + " " +
                Integer.toString( date.getMonths() ) + " " +
                Integer.toString( date.getYears() ) +
                "\n" + courseId +
                "\n" + studentId;
    }

    //Getter methods

    public String getFinalGrade() {
        return finalGrade;
    }

    public String getCourseId() {
        return courseId;
    }

    String getStudentId() {
        return studentId;
    }

    public Date getDate() {
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

    public void setDate(Date date) {
        this.date = date;
    }
}
