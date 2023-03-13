import java.util.Scanner;
public class Bai10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String s = sc.next();
		System.out.print("Nhap ky tu: ");
		char c = sc.next().charAt(0);
		int dem = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)==c)
			{
				dem++;
			}
		}
		System.out.println("So lan xuat hien cua ky tu " + c + ": " + dem);
	}
}
