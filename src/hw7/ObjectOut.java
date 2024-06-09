package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOut { //4.將Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡

	public static void main(String[] args) throws Exception {
		File dir = new File("c:\\data");
		// 判斷data資料夾是否存在
		if (dir.exists()) {
			System.out.println("data 資料夾已存在!");
		} else {
			System.out.println("data 資料夾不存在, 現在新增!");
			dir.mkdir();
		}
		// 建立狗貓物件, 為了可以用writeObject()方法寫出, 多型宣告為父類別Object型別
		Animal[] a = new Animal[4];
		a[0] = new Dog("旺財");
		a[1] = new Dog("小黑");
		a[2] = new Cat("地瓜球");
		a[3] = new Cat("麻糬");

		File objFile = new File("c:\\data\\Object.ser");
		FileOutputStream fos = new FileOutputStream(objFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// 輸出(寫出)
		try {
			for (int i = 0; i < a.length; i++) {
				oos.writeObject(a[i]); // 把objs陣列的元素逐一寫出至目的地檔案
				System.out.printf("Object%d 輸出完成!%n", i);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		// 關閉資料流
		oos.close();
		fos.close();
	}
}
