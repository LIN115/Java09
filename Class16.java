package Java09;

class CCircle // �w�q���OCCircle
{
	private static double pi = 3.14;
	private double radius;

	public CCircle(double r) // CCircle�غc��
	{
		radius = r;
	}

	public void show() {
		System.out.println("area=" + pi * radius * radius);
		System.out.println("radius=" + radius);
	}
}

public class Class16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle cir[];
		cir = new CCircle[6];
		for (int i = 0; i < cir.length; i++) {
			cir[i] = new CCircle(i);
			cir[i].show();
		}
		cir[0] = new CCircle(1.0);
		cir[1] = new CCircle(4.0);
		cir[2] = new CCircle(2.0);

		cir[0].show(); // �Q�Ϊ���cir[0]�I�sshow() method
		cir[1].show(); // �Q�Ϊ���cir[1]�I�sshow() method
		cir[2].show(); // �Q�Ϊ���cir[2]�I�sshow() method
	}

}
