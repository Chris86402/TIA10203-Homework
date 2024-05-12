package hw5Ex;

public class PenAbstractTest {
	public static void main (String[] args) {
		Pen[] p = new Pen[2]; //使用多型
		p[0] = new Pencil("SKB", 60.0);
		p[1] = new InkBrush("萬寶龍", 1200.0);
		
		for(int i = 0; i <p.length; i++) {
			p[i].write(); //執行對應子類別的方法
			System.out.println("售價為: " + p[i].getPrice());
		}
	}
}
