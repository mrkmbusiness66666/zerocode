package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	// Question3 課題Q1~Q12
	public static void main(String[] args) {
		
		
		/* Q1:for 文を使って 1 から 10 までの数字を 1 つずつ表示
		 */
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		
		/* Q2:for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示
		 */
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}
		
		
		/* Q3: for 文を使って 10 から 1 まで カウントダウンして表示
		 */
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		
		/* Q4:for 文を使って 1 から 100 までの合計 を表示
		 */
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		/* Q5: for 文を使って 以下のような三角形を出力
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/* Q6:while 文を使って 1 から 10 まで を 1 つずつ表示
		 */
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		
		/* Q7:while 文を使って 2 から 20 までの偶数 を 1 つずつ表示
		 */
		int a = 2;
		while (a <= 20) {
			System.out.println(a);
			a += 2;
		}
		
		
		/* Q8:while 文を使って 10 から 1 まで のカウントダウンを表示
		 */
		int b = 10;
		while (b >= 1) {
			System.out.println(b);
			b--;
		}
		
		
		/* Q9:while 文を使って 1 から 100 までの合計 を表示
		 */
		int sum1 = 0;
		int c = 1;
		while (c <= 100) {
			sum1 += c;
			c++;
		}
		System.out.println(sum1);
		
		
		/* Q10:ユーザーから 数値をコンソール入力 してもらう
		 * 入力が 0 になるまで 何度でも入力を受け付ける
		 * 0が入力されたら「終了しました」と表示
		 * ※Scannerを使用
		 * ※While文を使用してください
		 */
		// Scannerを作る
		Scanner sc = new Scanner(System.in); {
			int num = 1;
			while (num != 0) {
				// nextLineを使用
					String input = sc.nextLine();
					num = Integer.parseInt(input);
			}
			System.out.println("終了しました");
		}
		
		
		/* Q11: for文を使用して下記の通りに出力してください
		 */
		for (int i1 = 1; i1 <= 9; i1++) {
			for (int j1 = 1; j1 <= 9; j1++) {
				System.out.printf("%02d * %02d = %02d || ", i1, j1, i1 * j1);
			}
			System.out.println();
		}
		
		
		/* Q12:入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
		 * ・拡張for文・Switch文・条件演算子を使用すること　※普通の if文は使用不可
		 * ・Switch文内でテレビとディスプレイは続けて書き、条件演算子で各項目を出力される値を変更してください
		 * ・テレビとディスプレイは同じ商品扱いとし、二つの合計値は常に 11になるようにしてください。 
		 * ・例：テレビと受け取った場合、→「テレビの残り台数は〇台です」※〇はランダムで出た数字　ディスプレイは（ 11-〇）の値
		 * ・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
		 * ・入力された値は「、」区切りで指定してください
		 * ・そのほかの値が入力された場合下記を出力されるようにしてください
		 * 『受け取った値』は指定の商品ではありません
		 * ・残り台数は0〜11までのランダムな値が出力されるようにしてください
		 */
		Random rand = new Random() ;
		// コンソールに入力
		String input = sc.nextLine();
		// "、"で区切る
		String[] products = input.split("、");
		// テレビ、ディスプレイの在庫は合計11
		int tvStock = rand.nextInt(12);
		int displayStock = 11 - tvStock;
		// 拡張for文
		for (String product : products) {
			// 0~11
			int stock = rand.nextInt(12);
			switch (product) {
				case "テレビ", "ディスプレイ" -> {
					int result = product.equals("テレビ") ? tvStock : displayStock;
					System.out.println(product + "の残りの台数は" + result + "台です");
				}
				case "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器" -> {
					System.out.println(product + "の残りの台数は" + stock + "台です");
				}
				default -> {
					System.out.println("『" + product + "』は指定の商品ではありません");
				}
			}
		}
		sc.close();
	}
}
