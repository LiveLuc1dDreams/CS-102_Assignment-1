package UniversityDatabase;

/**
 * Created by brandon on 5/15/17.
 */

interface CompletionEventLinkedListInterface {
    boolean isEmpty(); // Determine whether a list is empty.

    //Insertion preserving the sorting (by date, oldest first)
    void add(CompletionEvent completionEvent);

    int size(); // Determines the length of a list.

    void removeAll(int index) throws CompletionEventListException;

    // Adds an item to the list at position index.
    void add(int index, Object item) throws CompletionEventListException;

    // Retrieves a list item by position.
    Object get( int index ) throws CompletionEventListException;

    // Deletes an item from the list at a given position.
    void remove( int index ) throws CompletionEventListException;
}
