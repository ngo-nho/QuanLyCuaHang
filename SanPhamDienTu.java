import java.util.Scanner;
public class SanPhamDienTu extends SanPham {
    private int thoigianbaohanh;
    private double tylegiamgia;
    public SanPhamDienTu() {}
    public SanPhamDienTu(String maSP, String tenSP, double donGia, int soLuong, int thoigianbaohanh, double tylegiamgia) {
        super(maSP, tenSP, donGia, soLuong);
        this.thoigianbaohanh = thoigianbaohanh;
        this.tylegiamgia = tylegiamgia;
    }
// Getter - Setter
    public int getThoigianbaohanh() {
        return thoigianbaohanh;
    }
    public void setThoigianbaohanh(int thoigianbaohanh) {
        this.thoigianbaohanh = thoigianbaohanh;
    }
    public double getTylegiamgia() {
        return tylegiamgia;
    }
    public void setTylegiamgia(double tylegiamgia) {
        this.tylegiamgia = tylegiamgia;
    }
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap thoi gian bao hanh (thang): ");
        thoigianbaohanh = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ty le giam gia (vd: 0.1 = 10%): ");
        tylegiamgia = Double.parseDouble(sc.nextLine());
    }
    @Override
    public void xuat() {
        System.out.println(toString());
    }
    @Override
    public double tinhGiaBan() {
        return donGia * (1 - tylegiamgia);
    }
    @Override
    public String toString() {
        return "SanPhamDienTu {" +
                "maSP=" + maSP + '\'' +
                ", tenSP=" + tenSP + '\'' +
                ", donGia: " + String.format("%,.0f", donGia) + " VND" +
                ", soLuong=" + soLuong +
                ", thoigianbaohanh=" + thoigianbaohanh +
                ", tylegiamgia=" + tylegiamgia +
                ", Gia ban: " + String.format("%,.0f", tinhGiaBan()) + " VND" +
                '}';
    }
}