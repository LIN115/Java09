package Java09;

class Caaa // �w�q���OCaaa
{
	private int value;

	public Caaa() {
		this(10);// (a)�ն�g���B���{���X�A�ϱo�I�s���غc���ɡAvalue���ȷ|�Q�]�w��10
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
		//(b)��21��O�I�s�S���޼ƪ��A��22��h�O�I�s���޼ƪ��C
		//(c)Caaa ���O����ŧi��public�A�]���@���ɮ׸̥u�঳�@�� public �����O�A�ӥB�P�{���x�s����r�ɦW�ۦP�C�p�G�n�N Caaa ���O�ŧi�� public�A�h�����NCaaa ���O�t�s���@���ɮסA�P�ɸ��ɮת��W�٭n�� Caaa.java�C
		//(d) �i�b��L���O�I�s value�ҥH�èS���v�T�C
	}
}