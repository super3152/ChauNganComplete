/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.DBConection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;

/**
 *
 * @author ADMIN
 */

public class jdlwelcome extends javax.swing.JFrame {
    
 
    
    int index;

    /**
     * Creates new form login
     */
    public  jdlwelcome() {
        
  
          try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
        }
        initComponents();

        Start();
   
     
    }
    public static void open(){
        
    }
  
  
  
       
  
  
public void Start(){
        pgbLoading.setStringPainted(true);
        Timer t = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                index +=1;
//                lblPhanTram.setText(Integer.toString(index)+"%");
                pgbLoading.setValue(index);
                if (index == 150) {
                    ((Timer) e.getSource()).stop();
                   
                     
                    showjdlDangNhap();
                  
                }
            }
        });
       
        t.start();
    }

public void showjdlDangNhap(){
     
       while (true) {            
        if (DBConection.conn != null) {
            this.dispose();   
           jdllogin jdl = new jdllogin();
           jdl.setVisible(true);
           
          break;
        }else{  
            ImageIcon icon = new ImageIcon("src/IMAGE/831.gif");
            
             Object[] options = {"Đồng ý",
                    "Thoát"};
         int ketquasaukhibam = JOptionPane.showOptionDialog(new JFrame(),
            "<html><body><strong>Vui lòng kết nối lại ?</strong></body?</html>", //thông báo
            "Thông báo!", //tiêu đề
           JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    icon,     //không sử dụng icon tùy chỉnh
    options,  //các tiêu để của các nút
    options[0]); //tiêu đề nút mặc định

        if (ketquasaukhibam == JOptionPane.YES_OPTION){
         DBConection db = new DBConection();
          } else{
            System.exit(0);
        }
        }
      }   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNenChao = new javax.swing.JPanel();
        lblLoad = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        pgbLoading = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WELCOME TO RES.STAR");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlNenChao.setOpaque(false);
        pnlNenChao.setLayout(null);

        lblLoad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLoad.setForeground(new java.awt.Color(255, 255, 255));
        lblLoad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/download_from_ftp_25px.png"))); // NOI18N
        lblLoad.setText(" Đang load dữ liệu, vui lòng đợi ít giây . . .");
        pnlNenChao.add(lblLoad);
        lblLoad.setBounds(0, 360, 600, 30);

        jPanel2.setBackground(new java.awt.Color(33, 36, 51));
        jPanel2.setForeground(new java.awt.Color(9, 122, 192));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Phiên bản 0.0.1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        pnlNenChao.add(jPanel2);
        jPanel2.setBounds(490, 420, 110, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/welcome.jpg"))); // NOI18N
        lblBackground.setOpaque(true);
        pnlNenChao.add(lblBackground);
        lblBackground.setBounds(0, 0, 600, 450);
        pnlNenChao.add(pgbLoading);
        pgbLoading.setBounds(27, 388, 545, 15);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlNenChao.add(jPanel1);
        jPanel1.setBounds(20, 380, 560, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/img_loader (2).gif"))); // NOI18N
        pnlNenChao.add(jLabel15);
        jLabel15.setBounds(0, 0, 300, 200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNenChao, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNenChao, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
           DBConection db = new DBConection();
        LoadDatabase db2 = new LoadDatabase();
    }//GEN-LAST:event_formWindowOpened

        
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
            java.util.logging.Logger.getLogger(jdlwelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdlwelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdlwelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdlwelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jdlwelcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBackground;
    public static javax.swing.JLabel lblLoad;
    private javax.swing.JProgressBar pgbLoading;
    private javax.swing.JPanel pnlNenChao;
    // End of variables declaration//GEN-END:variables
}
