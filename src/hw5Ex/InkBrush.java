package hw5Ex;

public class InkBrush extends Pen {

	public InkBrush(String brand, double price) { //建構子
		super(brand, price);
	}
	
	public void write() { //定義抽象方法內容
		System.out.println("沾墨汁再寫");
	}
	
	public double getPrice() { //售價為定價9折
		return super.getPrice() * 0.9;
	}

}
