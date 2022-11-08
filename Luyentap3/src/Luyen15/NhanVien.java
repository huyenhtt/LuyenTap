/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luyen15;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private int id;
    private String ma;
    private String ten;
    private String sdt;
    private int tuoi;
    private int vtro;

    public NhanVien() {
    }

    public NhanVien(int id, String ma, String ten, String sdt, int tuoi, int vtro) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.tuoi = tuoi;
        this.vtro = vtro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getVtro() {
        return vtro;
    }

    public void setVtro(int vtro) {
        this.vtro = vtro;
    }
    
}
