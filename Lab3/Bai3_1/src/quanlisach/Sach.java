package quanlisach;

import java.util.Scanner;

public class Sach {
	private String maSach;
	private String tenSach;
	private String tacGia;
	private int trangSach;
	private int tapSach;
	private int giaSach;
	private String loaiSach;
	private String nxb;
	
	public Sach()
	{
		
	}

	public void nhapSach()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma sach: ");
		maSach = sc.nextLine();
		System.out.print("Nhap ten sach: ");
		tenSach = sc.nextLine();
		System.out.print("Nhap tac gia: ");
		tacGia = sc.nextLine();
		System.out.print("Nhap so trang sach: ");
		trangSach = sc.nextInt();
		System.out.print("Nhap tap sach: ");
		tapSach = sc.nextInt();
		System.out.print("Nhap gia sach: ");
		giaSach = sc.nextInt();
		String c = sc.nextLine();
		System.out.print("Nhap loai sach: ");
		loaiSach = sc.nextLine();
		System.out.print("Nhap nha xuat ban: ");
		nxb = sc.nextLine();
	}
	public void inSach()
	{
		System.out.printf("%-3s%-10s%-30s%-30s%-10d%-10d%-10d%-30s%-30s\n"," ",maSach,
				tenSach,tacGia,trangSach,tapSach,giaSach, loaiSach, nxb);
	}
}


