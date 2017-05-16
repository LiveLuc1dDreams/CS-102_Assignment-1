package UniversityDatabase;

/**
 * Created by brandon on 5/9/17.
 */
class CompletionEventLinearLinkedNode {

    private Object item;
    private Object next;

    //Default constructor
    public CompletionEventLinearLinkedNode() {
        item = null;
        next = null;
    }

    CompletionEventLinearLinkedNode(CompletionEvent object ) {
        item = object;
        next = null;
    }

    public boolean isOlder( Object object ) {
        //Compare the dates of this "this.item"

        return true;
    }

    Object getNext() {
        return next;
    }

    void setNext(Object next) {
        this.next = next;
    }

    boolean isOlder( CompletionEvent completionEvent ){
        return false; //Forward this call to the CompletionEvent class.
    }
}

