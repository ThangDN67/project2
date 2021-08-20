package com.company.service;
import com.company.entity.CanBo;
import com.company.entity.CongNhan;
import com.company.entity.KySu;
import com.company.entity.NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {

    private ArrayList<CanBo> dscb;

    public QLCB(){
        dscb = new ArrayList<CanBo>(100);
    }

    public void addCanBo(CanBo cb){

        dscb.add(cb);
    }

    public void timCanBo(String hoTen){
        for (CanBo cb: dscb){
            if (hoTen.equals(cb.getHoTen())){
                cb.hienThiThongTin();
            }
            else
                System.out.println("Khong co can bo phu hop!!!");
        }
    }

    public void nhapDanhSach(Scanner sc){
        CanBo cb;
        System.out.print("Nhap vao so luong can bo: ");
        int n = sc.nextInt(); sc.nextLine();

        System.out.println("Nhap thong tin can bo: ");
        for (int i = 0; i<n;i++){
            System.out.println("Nhap nhan vien thu "+(i+1)+":");
            System.out.println("Chon nghe nghiep: ");
            System.out.println("1. Ky Su");
            System.out.println("2. Nhan Vien");
            System.out.println("3. Cong Nhan");
            int chon = sc.nextInt(); sc.nextLine();// loai bo khoang trang du thua, cach tab enter
            cb = new CanBo();

            switch (chon){
                case 1:
                    cb = new KySu();
                    break;
                case 2:
                    cb = new NhanVien();
                    break;
                case 3:
                    cb = new CongNhan();
                    break;
                default:
                    System.out.println("Khong co lua chon phu hop!!!");
                    //System.out.println("Vui long nhap lai!!!");
                    System.exit(0);

            }
            cb.nhapThongTin(sc); //dac diem ke thua
            addCanBo(cb);
        }
    }
}
