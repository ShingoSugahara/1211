import java.util.Random;
import java.util.Scanner;

public class HitNumber2 {

	public static void main(String[] args) {
		int GAME_NUM = 5;

		numberprint();//数あてゲームと表示する
		int ans = random();//乱数を決定

		gamestart(ans, GAME_NUM);

		endresult(ans);//終了と答えの表示
	}

	private static void gamestart(int ans, int GAME_NUM) {
		for (int i = 0; i < GAME_NUM; i++) {
			System.out.print("0～9の数字を入力してください:");
			int inputNum = userInput();
			boolean result = isCheck(ans, inputNum);
			showResult(result);
			if (result) {
				break;
			}
		}

	}

	public static void numberprint() {
		System.out.println("数あてゲーム");
	}

	public static int random() {
		Random rand = new Random();
		return rand.nextInt(10);

	}

	private static int userInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private static boolean isCheck(int ans, int inputNum) {
		boolean result = false;
		if (ans != inputNum) {
			result = false;

		} else {
			result = true;
		}
		return result;
	}

	private static void showResult(boolean result) {
		if (result) {
			System.out.println("アタリ");
		} else {
			System.out.println("違います");
		}
	}

	public static void endresult(int ans) {
		System.out.println("ゲームを終了します");
		System.out.println("答えは" + ans + "です。");
	}

}
