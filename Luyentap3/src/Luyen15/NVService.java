/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luyen15;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NVService {
    private NvRepository repo;

    public NVService() {
        this.repo=new NvRepository();
    }
    public ArrayList<NhanVien> getList(){
    return this.repo.all();
    }
    public void insert(NhanVien nv){
    this.repo.insert(nv);
    }
    public void delete(String ma){
    this.repo.delete(ma);
    }
    public void update(String ma,NhanVien nv){
    this.repo.update(ma, nv);
    }
    public String checckMA(String ma){
    return this.repo.chackMa(ma);
    }
}
