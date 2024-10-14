/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class HoaDonNhapMatHang39 {
    private int id;
    private MatHang39 matHang;
    private int soLuong;
    private float donGia;

    public HoaDonNhapMatHang39() {
    }

    public HoaDonNhapMatHang39(int id, MatHang39 matHang, int soLuong, float donGia) {
        this.id = id;
        this.matHang = matHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MatHang39 getMatHang() {
        return matHang;
    }

    public void setMatHang(MatHang39 matHang) {
        this.matHang = matHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
}
