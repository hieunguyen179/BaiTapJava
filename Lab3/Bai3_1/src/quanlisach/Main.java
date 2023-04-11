package quanlisach;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong sach can quan li: ");
		int n = sc.nextInt();
		Sach arr[]= new Sach[n];
		System.out.println("Nhap thong tin sach");
		for(int i = 0; i < n; i++)
		{
			System.out.println("Nhap thong tin cho cuon sach thu " + (i+1));
			arr[i] = new Sach();
			arr[i].nhapSach();
		}
		System.out.println("Thong tin sach");
		System.out.printf("%-4s%-10s%-30s%-30s%-10s%-10s%-10s%-30s%-30s\n","STT" ,"Ma sach","Ten Sach","Tac Gia",
				"So Trang", "Tap Sach","Gia Sach", "Loai Sach", "Nha Xuat Ban");
		for(int i = 0; i < n; i++)
		{
			System.out.print(i+1);
			arr[i].inSach();
		}
	}
	
}

