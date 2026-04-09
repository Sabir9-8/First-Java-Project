class GameJudge
{
	boolean compareGuess(int randomNum, int playerGuess, int player) {
		if (playerGuess == randomNum) {
			System.out.println("Player " + player + " guessed correctly!");
			System.out.println("Player " + player + " Wins the Tournament!");
			return true;
		}
		else if (playerGuess < randomNum) {
			System.out.println("Too Low!\n");
		}
		else {
			System.out.println("Too High!\n");
		}

		return false;
	}
}