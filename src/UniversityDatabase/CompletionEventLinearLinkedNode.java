package UniversityDatabase;

/**
 * Created by brandon on 5/9/17.
 */
class CompletionEventLinearLinkedNode {

    private CompletionEvent item;
    CompletionEventLinearLinkedNode next;

    //Default constructor
    public CompletionEventLinearLinkedNode(CompletionEvent item, CompletionEventLinearLinkedNode head) {
        this.item = null;
        next = null;
    }

    //Alternate Default Constructor
    CompletionEventLinearLinkedNode(CompletionEvent completionEvent ) {
        item = completionEvent;
        next = null;
    }

    CompletionEventLinearLinkedNode getNext() {
        return this.next;
    }

    void setNext(CompletionEventLinearLinkedNode next) {
        this.next = next;
    }

    boolean isOlder( CompletionEvent completionEvent ){
        return false; //Forward this call to the CompletionEvent class.
    }

    public CompletionEvent getItem() {
        return item;
    }
}

