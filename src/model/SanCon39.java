/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

public class SanCon39 {
    private int id;
    private String maSan, tenSan, loaiSan;
    private Date khungGioBatDau, khungGioKetThuc;
    private float donGia;
    private String trangThai;

    public SanCon39() {
    }

    public SanCon39(int id, String maSan, String tenSan, String loaiSan, Date 
        khungGioBatDau, Date khungGioKetThuc, float donGia, String trangThai) {
        this.id = id;
        this.maSan = maSan;
        this.tenSan = tenSan;
        this.loaiSan = loaiSan;
        this.khungGioBatDau = khungGioBatDau;
        this.khungGioKetThuc = khungGioKetThuc;
        this.donGia = donGia;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSan() {
        return maSan;
    }

    public void setMaSan(String maSan) {
        this.maSan = maSan;
    }

    public String getTenSan() {
        return tenSan;
    }

    public void setTenSan(String tenSan) {
        this.tenSan = tenSan;
    }

    public String getLoaiSan() {
        return loaiSan;
    }

    public void setLoaiSan(String loaiSan) {
        this.loaiSan = loaiSan;
    }

    public Date getKhungGioBatDau() {
        return khungGioBatDau;
    }

    public void setKhungGioBatDau(Date khungGioBatDau) {
        this.khungGioBatDau = khungGioBatDau;
    }

    public Date getKhungGioKetThuc() {
        return khungGioKetThuc;
    }

    public void setKhungGioKetThuc(Date khungGioKetThuc) {
        this.khungGioKetThuc = khungGioKetThuc;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }   
}
