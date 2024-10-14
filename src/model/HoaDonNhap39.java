/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.List;

public class HoaDonNhap39 {
    private int id;
    private String maHoaDonNhap;
    private Date ngayNhap;
    private List<HoaDonNhapMatHang39> mhNhap;
    private NguoiDung39 nguoiDung;
    private NhaCungCap39 nhaCungCap;

    public HoaDonNhap39() {
    }

    public HoaDonNhap39(int id, String maHoaDonNhap, Date ngayNhap, List<HoaDonNhapMatHang39> 
            mhNhap, NguoiDung39 nguoiDung, NhaCungCap39 nhaCungCap) {
        this.id = id;
        this.maHoaDonNhap = maHoaDonNhap;
        this.ngayNhap = ngayNhap;
        this.mhNhap = mhNhap;
        this.nguoiDung = nguoiDung;
        this.nhaCungCap = nhaCungCap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaHoaDonNhap() {
        return maHoaDonNhap;
    }

    public void setMaHoaDonNhap(String maHoaDonNhap) {
        this.maHoaDonNhap = maHoaDonNhap;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public List<HoaDonNhapMatHang39> getMhNhap() {
        return mhNhap;
    }

    public void setMhNhap(List<HoaDonNhapMatHang39> mhNhap) {
        this.mhNhap = mhNhap;
    }

    public NguoiDung39 getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung39 nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    public NhaCungCap39 getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap39 nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }
}
