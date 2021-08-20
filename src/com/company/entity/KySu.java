package com.company.entity;

import java.awt.*;
import java.util.Scanner;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu(){

    }
    public KySu (String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao){
        super(hoTen,ngaySinh,gioiTinh,diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }


}
