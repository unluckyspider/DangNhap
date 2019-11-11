/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangnhapcuoiky;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author LENOVO
 */
public class LayKetNoi {
    public static Connection layKetNoi(){
        Connection ketNoi = null;
        String uRL = "jdbc:sqlserver://;databaseName=DANGNHAP";
        String userName = "sa";
        String passWord = "123456";
        try{
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketNoi = DriverManager.getConnection(uRL, userName, passWord);
            System.out.println("Ket noi thanh cong");
        }
        catch (Exception e) {
            System.out.println("Ket noi khong thanh cong" + e);
        }

        return ketNoi;
    }
    
    public static void main(String[] args) {
        LayKetNoi cc =new LayKetNoi();
        cc.layKetNoi();
    }
}
