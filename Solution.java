import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = fs.nextInt();
			int tens = x / 10;
			x -= tens * 10;
			int fives = x / 5;
			x -= fives * 5;
			System.out.println(x == 0 ? tens + fives : -1);
		}
		fs.close();
	}
}
