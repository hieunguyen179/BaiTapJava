import java.util.Scanner;
public abstract class GiangVien {
	private String hoTen;
	private String diaChi;
	private String loaiGiangVien;
	public GiangVien()
	{
		hoTen = null;
		diaChi = null;
		loaiGiangVien = null;
	}
	public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGiangVien = loaiGiangVien;
	}
	public void nhapThongTin()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diaChi = sc.nextLine();
		System.out.print("Nhap loai giang vien:");
		loaiGiangVien = sc.nextLine();
	}
	
	public abstract double tinhLuong();
	public void inThongTin()
	{
		System.out.println("Ho ten: " + hoTen);
		System.out.println("Dia chi: " + diaChi);
		System.out.println("Loai giang vien: " + loaiGiangVien);
		System.out.println("Luong thang: " + tinhLuong());
	}
	
}
