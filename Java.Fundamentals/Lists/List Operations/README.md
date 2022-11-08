List Operations

You will be given numbers (a list of integers) on the first input line. Until you receive "End" you will be given operations you must apply on the list. The possible commands are:

· Add {number} - add number at the end

· Insert {number} {index} - insert number at given index

· Remove {index} - remove that index

· Shift left {count} - first number becomes last 'count' times

· Shift right {count} - last number becomes first 'count' times

Note: The index given may be outside the array's bounds. In that case, print "Invalid index".



Examples:



Input:




1 23 29 18 43 21 20

Add 5

Remove 5

Shift left 3

Shift left 1

End



Output:



43 20 5 1 23 29 18

