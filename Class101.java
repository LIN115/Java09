package Java09;

class CRational // �������O
{
	public static int n;
	public static int d;

	public void setND(int num, int den) {
		n = num;
		d = den;
	}

	public void setN(int num) // �]�w���l
	{
		n = num;
	}

	public void setD(int num) // �]�w����
	{
		d = num;
	}

}

public class Class101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRational aaa = new CRational();
		aaa.setND(3, 5);
		show(aaa); // �������(����)
	}

	public static void show(CRational obj) // �޼� ���Oand����
	{

		System.out.println(obj.n + "/" + obj.d); // ��ܤ���
	}
}
