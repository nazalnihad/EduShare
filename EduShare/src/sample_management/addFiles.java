/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sample_management;
//import StarButtonRenderer;
import db_connect.ConnectionProvider;
import java.sql.*;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author nazal
 */
public class addFiles extends javax.swing.JFrame {

    /**
     * Creates new form addFiles
     */
//    private starredPage s;
    public addFiles() {
        initComponents();
        getContentPane().setBackground( Color.WHITE );
        
//        immediatly update table on load
        populateTableWithData();
        
        back_btn.setVisible(false);
        edit_btn.setVisible(false);
        star_btn.setVisible(false);
    }

    public int getRowIndex() {
    JTable table = (JTable) getParent();
    return table.rowAtPoint(getLocation());
}

private void populateTableWithData() {
    try {
        Connection con = ConnectionProvider.getCon();
        String userName = new login().user_name;
        userName = "test1";
//        JOptionPane.showMessageDialog(null, userName);
    // Create a PreparedStatement with a parameterized query
    String selectQuery = "SELECT * FROM files WHERE name = ?";
    PreparedStatement preparedStatement = con.prepareStatement(selectQuery);
    
    // Set the parameter value
    preparedStatement.setString(1, userName);
    
    // Execute the query
    ResultSet rs = preparedStatement.executeQuery();
 DefaultTableModel model = new DefaultTableModel() {
    @Override
    public boolean isCellEditable(int row, int column) {
        // Make all cells non-editable
        return false;
    }
};

model.setColumnIdentifiers(new Object[]{"Index", "file_name", "file_type", "description", "access"}); // Add "Star" column


        int rowIndex = 1; // Initialize the index
        Random random = new Random();
// ...

while (rs.next()) {
    String accessValue = rs.getInt("public_or_private") == 1 ? "Public" : "Private"; // Convert 1 to "Public" and 0 to "Private"
    boolean isStarred = random.nextBoolean(); // Generate random star data
    model.addRow(new Object[]{rowIndex, rs.getString("file_name"), rs.getString("file_type"), rs.getString("description"), accessValue, isStarred}); // Add "Index", "accessValue," and "isStarred"
    rowIndex++; // Increment the index
}


        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable1.setModel(model);

        int[] columnWidths = {100, 150, 150, 200, 100};

        int columnIndex = 0;

        for (int width : columnWidths) {
            TableColumn column = jTable1.getColumnModel().getColumn(columnIndex);
            column.setPreferredWidth(width);
            columnIndex++;
        }
        

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Connection error: " + e.getMessage());
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

        add_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        search_btn = new javax.swing.JButton();
        search_field = new javax.swing.JTextField();
        edit_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        star_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setLocation(new java.awt.Point(450, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sample_management/add.png"))); // NOI18N
        add_btn.setText("Add ");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        getContentPane().add(add_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 493, 130, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setFillsViewportHeight(true);
        jTable1.setRowHeight(20);
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 135, 709, 305));

        search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sample_management/search.png"))); // NOI18N
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        getContentPane().add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 66, 100, 40));

        search_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(search_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 299, 30));

        edit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sample_management/edit.png"))); // NOI18N
        edit_btn.setText("Edit");
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });
        getContentPane().add(edit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 66, 110, 40));

        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sample_management/back_n.png"))); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 120, 30));

        star_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sample_management/star_f.png"))); // NOI18N
        star_btn.setText("star");
        star_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                star_btnActionPerformed(evt);
            }
        });
        getContentPane().add(star_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 65, 110, 40));

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel1.setText("MY FILES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 189, -1));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new addFileNew().setVisible(true);
    }//GEN-LAST:event_add_btnActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        // TODO add your handling code here:
    String file_name = search_field.getText();
    if (file_name.equals("")) {
        JOptionPane.showMessageDialog(null, "Enter the file name");
        return;
    } else {
        back_btn.setVisible(true);
        star_btn.setVisible(true);
//        back_btn.setVisible(true);


        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    // Make all cells non-editable
                    return false;
                }
            };

            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            jTable1.setModel(model);
            model.setColumnIdentifiers(new Object[]{"index","file_name", "file_type", "description", "access"});

            ResultSet rs = st.executeQuery("SELECT * FROM files WHERE file_name='" + file_name + "' AND name = 'test1'");

            int rowIndex = 1; // Initialize the index

        if (rs.next()) {
        // Data found, populate the table with the result
        int publicOrPrivate = rs.getInt("public_or_private");
        String accessValue = (publicOrPrivate == 1) ? "Public" : "Private";
        model.addRow(new Object[]{rowIndex, rs.getString("file_name"), rs.getString("file_type"), rs.getString("description"), accessValue});
        rowIndex++;
        edit_btn.setVisible(true);
    } else {
        // No data found for the search, handle this case
        populateTableWithData();
        JOptionPane.showMessageDialog(null, "File not found");
        
        back_btn.setVisible(true);
        edit_btn.setVisible(false);
        star_btn.setVisible(false);
        return;
//        this.populateTableWithData();
    }
            edit_btn.setVisible(true);
            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            jTable1.setModel(model);
            int[] columnWidths = {100, 150, 150, 200, 100}; // Adjust the values as needed for each column
            int columnIndex = 0;

            for (int width : columnWidths) {
                TableColumn column = jTable1.getColumnModel().getColumn(columnIndex);
                column.setPreferredWidth(width);
                columnIndex++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_search_btnActionPerformed

    private void search_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_fieldActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        populateTableWithData();
        back_btn.setVisible(false);
        edit_btn.setVisible(false);
        star_btn.setVisible(false);
        
    }//GEN-LAST:event_back_btnActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        // TODO add your handling code here:
        String file_name = search_field.getText();
        new editPage(file_name).setVisible(true);
        this.setVisible(false);
//        new editPage().setVisible(false);
    }//GEN-LAST:event_edit_btnActionPerformed

    private void star_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star_btnActionPerformed
        // TODO add your handling code here:
       try {
    Connection con = ConnectionProvider.getCon();
    Statement st = con.createStatement();
    
    String file_name = search_field.getText();
    String userName = new login().user_name;
    userName = "test1";
    
    // Query to select details from the files table
    String selectQuery = "SELECT name FROM files WHERE file_name = '" + file_name + "'";
    ResultSet rs = st.executeQuery(selectQuery);

    if (rs.next()) {
        String owner_name = rs.getString("name");
        
        // Insert values into the star table
        String insertStarQuery = "INSERT INTO star (file_name, user_name,owner_name ) VALUES (?, ?, ?)";
        PreparedStatement insertStatement = con.prepareStatement(insertStarQuery);
        
        // Set values for the prepared statement
        insertStatement.setString(1, file_name);
        insertStatement.setString(2, userName);
        insertStatement.setString(3, owner_name);
        
        int starRows = insertStatement.executeUpdate();
        
        if (starRows > 0) {
            // Row inserted successfully
            JOptionPane.showMessageDialog(null, "Record starred successfully");
            new addFiles().setVisible(true);
//            new starredPage().dispose();
            setVisible(false);
        } else {
            // Insertion failed, display an error message
            JOptionPane.showMessageDialog(null, "Failed to star the record");
        }
//        new starredPage().
        insertStatement.close();
    } else {
        // No matching record found in the files table
        JOptionPane.showMessageDialog(null, "No matching record found in files table");
    }
    
    rs.close();
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
}
 
    }//GEN-LAST:event_star_btnActionPerformed

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
            java.util.logging.Logger.getLogger(addFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addFiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton edit_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_field;
    private javax.swing.JButton star_btn;
    // End of variables declaration//GEN-END:variables
}
