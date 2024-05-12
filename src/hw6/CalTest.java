package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入x的值：");
			int x = sc.nextInt();
			System.out.println("請輸入y的值：");
			int y = sc.nextInt();

			Calculator c1 = new Calculator();
			c1.setXY(x, y);
			System.out.printf("%d的%d次方等於%d", x, y, c1.powerXY(x, y));
			sc.close();

		} catch (CalException e1) { // 接住自訂例外的手套
			System.out.println(e1.getMessage());

		} catch (Exception e) { // 接不住就用爸爸例外手套接.包含輸入格式不正確的InputMismatchException
			System.out.println("輸入格式不正確");
		}
	}
}
