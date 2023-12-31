/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sample_management;

import javax.swing.JOptionPane;

/**
 *
 * @author nazal
 */
public class addStudent extends javax.swing.JFrame {

    /**
     * Creates new form addStudent
     */
    public addStudent() {
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

        std_name_label = new javax.swing.JLabel();
        std_name_field = new javax.swing.JTextField();
        std_passwd_label = new javax.swing.JLabel();
        std_passwd_field = new javax.swing.JTextField();
        roll_no = new javax.swing.JLabel();
        roll_no_field = new javax.swing.JTextField();
        department = new javax.swing.JLabel();
        department_chose = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 125));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        std_name_label.setText("Student Name");
        getContentPane().add(std_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 111, -1, 31));
        getContentPane().add(std_name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 111, 213, 31));

        std_passwd_label.setText("Password");
        getContentPane().add(std_passwd_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 178, 71, 31));
        getContentPane().add(std_passwd_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 178, 213, 31));

        roll_no.setText("Roll Number");
        getContentPane().add(roll_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 244, 71, 31));
        getContentPane().add(roll_no_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 244, 53, 31));

        department.setText("Department");
        getContentPane().add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 303, 71, 30));

        department_chose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Physics", "Maths ", "Chemistry", "Engineering" }));
        getContentPane().add(department_chose, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 306, -1, -1));

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sample_management/Close.png"))); // NOI18N
        add.setText("Cancel");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 375, 112, 58));

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sample_management/add.png"))); // NOI18N
        cancel.setText("Add");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 375, 112, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Add New Student");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(472, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_addActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "New Student Added");
        this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel department;
    private javax.swing.JComboBox<String> department_chose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel roll_no;
    private javax.swing.JTextField roll_no_field;
    private javax.swing.JTextField std_name_field;
    private javax.swing.JLabel std_name_label;
    private javax.swing.JTextField std_passwd_field;
    private javax.swing.JLabel std_passwd_label;
    // End of variables declaration//GEN-END:variables
}
