import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class QuanLyCuaHang implements IReadWrite {
    private ArrayList<SanPham> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        System.out.println("1. San pham thuc pham");
        System.out.println("2. San pham dien tu");
        System.out.print("Chon loai: ");
        int loai = Integer.parseInt(sc.nextLine());
        SanPham sp = null;
        if (loai == 1) sp = new SanPhamThucPham();
        else if (loai == 2) sp = new SanPhamDienTu();
        else {
            System.out.println("Loai khong hop le!");
            return;
        }
        sp.nhap(sc);
        ds.add(sp);
        System.out.println("Da them san pham!");
    }
    public void xuat() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        System.out.println("== DANH SACH SAN PHAM ==");
        for (SanPham sp : ds) {
            System.out.println(sp);
            System.out.println("------------------");
        }
    }
    public void them() {
    System.out.println("1. San pham thuc pham");
    System.out.println("2. San pham dien tu");
    System.out.print("Chon loai: ");
    int loai = Integer.parseInt(sc.nextLine());

    SanPham sp = null;

    if (loai == 1) {
        sp = new SanPhamThucPham();
    } else if (loai == 2) {
        sp = new SanPhamDienTu();
    } else {
        System.out.println("Loai khong hop le!");
        return;
    }

    sp.nhap(sc);  // gọi hàm nhập riêng của từng loại
    ds.add(sp);
    System.out.println(" Them san pham thanh cong!");
}
    public SanPham timTheoMa(String ma) {
        for (SanPham sp : ds) {
            if (sp.getMaSP().equalsIgnoreCase(ma)) {
                return sp;
            }
        }
        return null;
    }
    public void xoaTheoMa(String ma) {
        SanPham sp = timTheoMa(ma);
        if (sp != null) {
            ds.remove(sp);
            System.out.println("Da xoa san pham ma: " + ma);
        } else System.out.println("Khong tim thay ma san pham!");
    }
    public void capNhatTheoMa(String ma) {
        SanPham sp = timTheoMa(ma);
        if (sp == null) {
            System.out.println("Khong tim thay san pham!");
            return;
        }
        System.out.print("Gia moi: ");
        sp.setDonGia(Double.parseDouble(sc.nextLine()));
        System.out.print("So luong moi: ");
        sp.setSoLuong(Integer.parseInt(sc.nextLine()));
        System.out.println(" Cap nhat thanh cong!");
    }
    public void thongKe() {
        System.out.println("Tong so san pham: " + ds.size());
    }
    public double tinhTongDoanhThu() {
        double sum = 0;
        for (SanPham sp : ds) {
            sum += sp.tinhGiaBan() * sp.getSoLuong();
        }
        return sum;
    }
    @Override
    public void writeData() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
            for (SanPham sp : ds) {
                bw.write(sp.toString());
                bw.newLine();
                bw.write("------------------------------");
                bw.newLine();
            }
            bw.close();
            System.out.println(" Ghi file thanh cong!");
        } catch (Exception e) {
            System.out.println("Loi ghi file!");
        }
    }
    @Override
    public void readData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));

            String line;
            System.out.println("== DU LIEU TU FILE ==");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Loi doc file!");
        }
    }
}