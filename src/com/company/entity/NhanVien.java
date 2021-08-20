package com.company.entity;
import java.util.Scanner;
public class NhanVien extends CanBo{
    private String congViec;
    public NhanVien(){

    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec){
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.congViec = congViec;

    }

}
