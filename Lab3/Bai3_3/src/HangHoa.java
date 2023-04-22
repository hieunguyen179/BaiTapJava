import java.util.Scanner;
public class HangHoa {
	private String maHang;
	private String tenHang;
	private String nhaSanXuat;
	private int gia;
	private int kiemTra; // dùng để phân biệt các loại hàng hóa
	public HangHoa()
	{
		maHang = null;
		tenHang = null;
		nhaSanXuat = null;
		gia = 0;
	}
	public HangHoa(String maHang, String tenHang, String nhaSanXuat, int gia) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.nhaSanXuat = nhaSanXuat;
		this.gia = gia;
	}
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma hang:");maHang = sc.nextLine();
		System.out.print("Nhap ten hang:");tenHang = sc.nextLine();
		System.out.print("Nhap nha san xuat:");nhaSanXuat = sc.nextLine();
		System.out.print("Nhap gia:");gia = sc.nextInt();
	}	
	@Override
	public String toString() {
		return String.format("%-12s%-20s%-20s%-10d", maHang,tenHang,nhaSanXuat,gia);
	}
	public int getkiemTra()
	{
		return kiemTra;
	}
	
	public void setkiemTra(int kiemTra)
	{
		// 1: hàng thực phẩm
		// 2: hàng sành sứ
		// 3: hàng điện máy
		this.kiemTra = kiemTra;
	}

	
}
