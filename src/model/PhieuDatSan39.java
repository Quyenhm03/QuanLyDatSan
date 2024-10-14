/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

public class PhieuDatSan39 {
    private int id;
    private String maPhieuDatSan;
    private Date ngayLapPhieu, khungGioBatDau, khungGioKetThuc, ngayBatDau, ngayKetThuc;
    private int soBuoiTrenTuan;
    private float donGia, tienDatCoc;
    private SanCon39 sanCon;
    private KhachHang39 khachHang;
    private BuoiThueSan39 buoiThueSan;

    public PhieuDatSan39() {
    }

    public PhieuDatSan39(Date ngayLapPhieu, Date khungGioBatDau, Date khungGioKetThuc, 
            Date ngayBatDau, Date ngayKetThuc, int soBuoiTrenTuan, float donGia, 
            float tienDatCoc, SanCon39 sanCon, KhachHang39 khachHang) {
        this.ngayLapPhieu = ngayLapPhieu;
        this.khungGioBatDau = khungGioBatDau;
        this.khungGioKetThuc = khungGioKetThuc;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.soBuoiTrenTuan = soBuoiTrenTuan;
        this.donGia = donGia;
        this.tienDatCoc = tienDatCoc;
        this.sanCon = sanCon;
        this.khachHang = khachHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaPhieuDatSan() {
        return maPhieuDatSan;
    }

    public void setMaPhieuDatSan(String maPhieuDatSan) {
        this.maPhieuDatSan = maPhieuDatSan;
    }

    public Date getNgayLapPhieu() {
        return ngayLapPhieu;
    }

    public void setNgayLapPhieu(Date ngayLapPhieu) {
        this.ngayLapPhieu = ngayLapPhieu;
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

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getSoBuoiTrenTuan() {
        return soBuoiTrenTuan;
    }

    public void setSoBuoiTrenTuan(int soBuoiTrenTuan) {
        this.soBuoiTrenTuan = soBuoiTrenTuan;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(float tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public SanCon39 getSanCon() {
        return sanCon;
    }

    public void setSanCon(SanCon39 sanCon) {
        this.sanCon = sanCon;
    }

    public KhachHang39 getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang39 khachHang) {
        this.khachHang = khachHang;
    }

    public BuoiThueSan39 getBuoiThueSan() {
        return buoiThueSan;
    }

    public void setBuoiThueSan(BuoiThueSan39 buoiThueSan) {
        this.buoiThueSan = buoiThueSan;
    }
}
