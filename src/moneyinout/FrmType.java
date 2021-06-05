package moneyinout;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmType extends javax.swing.JDialog {

    Connection conn;

    public FrmType(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conn = (Connection) My_CNX.getConnect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dgvShow = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cmdClear = new javax.swing.JButton();
        cmdAdd = new javax.swing.JButton();
        cmdDel = new javax.swing.JButton();
        cmdClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dgvShow.setFont(new java.awt.Font("Tahoma", 0, 14));
        dgvShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ชื่อรายการ"
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel1.setForeground(new java.awt.Color(143, 60, 16));
        jLabel1.setText("ชื่อรายการ");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cmdClear.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmdClear.setForeground(new java.awt.Color(143, 60, 16));
        cmdClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clearlist20x20.png"))); // NOI18N
        cmdClear.setText("ล้างข้อมูล");
        cmdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cmdClear)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdClear))
                .addContainerGap())
        );

        cmdAdd.setFont(new java.awt.Font("Tahoma", 1, 13));
        cmdAdd.setForeground(new java.awt.Color(143, 60, 16));
        cmdAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save30x30.png"))); // NOI18N
        cmdAdd.setText("เพิ่มรายการ");
        cmdAdd.setPreferredSize(new java.awt.Dimension(123, 39));
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        cmdDel.setFont(new java.awt.Font("Tahoma", 1, 13));
        cmdDel.setForeground(new java.awt.Color(143, 60, 16));
        cmdDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete30x30.png"))); // NOI18N
        cmdDel.setText("ลบรายการ");
        cmdDel.setPreferredSize(new java.awt.Dimension(123, 39));
        cmdDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDelActionPerformed(evt);
            }
        });

        cmdClose.setFont(new java.awt.Font("Tahoma", 1, 13));
        cmdClose.setForeground(new java.awt.Color(143, 60, 16));
        cmdClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit30x30.png"))); // NOI18N
        cmdClose.setText("ปิด");
        cmdClose.setPreferredSize(new java.awt.Dimension(123, 39));
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-466)/2, (screenSize.height-619)/2, 466, 619);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Wprv_Showdata();

    }//GEN-LAST:event_formWindowOpened

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed

        this.dispose();

    }//GEN-LAST:event_cmdCloseActionPerformed

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed

        try {
            if (txtName.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "กรุณากรอกชื่อรายการ", "ตรวจสอบ", JOptionPane.WARNING_MESSAGE, null);
                return;
            }

            String sName = txtName.getText().trim();

            String sSql = "insert into bntypereceive(name,status) values ('"+sName+"','" +psCheck+"')";
            PreparedStatement pre = conn.prepareStatement(sSql);
            if (pre.executeUpdate() != -1) {
                JOptionPane.showMessageDialog(rootPane, "เพิ่มรายการเรียบร้อย", "ตรวจสอบ", JOptionPane.INFORMATION_MESSAGE, null);
            }

            Wprv_Showdata();
            txtName.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage().toString(), "ตรวจสอบ", JOptionPane.ERROR_MESSAGE, null);
        }

    }//GEN-LAST:event_cmdAddActionPerformed

    private void dgvShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgvShowMouseClicked
// TODO add your handling code here:
        try {
            int nSelect = dgvShow.getSelectedRow();
            String sName = dgvShow.getValueAt(nSelect, 0).toString();

            txtName.setText(sName);
            cmdAdd.setEnabled(false);

        } catch (Exception ex) {

        }
    }//GEN-LAST:event_dgvShowMouseClicked

    private void cmdDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDelActionPerformed
        // TODO add your handling code here:
                try {
            if (txtName.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "กรุณาเลือกรายการที่จะลบ", "ตรวจสอบ", JOptionPane.WARNING_MESSAGE, null);
                return;
            }

            if (JOptionPane.showConfirmDialog(this, "คุณต้องการลบใช่หรือไม่?", "ตรวจสอบ", JOptionPane.YES_NO_OPTION)
                    == JOptionPane.NO_OPTION) {
                return;
            }

            String sName = txtName.getText().trim();

            String sSql = "delete from bntypereceive where name='"+sName+"'and status='"+psCheck+"' ";
            PreparedStatement pre = conn.prepareStatement(sSql);
            if (pre.executeUpdate() != -1) {
                JOptionPane.showMessageDialog(rootPane, "ลบข้อมูลเรียบร้อย", "ตรวจสอบ", JOptionPane.INFORMATION_MESSAGE, null);
            }
            Wprv_Showdata();
            txtName.setText("");
            cmdAdd.setEnabled(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage().toString(), "ตรวจสอบ", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_cmdDelActionPerformed

    private void cmdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        cmdAdd.setEnabled(true);
    }//GEN-LAST:event_cmdClearActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                FrmType dialog = new FrmType(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public String psCheck = "";
    
    private void Wprv_Showdata() {

        try {
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel = (DefaultTableModel) dgvShow.getModel();

            int nRowDel = dgvShow.getRowCount() - 1;
            while (nRowDel > -1) {
                tableModel.removeRow(nRowDel);
                nRowDel--;
            }

            Object[] oData = new Object[0];

            String sSql = "select * from bntypereceive where status='"+psCheck+"'";
            //String sSql = "select * from bntypereceive";
            ResultSet rs = conn.createStatement().executeQuery(sSql);

            int nRow = 0;
            while (rs.next()) {
                String sName = rs.getString("name");

                tableModel.addRow(oData);
                dgvShow.getTableHeader().setFont(new Font("tahoma", Font.BOLD, 18));
                dgvShow.getTableHeader().setForeground(new Color(143, 60, 16));
                dgvShow.setFont(new Font("tahoma", Font.PLAIN, 14));
                dgvShow.setForeground(new Color(143, 60, 16));
                dgvShow.setValueAt(sName, nRow, 0);

                nRow++;
            }
            if(psCheck=="1"){
                this.setTitle("กำหนดประเภทรายรับ");
            }else{
                this.setTitle("กำหนดประเภทรายจ่าย");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage().toString());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdClear;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdDel;
    private javax.swing.JTable dgvShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
