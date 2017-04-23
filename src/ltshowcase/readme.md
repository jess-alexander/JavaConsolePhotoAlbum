
================================================================================
User Story:

-- user will be given a range of albums to choose from
        maybe a list with rows? 
     1   2   3   4   5   6   7   8   9  10
    11  12  13  14  15  16  17  18  19  20
        (and so on and so forth)
-- user will chose which album to investigate using the album id 
-- user will have an option to go to "main" (the beginning) to see album options


================================================================================
Program Flow:

-- query JSON to display albums available.
    (JSON returns an array of photo objects, with superclass albumId)
    
-- condense 100 albumIds from 5000 photo objects
-- print albums in a formatted (numerically sorted) list

-- cue user to choose album number 

-- query the JSON file for only matching album number

-- print photos in a formatted 


================================================================================

Insights
** there are 100 albums in the JSON file, 5000 separate photo objects
* -- need a specific game plan for displaying them

** create an object to accept query specifications, then return data. 
* -- object must accept and differentiate between requesting number 
* --    of albums and displaying photos

** create an object to print data



================================================================================
================================================================================
================================================================================

*Lean Techniques - Technical Showcase - Create a Photo Album*

Create a console application that displays photo ids and titles in an
album. The photos are available in this online web service 
https://jsonplaceholder.typicode.com/photos

Hint: Photos are filtered with a query string. This will return photos
within albumId=3D3 (https://jsonplaceholder.typicode.com/photos?albumId=3D3=
)


Example:

> photo-album 2

[53] soluta et harum aliquid officiis ab omnis consequatur

[54] ut ex quibusdam dolore mollitia


> photo-album 3

[101] incidunt alias vel enim

[102] eaque iste corporis tempora vero distinctio consequuntur nisi nesciun
