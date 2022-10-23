package Java09;

class Caaa // 定義類別Caaa
{
	private int value;

	public Caaa() {
		this(10);// (a)試填寫此處的程式碼，使得呼叫此建構元時，value的值會被設定為10
		System.out.println("value=" + value);
	}

	public Caaa(int i) {
		value = i;
		System.out.println("value=" + value);
	}
}

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caaa obj1 = new Caaa();
		Caaa obj2 = new Caaa(12);
		//(b)第21行是呼叫沒有引數的，第22行則是呼叫有引數的。
		//(c)Caaa 類別不能宣告成public，因為一個檔案裡只能有一個 public 的類別，而且與程式儲存的文字檔名相同。如果要將 Caaa 類別宣告成 public，則必須將Caaa 類別另存成一個檔案，同時該檔案的名稱要為 Caaa.java。
		//(d) 可在其他類別呼叫 value所以並沒有影響。
	}
}