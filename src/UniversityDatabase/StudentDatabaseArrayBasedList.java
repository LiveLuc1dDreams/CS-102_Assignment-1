package UniversityDatabase;

/**
 * Created by brandon on 4/11/17.
 */

class StudentDatabaseArrayBasedList implements StudentDatabaseArrayBasedListInterface {

    //Max physical size of the list
    private static final int DEFAULT_MAX_LIST = 50;

    //Variable to keep track of the current max size of the array based list.
    //This is used to allow resizability of the list
    private int currentMaxList;

    //An array of list items
    private Student items[];

    //Number of items (logical size) of the list
    private int numItems;

    //Default constructor
    StudentDatabaseArrayBasedList() {

        items = new Student[DEFAULT_MAX_LIST];
        setNumItems(0);
        setCurrentMaxList(DEFAULT_MAX_LIST);

    }

    //Tells whether the list is empty or not
    public boolean isEmpty() {
        return (getNumItems() == 0);
    }

    //Returns the size of the list
    public int size() {
        return getNumItems();
    }

    public void removeAll() {
        //Creates a new array, and marks old array for garbage collection
        items = new Student[DEFAULT_MAX_LIST];
        setNumItems(0);
    }

    //note the add function will overwrite items a the given index, so always add an item to the end
    public void add(int index, Student student) throws UniversityDatabase.CompletionArrayBasedListException {

        if ( getNumItems() >= getCurrentMaxList() ) {
            throw new StudentDatabaseException("CompletionArrayBasedListException on add.");
        }

        if ((index >= 0) && (index <= getNumItems())) {

            items[index] = student;
            setNumItems(getNumItems() + 1);

        } else {
            throw new StudentDatabaseException("ListIndexOutOfBounds on add. ");
        }
    }

    //Retrieves a list item by position
    public Student get(int i) throws UniversityDatabase.CompletionArrayBasedListException {
        if (i >= 0 && i < getNumItems()) {
            return items[i];
        } else {
            throw new UniversityDatabase.CompletionArrayBasedListException("ListIndexOutOfBounds on Get");
        }
    }

    //Deletes an item from the list at a given position
    public void remove(int i) throws UniversityDatabase.CompletionArrayBasedListException {
        if (i >= 0 && i < getNumItems()) {

            items[i] = null;

            //Iterate from last index ( i + 1 ) to ( numItems - 1 ) copying each element to the previous
            // Check if i is not the index of the last item in array
            if (i != getNumItems() - 1) {

                //loop through
                for (int j = i + 1; j < getNumItems(); j++) {
                    items[j - 1] = items[j];
                }
                items[getNumItems() - 1] = null;
            }
            setNumItems(getNumItems() - 1);
        } else {
            throw new UniversityDatabase.CompletionArrayBasedListException("ListIndexOutOfBounds on Get");
        }
    }

    //Resizes the array of students stored in the student database by making a new bigger array and filling it with items
    // from the current smaller list.
    public void resize() {

        //Make the current max size of the list bigger by 10 items.
        setCurrentMaxList(getCurrentMaxList() + 10);

        //Create a temporary array to transfer all of the items from the current list to.
        Student biggerList[] = new Student[getCurrentMaxList()];

        //Loop through items array and assign all of the the students to the same positions in the biggerList temporary array.
        for (int i = 0; i < this.getNumItems(); i++) {
            biggerList[i] = this.items[i];
        }

        //Change the reference of items to the array referenced by biggerList
        this.items = biggerList;

        //De-reference biggerList for garbage collection to save memory
        biggerList = null;
    }

    public int getCurrentMaxList() {
        return this.currentMaxList;
    }

    public void setCurrentMaxList(int currentMaxList) {
        this.currentMaxList = currentMaxList;
    }

    public int getNumItems() {
        return this.numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }
}