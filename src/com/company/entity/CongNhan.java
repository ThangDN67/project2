package com.company.entity;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private String bac;

    public CongNhan(){

    }
    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac){
        super(hoTen,ngaySinh,gioiTinh,diaChi);
        this.bac = bac;

    }


}
