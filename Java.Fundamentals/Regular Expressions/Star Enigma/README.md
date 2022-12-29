The war is at its peak, but you, young Padawan, can turn the tides with your programming skills. You are tasked to create a program to decrypt the messages of The Order and prevent the death of hundreds of lives.

You will receive several messages, which are encrypted using the legendary star enigma. You should decrypt the messages following these rules:

To properly decrypt a message, you should count all the letters [s, t, a, r] – case insensitive and remove the count from the current ASCII value of each symbol of the encrypted message.

After decryption:

Each message should have a planet name, population, attack type ('A', as an attack or 'D', as destruction), and soldier count.

The planet's name starts after '@' and contains only letters from the Latin alphabet.

The planet population starts after ':' and is an Integer;

The attack type may be "A"(attack) or "D"(destruction) and must be surrounded by "!" (Exclamation mark).

The soldier count starts after "->" and should be an Integer.

The order in the message should be: planet name -> planet population -> attack type -> soldier count. Each part can be separated from the others by any character except: '@', '-', '!', ':' and '>'.




Input / Constraints

· The first line holds n – the number of messages – integer in the range [1…100].

· On the next n lines, you will be receiving encrypted messages.





Output

After decrypting all messages, you should print the decrypted information in the following format:

First print the attacked planets, then the destroyed planets. "Attacked planets: {attackedPlanetsCount}" "-> {planetName}" "Destroyed planets: {destroyedPlanetsCount}" "-> {planetName}"

The planets should be ordered by name alphabetically.




Example:


Input: 


2

STCDoghudd4=63333$D$0A53333

EHfsytsnhf?8555&I&2C9555SR



Output:


Attacked planets: 1 
-> Alderaa 
Destroyed planets: 1 
-> Cantonica