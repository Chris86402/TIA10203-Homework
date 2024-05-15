package hw7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class RandomNum {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("Data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);
			
			for (int i = 1; i <= 10; i++) {
				int x = (int) (Math.random() * 1001);
				ps.print(x + " ");
			}
			
			ps.close();
			bos.close();
			fos.close();

		} catch (IOException e) {
			System.err.println(e);
		}

	}
}
