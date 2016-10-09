/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class UpdateTable extends javax.swing.JFrame {

    /**
     * Creates new form UpdateTable
     */
    public UpdateTable() {
        initComponents();
        tableSow();
    }

    private void tableSow() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myshop", "root", "farid");
            String sql = "select * from customer";
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            ResultSet rs1 = stm.executeQuery();
            while (rs1.next()) {
                String id = rs1.getString("id");
                jComboBox1.addItem(id);
            }

            stm.close();
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mobile = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mobile2 = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel8 = new javax.swing.JLabel();
        attached = new javax.swing.JButton();
        update = new javax.swing.JButton();
        path = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mobile.setBackground(java.awt.SystemColor.textInactiveText);
        mobile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Customer Id");
        mobile.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        name.setBackground(java.awt.SystemColor.controlHighlight);
        mobile.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 228, -1));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Name");
        mobile.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Address");
        mobile.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Mobile");
        mobile.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        mobile2.setBackground(java.awt.SystemColor.controlHighlight);
        mobile.add(mobile2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 228, -1));

        location.setBackground(java.awt.SystemColor.controlHighlight);
        mobile.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 228, -1));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Location");
        mobile.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        mobile.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 283, -1, -1));

        add.setColumns(20);
        add.setRows(5);
        jScrollPane1.setViewportView(add);

        mobile.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 318, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(50, 2, 238));
        jLabel7.setText("Update Data");
        mobile.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel8.setToolTipText("Insert data carejfafksd");

        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        mobile.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 150, 150));

        attached.setText("Attached Image");
        attached.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachedActionPerformed(evt);
            }
        });
        mobile.add(attached, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arrows.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        mobile.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 100, 40));
        mobile.add(path, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 110, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete 2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mobile.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 380, 70, 40));

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        mobile.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mobile, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attachedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachedActionPerformed

    }//GEN-LAST:event_attachedActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myshop", "root", "farid");
            String id = (String) jComboBox1.getSelectedItem();
            String sql = "update customer set name=?,address=?,mobile=?, location=? where id='"+id+"'";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, name.getText());
            stm.setString(2, add.getText());
            stm.setString(3, mobile2.getText());
            stm.setString(4, location.getText());
            stm.execute();
            if(true){
                JOptionPane.showMessageDialog(this, "Successfully updated");
            }else{
                JOptionPane.showMessageDialog(this, "NOt Successfully updated");
            }
            stm.close();
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myshop", "root", "farid");
            String id = (String) jComboBox1.getSelectedItem();
            String sql = "select * from customer where id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                name.setText(rs.getString("name"));
                add.setText(rs.getString("address"));
                mobile2.setText(rs.getString("mobile"));
                location.setText(rs.getString("location"));
            }
            stm.close();
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

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
            java.util.logging.Logger.getLogger(UpdateTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea add;
    private javax.swing.JButton attached;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField location;
    private javax.swing.JPanel mobile;
    private javax.swing.JTextField mobile2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField path;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
