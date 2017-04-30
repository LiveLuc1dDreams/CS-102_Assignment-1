package ProjectExecute;

import DatabaseObjects.UniversityDatabase;
import ProjectObjects.Student;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
 *This class will be the main method that runs the University database
 */
public class Assignment1 {

    public static void main(String[] args) throws UniversityDatabaseException, FileNotFoundException {

        //File object to be used to read the input for the database from a text file
        File inFile = new File("/home/brandon/IdeaProjects/CS-102 Assignment-1/src/NonProjectItems/Input.txt");

        //Scanner that will be used to read the input from the file infile
        Scanner fileReader = new Scanner(inFile);

        UniversityDatabase mainDatabase = new UniversityDatabase();

        fillDatabase(fileReader);


    }

    //this method will be used to add all the items found in the
    public static void fillDatabase(Scanner inFile) {
        while ( inFile.hasNextLine() ) {
            String currLine = inFile.nextLine();

            switch ( currLine.split("/")[0] ) {
                case "STUDENT":
                    UniversityDatabase.addStudent(currLine);
                    break;

                case "COMPLETION":
                    UniversityDatabase.addCourse(currLine);
                    break;

                case "Course":

                    break;
            }
        }
    }
}
