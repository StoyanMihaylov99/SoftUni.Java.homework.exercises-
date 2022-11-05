Train:

On the first line, you will be given a list of wagons (integers). Each integer represents the number of passengers that are currently in each wagon. On the next line, you will get the max capacity of each wagon (single integer). Until you receive "end" you will be given two types of input:

· Add {passengers} - add a wagon to the end with the given number of passengers

· {passengers} - find an existing wagon to fit all the passengers (starting from the first wagon)

In the end, print the final state of the train (all the wagons separated by a space)



Example:


Input:



32 54 21 12 4 0 23

75

Add 10

Add 0

30

10

75

end




Output:


72 54 21 12 4 75 23 10 0