package hw7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class RandomNumber { //寫一支程式，亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (使用append功能讓每次執行結果都能被保存起來)


	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("c:\\TIA102_Workspace\\TIA10203-Homework\\files\\Data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos); //高階資料流
			PrintStream ps = new PrintStream(bos); //讓資料能夠以文字的形式作呈現的資料流
			
			for (int i = 1; i <= 10; i++) {
				int r = (int) (Math.random() * (1000 - 1 + 1)) + 1; //1001
				ps.println(r); //寫入亂數
			}
			
			//關閉資源
			ps.close();
			bos.close();
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}