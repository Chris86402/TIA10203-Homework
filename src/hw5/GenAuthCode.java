package hw5;

public class GenAuthCode {
	
	public void genAuthCode() {
		for (int i = 0; i < 8; i++) { // 產生8個數字
			int charOrNum = (int) (Math.random() * (3 - 1 + 1)) + 1; // 抽1~3,決定該次是數字,大寫英文,小寫英文

			if (charOrNum == 1) {
				int num = (int) (Math.random() * 10); // 數字0-9
				System.out.print(num);

			} else if (charOrNum == 2) {
				//max - min + 1表示指定該範圍數值的數量再*隨機小數,範圍會是0~max, 再+min即為min~max的亂數
				int Upper = (int) (Math.random() * (90 - 65 + 1)) + 65; //A-Z 
				System.out.print((char) Upper); //轉為字元列印

			} else {
				int Lower = (int) (Math.random() * (122 - 97 + 1)) + 97; //a-z
				System.out.print((char) Lower);
			}
		}
	}
	
	public static void main(String[] args) {
		GenAuthCode g1 = new GenAuthCode();
		System.out.println("本次隨機產生驗證碼為：");
		g1.genAuthCode();
	}
	

}
