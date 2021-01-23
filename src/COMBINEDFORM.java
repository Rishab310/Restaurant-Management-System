import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class COMBINEDFORM extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null;
ResultSet rs = null;

    /**
     * Creates new form COMMONFORM
     */
    public COMBINEDFORM() {
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

        idTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        mobileTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        loadBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        shiftTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ORDER = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        PRODUCT = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        CUSTOMER = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loadBTN.setText("LOAD");
        loadBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBTNActionPerformed(evt);
            }
        });

        jLabel6.setText("SHIFT");

        jLabel1.setText("EMP_ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("COMBINED FORM");

        jLabel2.setText("EMP_NAME");

        jLabel3.setText("MOBILE NO.");

        jLabel4.setText("ADDRESS");

        ORDER.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER_ID", "CUST_ID", "PRODUCT_ID", "QUANTITY", "AMOUNT", "REMARK", "EMP_ID"
            }
        ));
        ORDER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ORDERMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ORDER);

        PRODUCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT_ID", "PRODUCT_NAME", "PRICE", "DETAILS"
            }
        ));
        jScrollPane3.setViewportView(PRODUCT);

        CUSTOMER.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUST_ID", "CUST_NAME", "PHONE_NO", "TABLE_NO", "DT_TIME_BOOKING", "DT_TIME_ARRIVAL"
            }
        ));
        jScrollPane1.setViewportView(CUSTOMER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(idTF, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                        .addComponent(mobileTF)
                                        .addComponent(addressTF)
                                        .addComponent(shiftTF))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(loadBTN)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(mobileTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(shiftTF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(loadBTN)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(513, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBTNActionPerformed
try {Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/RESTAURANT","root","password");
    Statement stmt = con.createStatement() ;
    String query ="SELECT * FROM EMPLOYEE WHERE EMP_ID= "+ "'" + idTF.getText() + "'"+ ";";
    rs=stmt.executeQuery(query);
    if( rs.next()){
    String id = rs.getString("EMP_ID");
    String name = rs.getString("EMP_NAME");
    String mobile = rs.getString("MOBILE_NO");
    String address = rs.getString("ADDRESS");
    String shift = rs.getString("SHIFT");
    nameTF.setText(name);
    mobileTF.setText(mobile);
    addressTF.setText(address);
    shiftTF.setText(shift);

    nameTF.setEnabled(true);
    mobileTF.setEnabled(true);
    addressTF.setEnabled(true);}
        else{
                JOptionPane.showMessageDialog(null,"No such record found");
            }}
        catch(Exception e){JOptionPane.showMessageDialog(null,e.toString());
        }
    
DefaultTableModel model1=(DefaultTableModel) ORDER.getModel();
model1.setRowCount(0);
        try {
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/RESTAURANT","root","password");
    Statement stmt = con.createStatement() ;
    String query ="SELECT * FROM ORDER_D WHERE EMP_ID = '"+idTF.getText()+"' ;"  ;
    ResultSet rs =stmt.executeQuery(query);
    int count=0;
    while(rs.next()){
    count++;
    model1.addRow (new Object[]{
    rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),
        rs.getString(6),rs.getString(7)});
            }
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }                            
    }//GEN-LAST:event_loadBTNActionPerformed

    private void ORDERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ORDERMouseClicked
{
 DefaultTableModel model1=(DefaultTableModel) ORDER.getModel(); 
 DefaultTableModel model2=(DefaultTableModel) CUSTOMER.getModel(); 
 model2.setRowCount(0);
Object[] hid1=new Object[]{model1.getValueAt(ORDER.getSelectedRow(), 1)};
String hid=Arrays.toString(hid1);
hid = hid.substring(1,hid.length()-1);
try {
   Class.forName("java.sql.Driver");
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost/RESTAURANT","root","password");
   Statement stmt = con.createStatement() ;
 String query ="SELECT CUST_ID,CUST_NAME,PHONE_NO,TABLE_NO,DATE_TIME_BOOKING,DATE_TIME_ARRIVAL "
         + "FROM CUSTOMER WHERE CUST_ID ='"+hid+"';";
 ResultSet rs =stmt.executeQuery(query);
   int count=0;
   while(rs.next()){
   count++;  
model2.addRow (new Object[]{
       rs.getString(1),rs.getString(2),rs.getLong(3),rs.getInt(4),rs.getTimestamp(5),rs.getTimestamp(6)});   
   }
   }  
   catch(Exception e){
   JOptionPane.showMessageDialog(null,e.toString()); 
       }
       }
{
DefaultTableModel model1=(DefaultTableModel) ORDER.getModel(); 
DefaultTableModel model3=(DefaultTableModel) PRODUCT.getModel(); 
model3.setRowCount(0);
Object[] hid1=new Object[]{model1.getValueAt(ORDER.getSelectedRow(), 2)};
String hid=Arrays.toString(hid1);
hid = hid.substring(1,hid.length()-1);
  try {
   Class.forName("java.sql.Driver");
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost/RESTAURANT","root","password");
   Statement stmt = con.createStatement() ;
   
   String query ="SELECT PRODUCT_ID,PRODUCT_NAME,PRICE,DETAILS FROM PRODUCT WHERE PRODUCT_ID ='"+hid+"';";
   ResultSet rs =stmt.executeQuery(query);
   int count=0;
   while(rs .next()){
   count++;  
model3.addRow (new Object[]{
       rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4) });   
    }
   }  
   catch(Exception e){
   JOptionPane.showMessageDialog(null,e.toString());
   }}
    }//GEN-LAST:event_ORDERMouseClicked

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
            java.util.logging.Logger.getLogger(COMBINEDFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(COMBINEDFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(COMBINEDFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(COMBINEDFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new COMBINEDFORM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CUSTOMER;
    private javax.swing.JTable ORDER;
    private javax.swing.JTable PRODUCT;
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton loadBTN;
    private javax.swing.JTextField mobileTF;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField shiftTF;
    // End of variables declaration//GEN-END:variables
}
