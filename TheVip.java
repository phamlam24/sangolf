package SAN_GOLF;

public class TheVip extends The {
    public int namVip;
    TheVip(){

    }
    TheVip(int ma, String ten, Date ngay, int tien,int nam){
        maThanhVien = ma;
        tenThanhVien = ten;
        ngayGanNhat = ngay;
        tongTien = tien;
        namVip = nam;
    }
    public void inThongTin(){
        super.inThongTinRaw();
        System.out.println("So nam la VIP: " + Integer.toString(namVip));
    }

    public void themTien(int soLuong,Date ngayHienTai){
        Date hieuNgay = ngayHienTai.khacBiet(ngayGanNhat);
        if(hieuNgay.year>0 && (hieuNgay.month>0 || (hieuNgay.month==0 && hieuNgay.day > 0))){
            super.chuyenTheThanhVien();
        }
        
    }
}
