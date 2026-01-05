package curriculum.b;

import java.util.Scanner;

public class Question2 {

	// Question2 課題Q1~Q10
	public static void main(String[] args) {
		
		
		/* Q1: int 型の変数 score に 75 を代入
		 *  score が 60 以上なら "合格です！" と表示
		 */
		int score = 75;
		if (score >= 60) {
			System.out.println("合格です！");
		}

		/* Q2: int 型の変数 age に 25 を代入
		 * age が 20 以上 30 以下なら "適正年齢です" と表示
		 * それ以外の場合は "対象外です" と表示
		 */
		int age = 25;
		if (age >= 20 && age <= 30) {
			System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です");
		}

		/* Q3: int 型の変数 age に 18 を代入
		 * age が 20 以上なら "成人です" と表示
		 * age が 13 以上 19 以下なら "ティーンエイジャーです" と表示
		 * age が 12 以下なら "子供です" と表示
		 */
		int age1 = 18;
		if (age1 >= 20) {
			System.out.println("成人です");
		} else if (age1 >= 13 && age1 <= 19) {
			System.out.println("ティーンエイジャーです");
		} else {
			System.out.println("子供です");
		}

		/* Q4: int 型の変数 x, y, z に 30, 15, 50 を代入
		 * 一番大きい数値を判定して表示
		 */
		int x = 30;
		int y = 15;
		int z = 50;
		// 仮にxを最大とする
		int max = x;
		if (y > max) {
			max = y;
		}
		if (z > x) {
			max = z;
		}
		System.out.println(max);

		/* Q5: int 型の変数 num を用意　コンソール入力でいずれかの値を代入し
		 * num の値が 0 より大きければ "正の数です" と表示
		 * num の値が 0 なら "0 です" と表示
		 * num の値が 0 より小さければ "負の数です" と表示
		 */
		// Scannerを作る
		Scanner sc = new Scanner(System.in);
		// コンソールに入力した値をnumに代入
		int num;
		String input = sc.nextLine();
		num = Integer.parseInt(input);
		if (num > 0) {
			System.out.println("正の数です");
		} else if (num == 0) {
			System.out.println("0です");
		} else {
			System.out.println("負の数です");
		}

		/* Q6: int 型の変数 value を用意　コンソール入力でいずれかの値を代入し
		 * value が 偶数 なら "偶数です" と表示
		 * value が 奇数 なら "奇数です" と表示
		 */
		int value;
		String input1 = sc.nextLine();
		value = Integer.parseInt(input1);
		if (value % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}

		/* Q7: int 型の変数 score にコンソール入力で 0 から 100 のいずれかの数値を代入し
		 * 90 以上なら "優"
		 * 70 以上なら "良"
		 * 50 以上なら "可"
		 * 50 未満なら "不可"　を表示
		 */
		int score1;
		String input2 = sc.nextLine();
		score1 = Integer.parseInt(input2);
		if (score1 >= 90) {
			System.out.println("優");
		} else if (score1 >= 70) {
			System.out.println("良");
		} else if (score1 >= 50) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}

		// Q8:コンソール入力が null または空文字（""）のときに「入力が無効です」と表示する処理を作成してください
		// nextInt()のあとに残った改行を消す
		String letters = sc.nextLine();
		if (letters == null || letters.isEmpty()) {
			System.out.println("入力が無効です");
		}
		
		
		/* Q9: int 型の変数 day を用意（コンソール入力で1～7 のいずれかの数値を代入）
		day の値に応じて曜日を表示
		1 → "月曜日"
		2 → "火曜日"
		3 → "水曜日"
		4 → "木曜日"
		5 → "金曜日"
		6 → "土曜日"
		7 → "日曜日"
		それ以外の値なら "無効な入力です" と表示
		※Switch文を使用してください
		*/
		int day;
		String input3 = sc.nextLine();
		day = Integer.parseInt(input3);
		switch (day) {
			case 1 -> {
				System.out.println("月曜日");
			}
			case 2 -> {
				System.out.println("火曜日");
			}
			case 3 -> {
				System.out.println("水曜日");
			}
			case 4 -> {
				System.out.println("木曜日");
			}
			case 5 -> {
				System.out.println("金曜日");
			}
			case 6 -> {
				System.out.println("土曜日");
			}
			case 7 -> {
				System.out.println("日曜日");
			}
			default -> {
				System.out.println("無効な入力です");
			}
		}
		
		
		/* Q10: int 型の変数 month を用意（コンソール入力で1～12 のいずれかの数値を代入）
		 * month の値に応じて季節を表示
		 * 12, 1, 2 → "冬"
		 * 3, 4, 5 → "春"
		 * 6, 7, 8 → "夏"
		 * 9, 10, 11 → "秋"
		 * それ以外の値なら "無効な月です" と表示
		 * ※Switch文を使用してください
		 */
		int month;
		String input4 = sc.nextLine();
		month = Integer.parseInt(input4);
		switch (month) {
			case 12, 1, 2 -> {
				System.out.println("冬");
			}
			case 3, 4, 5 -> {
				System.out.println("春");
			}
			case 6, 7, 8 -> {
				System.out.println("夏");
			}
			case 9, 10, 11  -> {
				System.out.println("秋");
			}
			default -> {
				System.out.println("無効な月です");
			}
		}
		// Scannerを閉じる
		sc.close();
	}
}
