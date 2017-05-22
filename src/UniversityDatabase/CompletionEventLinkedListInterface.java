package UniversityDatabase;

/**
 * Created by brandon on 5/15/17.
 */

interface CompletionEventLinkedListInterface {

    // Determine whether a list is empty.
    boolean isEmpty();

    //Insertion preserving the sorting (by date, oldest first)
    void add(CompletionEvent completionEvent);

    // Determines the length of a list.
    int size();

    //Removes all of the Nodes from the list
    void removeAll(int index) throws CompletionEventListException;

    //Adds an item to the list at position index.
    void add(int index, CompletionEvent item) throws CompletionEventListException;

    // Retrieves a list item by position.
    CompletionEvent get( int index ) throws CompletionEventListException;

    // Deletes an item from the list at a given position.
    void remove( int index ) throws CompletionEventListException;
}
