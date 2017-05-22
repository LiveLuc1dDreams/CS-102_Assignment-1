package UniversityDatabase;

/**
 * Created by brandon on 5/16/17.
 */
public class CourseDatabaseDoubleLinkedCircularList implements CourseDatabaseDoubleLinkedCircularListInterface {

    int numNodes = 0;
    private CourseNode head;

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return numNodes;
    }

    public void removeAll() {

    }

    public void add(int i, Course course) throws CompletionArrayBasedListException {

        CourseNode newNode = new CourseNode( course );
        //Special case: list 1 is empty. Standard insertion at first.
        if ( this.getHead() == null ) {
            head = newNode;
            newNode.setNext();
            newNode.setPrev();
            numNodes++;
        //Standard case: List is not empty.
        } else {
            if ( o.getCourseId().compareTo("n") > 0  ) {
                //Find curr and prev to perform the insertion.
                CourseNode curr = head;
                CourseNode prev = head.getPrev();
                int currIndex = 1;
                //Update curr and prev accordingly to the sorting.
                while ( ( currIndex <= numNodes ) && curr.isLessThan( course ) ) {
                    //Update curr and prev.
                    prev = curr;
                    curr = curr.getNext();
                    currIndex++;
                }

                //Special case 2: insertion at first.
                if (currIndex == 1) {
                    head = newNode;
                }
            }
        }
    }


    public Object get(int i) throws CompletionArrayBasedListException {
        return null;
    }


    public void remove(int i) throws CompletionArrayBasedListException {

    }

    public Object getHead() {
        return this.head;
    }
}
