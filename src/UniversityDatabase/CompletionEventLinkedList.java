package UniversityDatabase;

/**
 * Created by brandon on 5/9/17.
 */

//Sorted (by date, older first) reference base linked list of completion events.
class CompletionEventLinkedList implements CompletionEventLinkedListInterface {

    //Object to store the head of the linked list
    private CompletionEventLinearLinkedNode head;

    //Integer to keep track of the number of nodes in the list
    private int numItems;

    //Variable to store the completion event items
    private CompletionEvent item;

    //Default Constructor
    public CompletionEventLinkedList() {
        head = null;
    }

    //Alternate Default Constructor
    public CompletionEventLinkedList(CompletionEvent completionEvent, CompletionEventLinearLinkedNode head) {
        this.head = head;
        this.item = completionEvent;
    }

    @Override
    //Returns true if the list is empty.
    public boolean isEmpty() {
        return ( numItems == 0 );
    }


    @Override
    //Insertion preserving the sorting (by date, oldest first).
    public void add(CompletionEvent completionEvent) {

        CompletionEventLinearLinkedNode newNode = new CompletionEventLinearLinkedNode( completionEvent );

        //Special case 1, list empty, standard insertion at first.
        if ( head == null ) {
            newNode.setNext(null);
            head = newNode;
            numItems++;
        } else {

            //Find "curr" and "prev" to perform insertion. These are temp variables.
            CompletionEventLinearLinkedNode curr = head;
            CompletionEventLinearLinkedNode prev = null;

            //Update prev and curr according to the sorting
            //We only add a node to the list where there are no younger CompletionEvents than itself
            while ( ( curr != null) && curr.isOlder( completionEvent ) ) {
                prev = curr;
                curr = (CompletionEventLinearLinkedNode) curr.getNext();
            }

            //Special case 2. Insertion at first with pre-existing node
            if ( curr == head ) {
                newNode.setNext( null );
                prev.setNext( newNode );
                numItems++;

                //Standard case. Insertion in middle or last
            } else {
                newNode.setNext(curr);
                prev.setNext(newNode);
                numItems++;
            }

        }
    }

    @Override
    //Returns the size of the list.
    public int size() {
        return numItems;
    }

    @Override
    //Removes all of the items in the list by de-referencing the first node of the list (head).
    public void removeAll(int index) throws CompletionEventListException {

        //Set the head to null and put all references in list up for garbage collection
        head = null;
        numItems = 0;
    }

    @Override
    public void remove(int index) throws CompletionEventListException {
        if( ( index >= 0 ) && ( index < numItems ) ) {
            if( index == 0 ) {
                // Delete the first node of the list.
                head = head.next;
            } else {
                CompletionEventLinearLinkedNode prev = searchCompletion( index - 1 );
                // Delete the node after the node referenced by prev.
                CompletionEventLinearLinkedNode curr = prev.next;
                prev.next = curr.next; }
            numItems--;
        } else {
            throw new CompletionEventListException( "List index out of bounds!" ); }
    }

    @Override

    public void add(int index, CompletionEvent item) throws CompletionEventListException {
        if( ( index >= 0 ) && ( index < ( numItems + 1 ) ) ) {
            if( index == 0 ) {
                // Insert node at the beginning of the list.
                CompletionEventLinearLinkedNode newNode = new CompletionEventLinearLinkedNode( item, head );
                head = newNode; }
            else {
                CompletionEventLinearLinkedNode prev = searchCompletion( index - 1 );
                // Insert node after the node referenced by prev.
                CompletionEventLinearLinkedNode newNode = new CompletionEventLinearLinkedNode( item, prev.next );
                prev.next = newNode; }
            numItems++; }
        else {
            throw new CompletionEventListException( "List index out of bounds on add!" ); }
    }

    @Override
    public CompletionEvent get(int index ) throws CompletionEventListException {

        if( ( index >= 0 ) && ( index < numItems ) ) {
            // Get the reference to the node, and then return the node data.
            CompletionEventLinearLinkedNode curr = searchCompletion( index );
            return curr.getItem();
        } else {
            throw new CompletionEventListException( "List index out of bounds on get!" ); }

    }

    // Locates a specified node in a linked list.
    // Precondition: index is the number of desired node ( 0 <= index < numItems ).
    // Postcondition: Returns a reference to the desired node
    private CompletionEventLinearLinkedNode searchCompletion(int index) {
        CompletionEventLinearLinkedNode curr = head;
        for( int skip = 0; skip < index; skip++ ) { curr = curr.next; }
        return curr;
    }
}
