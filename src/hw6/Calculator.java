package hw6;

public class Calculator {
	private int x;
	private int y;

	public Calculator() {

	}

	public Calculator(int x, int y) throws CalException {
		setXY(x, y); //內容同setter,為簡化重複程式碼直接呼叫setter
	}

	public void setXY(int x, int y) throws CalException { //setter
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義！"); //丟出自訂例外物件
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數！");
		} else {
			this.x = x;
			this.y = y;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int powerXY(int x, int y) {
		return (int) Math.pow(x, y);
	}
}
