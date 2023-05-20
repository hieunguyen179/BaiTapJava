import java.util.Scanner;

public class GVCoHuu extends GiangVien{
	private int luongCoBan;
	private double heSoLuong;
	private int thamNienCongTac;
	public GVCoHuu()
	{
		super();
		luongCoBan = 0;
		heSoLuong = 0;
		thamNienCongTac = 0;
	}
	public GVCoHuu(int luongCoBan, double heSoLuong, int thamNienCongTac) {
		super();
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.thamNienCongTac = thamNienCongTac;
	}
	public void nhapThongTin()
	{
		Scanner sc = new Scanner(System.in);
		super.nhapThongTin();
		System.out.print("Nhap luong co ban: ");
		luongCoBan = sc.nextInt();
		System.out.print("Nhap he so luong: ");
		heSoLuong = sc.nextDouble();
		System.out.print("Nhap tham nien cong tac: ");
		thamNienCongTac = sc.nextInt();
	}
	public double tinhLuong()
	{
		if(thamNienCongTac < 5)
		{
			return luongCoBan * heSoLuong;
		}
		double phuCap = ((float)thamNienCongTac/100) * luongCoBan;
		return luongCoBan * heSoLuong + phuCap;
	}
	public void inThongTin()
	{
		super.inThongTin();
		System.out.println("Luong co ban: " + luongCoBan);
		System.out.println("He so luong: " + heSoLuong);
		System.out.println("Tham nien cong tac: " + thamNienCongTac);

	}
}
