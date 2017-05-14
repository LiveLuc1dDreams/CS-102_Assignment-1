package UniversityDatabase;

/**
 * Created by brandon on 4/14/17.
 */
public interface ListInterface {

    //Determines if the list is empty
    boolean isEmpty();

    //Determines the size of the list
    int size();

    //Delete all items from the list
    void removeAll();

    //Adds an item to the list at position index
    void add(int i, Object o) throws ListIndexOutOfBoundsException, ListException;

    //Retrieves a list item by position
    Object get( int i ) throws  ListIndexOutOfBoundsException;

    //Deletes an item from the list at a given position
    void remove( int i ) throws ListIndexOutOfBoundsException;

}
