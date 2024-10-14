/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

public class SanBong39 {
    private int id;
    private String maSanBong, tenSanBong, diaChi, chuSan;
    private List<SanCon39> sanCon;

    public SanBong39() {
    }

    public SanBong39(int id, String maSanBong, String tenSanBong, String diaChi,
            String chuSan, List<SanCon39> sanCon) {
        this.id = id;
        this.maSanBong = maSanBong;
        this.tenSanBong = tenSanBong;
        this.diaChi = diaChi;
        this.chuSan = chuSan;
        this.sanCon = sanCon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSanBong() {
        return maSanBong;
    }

    public void setMaSanBong(String maSanBong) {
        this.maSanBong = maSanBong;
    }

    public String getTenSanBong() {
        return tenSanBong;
    }

    public void setTenSanBong(String tenSanBong) {
        this.tenSanBong = tenSanBong;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getChuSan() {
        return chuSan;
    }

    public void setChuSan(String chuSan) {
        this.chuSan = chuSan;
    }

    public List<SanCon39> getSanCon() {
        return sanCon;
    }

    public void setSanCon(List<SanCon39> sanCon) {
        this.sanCon = sanCon;
    }
}
