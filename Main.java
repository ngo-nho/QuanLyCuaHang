import java.util.Scanner;
public class Main {
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
        QuanLyCuaHang ql = new QuanLyCuaHang();
        int chon;
        do {
            System.out.println("\n== MENU QUAN LY CUA HANG ==");
            System.out.println("1. Nhap san pham");
            System.out.println("2. Xuat danh sach san pham");
            System.out.println("3. Them san pham");
            System.out.println("4. Tim san pham theo ma");
            System.out.println("5. Xoa san pham theo ma");
            System.out.println("6. Cap nhat gia, so luong san pham theo ma");
            System.out.println("7. Thong ke so luong san pham");
            System.out.println("8. Tinh tong doanh thu");
            System.out.println("9. Ghi du lieu ra file");
            System.out.println("10. Doc du lieu tu file");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    ql.nhap();
                    break;

                case 2:
                    ql.xuat();
                    break;

                case 3: 
                    ql.them();
                    break;
                
                case 4: {
                    System.out.print("Nhap ma san pham can tim: ");
                    String ma = sc.nextLine();

                    SanPham sp = ql.timTheoMa(ma);
                    if (sp != null) {
                        System.out.println("=== Tim thay ===");
                        System.out.println(sp);
                    } else {
                        System.out.println("Khong tim thay san pham!");
                    }
                    break;
                }
                case 5: {
                    System.out.print("Nhap ma can xoa: ");
                    String ma = sc.nextLine();
                    ql.xoaTheoMa(ma);
                    break;
                }
                case 6: {
                    System.out.print("Nhap ma can cap nhat: ");
                    String ma = sc.nextLine();
                    ql.capNhatTheoMa(ma);
                    break;
                }
                case 7:
                    ql.thongKe();
                    break;
                case 8:
                    System.out.println("Tong doanh thu = " + String.format("%,.0f", ql.tinhTongDoanhThu()) + " VND");

                    break;
                case 9:
                    ql.writeData();
                    break;
                case 10:
                    ql.readData();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
        }
   }
}