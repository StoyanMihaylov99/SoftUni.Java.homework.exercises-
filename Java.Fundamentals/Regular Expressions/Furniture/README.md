Write a program to calculate the total cost of different types of furniture. You will be given some lines of input until you receive the line "Purchase". For the line to be valid, it should be in the following format:

">>{furniture name}<<{price}!{quantity}"

The price can be a floating-point number or a whole number. Store the names of the furniture and the total price. In the end, print each bought furniture on a separate line in the format:

"Bought furniture:

{1st name}

{2nd name}

�"

And on the last line, print the following: "Total money spend: {spend money}", formatted to the second decimal point.



Example:


Input:


>>Sofa<<312.23!3

>>TV<<300!5

>Invalid<<!5

Purchase





Output:



Bought furniture: 
Sofa 
TV 
Total money spend: 2436.6
