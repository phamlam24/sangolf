package SAN_GOLF;

public class The {
    public int maThanhVien;
    public String tenThanhVien;
    public Date ngayGanNhat;
    public int tongTien;
    public String loaiThe;
    public TheVip theVip;
    public TheThanhVien theThanhVien;


    public The(){

    }
    public The(int ma, String ten, Date ngay, int tien){
        theThanhVien.maThanhVien = ma;
        theThanhVien.tenThanhVien = ten;
        theThanhVien.ngayGanNhat = ngay;
        theThanhVien.tongTien = tien;
        loaiThe = "ThanhVien";
    }

    public The(int ma, String ten, Date ngay, int tien,int nam){
        theVip.maThanhVien = ma;
        theVip.tenThanhVien = ten;
        theVip.ngayGanNhat = ngay;
        theVip.tongTien = tien;
        theVip.namVip = nam;
        loaiThe = "VIP";
    }
    public int xemMaThanhVien(){
        if(loaiThe=="ThanhVien") return theThanhVien.maThanhVien;
        else return theVip.maThanhVien;
    }
    public String xemTenThanhVien(){
        if(loaiThe=="ThanhVien") return theThanhVien.tenThanhVien;
        else return theVip.tenThanhVien;
    }
    public Date xemNgayGanNhat(){
        if(loaiThe=="ThanhVien") return theThanhVien.ngayGanNhat;
        else return theVip.ngayGanNhat;
    }
    public int xemTongTien(){
        if(loaiThe=="ThanhVien") return theThanhVien.tongTien;
        else return theVip.tongTien;
    }
    public int xemSoNamVIP(){
        return theVip.namVip;
    }
    public void xoaTien(){
        tongTien = 0;
    }
    public void chuyenTheThanhVien(){
        loaiThe = "ThanhVien";
        theThanhVien = new TheThanhVien(theVip.maThanhVien, theVip.tenThanhVien, theVip.ngayGanNhat, theVip.tongTien);
        theVip = new TheVip();
        xoaTien();
    }
    public void chuyenTheVip(){
        loaiThe = "VIP";
        theVip = new TheVip(theThanhVien.maThanhVien,theThanhVien.tenThanhVien,theThanhVien.ngayGanNhat,theThanhVien.tongTien,1);
        theThanhVien = new TheThanhVien();
    }

    void inThongTinRaw(){
        System.out.println("Ma thanh vien: " + Integer.toString(maThanhVien));
        System.out.println("Ten thanh vien: " + tenThanhVien);
        System.out.print("Ngay gan nhat su dung: ");
        ngayGanNhat.PrintDate();
        System.out.println("Tong tien su dung: " + Integer.toString(tongTien));
    }
    public void inThongTin(){
        if(loaiThe == "ThanhVien") theThanhVien.inThongTin();
        else theVip.inThongTin();
    }

    public void themTien(int soLuong, Date ngayHienTai){
        if(loaiThe =="ThanhVien") theThanhVien.themTien(soLuong, ngayHienTai);
        else theVip.themTien(soLuong, ngayHienTai);
        if(loaiThe =="ThanhVien"){
            theThanhVien.tongTien += soLuong;
            theThanhVien.ngayGanNhat = ngayHienTai;
            if(theThanhVien.tongTien >= 500) chuyenTheVip();
        }
        else{
            double phanTramThuong = Math.max(theVip.namVip * 2.0d / 100.0d, 0.2);
            theVip.tongTien += soLuong*phanTramThuong;
            theVip.ngayGanNhat = ngayHienTai;
        }
    }

}