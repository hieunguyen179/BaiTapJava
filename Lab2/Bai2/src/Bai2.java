import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen bat ki: ");
		int n = sc.nextInt();
		if(n%2==0)
		{
			System.out.println(n + " la so chan");
		}
		else if(n%2!=0)
		{
			System.out.println(n + " la so le");
		}
	}
}
