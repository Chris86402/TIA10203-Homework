package hw4;

public class ReverseString { //請建立一個字串，經過程式執行後，輸入結果是反過來的
	public static void main(String[] args) { 
		String s = "Hello World";
		char[] charArr = s.toCharArray(); //Converts this string to a new character array
		for (int i = charArr.length - 1; i >= 0 && i <= charArr.length; i--) {
			System.out.print(charArr[i]);
		}
	}
}
