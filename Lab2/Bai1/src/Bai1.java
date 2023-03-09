import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so thu nhat: ");
		float a = sc.nextFloat();
		System.out.print("Nhap so thu hai: ");
		float b = sc.nextFloat();
		// cau a
		System.out.println("Tong = " + (a+b));
		System.out.println("Hieu = " + (a-b));
		System.out.println("Tich = " + (a*b));
		System.out.println("Thuong = " + (a/b));
		System.out.println("Chia lay du = " + (a%b));
		// cau b
		System.out.println(a+ " == " + b + " : " + (a==b));
		System.out.println(a+ " != " + b + " : " + (a!=b));
		System.out.println(a+ " > " + b + " : " + (a>b));
		System.out.println(a+ " < " + b + " : " + (a<b));
		System.out.println(a+ " >= " + b + " : " + (a>=b));
		System.out.println(a+ " <= " + b + " : " + (a<=b));
	}
}
