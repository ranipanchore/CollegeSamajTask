Task: Create a program for guess a number take value from user 
Solution: 
Guess Gaming Look Like a Tambola Game. 
In which user have a limited number of chance to win the Game.

Rules for the game is ::
	1. if the number guess by the user is matching with the actual random generated number, so user won! the game.
	2. if the number guess by the user is not matching with the actual random generated number, so user loss! the game.
	3. if the user reached to the limit of number of trials than user lost the game.
	
For this purpose we need to follow following Steps::

 	Step 1:- Create Java Project
	Step 2:- creating a package and a java file name with GuessGaming.java
	Step 3:- Create a Main method in java file 
	Step 4:- Import Two packages, one for Math Class random() method a
				And Second one for Scanner class for taking input from user
	Step 5:- Define Four variable answer, limit, input, attempts :-
			a. answer is random generate integer number 
			b. limit is pre-decided integer number.
			c. Input is value is enter by the user.
			d. Attempts is a boolean value which is for exit the game after limitation.
	Step 6:- Create a loop for enter guess number by user also check the limit in loop:
	 	if limit > 0 than user can able to enter the number
	 	Now in the loop::
	 		a. define an integer variable guess for holding the next integer value entered by user.
	 		b. now check answer is matching with guess number entered by the user if number is matched user won the game and set attempts is true.
	 		c. else if number entered by user is greater than the answer than print number is too high and reduce the attempts by one
	 		d. else number entered by user is less than the answer than print number is too low and reduce the attempts by one.
	 		
	Step 7:- if Attempts is equal to false then Print a Message "you are trying to reached to attempts you loss the game".
	Step 8:- Exit the program;