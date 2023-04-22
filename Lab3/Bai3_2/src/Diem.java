import java.util.Scanner;
public class Diem {
	private int x,y;
	
	public Diem(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public Diem()
	{
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		y = s.nextInt();
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void inDiem()
	{
		System.out.println("(" + x + "," + y + ")");
	}
	public double tinhKhoangCach(Diem d1)
	{
		return (double)Math.sqrt((d1.x-x)*(d1.x-x) + (d1.y-y)*(d1.y-y));
	}
	public static void main(String agrs[])
	{
		System.out.print("Nhap toa do diem: ");
		Diem d = new Diem();
		d.inDiem();
	}
}
