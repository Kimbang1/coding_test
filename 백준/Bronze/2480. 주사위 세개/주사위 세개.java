import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] dice = new int[3];
		for (int i = 0; i < 3; i++) {
			dice[i] = scanner.nextInt();
		}
        int A = 0;
		if (dice[0] == dice[1] && dice[1] == dice[2]) {
			A = 10000 + dice[0] * 1000;
		} else if (dice[0] == dice[1] || dice[0] == dice[2] || dice[1] == dice[2]) {
			if (dice[0] == dice[1] || dice[0] == dice[2]) {
				A = 1000 + dice[0] * 100;
			} else {
				A = 1000 + dice[1] * 100;
			}
		} 
		else {
			int max = dice[0];
			for (int i = 0; i < 3; i++) {
				if (dice[i] > max) {
					max = dice[i];
				}
            }
				A = max * 100;
		}
		System.out.println (A);
		scanner.close();

	}
}
