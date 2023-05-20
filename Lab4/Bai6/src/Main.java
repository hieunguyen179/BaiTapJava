
public class Main {
	public static void main(String[] args) {
		CNKSP obj1 = new CNKSP();
		CNTCN obj2 = new CNTCN();
		System.out.println("Nhap thong tin cong nhan khoang san pham");
		obj1.nhapThongTin();
		System.out.println("Nhap thong tin cong nhan tinh cong nhat");
		obj2.nhapThongTin();
		System.out.println("Thong tin cong nhan khoang san pham");
		obj1.inThongTin();
		System.out.println("Thong tin cong nhan tinh san pham");
		obj2.inThongTin();
		
		
	}
}
