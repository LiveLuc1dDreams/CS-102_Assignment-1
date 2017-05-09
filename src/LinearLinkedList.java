import ProjectObjects.CompletionEvent;

/**
 * Created by brandon on 5/9/17.
 */

//Sorted (by date, older first) reference base linked list of completion events.
class LinearLinkedList {


    private Node head; //TODO: need node class

    //Default Constructor
    public LinearLinkedList() {
        head = null;
    }

    //Insertion preserving the sorting (by date, oldest first)
    public void add(CompletionEvent completionEvent) {

        //Special case, list empty, standard insertion at first.

        //Find "curr" and "prev" to perform insertion. These are temp variables.
        completionEvent curr = head;
        completionEvent prev = null;
        //Update prev and curr according to the sorting
        while ()


        Node newNode = new Node( completionEvent );
        newNode.setNext( curr );
        prev.setNext( newNode );

    }
}
