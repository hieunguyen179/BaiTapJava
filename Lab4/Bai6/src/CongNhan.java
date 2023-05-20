import java.util.Scanner;
public abstract class CongNhan {
	private String hoten;
	private String diachi;
	private String loaiCongNhan;
	public CongNhan()
	{
		hoten = null;
		diachi = null;
		loaiCongNhan = null;
	}
	public CongNhan(String hoten, String diachi, String loaiCongNhan) {
		this.hoten = hoten;
		this.diachi = diachi;
		this.loaiCongNhan = loaiCongNhan;
	}
	public void nhapThongTin()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		hoten = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diachi = sc.nextLine();
		System.out.print("Nhap loai cong nhan: ");
		loaiCongNhan = sc.nextLine();
	}
	public abstract double tinhLuong();
	public void inThongTin()
	{
		System.out.println("Ho ten: " + hoten);
		System.out.println("Dia chi: " + diachi);
		System.out.println("Loai cong nhan: " + loaiCongNhan);
		System.out.println("Luong thang: " + tinhLuong());
	}
}
