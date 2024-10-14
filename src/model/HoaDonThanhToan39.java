/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

public class HoaDonThanhToan39 {
    private int id;
    private String maHoaDon;
    private Date ngayThanhToan;
    private float tienThanhToan;
    private PhieuDatSan39 phieuDatSan;

    public HoaDonThanhToan39() {
    }

    public HoaDonThanhToan39(int id, String maHoaDon, Date ngayThanhToan, 
            float tienThanhToan, PhieuDatSan39 phieuDatSan) {
        this.id = id;
        this.maHoaDon = maHoaDon;
        this.ngayThanhToan = ngayThanhToan;
        this.tienThanhToan = tienThanhToan;
        this.phieuDatSan = phieuDatSan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public float getTienThanhToan() {
        return tienThanhToan;
    }

    public void setTienThanhToan(float tienThanhToan) {
        this.tienThanhToan = tienThanhToan;
    }

    public PhieuDatSan39 getPhieuDatSan() {
        return phieuDatSan;
    }

    public void setPhieuDatSan(PhieuDatSan39 phieuDatSan) {
        this.phieuDatSan = phieuDatSan;
    }
}
