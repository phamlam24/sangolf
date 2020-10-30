package SAN_GOLF;

import java.util.ArrayList;

public class sanGolf {
    public static ArrayList<The> cacThe = new ArrayList<The>();
    static Date ngayHienTai = new Date(24,10,2020);
    public static void themTienVaoThe(int soLuong, String ten){
        boolean ok = false;
        for(The the : cacThe){
            if(the.tenThanhVien == ten){
                the.themTien(soLuong, ngayHienTai);
                ok = true;
                System.out.println("Da them " + Integer.toString(soLuong) + " vao the cua " + ten);
            }
        }
        if(!ok) System.out.println("Khong tim thay nguoi dung!");
    }

    public static void chuyenThe(){
        for(The the : cacThe){
            Date ganNhat = the.xemNgayGanNhat();
            if(ngayHienTai.year > ganNhat.year && ((ngayHienTai.month > ganNhat.month) || (ngayHienTai.month == ganNhat.month && ngayHienTai.day > ganNhat.day))){
                if(the.loaiThe=="VIP") the.chuyenTheThanhVien();
                else the.xoaTien();
            }
        }
    }
    public static void inThongTin(){
        for(The the : cacThe){
            the.inThongTin();
            System.out.println();
        }
    }
    public static void main(String[] args){
        cacThe.add(new The());
        cacThe.add(new The(1,"Pham Tung Lam",new Date(6,10,2020),113));
        cacThe.add(new The(2,"Nguyen X",new Date(1,1,2020),566,3));
        cacThe.add(new The(5,"Lan Y",new Date(6,10,2018),113));
        cacThe.add(new The(234,"A",new Date(6,10,2017),5652535,4));
        cacThe.add(new The(123412,"dD",new Date(6,10,2020),56256,1));
        cacThe.add(new The(0,"",new Date(6,10,2020),43413,33));
        inThongTin();
        themTienVaoThe(250, "Nguyen X");
        themTienVaoThe(450, "Pham Tung Lam");
        themTienVaoThe(1, "A");
        themTienVaoThe(1, "f");
        inThongTin();
        chuyenThe();
        inThongTin();
    }
}
