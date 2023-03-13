import java.util.Scanner;
public class Bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu mang: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.print("Nhap phan tu thu " + (i+1) + ": ");
			a[i] = sc.nextInt();
		}
		int tong = 0;
		for(int i = 0; i < n; i++)
		{
			tong = tong + a[i];
		}
		System.out.print("Mang da nhap la: ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println("\nTBC = " + (float)tong/n);
	}
}
