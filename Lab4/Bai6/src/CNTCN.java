import java.util.Scanner;

public class CNTCN extends CongNhan{
	private int luongCoBan;
	private double heSoLuong;
	private int soNgayCong;
	public CNTCN()
	{
		super();
		luongCoBan = 0;
		heSoLuong = 0;
		soNgayCong = 0;
	}
	public CNTCN(int luongCoBan, double heSoLuong,int soNgayCong) {
		super();
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.soNgayCong = soNgayCong;
	}
	public void nhapThongTin()
	{
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap luong co ban: ");
		luongCoBan = sc.nextInt();
		System.out.print("Nhap he so luong: ");
		heSoLuong = sc.nextDouble();
		System.out.print("Nhap so ngay cong: ");
		soNgayCong = sc.nextInt();
	}
	public double tinhLuong()
	{
		if(soNgayCong < 20)
		{
			return luongCoBan*heSoLuong;
		}
		double thuong = 1.2*luongCoBan;
		return luongCoBan*heSoLuong+thuong;
	}
	public void inThongTin()
	{
		super.inThongTin();
		System.out.println("Luong co ban: " + luongCoBan);
		System.out.println("He so luong: " + heSoLuong);
		System.out.println("So ngay cong: " + soNgayCong);
	}
}
