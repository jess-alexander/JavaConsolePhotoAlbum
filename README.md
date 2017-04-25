================================================================================

To run the project from the command line:
- download the project
- navigate to the project's dist folder within the command line
- java -jar "LTShowCase.jar" 

================================================================================

User Story:

- user will be given a range of albums to choose from
     1   2   3   4   5   6   7   8   9  10
    11  12  13  14  15  16  17  18  19  20

- user will chose which album to investigate using the album id 
- user will have an option to go to "main" (the beginning) to see album options

- error will show if user-input is non-numeric
- error will show if user-input is not found in the json data


================================================================================

Program Flow:

- query JSON to display albums available.
- use MAP to condense albumIds
- print albums in a formatted (numerically sorted) list
- cue user to choose album number 
- query the JSON URL for user-input
- print photoId and title of each photo

================================================================================
