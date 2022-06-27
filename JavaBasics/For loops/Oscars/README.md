Oscars:



You are invited by the academy to write software to calculate the points for an actor / actress. The academy will give you first points for the actor. Then each evaluator will give your evaluation. The points that the actor receives are formed by: the length of the name of the evaluated multiplied by points, which are given divided by two.

If the result at some point exceeds 1250.5 the program must be interrupted and it must be printed that the actor has received a nomination.


Input:

• Name of the actor - text

• Points from the academy - real number in the interval [2.0 ... 450.5]

• Number of estimators n - integer in the interval [1… 20]

   

    On the next n-th number of rows:

o Name of the evaluator - text

o Points from the evaluator - a real number in the interval [1.0 ... 50.0]




Output:

Print one line on the console:

· If the points are above 1250.5:

"Congratulations, {actor's name} got a nominee for leading role with {points}!"



· If the points are not enough:

"Sorry, {actor's name} you need {need points} more!"

The result should be formatted to the first digit after the decimal point!



Example:

Input:                Output:
Zahari Baharov        Sorry, Zahari Baharov you need 247.5 more!

205

4

Johnny Depp

45

Will Smith

29

Jet Lee

10

Matthew Mcconaughey

39

