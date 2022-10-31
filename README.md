# JavaExercvise
The company ACME offers their employees the flexibility to work the hours they want. But due to some external circumstances they need to know what employees have been at the office within the same time frame
The goal of this exercise is to output a table containing pairs of employees and how often they have coincided in the office.
Input: the name of an employee and the schedule they worked, indicating the time and hours. This should be a .txt file with at least five sets of data. You can include the data from our examples below:
Example 1:
INPUT
RENE=MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00- 21:00
ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00
ANDRES=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00
 
OUTPUT:
ASTRID-RENE: 2
ASTRID-ANDRES: 3
RENE-ANDRES: 2
Example 2:
INPUT:
RENE=MO10:15-12:00,TU10:00-12:00,TH13:00-13:15,SA14:00-18:00,SU20:00-21:00
ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00
OUTPUT:
RENE-ASTRID: 3

 The following is my solution for this exercise:
1. Use the "readFile" function to read the.txt file containing the employees' schedule information and convert it to a list of arrays. I added an exception to this function that throws a FileNotFoundException if the read file is null.
2. Create a function called "getNameScheduleEmployee" that loops through the array list from step one (calls the readFile function) and strips the data after the "=".

3. Create a function called "showResults" that outputs the expected results with the suggested separations. In this function, I use several nested for loops to find the coincidences between the schedules of two or more employees, then I manipulate the output to improve its aesthetics.

4. Finally, the functions in the Main class are referred to as follows:

getNameScheduleEmployee(readFile());

showResults();



I didn't use any specific architecture for this exercise because I wanted to keep it as simple as possible, but it could use some polish.



