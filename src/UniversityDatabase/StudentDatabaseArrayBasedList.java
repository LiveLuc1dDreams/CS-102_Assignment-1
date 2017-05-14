package UniversityDatabase;

import org.w3c.dom.stylesheets.LinkStyle;

/**
 * Created by brandon on 4/11/17.
 */

public class StudentDatabaseArrayBasedList implements ListInterface {

    //Max physical size of the list
    private static final int MAX_LIST = 50;

    //An array of list items
    private Object items[];

    //Number of items (logical size) of the list
    private int numItems;

    //Default constructor
    StudentDatabaseArrayBasedList() {

        items = new Object[ MAX_LIST ];
        numItems = 0;

    }

    //Tells whether the list is empty or not
    public boolean isEmpty() {

        return  ( numItems == 0 );

    }

    //Returns the size of the list
    public int size() {

        return numItems;

    }

    public void removeAll() {
        //Creates a new array, and marks old array for garbage collection
        items = new  Object[ MAX_LIST ];
        numItems = 0;
    }

    //note the add function will overwrite items a the given index, so always add an item to the end
    public void add( int index, Object item ) throws ListIndexOutOfBoundsException, ListException {

        if ( numItems >= MAX_LIST ) {

            throw new ListException( "ListException on add.");

        }

        if ( ( index >= 0 ) && ( index  <= numItems ) ) {

            items[index] = item;
            numItems++;

        } else {
            throw new ListIndexOutOfBoundsException("ListIndexOutOfBounds on add. ");
        }
    }

     //Retrieves a list item by position
    public Object get( int i ) throws  ListIndexOutOfBoundsException {
        if ( i >= 0 && i < numItems ) {
            return items[i];
        }
        else {
            throw new ListIndexOutOfBoundsException("ListIndexOutOfBounds on Get");
        }
    }

    //Deletes an item from the list at a given position
    public void remove( int i ) throws ListIndexOutOfBoundsException{
        if ( i >= 0 && i < numItems ) {

            items[i] = null;

            //Iterate from last index ( i + 1 ) to ( numItems - 1 ) copying each element to the previous
            // Check if i is not the index of the last item in array
            if( i != numItems-1) {

                //loop through
                for(int j = i+1; j < numItems; j++ ) {
                    items[j-1] = items[j];
                }
                items[numItems-1] = null;
            }
            numItems--;
        }
        else {
            throw new ListIndexOutOfBoundsException("ListIndexOutOfBounds on Get");
        }
    }



}