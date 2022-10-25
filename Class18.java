package Java09;

public class Class18 {

		public static void main(String args[]) {
			(new CCircle(2.0) { //匿名內部類別CCircle
				void show() {
					System.out.println("area=" + pi * radius * radius);
				}
			}).show();
		}

		static class CCircle {
			public double pi = 3.14;
			public double radius;

			public CCircle(double r) {
				radius = r;
			}
		}
	}
