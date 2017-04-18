package ArrayBasedList;

/**
 * Created by brandon on 4/11/17.
 */

public abstract class ListArrayBased implements ListInterface {

    //Max physical size of the list
    private static final int MAX_LIST = 50;

    //An array of list items
    private Object items[];

    //Number of items (logical size) of the list
    private int numItems;

    //Default constructor
    public ListArrayBased() {

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

    public void add( int index, Object item ) throws ListIndexOutOfBoundsException, ListException {

        if ( numItems >= MAX_LIST ) {

            throw new ListException( "ListException on add.");

        }

        if ( ( index >= 0 ) && ( index  <= numItems ) ) {



        }
    }

}