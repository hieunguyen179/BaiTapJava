import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	private ArrayList<HangHoa> dsHH;
	public Main()
	{
		dsHH = new ArrayList<>();
	}
	public Main(ArrayList<HangHoa> dsHH) {
		this.dsHH = dsHH;
	}
	public void menu()
	{
		int luachon;
		while(true)
		{
			System.out.println("====QUAN LI HANG HOA=====");
			System.out.println("1.Nhap hang thuc pham");
			System.out.println("2.Nhap hang sanh su");
			System.out.println("3.Nhap hang dien may");
			System.out.println("4.In sanh sach hang hoa");
			System.out.println("5.Thoat chuong trinh");
			System.out.println("===========END============");
			System.out.print("Nhap lua chon cua ban: ");
			Scanner sc = new Scanner(System.in);
			luachon = sc.nextInt();
			if(luachon==1)
			{
				HangThucPham obj = new HangThucPham();
				System.out.println("Nhap thong tin hang thuc pham");
				obj.nhapHangThucPham();
				obj.setkiemTra(1);
				dsHH.add(obj);
			}
			else if(luachon==2)
			{
				HangSanhSu obj = new HangSanhSu();
				System.out.println("Nhap thong tin hang sanh su");
				obj.nhapHangSanhSu();
				obj.setkiemTra(2);
				dsHH.add(obj);
			}
			else if(luachon==3)
			{
				HangDienMay obj = new HangDienMay();
				System.out.println("Nhap thong tin hang dien may");
				obj.nhapHangDienMay();
				obj.setkiemTra(3);
				dsHH.add(obj);
			}
			else if(luachon==4)
			{
				System.out.println("     DANH SACH HANG THUC PHAM");
				System.out.printf("%-12s%-20s%-20s%-10s%-12s%-12s\n","Ma san pham","Ten san pham",
						"Nha san xuat","Gia","NSX","HSD");
				for(int i = 0; i < dsHH.size(); i++)
				{
					// là hàng hóa thực phẩm
					if(dsHH.get(i).getkiemTra()==1)
					{
						System.out.println(dsHH.get(i).toString());
					
					}
				}
				System.out.println("------------------------------------");
				System.out.println("     DANH SACH HANG SANH SU");
				System.out.printf("%-12s%-20s%-20s%-10s%-20s\n","Ma san pham","Ten san pham",
						"Nha san xuat","Gia","Loai nguyen lieu");
				for(int i = 0; i < dsHH.size(); i++)
				{
					// là hàng sành sứ
					if(dsHH.get(i).getkiemTra()==2)
					{
							System.out.println(dsHH.get(i).toString());
							
					}
		
				}
				System.out.println("------------------------------------");
				System.out.println("     DANH SACH HANG DIEN MAY");
				System.out.printf("%-12s%-20s%-20s%-10s%-16s%-8s%-9s\n","Ma san pham","Ten san pham",
						"Nha san xuat","Gia","Bao hanh(thang)","Dien ap","Cong suat");
				for(int i = 0; i < dsHH.size(); i++)
				{
					// là hàng điện máy
					if(dsHH.get(i).getkiemTra()==3)
					{
							System.out.println(dsHH.get(i).toString());
							
					}
				}
				System.out.println("------------------------------------");
				
			}
			else 
			{
				break;
			}
		}
	}
	public static void main(String agrs[])
	{
		Main obj = new Main();
		obj.menu();
	}
}
	
	