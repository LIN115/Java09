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

		Test(int eng, int m) {
			english = eng;
			math = m;
		}

		double avg() {
			return (english + math) / 2.0;
		}
	}

	public void show() {
		System.out.println("�ǥͩm�W:" + name);
		System.out.println("�^�妨�Z:" + score.english);
		System.out.println("�ƾǦ��Z:" + score.math);
		System.out.println("�������Z:" + score.avg());
	}
}

public class Class19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data stu = new Data("Annie", 85, 92);
		stu.show();
	}

}