
import java.util.Scanner;
public class HangThucPham extends HangHoa{
	private NgayThang ngaySanXuat;
	private NgayThang ngayHetHan;
	public HangThucPham()
	{
		super();
		ngaySanXuat = new NgayThang();
		ngayHetHan = new NgayThang();
	}
	public HangThucPham(String maHang, String tenHang, String nhaSanXuat, int gia,
			NgayThang ngaySanXuat, NgayThang ngayHetHan) {
		super(maHang,tenHang,nhaSanXuat,gia);
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	
	public void nhapHangThucPham()
	{
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap ngay san xuat ");
		System.out.println();
		ngaySanXuat.nhap();
		System.out.print("Nhap ngay het han ");
		System.out.println();
		ngayHetHan.nhap();
	}
	@Override
	public String toString() {

		return super.toString() + String.format("%-12s%-12s",
				ngaySanXuat,ngayHetHan);
	}

}
