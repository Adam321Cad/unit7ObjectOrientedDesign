1:if you are refering to the deckSize method then it is not abstract because the way you find the
deck size is the same any way regardless of the type of game.

2:because that is the same no matter what type of game you are
playing regardless of elevens or thirteens

3: no making the board class an interface would not work as well
because elvensBoard also needs the instince variables from board and
certian methods like deal(), deckSize(), replaceSelectedCards() and so on. so even if it would be
possible to do it like that, it would be much harder and less efficient.