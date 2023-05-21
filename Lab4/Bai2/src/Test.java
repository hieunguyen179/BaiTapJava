import java.util.Scanner;

public class Test {
	public static void nhapThongTin()
	{
		String ten,lop,nghanh;
		int tuoi;
		char gioitinh;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: "); ten = sc.nextLine();
		System.out.print("Nhap tuoi: "); tuoi = sc.nextInt();
		System.out.print("Nhap gioi tinh: "); gioitinh = sc.next().charAt(0);
		System.out.print("Nhap lop: "); lop = sc.nextLine();
		sc.nextLine();;
		System.out.print("Nhap nghanh: "); nghanh = sc.nextLine();
		String tenTruong,diaChi,hieuTruong;
		System.out.print("Nhap ten truong: "); tenTruong = sc.nextLine();
		System.out.print("Nhap dia chi truong: "); diaChi = sc.nextLine();
		System.out.print("Nhap hieu truong: "); hieuTruong = sc.nextLine();
		Truong th = new Truong(tenTruong,diaChi,hieuTruong);
		SinhVien sv = new SinhVien(ten,tuoi,gioitinh,lop,nghanh,th);
		System.out.println(sv.toString());
	}
	public static void main(String[] args) {
		nhapThongTin();
	}
}
