package UniversityDatabase;

/**
 * Created by brandon on 5/16/17.
 */
public interface CourseDatabaseDoubleLinkedCircularListInterface {

    //Determines if the list is empty
    boolean isEmpty();

    //Determines the size of the list
    int size();

    //Delete all items from the list
    void removeAll();

    //Adds an item to the list at position index
    void add(int i, CompletionEvent c) throws CompletionArrayBasedListIndexOutOfBoundsException, CompletionArrayBasedListException;

    //Retrieves a list item by position.
    Object get( int i ) throws CompletionArrayBasedListIndexOutOfBoundsException;

    //Deletes an item from the list at a given position.
    void remove( int i ) throws CompletionArrayBasedListIndexOutOfBoundsException;
}
