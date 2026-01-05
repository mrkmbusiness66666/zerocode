package curriculum.a;

public class Question1 {

	// Question1 課題Q1~Q13
	public static void main(String[] args) {
		
		
		/* Q1:各型の変数を宣言し、初期値を設定してください。
		 * Q2:1で宣言した各型の変数に指定された値を代入してください。
		 */
		// byte型の変数byteNumの初期値を設定
		byte byteNum = 0;
		// 変数byteNumに10を代入
		byteNum = 10;
		
		// short型の変数shortNumの初期値を設定
		short shortNum = 0;
		// 変数shortNumに100を代入
		shortNum = 100;
		
		// int型の変数intNumの初期値を設定
		int intNum = 0;
		// 変数intNumに1000を代入
		intNum = 1000;
		
		// long型の変数longNumの初期値を設定
		long longNum = 0;
		// 変数longNumに10000を代入
		longNum = 10000;
		
		// float型の変数floatNumの初期値を設定
		float floatNum = 0.0f;
		// 変数floatNumに9.5fを代入
		floatNum = 9.5f;
		
		// double型の変数doubleNumの初期値を設定
		double doubleNum = 0.0;
		// 変数doubleNumに10.5を代入
		doubleNum = 10.5;
		
		// char型の変数letterの初期値を設定
		char letter = '\u0000';
		// 変数letterにaを代入
		letter = 'a';
		
		// String型の変数lettersの初期値を設定
		String letters = "null";
		// 変数lettersにハローを代入
		letters = "ハロー";
		
		// boolean型の変数Booleanの初期値を設定
		boolean Boolean = false;
		// 変数Booleanにtrueを代入
		Boolean = true;
		
		
		// Q3:値を代入した変数を用いて出力をしてください。
		// 11110を出力
		System.out.println(longNum + intNum + shortNum +  byteNum );
		
		// 20を出力
		System.out.println(byteNum * 2);
		
		// a ハロー trueを出力
		System.out.println(letter + letters + Boolean );
		
		// 11130 数字を全て足して出力
		System.out.println(longNum + intNum + shortNum +  byteNum * 3);
		
		//小数点以外の数字を全てかけて出力
		System.out.println(longNum * intNum * shortNum *  byteNum);
		
		// 10.5割る100をして出力
		System.out.println(doubleNum / shortNum);
		
		// 10引く100をして出力
		System.out.println(byteNum - shortNum);
		
		
		/* Q4:nameというString型の変数を宣言しその変数に"山田太郎"という値を代入してください。
		 * name変数を使用してコンソールにこんにちは、山田太郎さん！と表示してください。
		 */
		String name = "山田太郎";
		// 出力 こんにちは、山田太郎さん！
		System.out.println("こんにちは、" + name + "さん！");
		
		
		/* Q5:ageというint型の変数を宣言しその変数に25を代入してください。
		 * age変数を使用してコンソールに年齢:25歳という表示してください。
		 */
		int age;
		age = 25;
		// 出力 年齢:25
		System.out.println("年齢:" + age);
		
		
		/* Q6:num1というint型の変数を宣言し、10を代入
		 * num2というint型の変数 を宣言し、5を代入
		 * num1とnum2を足した結果をsumという変数に代入し、コンソールに表示してください。
		 */
		int num1;
		num1 = 10;
		int num2;
		num2 = 5;
		int sum = num1 + num2;
		// 出力 15
		System.out.println(sum);
		
		
		/* Q7:scoreというint型の変数を宣言し、80を代入
		 * scoreに20を加えて、更新する最終スコア:100をscoreを使用してコンソールに表示してください。
		 */
		int score;
		score = 80;
		// scoreに20加算
		score = score + 20;
		// 出力 最終スコア:100
		System.out.println("最終スコア:" + score);
		
		
		/* Q8:priceというdouble型の変数を宣言し、99.99を代入
		 * priceをint型に変換し、整数価格: 99とコンソールに表示してください。
		 */
		double price;
		price = 99.99;
		// double→int(小数点以下が切り捨て)
		int price1 = (int)price;
		// 出力 整数価格:99
		System.out.println("整数価格:" + price1);
		
		
		/* Q9:String型の変数numStrに"123"を代入
		 * numStrをint型に変換し、
		 * 変換後の値:の後ろにnumStr+10した結果をコンソールに表示してください。
		 */
		String numStr = "123";
		// 文字列をintに変換
		int numStr1 = Integer.parseInt(numStr);
		// 出力 133
		System.out.println(numStr1 + 10);
		
		
		/* Q10:int型の変数numに50を代入
		 * numをString型に変換し、"得点:50点"の形で表示
		 */
		int num = 50;
		// numをString型に変換
		String str = String.valueOf(num);
		// 出力 得点:50点
		System.out.println("得点:" + str + "点");
		
		
		/* Q11:次の条件を満たすプログラムを条件演算子を使用して作成してください。
		 * int型の変数aに10を代入
		 * int型の変数bに20 を代入
		 * aがbより小さいかどうかをboolean変数resultに代入
		 * resultの値を表示
		 */
		int a = 10;
		int b = 20;
		// aがbより小さいかどうかをboolean変数resultに代入
		boolean result = (a < b) ? true : false;
		// resultの値を表示
		System.out.println(result);
			
		
		/* Q12:条件演算子（三項演算子）を使用してください。
		 * int型の変数xに15を代入
		 * xが10以上なら"OK"、そうでなければ"NG"を表示
		 */
		int x = 15;
		// xが10以上なら"OK"、そうでなければ"NG"
		String result1 = (x > 10) ? "OK" : "NG";
		// resultの値を表示
		System.out.println(result1);
		
		
		/* Q13:String text = "私はJavaが好きです。Javaは楽しい！";という
		 * 文章の中にある「Java」を「Python」に置き換えて表示させてください。
		 */
		String text = "私はJavaが好きです。Javaは楽しい！";
		// 「Java」を「Python」に置き換えて表示
		System.out.println(text.replace("Java", "Python"));	
	}

}
