package hw1;

public class Homework1 {
	public static void main(String[] args) {

		// 第一題-請設計一隻Java程式・計算12・6這兩個數値的和與積
		int num1 = 12, num2 = 6;
		int sum = num1 + num2;
		int mult = num1 * num2;
		System.out.printf("%s與%s之和為: %d%n", num1, num2, sum); // 格式化輸出字串十進制整數並換行
		System.out.printf("%s與%s之積為: %d%n", num1, num2, mult);

		// 第二題-請設計一隻Java程式,計算200顆蛋共是幾打幾顆？（一打為12顆）
		int eggs = 200;
		int dozen = eggs / 12; // 整除取商
		int left = eggs % 12; // 取餘數
		System.out.printf("200顆蛋共是: %d打 %d顆%n", dozen, left);

		// 第三題-請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int target = 256559;
		int day = 86400; //60秒*60分鐘*24小時
		int hour = 3600; //60秒*60分鐘
		int min = 60; //1分鐘為60秒

		int dayCount = target / day; //多少天
		int dayLeft = target % day; //計算多少天後 的剩餘秒數

		int hourCount = dayLeft / hour; //計算多少天後的剩餘秒數 是多少小時
		int hourLeft = dayLeft % hour; //計算多少小時後 的剩餘秒數

		int minCount = hourLeft / min; //計算多少小時後的剩餘秒數 是多少分鐘
		int minLeft = hourLeft % min; //計算多少分鐘後 的剩餘秒數 即秒數

		System.out.printf("%d天 %d小時 %d分鐘 %d秒%n", dayCount, hourCount, minCount, minLeft);

		// 第四題-請定義一個常數為3.1415（圓周率）,並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int r = 5;
		double area = PI * r * r;
		double length = 2 * r * PI;
		System.out.printf("圓面積為: %f 圓周長為: %f%n", area, length);

		// 第五題-某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢(用複利計算)?
		int money = 1_500_000;
		double rate = .02; // 2%為0.02
		int year = 10;
		double result = money * (Math.pow((1 + rate), year)); // 本利和 = 本金 × (1 + 年利率)^期間
		System.out.printf("本利和為: %f%n", result);

		// 第六題-請寫一隻程式,利用System.out.println印出以下三個運算式結果
		System.out.println(5 + 5); // 整數數值5+整數數值5=整數數值10
		System.out.println(5 + '5'); // 整數數值5與字元'5'相加,因字元'5'會轉為Unicode編碼53,故為整數數值5+53,運算回傳值為整數數值58
		System.out.println(5 + "5"); // 整數數值5與字串"5"相加,為串接相加,運算回傳值為字串"55"

	}
}