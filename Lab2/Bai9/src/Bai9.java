import java.util.Scanner;
public class Bai9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String s = sc.next();
		int demKyTuThuong = 0;
		int demKyTuHoa = 0;
		int demKyTuSo = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				demKyTuThuong++;
			}
			else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				demKyTuHoa++;
			}
			else
			{
				demKyTuSo++;
			}
		}
		System.out.println("So luong ky tu thuong " + demKyTuThuong);
		System.out.println("So luong ky tu in hoa " + demKyTuHoa);
		System.out.println("So luong ky tu chu so " + demKyTuSo);
	}
}
