package Java09;

class Namecard {    // 外部類別
	private String name;
	private String address;
	private Phone data;

	public Namecard(String n, String a, String s1, String s2) { // Namecard建構元
		name = n;
		address = a;
		data = new Phone(s1, s2); 用new建立Phone物件
	}

	class Phone {  // 內部類別
		private String company;
		private String cell;

		public Phone(String s1, String s2) { // Phone建構元
			company = s1;
			cell = s2;
		}

		public void show_company() {
			System.out.println("公司電話:" + company);
		}

		public void show_cell() {
			System.out.println("手機號碼:" + cell);
		}

	}

	public void show() { // 外部類別Namecard的成員函數
		System.out.println("好友姓名:" + name);
		System.out.println("聯絡地址:" + address);
		data.show_company(); //System.out.println("公司電話:" + company);
		data.show_cell(); // System.out.println("手機號碼:" + cell);
	}
}

public class Class17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Namecard first = new Namecard("Andy", "123City", "2345-6789", "0911-336600");
		first.show();
	}

}
