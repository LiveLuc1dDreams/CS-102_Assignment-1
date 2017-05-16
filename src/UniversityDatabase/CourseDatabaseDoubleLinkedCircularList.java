package UniversityDatabase;

/**
 * Created by brandon on 5/16/17.
 */
public class CourseDatabaseDoubleLinkedCircularList implements CourseDatabaseDoubleLinkedCircularListInterface {

    public boolean isEmpty() {
        return false;
    }


    public int size() {
        return 0;
    }


    public void removeAll() {

    }


    @Override
    public void add(int i, Course c) throws CompletionArrayBasedListIndexOutOfBoundsException, CompletionArrayBasedListException {

        CourseNode newNode = new CourseNode( c );
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
                while ( ( currIndex <= numNodes ) && curr.isLessThan( c ) ) {
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


    public Object get(int i) throws CompletionArrayBasedListIndexOutOfBoundsException {
        return null;
    }


    public void remove(int i) throws CompletionArrayBasedListIndexOutOfBoundsException {

    }
}
