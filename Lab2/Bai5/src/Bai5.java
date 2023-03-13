import java.util.Scanner;
public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int tong = 0;
		do {
			System.out.print("Nhap 1 so nguyen: ");
			n = sc.nextInt();
			tong+=n;
		}while(tong<=100);
		System.out.println("Tong cac so da nhap: " + tong);
	}
}
