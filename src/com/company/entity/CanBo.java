package com.company.entity;

import java.util.Scanner;

public class CanBo {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;

    public CanBo() {
    }

    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void nhapThongTin(Scanner sc){
        System.out.print("\t Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("\t Nhap ngay sinh (dd/MM/yyyy): ");
        ngaySinh = sc.nextLine();
        System.out.print("\t Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("\t Nhap dia chi: ");
        diaChi = sc.nextLine();

    }
    public void hienThiThongTin(){
        System.out.println("\tHo ten: " + hoTen);
        System.out.println("\tNgay sinh: " + ngaySinh);
        System.out.println("\tGioi tinh: " + gioiTinh);
        System.out.println("\tDia chi: " + diaChi);
    }

}

