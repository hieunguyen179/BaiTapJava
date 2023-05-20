import java.util.Scanner;

public class HocVienLT extends HocVien{
	private int soBuoiHoc;
	private int DonGiaLT;
	private int uuTien;
	
	public HocVienLT()
	{
		super();
		soBuoiHoc = 0;
		DonGiaLT = 0;
		uuTien = 0;
	}
	
	public HocVienLT(int soBuoiHoc, int donGiaLT, int uuTien) {
		super();
		this.soBuoiHoc = soBuoiHoc;
		this.DonGiaLT = donGiaLT;
		this.uuTien = uuTien;
	}
	
	public int hocPhi()
	{
		if(uuTien==1)
		{
			return soBuoiHoc*DonGiaLT-1000000;
		}
		return soBuoiHoc*DonGiaLT-800000;
	}
	
	public void nhapThongTin()
	{
		Scanner sc = new Scanner(System.in);
		super.nhapThongTin();
		System.out.print("Nhap so buoi hoc: ");
		soBuoiHoc = sc.nextInt();
		System.out.print("Nhap don gia: ");
		DonGiaLT = sc.nextInt();
		System.out.print("Nhap loai uu tien: ");
		uuTien = sc.nextInt();
	}
	
	public void inThongTin()
	{
		super.inThongTin();
		System.out.println("So buoi hoc: " + soBuoiHoc);
		System.out.println("Don gia: " + DonGiaLT);
		System.out.println("Loai uu tien: " + uuTien);
		System.out.println("Hoc phi: " + hocPhi());
	}
}
