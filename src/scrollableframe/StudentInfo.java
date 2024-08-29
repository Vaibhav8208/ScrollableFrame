/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrollableframe;

/**
 *
 * @author hp
 */

import java.sql.*;

public class StudentInfo extends javax.swing.JFrame {
 Connection con;
Statement st;
ResultSet rs;

    public StudentInfo() {
        initComponents();
        myInit();
    }

 
     
      public  void myInit()
    {
        try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##vaibhav","Vaibhav");
		
                 st =(Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
		ResultSet.CONCUR_READ_ONLY);
		 rs=(ResultSet)st.executeQuery("select * from studentinfonew");
                 
                 
                 
          }
        catch(Exception se)
        {
            se.printStackTrace();
        }
    }
     
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Student Roll No");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 30, 80, 14);

        jLabel2.setText("Student Name ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 80, 80, 14);

        jLabel3.setText("Student Address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 120, 90, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(230, 30, 150, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(230, 70, 150, 20);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(230, 120, 150, 20);

        jButton1.setText("First");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 170, 53, 23);

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(100, 170, 55, 23);

        jButton3.setText("Previous");
        jButton3.setActionCommand("Previous");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(190, 170, 73, 23);

        jButton4.setText("Last");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(300, 170, 53, 23);

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("CSMSS Chh.Shahu College Of Engineering");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 0, 210, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
 
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try{
        rs.first();
        jTextField1.setText(rs.getString(1));
        jTextField2.setText(rs.getString(2));
        jTextField3.setText(rs.getString(3));
      }
        catch(Exception se)
        {
            se.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            try{
        rs.previous();
        jTextField1.setText(rs.getString(1));
        jTextField2.setText(rs.getString(2));
        jTextField3.setText(rs.getString(3));
      }
        catch(Exception se)
        {
            se.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{
        rs.next();
        jTextField1.setText(rs.getString(1));
        jTextField2.setText(rs.getString(2));
        jTextField3.setText(rs.getString(3));
      }
        catch(Exception se)
        {
            se.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try{
        rs.last();
        jTextField1.setText(rs.getString(1));
        jTextField2.setText(rs.getString(2));
        jTextField3.setText(rs.getString(3));
       // jButton2.setVisible(false);
      }
        catch(Exception se)
        {
            se.printStackTrace();
        }
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInfo().setVisible(true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
