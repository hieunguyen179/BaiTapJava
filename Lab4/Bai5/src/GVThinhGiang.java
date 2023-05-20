import java.util.Scanner;
public class GVThinhGiang extends GiangVien{
	private int soTietDay;
	private int donGia;
	public GVThinhGiang()
	{
		super();
		soTietDay = 0;
		donGia = 0;
	}
	public GVThinhGiang(int soTietDay, int donGia) {
		super();
		this.soTietDay = soTietDay;
		this.donGia = donGia;
	}
	public void nhapThongTin()
	{
		Scanner sc = new Scanner(System.in);
		super.nhapThongTin();
		System.out.print("Nhap so tiet day: ");
		soTietDay = sc.nextInt();
		System.out.print("Nhap don gia: ");
		donGia = sc.nextInt();
	}
	public double tinhLuong()
	{
		double thuNhap = ((double)15/100 * (soTietDay*donGia));
		return soTietDay*donGia - (thuNhap/100);
	}
	public void inThongTin()
	{
		super.inThongTin();
		System.out.println("So tiet day: " + soTietDay);
		System.out.println("Don gia: " + donGia);
	}
}
