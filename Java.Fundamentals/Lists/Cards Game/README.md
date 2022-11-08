Cards Game

You will be given two hands of cards, which will be integer numbers. Assume that you have two players. You must find the winning deck and, respectively, the winner.

You start from the beginning of both hands. Compare the cards from the first deck to those from the second. The player, who has a bigger card, takes both cards and puts them on the back of his hand - the second player's card is last, and the first person's card (the winning one) is before it (second to last), and the player with the smaller card must remove the card from his deck. If both players' cards have the same values - no one wins, and the two cards must be removed from the decks. The game is over when one of the decks is left without any cards. You have to print the winner on the console and the sum of the left cards: "{First/Second} player wins! Sum: {sum}".




Examples:



Input:


20 30 40 50

10 20 30 40



Output:


First player wins! Sum: 240