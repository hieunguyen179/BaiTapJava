import java.util.Scanner;
public class Bai12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so hang cua ma tran: ");
		int n = sc.nextInt();
		System.out.print("Nhap so cot cua ma tran: ");
		int m = sc.nextInt();
		System.out.println("Nhap cac gia tri cua ma tran");
		int a[][] = new int[n][m];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		int max = a[0][0];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				if(a[i][j]>max)
				{
					max = a[i][j];
				}
			}
		}
		System.out.print("Phan tu lon nhat trong ma tran: " + max);
	}
}
