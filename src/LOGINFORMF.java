import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Arrays;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HCL
 */
public class LOGINFORMF extends javax.swing.JFrame {

    /**
     * Creates new form LOGINFORMF
     */
    public LOGINFORMF() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        EMPLOYEERB = new javax.swing.JRadioButton();
        CUSTOMERRB = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        ADMINRB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(EMPLOYEERB);
        EMPLOYEERB.setText("EMPLOYEE");
        EMPLOYEERB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMPLOYEERBActionPerformed(evt);
            }
        });

        buttonGroup1.add(CUSTOMERRB);
        CUSTOMERRB.setText("CUSTOMER");
        CUSTOMERRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUSTOMERRBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LOGIN FORM");

        jLabel2.setText("USER_ID");

        jLabel3.setText("PASSWORD");

        jLabel4.setText("TYPE OF LOGIN");

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(ADMINRB);
        ADMINRB.setText("ADMIN");
        ADMINRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jButton1))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CUSTOMERRB)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ADMINRB)
                                .addGap(18, 18, 18)
                                .addComponent(EMPLOYEERB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ADMINRB)
                    .addComponent(EMPLOYEERB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(CUSTOMERRB))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String k ;   
    private void EMPLOYEERBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMPLOYEERBActionPerformed
 if(EMPLOYEERB.isSelected()==true)k="EMPLOYEE";
    }//GEN-LAST:event_EMPLOYEERBActionPerformed

    private void CUSTOMERRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUSTOMERRBActionPerformed
if(CUSTOMERRB.isSelected()==true)k="CUSTOMER";
    }//GEN-LAST:event_CUSTOMERRBActionPerformed
LOGINFORMB a =new LOGINFORMB();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String ID=jTextField1.getText();
String PWD =new String(jPasswordField1.getPassword());
    try{
      Class.forName("java.sql.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost/RESTAURANT",
              "root","password");
      Statement stmt=con.createStatement();
      String query="SELECT * FROM USER WHERE USER_ID='"+ID+"' ; ";
      ResultSet rs=stmt.executeQuery(query);
      while(rs.next()){
        if(PWD.equals(rs.getString(3))){
            if(k.equals("ADMIN")){
             LOGINFORMB a=new LOGINFORMB();
             a.setVisible(true);
            }else if(k.equals("EMPLOYEE")&&rs.getString(4).equals("EMPLOYEE")){
             LOGINFORMB a =new LOGINFORMB();
             a.setVisible(true);
             a.PROD_UPD.setVisible(false);
             a.EMP_UPD.setVisible(false);
             a.CUST_UPD.setVisible(false);
             a.ORDER_UPD.setVisible(false);
             a.jLabel2.setVisible(false);
            }else if(k.equals("CUSTOMER")&&rs.getString(4).equals("CUSTOMER")){
             LOGINFORMB a=new LOGINFORMB();
             a.setVisible(true);
             a.PROD_UPD.setVisible(false);
             a.EMP_UPD.setVisible(false);
             a.CUST_UPD.setVisible(false);
             a.ORDER_UPD.setVisible(false);
             a.COMBINED.setVisible(false);
             a.jLabel2.setVisible(false);
             a.jLabel3.setVisible(false);
            }else{
    JOptionPane.showMessageDialog(null,"Access Denied.Please check your login type");
                  }
                }else{
    JOptionPane.showMessageDialog(null,"Access Denied.Please check your entries");
                }
                    }
            rs.close();
            stmt.close();
            con.close();}
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ADMINRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINRBActionPerformed
if(ADMINRB.isSelected()==true)k="ADMIN";
    }//GEN-LAST:event_ADMINRBActionPerformed

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
            java.util.logging.Logger.getLogger(LOGINFORMF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGINFORMF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGINFORMF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGINFORMF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGINFORMF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ADMINRB;
    private javax.swing.JRadioButton CUSTOMERRB;
    private javax.swing.JRadioButton EMPLOYEERB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
