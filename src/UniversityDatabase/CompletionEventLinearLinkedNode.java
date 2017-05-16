package UniversityDatabase;

/**
 * Created by brandon on 5/9/17.
 */
class CompletionEventLinearLinkedNode {

    private CompletionEvent item;
    private CompletionEvent next;

    //Default constructor
    public CompletionEventLinearLinkedNode() {
        item = null;
        next = null;
    }

    CompletionEventLinearLinkedNode(CompletionEvent completionEvent ) {
        item = completionEvent;
        next = null;
    }

    Object getNext() {
        return next;
    }

    void setNext(CompletionEvent next) {
        this.next = next;
    }

    boolean isOlder( CompletionEvent completionEvent ){
        return false; //Forward this call to the CompletionEvent class.
    }

    public CompletionEvent getItem() {
        return item;
    }
}

