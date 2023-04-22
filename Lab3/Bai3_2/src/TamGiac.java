
public class TamGiac {
	public Diem a,b,c;
	public TamGiac(Diem a, Diem b,Diem c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public TamGiac()
	{
		System.out.print("Nhap toa do dinh A: ");
		a = new Diem();
		System.out.print("Nhap toa do dinh B: ");
		b = new Diem();
		System.out.print("Nhap toa do dinh C: ");
		c = new Diem();
	}

	public void inTG()
	{
		System.out.println("Toa do dinh A: ");a.inDiem();
		System.out.println("Toa do dinh B: ");b.inDiem();
		System.out.println("Toa do dinh C: ");c.inDiem();
		
	}
	public boolean kiemTra()
	{
		double AB = a.tinhKhoangCach(b);
		double AC = a.tinhKhoangCach(c);
		double BC = b.tinhKhoangCach(c);
		if(AB + AC > BC && AB + BC > AC && AC + BC > AB)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public double chuVi()
	{
		double AB = a.tinhKhoangCach(b);
		double AC = a.tinhKhoangCach(c);
		double BC = b.tinhKhoangCach(c);
		return AB + AC + BC;
	}
	public double dienTich()
	{
		return 0.5 * Math.abs(((b.getX()-a.getX())*(c.getY()-a.getY()))- 
				((c.getX()-a.getX()) * (b.getY()-a.getY())));
	}
	public static void main(String agrs[])
	{
		System.out.println("Nhap toa do 3 dinh tam giac");
		TamGiac tg = new TamGiac();
		if(tg.kiemTra()==true)
		{
			System.out.println("A,B,C la 3 dinh cua tam giac");
		}
		else
		{
			System.out.println("A,B,C khong phai 3 dinh cua tam giac");
		}
		System.out.println("Chu vi tam giac: " +tg.chuVi());
		System.out.println("Dien tich tam giac: " + tg.dienTich());
	}
}
