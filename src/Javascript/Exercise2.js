/*
*
Manipulate an array of strings (add, remove, sort)
Create an array named studentNames with the names of your students.

Add a new student name to the beginning of the array.

Remove the last student name from the array.

Alphabetize the student names within the array.
*
* */


var studentNames = ["Alice", "Bob", "Charlie"];

// Add new student at the beginning
studentNames.unshift("Zoe");

// Remove last student
studentNames.pop();

// Sort alphabetically
studentNames.sort();

console.log(studentNames);
