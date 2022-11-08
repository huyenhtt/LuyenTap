/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luyen15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class NvRepository {

    public String chackMa(String ma) {
        String text = null;
        try {
            Connection conn = JdbcUntil.getConnection();
            String sql = "Select ma_nv from nhan_vien Where ma_nv=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
             
                text = rs.getString("ma_nv");

            }
            return text;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<NhanVien> all() {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection conn = JdbcUntil.getConnection();
            String sql = "Select * from nhan_vien";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ma = rs.getString("ma_nv");
                String ten = rs.getString("ten");
                String sdt = rs.getString("sdt");
                int tuoi = rs.getInt("tuoi");
                int vtro = rs.getInt("vai_tro");
                NhanVien nv = new NhanVien(id, ma, ten, sdt, tuoi, vtro);
                list.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NvRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void insert(NhanVien nv) {
        try {
            Connection conn = JdbcUntil.getConnection();
            String sql = "Insert into nhan_vien " + "(ma_nv,ten,sdt,tuoi,vai_tro)" + " values(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMa());
            ps.setString(2, nv.getTen());
            ps.setString(3, nv.getSdt());
            ps.setInt(4, nv.getTuoi());
            ps.setInt(5, nv.getVtro());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NvRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void update(String ma, NhanVien nv) {
        try {
            Connection conn = JdbcUntil.getConnection();
            String sql = "Update nhan_vien set ten=?,sdt=?,tuoi=?,vai_tro=? where ma_nv=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(5, ma);
            ps.setString(1, nv.getTen());
            ps.setString(2, nv.getSdt());
            ps.setInt(3, nv.getTuoi());
            ps.setInt(4, nv.getVtro());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NvRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete(String ma) {
        try {
            Connection conn = JdbcUntil.getConnection();
            String sql = "Delete from nhan_vien where ma_nv=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NvRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
