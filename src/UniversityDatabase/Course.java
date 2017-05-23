package UniversityDatabase;

import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;
import org.omg.CORBA.COMM_FAILURE;

import java.util.Vector;

/**
 * Created by brandon on 4/8/17.
 * This class implements the Course object that will be used in the University database
 */
class Course {

    private String course;
    private String credits;
    private String uniqueId;
    private String name;

    //Vector list to store completion events
    private Vector<CompletionEvent> courseCompletions;

    //Course object constructor

    Course(String uniqueId, String name, String credits) {
        this.credits = credits;
        this.uniqueId = uniqueId;
        this.name = name;
    }

    //Allows the addition of a completion event to the list
    void addCompletion(CompletionEvent completionEvent) {

        //TODO: need to have this add be sorted by date
        this.courseCompletions.add(completionEvent);
    }

    //Getter methods
    String getCourse() {
        return course;
    }

    String getCredits() {
        return credits;
    }

    String getUniqueId() {
        return uniqueId;
    }

    String getName() {
        return name;
    }

    //Setter methods

    void setCourse(String course) {
        this.course = course;
    }

    void setCredits(String credits) {
        this.credits = credits;
    }

    void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    void setName(String name) {
        this.name = name;
    }
}

