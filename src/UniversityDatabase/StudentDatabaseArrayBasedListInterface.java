package UniversityDatabase;

/**
 * Created by brandon on 5/21/17.
 */

interface StudentDatabaseArrayBasedListInterface {
    //Determines if the list is empty
    boolean isEmpty();

    //Determines the size of the list
    int size();

    //Delete all items from the list
    void removeAll();

    //Adds an item to the list at position index
    void add(int i, Student student) throws CompletionArrayBasedListException, CompletionArrayBasedListException;

    //Retrieves a list item by position.
    UniversityDatabase.Course get(int i ) throws UniversityDatabase.CompletionArrayBasedListException;

    //Deletes an item from the list at a given position.
    void remove( int i ) throws CompletionArrayBasedListException;

    //Changes the size of the array to a larger capacity.
    void resize() throws CompletionArrayBasedListException;

}
