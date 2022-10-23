package Java09;

class CCount {
	static int count;

	public static void add2n(int n) {
		for (int i = 0; i <= n; i++) {
			count = count + i;
		}
		System.out.println("1+2+3+..=" + count);
		count = 0;//須歸零否則會繼續累計加下去
	}

}

public class Class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCount.add2n(10);
		CCount.add2n(5);
	}
}
