import java.util.Scanner;

/**
 * NhanVien
 */
public class NhanVien {

    private int maso;
    private String hoten;
    private int luongcoban;
    private double hesoluong;

    public int getMaso() {
        return this.maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return this.hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getLuongcoban() {
        return this.luongcoban;
    }

    public void setLuongcoban(int luongcoban) {
        this.luongcoban = luongcoban;
    }

    public double getHesoluong() {
        return this.hesoluong;
    }

    public void setHesoluong(float hesoluong) {
        this.hesoluong = hesoluong;
    }

    public NhanVien() {
        this(0, "", 0, 0.0w);
    }

    public NhanVien(int maso, String hoten, int luongcoban, Double hesoluong) {
        this.maso = maso;
        this.hoten = hoten;
        this.luongcoban = luongcoban;
        this.hesoluong = hesoluong;
    }

    public NhanVien(NhanVien obj) {
        this.maso = obj.maso;
        this.hoten = obj.hoten;
        this.luongcoban = obj.luongcoban;
        this.hesoluong = obj.hesoluong;
    }

    public void nhap1nv() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so nhan vien  : ");
        this.maso = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten nhan vien : ");
        this.hoten = sc.nextLine();
        System.out.println("Nhap luong co ban : ");
        this.luongcoban = sc.nextInt();
        System.out.println("Nhap he so luong : ");
        this.hesoluong = sc.nextDouble();
    }

    public void xuat1nv() {
        System.out.println("Xuat thong tin nhan vien : ");
        System.out.println("Maso : " + this.maso);
        System.out.println("Ho ten : " + this.hoten);
        System.out.println("Luong co ban : " + this.luongcoban);
        System.out.println("He so luong : " + this.hesoluong);
    }

    public void doiten() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten moi : ");
        this.hoten = sc.nextLine();
    }

    public void maxhsl(NhanVien nv2, NhanVien nv3) {
        if (this.hesoluong == nv2.hesoluong && this.hesoluong == nv3.hesoluong) {
            System.out.println("Ba nhan vien co he so luong bang nhau!");
        } else {
            if (this.hesoluong > nv2.hesoluong && this.hesoluong > nv3.hesoluong) {
                System.out.println("Xuat thong tin nhan vien : ");
                System.out.println("Maso : " + this.maso);
                System.out.println("Ho ten : " + this.hoten);
                System.out.println("Luong co ban : " + this.luongcoban);
                System.out.println("He so luong : " + this.hesoluong);
            } else if (nv2.hesoluong > nv3.hesoluong) {
                nv2.xuat1nv();
            } else {
                nv3.xuat1nv();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv1 = new NhanVien();
        nv1.nhap1nv();
        nv1.xuat1nv();
        nv1.doiten();
        nv1.xuat1nv();
        NhanVien nv2 = new NhanVien(2, "vu", 7000000, 1.25);
        NhanVien nv3 = new NhanVien(3, "van a", 7350000, 1.5);
        System.out.println("Nhan vien co he so luong lon nhat : ");
        nv1.maxhsl(nv2, nv3);
    }
}