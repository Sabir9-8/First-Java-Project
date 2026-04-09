import java.util.Random;
class NumberGenerator
{
	int randomNum(int limit) {
		Random random = new Random();
		return random.nextInt(limit) + 1;
	}
}