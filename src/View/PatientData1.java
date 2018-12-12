/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.PatientData;
import View.DoctorModule;
import hms2.Sng_Back;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Leo James
 */
public class PatientData1 extends javax.swing.JFrame {
    assignDoc docTable = new assignDoc();
    
    private int id;
    /**
     * Creates new form PatientData
     */
    public PatientData1() {
        initComponents();
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void close2(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextAdmitted = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextRoom = new javax.swing.JTextField();
        jTextGender = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextAge = new javax.swing.JTextField();
        jTextAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonback = new javax.swing.JButton();
        lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        jButtonRelease = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        diagnosis = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jTextAdmitted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAdmittedActionPerformed(evt);
            }
        });
        jPanel1.add(jTextAdmitted);
        jTextAdmitted.setBounds(220, 350, 230, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Date Admitted");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 350, 100, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Room Number");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(90, 310, 90, 17);
        jPanel1.add(jTextRoom);
        jTextRoom.setBounds(220, 310, 230, 30);

        jTextGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextGenderActionPerformed(evt);
            }
        });
        jPanel1.add(jTextGender);
        jTextGender.setBounds(220, 270, 230, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(110, 270, 50, 17);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 570, 0);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Age");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(120, 230, 30, 17);

        jTextAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAgeActionPerformed(evt);
            }
        });
        jPanel1.add(jTextAge);
        jTextAge.setBounds(220, 230, 230, 30);

        jTextAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAddressActionPerformed(evt);
            }
        });
        jPanel1.add(jTextAddress);
        jTextAddress.setBounds(220, 190, 230, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 190, 50, 14);

        jButton1.setText("New Doctor");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(520, 190, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Diagnosis");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 100, 70, 17);

        jButtonback.setText("Back");
        jButtonback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonbackMouseClicked(evt);
            }
        });
        jButtonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbackActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonback);
        jButtonback.setBounds(0, 10, 60, 23);

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel1.add(lname);
        lname.setBounds(220, 40, 80, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 50, 40, 17);

        mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameActionPerformed(evt);
            }
        });
        jPanel1.add(mname);
        mname.setBounds(420, 40, 40, 30);

        jButtonRelease.setText("Release");
        jButtonRelease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonReleaseMouseClicked(evt);
            }
        });
        jButtonRelease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReleaseActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRelease);
        jButtonRelease.setBounds(520, 250, 100, 30);

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname);
        fname.setBounds(310, 40, 100, 30);

        diagnosis.setColumns(20);
        diagnosis.setRows(5);
        jScrollPane1.setViewportView(diagnosis);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(220, 90, 250, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication10/img/adminbg1.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextAdmittedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAdmittedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAdmittedActionPerformed

    private void jTextGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextGenderActionPerformed

    private void jTextAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAgeActionPerformed

    private void jTextAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAddressActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void jButtonReleaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonReleaseMouseClicked
        // TODO add your handling code here:
        Connection conn = null;
        ResultSet rs = null;
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        try{
            String sql = "UPDATE `patientrec` SET `assignedDoctor`=? , `date_Released`=?  WHERE patientID =" + id ;
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/icaredb?zeroDateTimeBehavior=exception","root","");
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, "69");
            pst.setString(2, timeStamp);
            int i = pst.executeUpdate();
            System.out.println("Updated");
            JOptionPane.showMessageDialog(null, "Successfully Released");
            DoctorModule docMod = new DoctorModule();
            docMod.setVisible(true);
            docMod.pack();
            docMod.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            close2();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ErawrXD");
        }
    }//GEN-LAST:event_jButtonReleaseMouseClicked

    private void jButtonReleaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReleaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonReleaseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        docTable.setVisible(true);
        docTable.setdoc_set_id(id);
        close2();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButtonbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonbackMouseClicked
        // TODO add your handling code here:
        Sng_Back.instance().goPreviousPage(this);
    }//GEN-LAST:event_jButtonbackMouseClicked

    private void jButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonbackActionPerformed

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
            java.util.logging.Logger.getLogger(PatientData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientData1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea diagnosis;
    public javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButtonRelease;
    private javax.swing.JButton jButtonback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextAddress;
    public javax.swing.JTextField jTextAdmitted;
    public javax.swing.JTextField jTextAge;
    public javax.swing.JTextField jTextGender;
    public javax.swing.JTextField jTextRoom;
    public javax.swing.JTextField lname;
    public javax.swing.JTextField mname;
    // End of variables declaration//GEN-END:variables
}
