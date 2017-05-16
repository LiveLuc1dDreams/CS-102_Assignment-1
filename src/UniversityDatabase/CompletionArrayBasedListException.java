package UniversityDatabase;

/**
 * Created by brandon on 4/14/17.
 */

//Exception used when the array storing the list becomes full
class CompletionArrayBasedListException extends RuntimeException {

    CompletionArrayBasedListException(String s ) {

        super( s );

    }

}
