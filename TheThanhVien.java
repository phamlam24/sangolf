package SAN_GOLF;

class TheThanhVien extends The{
    TheThanhVien(){

    }
    TheThanhVien(int ma, String ten, Date ngay, int tien){
        maThanhVien = ma;
        tenThanhVien = ten;
        ngayGanNhat = ngay;
        tongTien = tien;
    }

    public void inThongTin(){
        super.inThongTinRaw();
    }

    public void themTien(int soLuong,Date ngayHienTai){
        Date hieuNgay = ngayHienTai.khacBiet(ngayGanNhat);
        if(hieuNgay.year>0 && (hieuNgay.month>0 || (hieuNgay.month==0 && hieuNgay.day > 0))){
            xoaTien();
        }
        tongTien += soLuong;
        ngayGanNhat = ngayHienTai;
        if(tongTien>=500){
            chuyenTheVip();
        }
    }
}
