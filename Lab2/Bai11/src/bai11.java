import java.util.Scanner;
public class bai11 {
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
		System.out.print("Mang da nhap: ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
		for(int i = 0; i < n-1; i++)
		{
			for(int j = n-1; j > i; j--)
			{
				if(a[j] < a[j-1])
				{
					int t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
				}
			}
		}
		System.out.print("\nMang sau khi sap xep tang dan: ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
