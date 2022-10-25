package Java09;

class Data {
	private String name;
	private Test score;

	public Data(String n, int s1, int s2) {
		name = n;
		score = new Test(s1, s2);
	}

	class Test { 
		private int english;
		private int math;

		Test(int eng, int m) { //Test類別建構元
			english = eng;
			math = m;
		}

		double avg() { // double avg()函數
			return (english + math) / 2.0;
		}
	}

	public void show() {
		System.out.println("學生姓名:" + name);
		System.out.println("英文成績:" + score.english);
		System.out.println("數學成績:" + score.math);
		System.out.println("平均成績:" + score.avg());
	}
}

public class Class19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data stu = new Data("Annie", 85, 92);
		stu.show();
	}

}
