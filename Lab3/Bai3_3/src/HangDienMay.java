import java.util.Scanner;
public class HangDienMay extends HangHoa{
	private int thoiGianBaoHanh;
	private double dienAp;
	private double congSuat;
	public HangDienMay() {
		super();
		thoiGianBaoHanh = 0;
		dienAp = 0;
		congSuat = 0;
	}
	public HangDienMay(String maHang, String tenHang, String nhaSanXuat, int gia,
			int thoiGianBaoHanh,double dienAp,double congSuat)
	{
		super(maHang,tenHang,nhaSanXuat,gia);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.dienAp = dienAp;
		this.congSuat = congSuat;
	}
	public void nhapHangDienMay()
	{
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap thoi gian bao hanh: ");
		thoiGianBaoHanh = sc.nextInt();
		System.out.print("Nhap dien ap: ");
		dienAp = sc.nextDouble();
		System.out.print("Nhap cong suat: ");
		congSuat = sc.nextDouble();
	}

	public String toString()
	{
		return super.toString() + String.format("%-16d%-8.1f%-9.1f", thoiGianBaoHanh,
				dienAp,congSuat);
	}
	
}
