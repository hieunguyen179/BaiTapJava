
import java.util.Scanner;
public class HangSanhSu extends HangHoa{
	private String loaiNguyenLieu;
	public HangSanhSu()
	{
		super();
		loaiNguyenLieu = null;
	}
	public HangSanhSu(String maHang, String tenHang, String nhaSanXuat, int gia,
			String loaiNguyenLieu) {
		super(maHang,tenHang,nhaSanXuat,gia);
		this.loaiNguyenLieu = loaiNguyenLieu;
	}
	public void nhapHangSanhSu()
	{
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap loai nguyen lieu: ");
		loaiNguyenLieu = sc.nextLine();
	}
	
	public String toString()
	{
		return super.toString() + String.format("%-20s", loaiNguyenLieu);
	}
		
}
