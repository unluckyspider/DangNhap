/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangnhapcuoiky;

import java.util.Vector;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class DanhSach {
    public Vector<NguoiDung> vector = new Vector<NguoiDung>();
    
    public void LayThongTin(){
    Connection ketNoi=LayKetNoi.layKetNoi();
    String sql= "SELECT SDT,EMAIL,FB,MATKHAU from ND";
    
    try{
        PreparedStatement ps = ketNoi.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            NguoiDung nD = new NguoiDung();
            
            nD.setSDT(rs.getString("SDT"));
            nD.setEmail(rs.getString("EMAIL"));
            nD.setFB(rs.getString("FB"));
            nD.setMK(rs.getString("MATKHAU"));
            vector.add(nD);
        }
        rs.close();
        ps.close();
        ketNoi.close();
    }
    catch(SQLException ex){
         Logger.getLogger(DanhSach.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    for(NguoiDung a:vector){
        System.out.println(a);
    }
    }
    
    public void LuuThongTin(String ten, String sdt, String email,String fb, String mk){
           Connection ketNoi = LayKetNoi.layKetNoi();
           String sql = "insert into ND values(?,?,?,?,?)";
           
           try{
           PreparedStatement ps = ketNoi.prepareStatement(sql);
           ps.setString(1, ten);
           ps.setString(2, sdt);
           ps.setString(3, email);
           ps.setString(4, fb);
           ps.setString(5, mk);
           ps.executeUpdate();
           }
           catch(SQLException ex){
               Logger.getLogger(DanhSach.class.getName()).log(Level.SEVERE, null, ex);
           } 
       
    }
    
    public boolean checkEmail(String email){
        LayThongTin();
        for(NguoiDung a:vector){
            if(email.equals(a.getEmail())==true)
                return false;
        }
        return true;
    }
    public boolean checkFB(String fb){
        LayThongTin();
        for(NguoiDung a:vector){
            if(fb.equals(a.getFB())==true)
                return false;
        }
        return true;
    }
    public boolean checkSDT(String SDT){
        LayThongTin();
        for(NguoiDung a:vector){
            if(SDT.equals(a.getSDT())==true)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        DanhSach i =new DanhSach();
        i.LayThongTin();
    }
            

    
}
