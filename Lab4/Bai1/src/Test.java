import java.util.Scanner;

public class Test {
	public static void nhapThongTin(BenhNhan obj1)
	{
		Scanner sc = new Scanner(System.in);
		//BenhNhan obj1 = new BenhNhan();
		System.out.print("nhap ho ten: ");
		obj1.setTen(sc.nextLine());
		System.out.print("Nhap tuoi: ");
		obj1.setTuoi(sc.nextInt());
		System.out.print("Nhap gioi tinh: ");
		obj1.setGioiTinh(sc.next().charAt(0));
		String c = sc.nextLine();
		System.out.print("Nhap tien su: ");
		obj1.setTienSu(sc.nextLine());
		System.out.print("Nhap chan doan: ");
		obj1.setChanDoan(sc.nextLine());
		BenhVien bv = new BenhVien();
		System.out.print("Nhap ten bv: ");
		bv.setTen(sc.nextLine());
		System.out.print("Nhap dia chi: ");
		bv.setDiaChi(sc.nextLine());
		System.out.println("Giam doc: ");
		bv.setGiamDoc(sc.nextLine());
		obj1.setBenhVien(bv);
		System.out.println();
	}
	public static void inThongTin(BenhNhan obj1)
	{
		System.out.println("Ten: " + obj1.getTen());
		System.out.println("Tuoi: " + obj1.getTuoi());
		System.out.println("Gioi tinhh: " + obj1.getGioiTinh());
		System.out.println("Tien su: " + obj1.getTienSu());
		System.out.println("Chan doan: " + obj1.getChanDoan());
	}
	public static void main(String[] args) {
		System.out.println("Nhap thong tin benh nhan");
		BenhNhan obj1 = new BenhNhan();
		nhapThongTin(obj1);
		System.out.println("Thong tin benh nhan");
		System.out.println(obj1.toString());
	}
}
