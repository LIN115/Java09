package Java09;

class Namecard {
	private String name;
	private String address;
	private Phone data;

	public Namecard(String n, String a, String s1, String s2) {
		name = n;
		address = a;
		data = new Phone(s1, s2);
	}

	class Phone {
		private String company;
		private String cell;

		public Phone(String s1, String s2) {
			company = s1;
			cell = s2;
		}

		public void show_company() {
			System.out.println("���q�q��:" + company);
		}

		public void show_cell() {
			System.out.println("������X:" + cell);
		}

	}

	public void show() {
		System.out.println("�n�ͩm�W:" + name);
		System.out.println("�p���a�}:" + address);
		data.show_company();
		data.show_cell();
	}
}

public class Class17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Namecard first = new Namecard("Andy", "123City", "2345-6789", "0911-336600");
		first.show();
	}

}
