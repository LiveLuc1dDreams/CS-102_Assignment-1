import ProjectObjects.CompletionEvent;

/**
 * Created by brandon on 5/9/17.
 */

//Sorted (by date, older first) reference base linked list of completion events.
class LinearLinkedList {


    private LinearLinkedNode head; //TODO: need node class

    //Default Constructor
    public LinearLinkedList() {
        head = null;
    }

    //Insertion preserving the sorting (by date, oldest first)
    public void add(CompletionEvent completionEvent) {

        LinearLinkedNode newNode = new LinearLinkedNode( completionEvent );

        //Special case 1, list empty, standard insertion at first.
        if ( head == null ) {
            newNode.setNext(null);
            head = newNode;
        } else {

            //Find "curr" and "prev" to perform insertion. These are temp variables.
            LinearLinkedNode curr = head;
            LinearLinkedNode prev = null;

            //Update prev and curr according to the sorting
            //We only add a node to the list where there are no younger CompletionEvents than itself
            while ( ( curr != null) && curr.isOlder( completionEvent ) ) {
                prev = curr;
                curr = (LinearLinkedNode) curr.getNext();
            }

            //Special case 2. Insertion at first with pre-existing node
            if ( curr == head ) {
                newNode.setNext( null );
                prev.setNext( newNode );

            //Standard case. Insertion in middle or last
            } else {
                newNode.setNext(curr);
                prev.setNext(newNode);
            }
        }
    }
}
