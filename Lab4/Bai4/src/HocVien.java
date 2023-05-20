import java.util.Scanner;

public abstract class HocVien {
	 private String hoten;
	 private String diachi;
	 private String loaiChuongTrinh;
	 public HocVien()
	 {
		 hoten = null;
		 diachi = null;
		 loaiChuongTrinh = null;
	 }
	 public HocVien(String hoten, String diachi, String loaiChuongTrinh) {
		super();
		this.hoten = hoten;
		this.diachi = diachi;
		this.loaiChuongTrinh = loaiChuongTrinh;
	}
	 public void nhapThongTin()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Nhap ho ten: ");
		 hoten = sc.nextLine();
		 System.out.print("Nhap dia chi: ");
		 diachi = sc.nextLine();
		 System.out.print("Nhap loai chuong trinh: ");
		 loaiChuongTrinh = sc.nextLine();
	 }
	 public abstract int hocPhi();
	 
	 public void inThongTin()
	 {
		 System.out.println("Ho ten: " + hoten);
		 System.out.println("Dia chi: " + diachi);
		 System.out.println("Loai chuong trinh hoc: " + loaiChuongTrinh);
	 }
	 	 
}
