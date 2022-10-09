package Java09;

class CCount {
	static int cnt = 0;

	public CCount() {
		cnt++;
	}

	public void count() {
		System.out.println(cnt + "object(s) created");
	}

	void setZero() { //設setZero函數，使呼叫時cnt的值會被歸零
		cnt = 0;
	}

	void setValue(int n) {//設setValue函數，呼叫時cnt的值會變成n
		cnt = n;
	}

}

public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCount a = new CCount();
		a.count();
		CCount b = new CCount();
		CCount c = new CCount();
		b.count();
		a.setZero();
		c.count();
	}

}
//(d)類別變數，static修飾子加上成為類別變數，類別變數是每一個物件共享，因此會隨物件建立而累加
//(e)實例函數，只要執行count() cnt變累加，如果是類別函數變成物件共用便無法執行。
