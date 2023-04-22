import java.util.Scanner;
public class NgayThang {
	private int ngay;
	private int thang;
	private int nam;
	public NgayThang()
	{
		ngay = 0;
		thang = 0;
		nam  = 0;
	}
	public NgayThang(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ngay: "); ngay = sc.nextInt();
		System.out.print("Nhap thang: "); thang = sc.nextInt();
		System.out.print("Nhap nam: "); nam = sc.nextInt();
	}
	@Override
	public String toString() {
		return ngay + "-" + thang + "-" + nam;
	
}

}