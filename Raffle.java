import java.util.Random;

public class Raffle {
	public static void main(String[] args) {
		Random rand = new Random();

		for (int i = 0; i < 10; ++i) {
			int randomNumber = rand.nextInt(10);
			System.out.println(randomNumber);
		}
	}
}
