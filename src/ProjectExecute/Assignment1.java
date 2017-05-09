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

        //Instantiates a database object to store all of the University's students, courses, and completions
        UniversityDatabase mainDatabase = new UniversityDatabase();

        //goes through and adds all of the objects from the input file to the database
        fillDatabase(fileReader, mainDatabase);

        //TODO: start the user input method

    }

    //this method will run the instructions for the interactive input for the user
    private static void printInstructions() {
        System.out.print("Welcome to the CS-102 Student-Course Manager\n" +
                "Current available commands:\n" +
                "1 --> Print all students.\n" +
                "2 --> Print all courses.\n" +
                "3 --> Print all students of a course.\n" +
                "4 --> Print all courses of a student.\n" +
                "9 --> Exit");
    }

    //this method will be used to add all the items found in the
    private static void fillDatabase(Scanner inFile, UniversityDatabase mainDatabase) {

        //Go through all of the lines in the file and
        while ( inFile.hasNextLine() ) {

            //Set the current line of the input file to the currLine variable
            //The variable currline will be used to process the input
            String currLine = inFile.nextLine();

            //Depending upon the first part of the current line
            switch ( currLine.split("/")[0] ) {
                case "STUDENT":
                    mainDatabase.addStudent(currLine);
                    break;

                case "COMPLETION":
                    mainDatabase.addCompletionEvent(currLine);
                    break;

                case "COURSE":
                    mainDatabase.addCourse(currLine);
                    break;
            }
        }
    }

    private static void Input(){
        //Scanner that will take the user input from the interactive input
        Scanner commandSelection = new Scanner(System.in);

        //When the user  for the user to select the command option

    }
}
