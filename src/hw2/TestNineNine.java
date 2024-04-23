package hw2;

public class TestNineNine {
	public static void main(String[] args) {
		
		// for+while 1-9 99乘法
		System.out.println("====for+while====");
		for (int i = 1; i <= 9; i++) {
			int j = 1; // 每跑一圈for, 重置j
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t"); //tab鍵 \t
				j++;
			}
			System.out.println(); //換行
		}
		

		// for+do...while 1-9 99乘法
		System.out.println("====for+do...while====");
		for (int x = 1; x <= 9; x++) {
			int y = 1;
			do {
				System.out.print(x + "*" + y + "=" + x * y + "\t");
				y++;
			} while (y <= 9);
			System.out.println(); //換行
		}
		

		// while+do...while 1-9 99乘法
		System.out.println("====while+do...while====");
		int a = 1;
		while (a <= 9) {
			int b = 1;
			do {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			} while (b <= 9);

			a++;
			System.out.println(); //換行
		}
	}
}
