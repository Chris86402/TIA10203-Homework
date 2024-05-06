package hw5;

public class RandAvg { // 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

	public int randAvg(int[] arr) { // 宣告randAvg方法, 傳入參數為int陣列arr,回傳值為int型別
		int sum = 0; // 宣告加總變數
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; // sum = sum + arr[i] 將每個數值取出來做加總
		}
		int avg = sum / arr.length; // 取平均值:加總除以數值個數
		return avg;
	}

	public static void main(String[] args) {
		System.out.println("本次亂數結果：");

		int[] arr = new int[10]; // 宣告長度為10的int陣列
		for (int i = 0; i < arr.length; i++) { // 填入亂數0~101
			arr[i] = (int) (Math.random() * 101);
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		RandAvg a = new RandAvg(); // 建立RandAvg類別的物件實體a
		System.out.print(a.randAvg(arr)); // 呼叫物件a的randAvg方法, 傳入int陣列arr,並列印回傳結果
	}
}
