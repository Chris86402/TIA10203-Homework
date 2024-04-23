package hw2;

public class Homework2 {
	public static void main(String[] args) {

		// 第一題-計算1~1000的偶數和(2+4+6+...+1000)
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1~1000的偶數和為:" + sum);

		// 第二題-計算1~10的連乘積(1*2*3*...*10)(用for迴圈)
		int mult = 1;
		for (int j = 1; j <= 10; j++) {
			mult *= j;
		}
		System.out.println("1~10的連乘積為(for迴圈):" + mult);

		// 第三題-計算1~10的連乘積(1*2*3*...*10)(用while迴圈)
		int mult2 = 1, k = 1;
		while (k <= 10) {
			mult2 *= k;
			k++;
		}
		System.out.println("1~10的連乘積為(while迴圈):" + mult2);

		// 第四題-請設計一支程式, 輸出結果為:1 4 9 16 25 36 49 64 81 100
		System.out.println("輸出結果為:");
		for (int m = 1; m <= 10; m++) {
			int square = m * m;
			System.out.print(square + " ");
		}
		System.out.println();

		// 第五題-阿文簽大樂透(1~49),排除有4的數字,可以選擇的數字有哪些?總共有幾個?
		System.out.println("阿文可以簽的號碼為: ");
		int count = 0;
		for (int n = 1; n <= 49; n++) {
			switch (n) {
			case 4:
				break;
			case 14:
				break;
			case 24:
				break;
			case 34:
				break;
			case 44:
				break;
			default:
				System.out.print(n + " ");
				count++;
			}
		}
		System.out.println();
		System.out.printf("總共有%d個%n%n", count);

		// 第六題-請設計一支程式, 輸出倒三角的1-10圖案?
		System.out.println("輸出倒三角的1-10圖案: ");
		for (int x = 10; x >= 1; x--) { // 縱-外圈-10次-倒序要遞減
			for (int y = 1; y <= x; y++) { // 橫-內圈-隨外圈變動,第一次就要印到10
				System.out.print(y + " ");
			}
			System.out.println();
		}

		// 第七題-請設計一支程式, 輸出三角型的A-F圖案?
		System.out.println("輸出三角型的A-F圖案: ");
		for (int a = 65; a <= 70; a++) { // 縱-外圈-65~70(A~F)
			for (int b = 65; b <= a; b++) { // 橫-內圈-隨外圈變動
				System.out.print((char) a); // 外圈當次的a
			}
			System.out.println();
		}
	}

}

