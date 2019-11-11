
import java.util.Vector;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random; 
import javax.swing.table.DefaultTableModel;
import java.awt.Choice;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class DanhSach {
    public Vector<HocVien> vector = new Vector<HocVien>();
    
    public void LayThongTin(){
    Connection ketNoi=LayKetNoi.layKetNoi();
    String sql= "SELECT MANV,HOTEN,NGAYSINH,PHONGBAN,GIOITINH,GHICHU from NHANVIEN";
    
    try{
        PreparedStatement ps = ketNoi.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            HocVien nD = new HocVien();
            
            nD.setMaNV(rs.getString("MANV"));
            nD.setTen(rs.getString("HOTEN"));
            nD.setNgaySinh(rs.getDate("NGAYSINH"));
            nD.setPhongBan(rs.getString("PHONGBAN"));
            nD.setGioiTinh(rs.getString("GIOITINH"));
            nD.setGhiChu(rs.getString("GHICHU"));
            vector.add(nD);
            System.out.println(nD.getNgaySinh());
        }
        rs.close();
        ps.close();
        ketNoi.close();
    }
    catch(SQLException ex){
         Logger.getLogger(DanhSach.class.getName()).log(Level.SEVERE, null, ex);
    }
    for(HocVien i:vector){
        System.out.println(i);
    }
    }
    
    public void LuuThongTin(String hoTen, String ngaySinh, String phongBan, String gioiTinh, String ghiChu){
        Connection ketNoi = LayKetNoi.layKetNoi();
        String sql = "insert into NHANVIEN values(?,?,?,?,?,?)";
        String maNV = KTMaNV();
        try {
            PreparedStatement ps =ketNoi.prepareStatement(sql);
            
            ps.setString(1, maNV);
            ps.setString(2, hoTen);
            ps.setString(3, ngaySinh);
            ps.setString(4, phongBan);
            ps.setString(5, gioiTinh);
            ps.setString(6, ghiChu);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(DanhSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String KTMaNV(){
        LayThongTin();
        Random rand = new Random();
        int rand_int = rand.nextInt(1000);
        String maNV = "NV"+rand_int;
        for(HocVien i:vector){
            if(i.getMaNV().equals(maNV)){
                rand_int = rand.nextInt(1000);
                maNV = "NV"+rand_int;
            }
        }
        return maNV;
    }
            
    public void Xoa(String ten){
        Connection ketNoi = LayKetNoi.layKetNoi();
        String sql = "delete from NHANVIEN where HOTEN=?";
        
        try {
            PreparedStatement ps =ketNoi.prepareStatement(sql);
            ps.setString(1, ten);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void Update(DefaultTableModel tableModel){
 //       tableModel.setRowCount(0);
        Connection ketNoi=LayKetNoi.layKetNoi();
    String sql= "SELECT MANV,HOTEN,NGAYSINH,PHONGBAN,GIOITINH,GHICHU from NHANVIEN";
    
    try{
        PreparedStatement ps = ketNoi.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){            
            
            String maNV=rs.getString("MANV");
            String ten = (rs.getString("HOTEN"));
            Date ngaySinh= rs.getDate("NGAYSINH");
            String phongBan = rs.getString("PHONGBAN");
            String gioiTinh = (rs.getString("GIOITINH"));
            String ghiChu = (rs.getString("GHICHU"));
            
            tableModel.addRow(new Object[]{
            maNV, ten,ngaySinh,phongBan,gioiTinh,ghiChu
        });
            
        }
        rs.close();
        ps.close();
        ketNoi.close();
    }
    catch(SQLException ex){
         Logger.getLogger(DanhSach.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public static void main(String[] args) {
        DanhSach i =new DanhSach();
        i.LayThongTin();
    }
    
}
