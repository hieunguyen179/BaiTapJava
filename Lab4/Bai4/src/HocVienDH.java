import java.util.Scanner;
public class HocVienDH extends HocVien {
	private int soBuoiHoc;
	private int DonGiaDH;
	private int uuTien;
	
	public HocVienDH()
	{
		super();
		soBuoiHoc = 0;
		DonGiaDH = 0;
		uuTien = 0;
	}
	public HocVienDH(int soBuoiHoc, int donGiaDH, int uuTien) {
		super();
		this.soBuoiHoc = soBuoiHoc;
		DonGiaDH = donGiaDH;
		this.uuTien = uuTien;
	}
	public int hocPhi()
	{
		if(uuTien==1)
		{
			return soBuoiHoc*DonGiaDH-1000000;
		}
		return soBuoiHoc*DonGiaDH-500000;
	}
	public void nhapThongTin()
	{
		Scanner sc = new Scanner(System.in);
		super.nhapThongTin();
		System.out.print("Nhap so buoi hoc: ");
		soBuoiHoc = sc.nextInt();
		System.out.print("Nhap don gia: ");
		DonGiaDH = sc.nextInt();
		System.out.print("Nhap loai uu tien: ");
		uuTien = sc.nextInt();
	}
	
	public void inThongTin()
	{
		super.inThongTin();
		System.out.println("So buoi hoc: " + soBuoiHoc);
		System.out.println("Don gia: " + DonGiaDH);
		System.out.println("Loai uu tien: " + uuTien);
		System.out.println("Hoc phi: " + hocPhi());
	}
	
	
}
