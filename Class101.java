package Java09;

class CRational // だ计摸
{
	public static int n;
	public static int d;

	public void setND(int num, int den) {
		n = num;
		d = den;
	}

	public void setN(int num) // 砞﹚だ
	{
		n = num;
	}

	public void setD(int num) // 砞﹚だダ
	{
		d = num;
	}

}

public class Class101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRational aaa = new CRational();
		aaa.setND(3, 5);
		show(aaa); // ず场ㄧ计(ン)
	}

	public static void show(CRational obj) // ま计 摸andン
	{

		System.out.println(obj.n + "/" + obj.d); // 陪ボだ计
	}
}
