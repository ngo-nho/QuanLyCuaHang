import java.util.Scanner;
public class SanPhamThucPham extends SanPham {
    protected String hanSuDung;
    protected double mucGiamGia;
    public SanPhamThucPham() {}
    public SanPhamThucPham(String maSP, String tenSP, double donGia, int soLuong, String hanSuDung, double mucGiamGia)
        {
        super(maSP, tenSP, donGia, soLuong);
        this.hanSuDung = hanSuDung;
        this.mucGiamGia = mucGiamGia;
    }
    //Getter - Setter
    public String getHanSuDung() {
        return hanSuDung;
    }
    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
    }
    public double getMucGiamGia() {
        return mucGiamGia;
    }
    public void setMucGiamGia(double mucGiamGia) {
        this.mucGiamGia = mucGiamGia;
    }
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap han su dung (ngay): ");
        hanSuDung = sc.nextLine();
        System.out.print("Nhap muc giam gia (vd: 0.1 = 10%): ");
        mucGiamGia = Double.parseDouble(sc.nextLine());
    }
    @Override
    public void xuat() {
        System.out.println(toString());
    }
    @Override
    public double tinhGiaBan() {
        return donGia - (donGia * mucGiamGia);
    }
    @Override
    public String toString() {
        return "SanPhamThucPham{" +
                "maSP=" + maSP + '\'' +
                ", tenSP=" + tenSP + '\'' +
                ", donGia: " + String.format("%,.0f", donGia) + " VND" +
                ", soLuong=" + soLuong +
                ", hanSuDung=" + hanSuDung + '\'' +
                ", mucGiamGia=" + mucGiamGia +
                ", Gia ban: " + String.format("%,.0f", tinhGiaBan()) + " VND" +
                '}';
    }
}