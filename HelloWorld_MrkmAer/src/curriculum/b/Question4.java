package curriculum.b;

import java.util.Scanner;

public class Question4 {
	
	// Question4 課題Q1~Q10
	public static void main(String[] args) {
		
		
		/* Q1:int 型の配列 を作成し、1, 2, 3, 4, 5 を格納する
		 * 配列の全要素を 順番に表示
		 */
		int[]  array1 = {1, 2, 3, 4, 5};
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		
		/* Q2: int 型の配列 {10, 20, 30, 40, 50} を用意する
		 * 配列の要素を 逆順 に表示
		 */
		int[] array2 =  {10, 20, 30, 40, 50};
		for (int i = array2.length - 1; i >= 0; i--) {
			System.out.println(array2[i]);
		}
		
		
		/* Q3; int 型の配列 {3, 5, 7, 9, 11} を用意する
		 * 配列の全要素の 合計値 を計算し、表示
		 */
		int[] array3 = {3, 5, 7, 9, 11};
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += array3[i];
		}
		System.out.println(sum);
		
		
		/* Q4: int 型の配列 {12, 7, 9, 21, 5, 18} を用意する
		 * 配列の 最大値と最小値 を求めて表示
		 */
		int[] array4 = {12, 7, 9, 21, 5, 18};
		int max = array4[0];
		int min = array4[0];
		for (int i = 1; i < array4.length; i++) {
			if (array4[i] > max) {
				max = array4[i];
			}
			if (array4[i] < min) {
				min = array4[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		
		/* Q5: int 型の配列 {1, 2, 3, 4, 5} を用意する
		 * 配列のすべての要素を 2 倍 し、結果を表示
		 * 結果を表示する際の処理に拡張for文を使用してください
		 */
		int[] array5 = {1, 2, 3, 4, 5};
		for (int value : array5) {
			System.out.println(value * 2);
		}
		
		
		/* Q6: int 型の配列 {4, 7, 10, 15, 20} を用意する
		 * ユーザーがコンソール入力した数が 配列に含まれているか を判定し、結果を表示
		 * 結果：（”入力した値”は配列に含まれています／含まれていません）
		 */
		// Scannerを作る
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int value = 0;
		value = Integer.parseInt(input);
		boolean found = false;
		int[] array6 = {4, 7, 10, 15, 20};
		for (int num : array6) {
			if (num == value) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("入力した値は配列に含まれていrます");
		} else {
			System.out.println("含まれていません");
		}
		sc.close();
		
		
		/* Q7:2次元配列 int[][] array = {{1, 2}, {3, 4}, {5, 6}}; を用意する
		 * 配列の すべての要素を表示 
		 */
		int[][] array7 = {{1, 2}, {3, 4}, {5, 6}};
		for (int i = 0; i < array7.length; i++) {
			for (int j = 0;  j < array7[i].length; j++) {
				System.out.println(array7[i][j]);
			}
		}
		
		
		/* Q8:2次元配列 int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; を用意する
		 * 配列の すべての要素の合計値を表示
		 */
		int[][] array8 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		int sum1 = 0;
		for (int i = 0; i < array8.length; i++) {
			for (int j = 0; j < array8[i].length; j++) {
				sum1 += array8[i][j];
			}
		}
		System.out.println(sum1);
		
		
		/* Q9:2次元配列 int[][] array = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}; を用意する
		 * 配列内の 最大値と最小値 を求めて表示
		 */
		int[][] array9 = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
		int max1 = array9[0][0];
		int min1 = array9[0][0];
		for (int i = 0; i < array9.length; i++) {
			for (int j = 0; j < array9[i].length; j++) {
				if (array9[i] [j] > max1) {
					max1 = array9[i][j];
					}
				if (array9[i][j] < min1) {
					min1 = array9[i][j];
					}
				}
			}
		System.out.println(max1);
		System.out.println(min1);
		
		
		/* Q10:3次元配列 int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; を用意する
		 * 配列内のすべての要素を 表示
		 */
		int [][][] array10 = {
				{{1, 2}, {3, 4}},
				{{5, 6}, {7, 8}}
		};
		for (int i = 0; i < array10.length; i++) {
			for ( int j = 0; j < array10[i].length; j++) {
				for (int k = 0; k <  array10[i][j].length; k++) {
					System.out.println(array10[i][j][k]);
				}
			}
		}
	}
}
