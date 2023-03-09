import java.util.Scanner;
public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		String ten = sc.next();
		System.out.print("Nhap nam sinh: ");
		int namSinh = sc.nextInt();
		int tuoi = 2023 - namSinh;
		if(tuoi<16)
		{
			System.out.println("Ban " + ten + " o do tuoi vi thanh nien");
		}
		else if(tuoi>=16 && tuoi<18)
		{
			System.out.println("Ban " + ten + " o do tuoi truong thanh");
		}
		else if(tuoi>=18)
		{
			System.out.println("Ban " + ten + " da gia");
		}
	}
}
