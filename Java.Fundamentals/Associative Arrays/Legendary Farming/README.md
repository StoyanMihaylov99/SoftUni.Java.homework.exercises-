Legendary Farming

You are playing a game, and your goal is to win a legendary item - any legendary item will be good enough. However, it's a tedious process and requires quite a bit of farming. The possible items are:

· "Shadowmourne" - requires 250 Shards

· "Valanyr" - requires 250 Fragments

· "Dragonwrath" - requires 250 Motes

"Shards", "Fragments", and "Motes" are the key materials (case-insensitive), and everything else is junk.

You will be given lines of input in the format:

"{quantity1} {material1} {quantity2} {material2} … {quantityN} {materialN}"


Keep track of the key materials - the first one that reaches 250, wins the race. At that point, you have to print that the corresponding legendary item is obtained.

In the end, print the remaining shards, fragments, and motes in the format:

"shards: {numberOfShards}

fragments: {numberOfFragments}

motes: {numberOfMotes}"

Finally, print the collected junk items in the order of appearance.



Example:


Input:


Each line comes in the following format: "{quantity1} {material1} {quantity2} {material2} … {quantityN} {materialN}"



Output:


Valanyr obtained! 
shards: 5 
fragments: 5 
motes: 3 
stones: 5 
leathers: 6