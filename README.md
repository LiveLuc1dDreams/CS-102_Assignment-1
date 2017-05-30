# CS-102_Assignment-1

#Project Usage Instructions:

To use the program, hit the compile and run button to be prompted for input. 
There will be a set of instructions displaying the possible functions of the program
The input file will be read from a path specified by the variable in Assignment 2 main class
###Notes:
* When adding a completion event to a student in a student database, if the student doesn't exist, 
the completion event will not be added to the database, and the function to add items to the database has to be run again if the student the completion event belongs to is lower in the input file.
* Currently support for courses is not available, as the inplementation of the doubly linked circular list is not complete and therefore not implemented in the CourseDatabase class. 
#Project Functionality:

###The program has three main functionalism's:
1. Reads an input file with formatted text representing students, courses, and course completions to be added to a database object
2. Turns the input from the input file into objects corresponding to the type of input found. 
3. Runs an interactive input for the user to display the courses, students, and completions sorted in various different ways. (currently not fully functional)

#Info to add to the readme:
Choices for the lists implemented in Course and Student classes:
Courses: ArrayList, Reason: Need to add many courses, so I want the adding process to not take too long, and also I do not want each completion to save on memory. By using the vector class the memory the array wastes is also saved due to its resizability. This implementation is better than a reference based list because a reference based list is slower to access each item and takes up more space for each item, which would be cumbersome. 
Students: ArrayList, Reason: Only need to add a few completions to each student so we can make a small array and only waste a little bit of space while making each of the items easy to access and take up a less memory than reference based list.
For adding objects to the database: if there is a duplicate object then the newest version of the duplicate object will overwrite the current version of the object in the database. 
Input file format:
 Student: STUDENT/student id/first name/last name/birthyear/birth-country
 Course: COURSE/course id/course title/course credits
 Completion: COMPLETION/student id/course id/grade/date of completion