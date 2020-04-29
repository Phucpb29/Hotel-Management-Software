/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team3.UI;

import com.team3.DAO.DAO_KhachHang;
import com.team3.DAO.DAO_PhieuDangKy;
import com.team3.DAO.DAO_Phong;
import com.team3.Helpers.DateHelper;
import com.team3.Helpers.DialogHelper;
import com.team3.Model.Model_KhachHang;
import com.team3.Model.Model_PhieuDangKy;
import com.team3.Model.Model_Phong;
import com.team3.UI.JPanel.SoDoPhong;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dell Vostro
 */
public class PhieuDangKy_Form extends javax.swing.JDialog {
    DAO_PhieuDangKy pdkDAO = new DAO_PhieuDangKy();
    DAO_KhachHang khDAO = new DAO_KhachHang();
    DAO_Phong pDAO = new DAO_Phong();
    String masoPhong;
    int trangthai;
    static int xx, yy;
    Date ngaynhan;
    /**
     * Creates new form PhieuDangKy
     */
    public PhieuDangKy_Form(java.awt.Frame parent, boolean modal,String maSoPhong, String tenPhong, int trangThai) {
        super(parent, modal);
        initComponents();
        masoPhong = maSoPhong;
        trangthai = trangThai;
        init();
        loadDatatoForm();
        lblTitle.setText("Đang xem phiếu đăng kí của phòng: "+tenPhong);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lblIconApp = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblIconApp1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dccNgayTraDK = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        txtTenKH = new javax.swing.JTextField();
        txtNgayDat = new javax.swing.JTextField();
        dccNgayNhan = new com.toedter.calendar.JDateChooser();

        jMenuItem1.setText("Xem/Sửa Phiếu");
        jPopupMenu1.add(jMenuItem1);
        jPopupMenu1.add(jSeparator1);

        jMenuItem2.setText("Thoát");
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(48, 55, 79));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/team3/Images/icons/close.png"))); // NOI18N
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCloseMousePressed(evt);
            }
        });
        jPanel2.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 30, 30));

        lblIconApp.setBackground(new java.awt.Color(153, 255, 102));
        lblIconApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconApp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lblIconApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Đang xem phiếu đăng kí của phòng: P205");
        jPanel2.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 300, 30));

        lblIconApp1.setBackground(new java.awt.Color(153, 255, 102));
        lblIconApp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconApp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/team3/Images/icons/iconApp.png"))); // NOI18N
        lblIconApp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lblIconApp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 340, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setComponentPopupMenu(jPopupMenu1);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Họ tên khách hàng");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ngày đặt");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Ngày nhận phòng");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ngày trả dự kiến");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        dccNgayTraDK.setDateFormatString("dd/MM/yyyy");
        jPanel3.add(dccNgayTraDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 290, 30));

        jButton1.setText("Câp nhật");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 140, 40));

        txtTenKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenKH.setEnabled(false);
        jPanel3.add(txtTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 290, -1));

        txtNgayDat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayDat.setEnabled(false);
        jPanel3.add(txtNgayDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 290, -1));

        dccNgayNhan.setDateFormatString("dd/MM/yyyy");
        jPanel3.add(dccNgayNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, 30));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 30, 340, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/team3/Images/icons/close2.png")));
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/team3/Images/icons/close.png")));
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        this.dispose();
    }//GEN-LAST:event_lblCloseMousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.update();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PhieuDangKy_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhieuDangKy_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhieuDangKy_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieuDangKy_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new PhieuDangKy_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dccNgayNhan;
    private com.toedter.calendar.JDateChooser dccNgayTraDK;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblIconApp;
    private javax.swing.JLabel lblIconApp1;
    public static javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtNgayDat;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
    void init(){
        dccNgayTraDK.setDateFormatString("MM/dd/yyyy");
        dccNgayTraDK.setDate(new Date());
        dccNgayNhan.setDateFormatString("MM/dd/yyyy");
        dccNgayNhan.setDate(new Date());
    }
    void loadDatatoForm(){
        Model_PhieuDangKy mdl = this.pdkDAO.findByMaPhongActive(masoPhong);
        Model_KhachHang mdlkh = this.khDAO.findById(mdl.getMaKH());
        txtTenKH.setText(mdlkh.getHoTen());
        txtNgayDat.setText(DateHelper.toString(mdl.getNgayLap(), new String[0]));
        dccNgayNhan.setDate(mdl.getNgayNhanPhong());
        ngaynhan=DateHelper.toDate(DateHelper.toString(mdl.getNgayNhanPhong(), new String[0]), new String[0]);
        dccNgayTraDK.setDate(mdl.getNgayTraPhongDuKien());
    }
    void update(){
        Model_PhieuDangKy mdl = this.pdkDAO.findByMaPhongActive(masoPhong);
        Model_Phong mdlp = this.pDAO.findById(masoPhong);
        if(dccNgayNhan.getDate().before(DateHelper.toDate(txtNgayDat.getText(), new String[0]))){
            DialogHelper.alert(this, "Ngày nhận không được nằm trước ngày đặt!");  
        }else if(dccNgayTraDK.getDate().before(dccNgayNhan.getDate())){
            DialogHelper.alert(this, "Ngày trả không được nằm trước ngày nhận!");
        } else if(dccNgayNhan.getDate().after(dccNgayTraDK.getDate()))
            {   
              DialogHelper.alert(this, "Ngày nhận không được nằm sau ngày trả!");  
        } else
        {
        mdl.setNgayTraPhongDuKien(dccNgayTraDK.getDate());
        mdl.setNgayNhanPhong(dccNgayNhan.getDate());
        if(trangthai==5){
        mdlp.setTrangThai(5);}
        else {mdlp.setTrangThai(1);     
        }
        if(trangthai==1){
        if(dccNgayNhan.getDate().after(ngaynhan)){
                DialogHelper.alert(this, "Bạn không thể đổi ngày nhận khi đã nhận phòng!");
            }
        else{
        try {
            pdkDAO.update(mdl);
            pDAO.update(mdlp);
            DialogHelper.alert(this, "Cập nhật thành công!");
            updateChuanBiDi();
            this.dispose();
            SoDoPhong.btnShowAll.doClick();
        } catch (Exception e) {
            DialogHelper.alert(this, "Cập nhật thất bại!");
            e.printStackTrace();
        }
            }
                        }
        else{
            try {
            pdkDAO.update(mdl);
            pDAO.update(mdlp);
            DialogHelper.alert(this, "Cập nhật thành công!");
            updateChuanBiDi();
            this.dispose();
            SoDoPhong.btnShowAll.doClick();
        } catch (Exception e) {
            DialogHelper.alert(this, "Cập nhật thất bại!");
            e.printStackTrace();
        }           
        }
        } 
    }
    void updateChuanBiDi(){
        if(trangthai==1){
        try {
            List<Model_PhieuDangKy> list = this.pdkDAO.selectSapDi(DateHelper.toDate(DateHelper.toString(DateHelper.now(), new String[0]), new String[0]));
            if(list!=null){
            for (Model_PhieuDangKy pdk : list) {                
                Model_Phong mdl = this.pDAO.findById(String.valueOf(pdk.getMaPhong()));
                mdl.setTrangThai(3);
                this.pDAO.update(mdl);    
            }
            }       
        }
        catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn CSDL!");
            e.printStackTrace();
        }
    }
    }
    
}
