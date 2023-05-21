
public class Truong {
	private String tenTruong;
	private String diaChi;
	private String hieuTruong;
	public Truong()
	{
		
	}
	public Truong(String tenTruong, String diaChi, String hieuTruong) {
		super();
		this.tenTruong = tenTruong;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;
	}
	public String getTenTruong() {
		return tenTruong;
	}
	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getHieuTruong() {
		return hieuTruong;
	}
	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}
	@Override
	public String toString() {
		return " [ten=" + tenTruong + ", diaChi=" + diaChi + ", hieuTruong=" + hieuTruong + "]";
	}
	
}
