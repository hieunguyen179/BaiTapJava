
public class Main {
	public static void main(String[] args) {
		HocVienDH obj_dh = new HocVienDH();
		HocVienLT obj_lt = new HocVienLT();
		System.out.println("Nhap thong tin hoc vien do hoa");
		obj_dh.nhapThongTin();
		System.out.println("Nhap thong tin cho hoc vien lap trinh");
		obj_lt.nhapThongTin();
		System.out.println("Thong tin hoc vien do hoa");
		obj_dh.inThongTin();
		System.out.println("------------------------------");
		System.out.println("Thong tin hoc vien lap trinh");
		obj_lt.inThongTin();
	}
}
