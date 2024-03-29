
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class TEST extends javax.swing.JFrame {
    DanhSach ds = new DanhSach();
    DefaultTableModel model;
    public TEST() {

        initComponents();
        taoCot();
        ds.Update(model);
        ds.LayThongTin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void taoCot(){
    model=(DefaultTableModel) jTable1.getModel();    
        model.addColumn("mã NV");
        model.addColumn("Họ tên");
        model.addColumn("Ngày sinh");
        model.addColumn("Phòng ban");
        model.addColumn("Giới tính");
        model.addColumn("Ghi chú");
            }
    public void themHang(Object[] object){
    model.addRow(object);
        
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_PhongBan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_GioiTinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_GhiChu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Họ tên");

        jLabel2.setText("Ngày sinh");

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xoá");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sửa");

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setText("Phòng ban");

        jLabel5.setText("Giới tính");

        jLabel6.setText("Ghi chú");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_GhiChu)
                    .addComponent(jTextField_GioiTinh)
                    .addComponent(jTextField_PhongBan)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_PhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_GhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int hoTen=0,ngaySinh=0,phongBan=0,ghiChu=0;
        if(jTextField1.getText().isEmpty()){ 
            hoTen=1;
            JOptionPane.showMessageDialog(rootPane, "Không được để trống họ tên");
            jTextField1.requestFocus();
        }   else
        if(jTextField2.getText().isEmpty()){ 
             hoTen=0;
            JOptionPane.showMessageDialog(rootPane, "Không được để trống ngày sinh");
            jTextField2.requestFocus();
            ngaySinh=1;
        }   else
        if(kiemTraNS(jTextField2.getText())==false){
            JOptionPane.showMessageDialog(rootPane, "Không đúng định dạng YYYY/MM/DD");
            jTextField2.requestFocus();
            ngaySinh=1;
        }   else
       
        if(jTextField_PhongBan.getText().isEmpty()){
             ngaySinh=0;
            JOptionPane.showMessageDialog(rootPane, "Không được để trống phòng ban");
            jTextField_PhongBan.requestFocus();
            phongBan=1;
        }
        else
        if(jTextField_GhiChu.getText().isEmpty()){
             phongBan=0;
            JOptionPane.showMessageDialog(rootPane, "Không được để trống ghi chú");
            jTextField_GhiChu.requestFocus();
            ghiChu=1;
        }   else ghiChu=0;
        if(hoTen==0&&phongBan==0&&ngaySinh==0&&ghiChu==0){  
//            themHang(new Object[]{
//                jTextField1.getText(),jTextField2.getText(),jTextField_PhongBan.getText(),jTextField_GioiTinh.getText(),jTextField_GhiChu.getText()
//            });
            ds.LuuThongTin(jTextField1.getText(), jTextField2.getText(), jTextField_PhongBan.getText(), jTextField_GioiTinh.getText(), jTextField_GhiChu.getText());
            JOptionPane.showMessageDialog(rootPane, "them thanh cong");
            ds.Update(model);
        }
        
      //  HocVien hv=new HocVien(jTextField1.getText(),Date.parse(jTextField2.getText()));
        
    }//GEN-LAST:event_jButton1ActionPerformed
    public boolean kiemTraNS(String ns){
        Pattern nsPattern=Pattern.compile("((19|20)\\d\\d)/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])");
        Matcher nsMatcher=nsPattern.matcher(ns);
        if(nsMatcher.matches()){
            nsMatcher.reset();
            if(nsMatcher.find()){
                String ngay=nsMatcher.group(1);
                String thang=nsMatcher.group(2);
                int nam=Integer.parseInt(nsMatcher.group(3));
                if ("31".equals(ngay) && 
                  ("4".equals(thang) || "6".equals(thang) || "9".equals(thang) ||
                   "11".equals(thang) || "04".equals(thang) || "06".equals(thang) || 
                   "09".equals(thang))) {
                   return false;} // 1, 3, 5, 7, 8, 10, 12 co 31 ngay
                else if ("2".equals(thang) || "02".equals(thang)) {
                    //leap year
                    if (nam % 4 == 0) {
                        return !"30".equals(ngay) && !"31".equals(nam);
                    } else {
                        return !"29".equals(ngay) && !"30".equals(ngay) && !"31".equals(ngay);
                    }
               } else {
                   return true;
               }
           } else {
               return false;
           }
        } else {
            return false;
        }
            }
        
//    (0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)



    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int[] selected = jTable1.getSelectedRows();
        
        for(int i = 0 ; i < selected.length;i++){
            String id = (String)jTable1.getValueAt(selected[i], 0);
            ds.Xoa(id);
        }
        ds.Update(model);
        JOptionPane.showMessageDialog(rootPane, "xoa thanh cong");
//        
//        database.updateData((DefaultTableModel)table.getModel());
                
//        if(jTextField1.getText().isEmpty()){
//            JOptionPane.showMessageDialog(rootPane, "nhap ten can xoa");
//        }
//        else{
//            ds.Xoa(jTextField1.getText());
//            JOptionPane.showMessageDialog(rootPane, "xoa thanh cong");
//        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TEST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField_GhiChu;
    private javax.swing.JTextField jTextField_GioiTinh;
    private javax.swing.JTextField jTextField_PhongBan;
    // End of variables declaration//GEN-END:variables
}
