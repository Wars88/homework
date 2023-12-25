/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javawork;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 *
 * @author LG
 */
public class MainForm extends javax.swing.JPanel {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMFT = new javax.swing.JLabel();
        btnScdAdd = new javax.swing.JButton();
        btnScdcheck = new javax.swing.JButton();
        btnScdmod = new javax.swing.JButton();
        btnScddel = new javax.swing.JButton();

        lblMFT.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        lblMFT.setText("관리 메뉴");

        btnScdAdd.setText("일정 추가");
        btnScdAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnScdAddMouseClicked(evt);
                ScdAdd(evt);
            }
        });
        btnScdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputForm(evt);
            }
        });

        btnScdcheck.setText("일정 조회");
        btnScdcheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScdCheck(evt);
            }
        });
        btnScdcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScdcheckActionPerformed(evt);
            }
        });

        btnScdmod.setText("일정 수정");
        btnScdmod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScdMod(evt);
            }
        });
        btnScdmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScdmodActionPerformed(evt);
            }
        });

        btnScddel.setText("일정 삭제");
        btnScddel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScdDel(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMFT)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnScdcheck)
                            .addComponent(btnScdAdd)
                            .addComponent(btnScdmod)
                            .addComponent(btnScddel))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblMFT, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnScdAdd)
                .addGap(31, 31, 31)
                .addComponent(btnScdcheck)
                .addGap(28, 28, 28)
                .addComponent(btnScdmod)
                .addGap(32, 32, 32)
                .addComponent(btnScddel)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void InputForm(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputForm
        // TODO add your handling code here:
        // InputForm 객체 생성
    InputForm inputForm = new InputForm(this);
    
    // InputForm화면 표시
    inputForm.setVisible(true);
    this.setVisible(false);
    // MainForm이 포함된 JFrame을 찾아서 숨김

    }//GEN-LAST:event_InputForm

    private void btnScdcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScdcheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnScdcheckActionPerformed

    private void btnScdmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScdmodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnScdmodActionPerformed

    private void btnScdAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScdAddMouseClicked

    }//GEN-LAST:event_btnScdAddMouseClicked

    private void ScdAdd(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScdAdd
        // TODO add your handling code here:
    }//GEN-LAST:event_ScdAdd

    private void ScdCheck(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScdCheck
        // TODO add your handling code here:
    }//GEN-LAST:event_ScdCheck

    private void ScdMod(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScdMod
        // TODO add your handling code here:
    }//GEN-LAST:event_ScdMod

    private void ScdDel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScdDel
        // TODO add your handling code here:
    }//GEN-LAST:event_ScdDel

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
                
            }
        });
    }
          
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnScdAdd;
    private javax.swing.JButton btnScdcheck;
    private javax.swing.JButton btnScddel;
    private javax.swing.JButton btnScdmod;
    private javax.swing.JLabel lblMFT;
    // End of variables declaration//GEN-END:variables
}