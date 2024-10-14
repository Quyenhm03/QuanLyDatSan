/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.List;

public class BuoiThueSan39 {
    private int id;
    private String maBuoiThue;
    private Date ngayThue, gioNhan, gioTra;
    private List<MatHangSuDung39> mhSuDung;
    private float tienThue;

    public BuoiThueSan39() {
    }

    public BuoiThueSan39(int id, String maBuoiThue, Date ngayThue, Date gioNhan, 
            Date gioTra, List<MatHangSuDung39> mhSuDung, float tienThue) {
        this.id = id;
        this.maBuoiThue = maBuoiThue;
        this.ngayThue = ngayThue;
        this.gioNhan = gioNhan;
        this.gioTra = gioTra;
        this.mhSuDung = mhSuDung;
        this.tienThue = tienThue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaBuoiThue() {
        return maBuoiThue;
    }

    public void setMaBuoiThue(String maBuoiThue) {
        this.maBuoiThue = maBuoiThue;
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }

    public Date getGioNhan() {
        return gioNhan;
    }

    public void setGioNhan(Date gioNhan) {
        this.gioNhan = gioNhan;
    }

    public Date getGioTra() {
        return gioTra;
    }

    public void setGioTra(Date gioTra) {
        this.gioTra = gioTra;
    }

    public List<MatHangSuDung39> getMhSuDung() {
        return mhSuDung;
    }

    public void setMhSuDung(List<MatHangSuDung39> mhSuDung) {
        this.mhSuDung = mhSuDung;
    }

    public float getTienThue() {
        return tienThue;
    }
}
