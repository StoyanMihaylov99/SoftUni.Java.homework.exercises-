Write a program which keeps the information about courses. Each course has a name and registered students.

You will receive the course name and student name until you receive the command "end". Check if such a course already exists and if not - add the course. Register the user into the course. When you do receive the command "end", print the courses with their names and total registered users. For each contest, print the registered users.

Input

· Until you receive "end", the input come in the format: "{courseName} : {studentName}".

· The product data is always delimited by " : ".

Output

· Print information about each course, following the format: "{courseName}: {registeredStudents}"

· Print information about each student, following the format: "-- {studentName}"




Example:



Input:



Programming Fundamentals : John Smith

Programming Fundamentals : Linda Johnson

JS Core : Will Wilson

Java Advanced : Harrison White

end




Output:




Programming Fundamentals: 2 
-- John Smith 
-- Linda Johnson 
JS Core: 1
 -- Will Wilson 
Java Advanced: 1 
-- Harrison White


