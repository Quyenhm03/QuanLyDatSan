/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.KhachHang39;
import model.PhieuDatSan39;
import model.SanCon39;

public class QuanLyDatSanDAO39 {

   private Connection con;

    public QuanLyDatSanDAO39() {            
        String url = "jdbc:sqlserver://localhost:1433; databaseName=QuanLyDatSan;"
                + "user=sa;password=12345;"
                + "encrypt=true;trustServerCertificate=true";
            try {              
                con = DriverManager.getConnection(url);            
            } 
            catch (SQLException e) {
                e.printStackTrace();
            } 
    }
    
    public List<SanCon39> timSanTrong(Date khungGioBatDau, Date khungGioKetThuc, 
                                      String loaiSan){
        List<SanCon39> result = new ArrayList<>();

        String sql ="SELECT * " +
                    "FROM tblSanCon39 " +
                    "WHERE tblSanCon39.id NOT IN ( " +
                    "    SELECT tblSanCon39.id " +
                    "    FROM tblSanCon39 " +
                    "    INNER JOIN tblPhieuDatSan39 ON tblSanCon39.id = "
                    + "tblPhieuDatSan39.idSanCon39 WHERE ( " +
                    " (tblPhieuDatSan39.khungGioKetThuc > ? AND tblSanCon39.khungGioBatDau < ?) " +
                    " OR (tblSanCon39.khungGioKetThuc > ? AND tblPhieuDatSan39.khungGioBatDau < ?) " +
                    "    )" +
                    ") " +
                    "AND tblSanCon39.loaiSan = ? " +
                    "AND tblSanCon39.khungGioBatDau <= ? " +
                    "AND tblSanCon39.khungGioKetThuc >= ? ";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        try{
            PreparedStatement ps = con.prepareStatement(sql);           
            ps.setString(1, sdf.format(khungGioBatDau));
            ps.setString(2, sdf.format(khungGioKetThuc));
            ps.setString(3, sdf.format(khungGioBatDau));
            ps.setString(4, sdf.format(khungGioKetThuc)); 
            ps.setString(5, loaiSan);
            ps.setString(6, sdf.format(khungGioBatDau));
            ps.setString(7, sdf.format(khungGioKetThuc));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SanCon39 sc = new SanCon39();
                sc.setId(rs.getInt("id"));
                sc.setMaSan(rs.getString("maSan"));
                sc.setTenSan(rs.getString("tenSan"));
                sc.setLoaiSan(rs.getString("loaiSan"));           
                
                
                float donGiaSan = rs.getFloat("donGia");
                Time gioBatDau = rs.getTime("khungGioBatDau");
                Time gioKetThuc = rs.getTime("khungGioKetThuc");
                long gioThue = gioKetThuc.getTime() - gioBatDau.getTime();
                long khungGioThue = khungGioKetThuc.getTime() - khungGioBatDau.getTime();
                float donGia = donGiaSan / (gioThue / 1000) * (khungGioThue / 1000);
                
                sc.setKhungGioBatDau(new Time(khungGioBatDau.getTime()));
                sc.setKhungGioKetThuc(new Time(khungGioKetThuc.getTime()));
                sc.setDonGia(donGia);
                
                sc.setTrangThai("Đã đặt "+(new Time(khungGioBatDau.getTime())) + "-" + 
                        (new Time(khungGioKetThuc.getTime())));
                result.add(sc);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    
    public List<KhachHang39> timKhachHang(String tenKH){
        List<KhachHang39> result = new ArrayList<>();
        String sql = "SELECT * FROM tblKhachHang39 WHERE tenKH LIKE ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + tenKH + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                KhachHang39 kh = new KhachHang39();
                kh.setId(rs.getInt("id"));
                kh.setMaKH(rs.getString("maKH"));
                kh.setTenKH(rs.getString("tenKH"));
                kh.setDiaChi(rs.getString("diaChi"));
                kh.setSoDienThoai(rs.getString("soDienThoai"));
                result.add(kh);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    
    public void themKhachHang(KhachHang39 khachHang){
        String sql = "INSERT INTO tblKhachHang39(maKH, tenKH, diaChi, soDienThoai) VALUES(?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, khachHang.getMaKH());
            ps.setString(2, khachHang.getTenKH());
            ps.setString(3, khachHang.getDiaChi());
            ps.setString(4, khachHang.getSoDienThoai());
            ps.executeUpdate();
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                khachHang.setId(generatedKeys.getInt(1));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void themPhieuDatSan(PhieuDatSan39 phieuDatSan){
        String sql = "INSERT INTO tblPhieuDatSan39(maPhieuDatSan, ngayLapPhieu, khungGioBatDau, "
                + "khungGioKetThuc, ngayBatDau, ngayKetThuc, soBuoiTrenTuan, donGia, tienDatCoc, "
                + "idSanCon39, idKhachHang39) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        SimpleDateFormat sdft = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat sdfd = new SimpleDateFormat("yyyy-MM-dd");
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, "1");
            ps.setString(2, sdfd.format(phieuDatSan.getNgayLapPhieu()));
            ps.setString(3, sdft.format(phieuDatSan.getKhungGioBatDau()));
            ps.setString(4, sdft.format(phieuDatSan.getKhungGioKetThuc()));
            ps.setString(5, sdfd.format(phieuDatSan.getNgayBatDau()));
            ps.setString(6, sdfd.format(phieuDatSan.getNgayKetThuc()));
            ps.setInt(7, phieuDatSan.getSoBuoiTrenTuan());
            ps.setFloat(8, phieuDatSan.getDonGia());
            ps.setFloat(9, phieuDatSan.getTienDatCoc());
            ps.setInt(10, phieuDatSan.getSanCon().getId());
            ps.setInt(11, phieuDatSan.getKhachHang().getId());
            ps.executeUpdate();
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                int id = generatedKeys.getInt(1);
                String maPhieuDatSan = "PDS" + String.format("%03d", id);
                phieuDatSan.setMaPhieuDatSan(maPhieuDatSan);

                String updateMaPDS = "UPDATE tblPhieuDatSan39 SET maPhieuDatSan = ? WHERE id = ?";
                PreparedStatement updatePsPDS = con.prepareStatement(updateMaPDS);
                updatePsPDS.setString(1, maPhieuDatSan);
                updatePsPDS.setInt(2, id);
                updatePsPDS.executeUpdate();
                
                String updateTrangThaiSan = "UPDATE tblSanCon39 " +
                                            "SET trangThai = CASE " +
                                            "    WHEN trangThai IS NULL THEN ? + CHAR(13) + CHAR(10) " +
                                            "    ELSE CONCAT(trangThai, CHAR(13) + CHAR(10) + ? ) " +
                                            "    END " +
                                            "WHERE id = ? ";
                PreparedStatement updatePsTT = con.prepareStatement(updateTrangThaiSan);
                updatePsTT.setString(1, phieuDatSan.getSanCon().getTrangThai());
                updatePsTT.setString(2, phieuDatSan.getSanCon().getTrangThai());
                updatePsTT.setInt(3, phieuDatSan.getSanCon().getId());
                updatePsTT.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
