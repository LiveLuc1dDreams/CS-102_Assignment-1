import ProjectObjects.CompletionEvent;

/**
 * Created by brandon on 5/9/17.
 */
public class LinearLinkedNode {

    private Object item;
    private Object next;

    //Default constructor
    public LinearLinkedNode() {
        item = null;
        next = null;
    }

    public LinearLinkedNode( Object object ) {
        item = object;
        next = null;
    }

    public boolean isOlder( Object object ) {
        //Compare the dates of this "this.item"

        return true;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }

    public boolean isOlder( CompletionEvent completionEvent ){
        return item.isOlder( completionEvent ); //Forward this call to the CompletionEvent class.
    }
}

