package ProjectExecute;

import DatabaseObjects.UniversityDatabase;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
 *This class will be the main method that runs the Project 1 Program and contains supporting methods for the execution of the program.
 */

//General tasks:
//TODO: Files left to comment:  CourseDatabase, StudentDatabase, Student, Course, CompletionEvent, UniversityDatabase.
//TODO: Find out if there a better way to use the try catch blocks
//TODO: Make sure that the Database is properly cleared
//TODO: Make sure that the program actually runs and compiles
//TODO: Valid and non valid files need to let the program work/be handled
//TODO: All the items in the database are printed correctly and are sorted
//TODO: Insertion of an item into the database should preserve the order of the items
//TODO:
//TODO:
//Functionality To Be Implemented:
//TODO: Add method to change the location of the input file
//TODO: User input interaction needs an interface
//TODO: Re-intake data from a new file specified by the user
//TODO: Add method to get the gpa
//TODO: Have each letter grade = a gpa i.e. A = 4.0 etc
//TODO: Take the average gpa of all the courses a student has completed and divide by the number of courses
//TODO: Make a Doubly linked, circular list for project 2 specifications
//TODO: 3 new Commands to add a student, course, and completion event to the database. These will take in all the parameters from object constructors.
//TODO: Student Course completion event list has to be linked reference based.
//TODO: StudentDatabase needs to be an array based list that resizes itself when it it is full
//TODO: CourseDatabase needs to store courses using a sorted doubly linked circular linked list
//TODO: UniversityDatabase stores only two database objects, student and course database **DONE**
//TODO: Need an assigment2 class with a main method, performs all the operations requested by the user, never accesses the members of the other classes
//TODO: All classes except Assignment2 should be in the package UniversityDatabase and all classes are package private, except UniversityDatabase which is public.
//TODO: UniversityDatabase, CourseDatabase, StudentDatabase should have interfaces UniversityDatabaseInterface, etc...
//TODO: Duplicate items need to be handled

public class Assignment1 {

    //Here all of the commands to create the database, read the input file,
    // add the items from the input file to the database, and take commands from the user.
    //The exceptions will be thrown if there aren't
    public static void main( String[] args ) throws UniversityDatabaseException, FileNotFoundException {

        //Variable to store the path to the input file.
        //The location "/home/brandon/IdeaProjects/CS-102 Assignment-1/src/NonProjectItems/Input.txt" is what I have
        // set as the default.
        String inFileLocation = "/home/brandon/IdeaProjects/CS-102 Assignment-1/src/NonProjectItems/Input.txt";


        //Try and find the input file and throw an exception if it is not found
        try {

            //File object to be used to read the input for the database from a text file
            File inFile = new File(inFileLocation);

            //Scanner that will be used to read the input from the file infile
            Scanner fileReader = new Scanner(inFile);

            //Instantiates a database object to store all of the University's students, courses, and completions
            UniversityDatabase mainDatabase = new UniversityDatabase();

            //Goes through and adds all of the objects from the input file to the database
            fillDatabase(fileReader, mainDatabase);

            //TODO: start the user input method


        } catch (FileNotFoundException e) {

            //The file wasn't found so a new exception is thrown.
            throw new FileNotFoundException("FileNotFoundException An input file wasn't found");

        } catch (UniversityDatabaseException e) {
            //There was an error while creating the database. TODO: need to decide what errors this will catch
        }


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
