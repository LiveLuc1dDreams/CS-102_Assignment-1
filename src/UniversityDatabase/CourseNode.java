package UniversityDatabase;

/**
 * Created by brandon on 5/16/17.
 */
class CourseNode {
    private Course item;
    private CourseNode next;
    private CourseNode head;
    private CourseNode prev;


    //Default constructor
    public CourseNode() {
        item = null;
        next = null;
    }

    public CourseNode( Course course ) {
        item = course;
        next = null;
    }

    public CourseNode getHead() {
        return head;
    }

    CourseNode getNext() {
        return next;
    }

    void setNext(CourseNode next) {
        this.next = next;
    }
}
