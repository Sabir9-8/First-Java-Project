import java.util.Scanner;
class Game
{
	int randomNum;
	int maxGuesses;
	int playerGuess;
	int limit;
	int p_num;

	Scanner scan = new Scanner(System.in);
	Player player = new Player();
	NumberGenerator numgen = new NumberGenerator();
	GameJudge judge = new GameJudge();

	void startGame() {
		System.out.println("Welcome to Number Guessing Tournament!\n");
		boolean play = true;
		while (play) {
			System.out.println("Enter the upper limit (50 <= limit <= MAX_INT) for the random number:");
			
			limit = scan.nextInt();
			while (limit < 50) {
				System.out.println("Invalid Input, Please Enter a Valid Input:");
				limit = scan.nextInt();
			}
			randomNum = numgen.randomNum(limit);
			System.out.println("System generated a number between 1 and " + limit + ".\n");
			System.out.println("Enter the number of players(<= 3):");
			p_num = scan.nextInt();
			while (p_num > 3 || p_num < 1) {
				System.out.println("More than 3 Players not allowed!\nPlease Enter a Valid Number of Players:");
				p_num = scan.nextInt();
			}
			maxGuesses = (int)(Math.log(limit) / Math.log(2));
			System.out.println("Enter the difficulty Level:\nEasy(e/E):\nMedium(m/M):\nHard(h/H):"); 
			char ch = scan.next().charAt(0);
			if (ch == 'e' || ch == 'E') {
				maxGuesses += 5;
			}
			else if (ch == 'm' || ch == 'M') {
				maxGuesses += 1;
			}
			else if (ch == 'h' || ch == 'H') {
				maxGuesses -= 1;
			}
			else {
				System.out.println("Invalid Input! Restart Game.");
				scan.close();
				return;
			}

			System.out.println("Maximum guesses allowed: " + maxGuesses + "\n");
			int round = 1;
			int guessCount = 0;
			while (guessCount < maxGuesses)
			{
				if (p_num != 1) {
					System.out.println("Round " + round + " starts!\n");
				}

				for (int p = 1; p <= p_num && guessCount < maxGuesses; ++p)
				{
					System.out.println("Player " + p + " guess:");
					
					playerGuess = player.guessNum(scan);
					++guessCount;

					if(judge.compareGuess(randomNum, playerGuess, p)){
						scan.close();
						return;
					}
				}
				++round;
			}

			System.out.println("Game Over! The number was: " + randomNum);
			System.out.println("Do you want to play again? (y/Y for yes, any other key for no):");
			char playAgain = scan.next().charAt(0);
			if (playAgain != 'y' && playAgain != 'Y') {
				play = false;
			}
		}
		

		scan.close();
		
	}
	
}