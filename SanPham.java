import java.util.Scanner;
public abstract class SanPham {
    protected String maSP;
    protected String tenSP;
    protected double donGia;
    protected int soLuong;
    public SanPham() {}
    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    // getter - setter
    public String getMaSP() {
        return maSP;
    }
    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }
    public String getTenSP() {
        return tenSP;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void nhap(Scanner sc) {
    System.out.print("Nhap ma san pham: ");
    maSP = sc.nextLine();

    System.out.print("Nhap ten san pham: ");
    tenSP = sc.nextLine();

    System.out.print("Nhap don gia: ");
    donGia = sc.nextDouble();
    sc.nextLine();

    System.out.print("Nhap so luong: ");
    soLuong = sc.nextInt();
    sc.nextLine();
}
    //Abstract 
    public abstract double tinhGiaBan();
    public void xuat() {
        System.out.println(this.toString());
    }
    // toString() — chuyển đối tượng thành chuỗi
    @Override
    public String toString() {
        return  "Ma SP: " + maSP +
                "\nTen SP: " + tenSP +
                ", DonGia: " + String.format("%,.0f", donGia) + " VND" +
                "\nSo luong: " + soLuong;
    }
}