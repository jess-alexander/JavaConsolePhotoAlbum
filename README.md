================================================================================

Coded in NetBeans IDE 8.1

Dependencies: gson-2.6.2.jar



================================================================================

User Story:

-- user will be given a range of albums to choose from
        maybe a list with rows? 
     1   2   3   4   5   6   7   8   9  10
    11  12  13  14  15  16  17  18  19  20
        (and so on and so forth)
-- user will chose which album to investigate using the album id 
-- user will have an option to go to "main" (the beginning) to see album options

-- error will show if user-input is non-numeric
-- error will show if user-input is not found in the json data


================================================================================

Program Flow:

-- query JSON to display albums available.
-- use MAP to condense albumIds
-- print albums in a formatted (numerically sorted) list
-- cue user to choose album number 
-- query the JSON URL for user-input
-- print photoId and title of each photo

================================================================================
================================================================================
================================================================================
================================================================================


Lean Techniques - Technical Showcase - Create a Photo Album
Create a console application that displays photo ids and titles in an album. The photos are available in this online web service (https://jsonplaceholder.typicode.com/photos).
 
Hint: Photos are filtered with a query string. This will return photos within albumId=3 (https://jsonplaceholder.typicode.com/photos?albumId=3)
 
You can use any language
Any open source libraries
Unit tests are encouraged
Post your solution on any of the free code repositories and send us a link:
https://github.com/
https://gitlab.com
https://bitbucket.org/
Provide a README that contains instructions on how to build and run your application
 
Spend as much (or little) time as you'd like on this. Feel free to use any resources available.
 
Example: 
> photo-album 2
[53] soluta et harum aliquid officiis ab omnis consequatur
[54] ut ex quibusdam dolore mollitia
…

> photo-album 3
[101] incidunt alias vel enim
[102] eaque iste corporis tempora vero distinctio consequuntur nisi nesciunt
