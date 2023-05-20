
public class Main {
	public static void main(String[] args) {
		GVCoHuu obj1 = new GVCoHuu();
		GVThinhGiang obj2 = new GVThinhGiang();
		System.out.println("Nhap thong tin giang vien co huu");
		obj1.nhapThongTin();
		System.out.println("Nhap thong tin giang vien thinh giang");
		obj2.nhapThongTin();
		System.out.println("Thong tin giang vien co huu");
		obj1.inThongTin();
		System.out.println("Thong tin giang vien thinh giang");
		obj2.inThongTin();
	}
}
