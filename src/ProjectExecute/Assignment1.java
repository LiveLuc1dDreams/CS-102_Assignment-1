package ProjectExecute;

import DatabaseObjects.UniversityDatabase;
import ProjectObjects.Student;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
 *This class will be the main method that runs the University database
 */

//General tasks:
    //TODO: add method to change the location of the input file
    //TODO: Files left to comment:  CourseDatabase, StudentDatabase, Student, Course, CompletionEvent, UniversityDatabase.
    //
public class Assignment1 {

    //Here all of the commands to create the database, read the input file,
    // add the items from the input file to the database, and take commands from the user.
    public static void main(String[] args) throws UniversityDatabaseException, FileNotFoundException {

        //Variable to store the path to the input file.
        //The location "/home/brandon/IdeaProjects/CS-102 Assignment-1/src/NonProjectItems/Input.txt" is what I have
        // set as the default.
        String inFileLocation = "/home/brandon/IdeaProjects/CS-102 Assignment-1/src/NonProjectItems/Input.txt";


        //Try and find the input file and throw an exception if it is not found
        try {

        } catch (FileNotFoundException ) {

        }
        //File object to be used to read the input for the database from a text file
        File inFile = new File(inFileLocation);

        //Scanner that will be used to read the input from the file infile
        Scanner fileReader = new Scanner(inFile);

        //Instantiates a database object to store all of the University's students, courses, and completions
        UniversityDatabase mainDatabase = new UniversityDatabase();

        //Goes through and adds all of the objects from the input file to the database
        fillDatabase(fileReader, mainDatabase);

        //TODO: start the user input method

    }

    //This method will run the instructions for the interactive input for the user
    private static void printInstructions() {
        System.out.print("Welcome to the CS-102 Student-Course Manager\n" +
                "Current available commands:\n" +
                "1 --> Print all students.\n" +
                "2 --> Print all courses.\n" +
                "3 --> Print all students of a course.\n" +
                "4 --> Print all courses of a student.\n" +
                "9 --> Exit");
    }

    //This method will be used to add all the items found in the input file to the database
    private static void fillDatabase(Scanner inFile, UniversityDatabase mainDatabase) {

        //While the input file has another line go through all of the lines in the input file and
        while ( inFile.hasNextLine() ) {

            //Set the current line of the input file to the currLine variable.
            //The variable currline will be used to process the input.
            String currLine = inFile.nextLine();

            //Depending upon the first part of the current line input, decide whether the object to be made and added
            // to the database is a Student, Course, or a Completion.
            switch ( currLine.split("/")[0] ) {

                //"STUDENT" was found at the beginning of the input line and a student object will be made.
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
