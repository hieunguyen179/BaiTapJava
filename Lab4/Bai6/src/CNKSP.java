import java.util.Scanner;

public class CNKSP extends CongNhan{
	private int soSanPham;
	private int donGiaSp;
	public CNKSP(int soSanPham, int donGiaSp)
	{
		super();
		this.soSanPham = soSanPham;
		this.donGiaSp = donGiaSp;
	}
	public CNKSP()
	{
		super();
		soSanPham = 0;
		donGiaSp = 0;
	}
	public void nhapThongTin()
	{
		Scanner sc = new Scanner(System.in);
		super.nhapThongTin();
		System.out.print("Nhap so san pham: ");
		soSanPham = sc.nextInt();
		System.out.print("Nhap don gia san pham: ");
		donGiaSp = sc.nextInt();
	}
	public double tinhLuong()
	{
		if(soSanPham <= 1000)
		{
			int thuong = 0;
			return soSanPham*donGiaSp + thuong;
		}
		else if(soSanPham-1000 >= 100 && soSanPham-100 < 150)
		{
			int thuong = 1000000;
			return soSanPham*donGiaSp + thuong;
		}
		int thuong = 1500000;
		return soSanPham*donGiaSp + thuong;
	}
	public void inThongTin()
	{
		super.inThongTin();
		System.out.println("So san pham lam/1thang: " + soSanPham);
		System.out.println("Don gia san pham: " + donGiaSp);
	}
	
}	
