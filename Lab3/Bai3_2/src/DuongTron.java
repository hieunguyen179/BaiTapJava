import java.util.Scanner;
public class DuongTron extends Diem{
	private double r;
	private Diem I;
	public DuongTron()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ban kinh duong tron: ");
		r = sc.nextDouble();
	}
	public DuongTron(int x, int y, double r)
	{
		super(x,y);
		this.r = r;
	}
	public void inDuongTron()
	{
		System.out.println("Toa do tam duong tron: " );
		super.inDiem();
		System.out.println("Ban kinh duong tron: " + r);
	}
	public double chuVi()
	{
		return (2*r)*3.14;
	}
	public double dienTich()
	{
		return r*r*3.14;
	}
	public static void main(String agrs[])
	{
		System.out.println("Nhap toa do tam duong tron");
		DuongTron dt = new DuongTron();
		dt.inDuongTron();
		System.out.println("Chu vi duon tron: " + dt.chuVi());
	}
}
