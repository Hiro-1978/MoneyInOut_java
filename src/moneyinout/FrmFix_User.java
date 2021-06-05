package moneyinout;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Font;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmFix_User extends javax.swing.JInternalFrame {

    Connection conn;

    public FrmFix_User() {
        initComponents();
        conn = (Connection) My_CNX.getConnect();
        showdata();
    }

    private void showdata() {
        try {
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel = (DefaultTableModel) dgvShow.getModel();

            int nRowDel = dgvShow.getRowCount() - 1;
            while (nRowDel > -1) {
                tableModel.removeRow(nRowDel);
                nRowDel--;
            }

            Object[] oData = new Object[0];

            String sSql = "select * from bnuser";
            ResultSet rs = conn.createStatement().executeQuery(sSql);

            int nRow = 0;
            while (rs.next()) {
                String sUsername = rs.getString("Log_User");
                String sPassword = rs.getString("Log_pass");
                tableModel.addRow(oData);
                dgvShow.getTableHeader().setFont(new Font("tahoma", Font.BOLD,18));
                dgvShow.getTableHeader().setForeground(new Color(143,60,16));
                dgvShow.setFont(new Font("tahoma", Font.PLAIN,14));
                dgvShow.setForeground(new Color(143,60,16));
                dgvShow.setValueAt(sUsername, nRow, 0);
                dgvShow.setValueAt(sPassword, nRow, 1);

                nRow++;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage().toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        cmdAdd = new javax.swing.JButton();
        cmdDel = new javax.swing.JButton();
        cmdEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgvShow = new javax.swing.JTable();
        cmdClose = new javax.swing.JButton();

        setTitle("กำหนดสิทธ์การใช้งาน");
        setFont(new java.awt.Font("Tahoma", 0, 24));
        setMinimumSize(new java.awt.Dimension(1070, 725));
        setPreferredSize(new java.awt.Dimension(1070, 725));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(143, 60, 16));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 70, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(143, 60, 16));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 120, 100, 30);

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(txtUsername);
        txtUsername.setBounds(120, 70, 330, 30);

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(txtPassword);
        txtPassword.setBounds(121, 118, 330, 32);

        cmdAdd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmdAdd.setForeground(new java.awt.Color(143, 60, 16));
        cmdAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save30x30.png"))); // NOI18N
        cmdAdd.setText("เพิ่มข้อมูล");
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });
        getContentPane().add(cmdAdd);
        cmdAdd.setBounds(20, 190, 140, 40);

        cmdDel.setFont(new java.awt.Font("Tahoma", 1, 13));
        cmdDel.setForeground(new java.awt.Color(143, 60, 16));
        cmdDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete30x30.png"))); // NOI18N
        cmdDel.setText("ลบข้อมูล");
        cmdDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDelActionPerformed(evt);
            }
        });
        getContentPane().add(cmdDel);
        cmdDel.setBounds(180, 190, 140, 40);

        cmdEdit.setFont(new java.awt.Font("Tahoma", 1, 13));
        cmdEdit.setForeground(new java.awt.Color(143, 60, 16));
        cmdEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit30x30.png"))); // NOI18N
        cmdEdit.setText("แก้ไขข้อมูล");
        cmdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditActionPerformed(evt);
            }
        });
        getContentPane().add(cmdEdit);
        cmdEdit.setBounds(340, 190, 140, 40);

        dgvShow.setFont(new java.awt.Font("Tahoma", 0, 14));
        dgvShow.setForeground(new java.awt.Color(143, 60, 16));
        dgvShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password"
            }
        ));
        dgvShow.setRowHeight(20);
        dgvShow.setRowMargin(3);
        dgvShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgvShowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgvShow);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(500, 20, 550, 660);

        cmdClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdClose.setForeground(new java.awt.Color(143, 60, 16));
        cmdClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit30x30.png"))); // NOI18N
        cmdClose.setText("ปิดหน้าต่าง");
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });
        getContentPane().add(cmdClose);
        cmdClose.setBounds(340, 640, 140, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed
        // TODO add your handling code here:
        try {
            if (txtUsername.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "กรุณากรอก Username", "ตรวจสอบ", JOptionPane.WARNING_MESSAGE, null);
                return;
            }

            if (txtPassword.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "กรุณากรอก Password", "ตรวจสอบ", JOptionPane.WARNING_MESSAGE, null);
                return;
            }

            String sUsername = txtUsername.getText().trim();
            String sPassword = txtPassword.getText().trim();

            String sSql = "insert into bnuser(Log_User,Log_pass) values (' " + sUsername + " ' ,' " + sPassword + " ')";
            PreparedStatement pre = conn.prepareStatement(sSql);
            if (pre.executeUpdate() != -1) {
                JOptionPane.showMessageDialog(rootPane, "เพิ่มข้อมูลเรียบร้อย", "ตรวจสอบ", JOptionPane.INFORMATION_MESSAGE, null);
            }
            showdata();
            txtUsername.setText("");
            txtPassword.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage().toString(), "ตรวจสอบ", JOptionPane.ERROR_MESSAGE, null);
        }

    }//GEN-LAST:event_cmdAddActionPerformed

    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditActionPerformed
        // TODO add your handling code here:
        try {
            if (txtUsername.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "กรุณากรอก Username", "ตรวจสอบ", JOptionPane.WARNING_MESSAGE, null);
                return;
            }

            if (txtPassword.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "กรุณากรอก Password", "ตรวจสอบ", JOptionPane.WARNING_MESSAGE, null);
                return;
            }

            String sUsername = txtUsername.getText().trim();
            String sPassword = txtPassword.getText().trim();

            String sSql = "update bnuser set Log_pass=' " + sPassword + " ' where Log_User=' " + sUsername + " ' ";
            PreparedStatement pre = conn.prepareStatement(sSql);
            if (pre.executeUpdate() != -1) {
                JOptionPane.showMessageDialog(rootPane, "แก้ไขข้อมูลเรียบร้อย", "ตรวจสอบ", JOptionPane.INFORMATION_MESSAGE, null);
            }
            showdata();
            txtUsername.setText("");
            txtPassword.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage().toString(), "ตรวจสอบ", JOptionPane.ERROR_MESSAGE, null);
        }

    }//GEN-LAST:event_cmdEditActionPerformed

    private void cmdDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDelActionPerformed
        // TODO add your handling code here:
        try {
            if (txtUsername.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "กรุณากรอก Username", "ตรวจสอบ", JOptionPane.WARNING_MESSAGE, null);
                return;
            }

            if (txtPassword.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "กรุณากรอก Password", "ตรวจสอบ", JOptionPane.WARNING_MESSAGE, null);
                return;
            }

            if (JOptionPane.showConfirmDialog(this, "คุณต้องการลบใช่หรือไม่?", "ตรวจสอบ", JOptionPane.YES_NO_OPTION)
                    == JOptionPane.NO_OPTION) {
                return;
            }

            String sUsername = txtUsername.getText().trim();
            String sPassword = txtPassword.getText().trim();

            String sSql = "delete from bnuser where Log_User=' " + sUsername + " ' ";
            PreparedStatement pre = conn.prepareStatement(sSql);
            if (pre.executeUpdate() != -1) {
                JOptionPane.showMessageDialog(rootPane, "ลบข้อมูลเรียบร้อย", "ตรวจสอบ", JOptionPane.INFORMATION_MESSAGE, null);
            }
            showdata();
            txtUsername.setText("");
            txtPassword.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage().toString(), "ตรวจสอบ", JOptionPane.ERROR_MESSAGE, null);
        }

    }//GEN-LAST:event_cmdDelActionPerformed

    private void dgvShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgvShowMouseClicked
        // TODO add your handling code here:
        try {
            int nSelect = dgvShow.getSelectedRow();
            String sUsername = dgvShow.getValueAt(nSelect, 0).toString();
            String sPassword = dgvShow.getValueAt(nSelect, 1).toString();

            txtUsername.setText(sUsername);
            txtPassword.setText(sPassword);

        } catch (Exception ex) {
        }
    }//GEN-LAST:event_dgvShowMouseClicked

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cmdCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdDel;
    private javax.swing.JButton cmdEdit;
    private javax.swing.JTable dgvShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
