package CustomerUI;

import AdminUI.AdminMainMenu;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.protocol.Resultset;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dave
 */
public class CustomerMain extends javax.swing.JFrame {

    /**
     * Creates new form Browse_Equipment
     */
    public CustomerMain() {
        initComponents();
        loadEquipments();
    }
    
    private void loadEquipments() {
    try {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fers", "root", "");
        String query = "SELECT Category, Equipment_Name, Brand, Model_Number, Rent_Price FROM rental_equipments";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        DefaultTableModel model = (DefaultTableModel) EquipmentsTbl.getModel();

        // Clear existing rows in the table
        model.setRowCount(0);

        // Iterate through the result set
        while (rs.next()) {
            String category = rs.getString("Category");
            String Type = rs.getString("Equipment_Name");
            String brand = rs.getString("Brand");
            String modelNumber = rs.getString("Model_Number");
            String rentPrice = rs.getString("Rent_Price");

            // Add the row to the table model
            model.addRow(new Object[]{category, Type, brand, modelNumber, rentPrice});
        }

        // Close the resources
        rs.close();
        st.close();
        con.close();
    } catch (SQLException e) {
        System.err.println("Database error: " + e.getMessage());
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        SearchBarFld = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CustomerAccBtn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        EquipmentsTbl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Cameraslbl = new javax.swing.JPanel();
        CameraSrchBtn = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(21, 25, 28));
        jPanel5.setPreferredSize(new java.awt.Dimension(900, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/BRBLogo.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        SearchBarFld.setBackground(new java.awt.Color(102, 102, 102));
        SearchBarFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBarFldActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search.png"))); // NOI18N

        CustomerAccBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/User Icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(SearchBarFld, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(CustomerAccBtn)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, Short.MAX_VALUE)
                .addComponent(SearchBarFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CustomerAccBtn)
                .addContainerGap())
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 0, 900, 80);

        jPanel3.setPreferredSize(new java.awt.Dimension(637, 1000));
        jPanel3.setLayout(new java.awt.BorderLayout());

        EquipmentsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Type", "Brand", "Model"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EquipmentsTbl.setRequestFocusEnabled(false);
        jScrollPane3.setViewportView(EquipmentsTbl);

        jPanel3.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(jPanel3);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(190, 80, 710, 260);

        jPanel2.setBackground(new java.awt.Color(255, 241, 241));

        Cameraslbl.setPreferredSize(new java.awt.Dimension(138, 92));
        Cameraslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CameraslblMouseClicked(evt);
            }
        });
        Cameraslbl.setLayout(new java.awt.BorderLayout());

        CameraSrchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CAMERA.png"))); // NOI18N
        CameraSrchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CameraSrchBtnMouseClicked(evt);
            }
        });
        Cameraslbl.add(CameraSrchBtn, java.awt.BorderLayout.CENTER);

        jPanel6.setPreferredSize(new java.awt.Dimension(138, 92));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CAMERA (1).png"))); // NOI18N
        jPanel6.add(jLabel8, java.awt.BorderLayout.CENTER);

        jPanel7.setPreferredSize(new java.awt.Dimension(138, 92));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CAMERA (2).png"))); // NOI18N
        jPanel7.add(jLabel9, java.awt.BorderLayout.CENTER);

        jPanel8.setPreferredSize(new java.awt.Dimension(138, 92));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CAMERA (3).png"))); // NOI18N
        jPanel8.add(jLabel10, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cameraslbl, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cameraslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 90, 190, 490);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(252, 251, 251));
        jLabel2.setText("jLabel2");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 210));

        jLabel3.setText("Rent Price:");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 100, -1));
        jPanel9.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 240, -1));

        jLabel5.setText("Equipment Name:");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 100, -1));
        jPanel9.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 240, -1));

        jLabel6.setText("Brand:");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 100, -1));
        jPanel9.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 240, -1));

        jLabel7.setText("Model:");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 100, -1));
        jPanel9.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 240, -1));

        jPanel1.add(jPanel9);
        jPanel9.setBounds(190, 350, 710, 230);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CameraslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CameraslblMouseClicked
        
    }//GEN-LAST:event_CameraslblMouseClicked

    private void SearchBarFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBarFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBarFldActionPerformed

    private void CameraSrchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CameraSrchBtnMouseClicked
        String Category, Type, Brand, Model;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/fers", "root", "");
            Statement st = con.createStatement();
            String query = "SELECT Category, Equipment_Name, Brand, Model_Number FROM rental_equipments WHERE Category = 'Camera'";
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            

            int colmn = rsmd.getColumnCount();
            String[] colmnName = new String[colmn];
            for(int i = 0; i<colmn; i++){
                colmnName[i] = rsmd.getColumnName(i+1);
            }
            DefaultTableModel model = (DefaultTableModel) EquipmentsTbl.getModel();
            model.setColumnIdentifiers(colmnName);
            while(rs.next()){
                    Category = rs.getString(1);
                    Type = rs.getString(2);
                    Brand = rs.getString(3);
                    Model = rs.getString(4);
                    String[] row = {Category, Type, Brand, Model};
                    model.addRow(row);
            }
            st.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error" + e.getMessage(), "Error Message", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_CameraSrchBtnMouseClicked


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
            java.util.logging.Logger.getLogger(CustomerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CustomerMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CameraSrchBtn;
    private javax.swing.JPanel Cameraslbl;
    private javax.swing.JLabel CustomerAccBtn;
    private javax.swing.JTable EquipmentsTbl;
    private javax.swing.JTextField SearchBarFld;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
