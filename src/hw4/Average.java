package hw4;

public class Average {
	public static void main(String[] args) { // 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int[] arr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			sum += arr[i];
		}
		int avr = sum / arr.length; //取平均值
		System.out.println("平均值為: " + avr);
		System.out.print("大於平均值的元素: ");

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > avr) { //列出大於平均值者
				System.out.print(arr[i] + " ");
			}
		}
	}
}
