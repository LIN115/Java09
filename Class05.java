package Java09;

class CCount {
	static int cnt = 0;

	public CCount() {
		cnt++;
	}

	public void count() {
		System.out.println(cnt + "object(s) created");
	}

	void setZero() { //�]setZero��ơA�ϩI�s��cnt���ȷ|�Q�k�s
		cnt = 0;
	}

	void setValue(int n) {//�]setValue��ơA�I�s��cnt���ȷ|�ܦ�n
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
//(d)���O�ܼơAstatic�׹��l�[�W�������O�ܼơA���O�ܼƬO�C�@�Ӫ���@�ɡA�]���|�H����إߦӲ֥[
//(e)��Ҩ�ơA�u�n����count() cnt�֥ܲ[�A�p�G�O���O����ܦ�����@�ΫK�L�k����C
