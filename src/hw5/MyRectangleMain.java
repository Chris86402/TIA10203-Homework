package hw5;

public class MyRectangleMain {
	public static void main (String[] args) {
		MyRectangle r1 = new MyRectangle(); //預設建構子
		r1.setWidth(10.0);
		r1.setDepth(20.0);
		System.out.println(r1.getArea()); //取得面積
		
		MyRectangle r2 = new MyRectangle(10.0, 20.0); //有參數的建構子
		System.out.println(r2.getArea());
	}
}
