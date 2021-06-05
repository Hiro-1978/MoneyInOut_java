package moneyinout;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmInOut extends javax.swing.JInternalFrame {

    Connection conn;

    public FrmInOut() {
        initComponents();
        conn = (Connection) My_CNX.getConnect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblDocNo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dtpDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        rdbIn = new javax.swing.JRadioButton();
        rdbOut = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox();
        cmdType = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetail = new javax.swing.JTextArea();
        cmdClear = new javax.swing.JButton();
        cmdSave = new javax.swing.JButton();
        cmdEdit = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        cmdClose = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        chkDocNo = new javax.swing.JCheckBox();
        dtpSearch = new org.jdesktop.swingx.JXDatePicker();
        cmdSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dgvShow = new javax.swing.JTable();

        setTitle("เอกสารรายรับ-รายจ่าย");
        setPreferredSize(new java.awt.Dimension(1070, 725));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(143, 60, 16));
        jLabel1.setText("เลขที่เอกสาร");

        lblDocNo.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblDocNo.setForeground(new java.awt.Color(143, 60, 16));
        lblDocNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocNo.setText("DocNo");
        lblDocNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 60, 16)));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(143, 60, 16));
        jLabel2.setText("วันที่");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 20, 100, 30);

        dtpDate.setForeground(new java.awt.Color(143, 60, 16));
        dtpDate.setFont(new java.awt.Font("Tahoma", 1, 14));
        jPanel1.add(dtpDate);
        dtpDate.setBounds(136, 22, 160, 24);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setForeground(new java.awt.Color(143, 60, 16));
        jLabel3.setText("รับ/จ่าย");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(29, 67, 100, 20);

        buttonGroup1.add(rdbIn);
        rdbIn.setFont(new java.awt.Font("Tahoma", 1, 14));
        rdbIn.setForeground(new java.awt.Color(143, 60, 16));
        rdbIn.setSelected(true);
        rdbIn.setText("รายรับ");
        rdbIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbInMouseClicked(evt);
            }
        });
        jPanel1.add(rdbIn);
        rdbIn.setBounds(136, 63, 130, 25);

        buttonGroup1.add(rdbOut);
        rdbOut.setFont(new java.awt.Font("Tahoma", 1, 14));
        rdbOut.setForeground(new java.awt.Color(143, 60, 16));
        rdbOut.setText("รายจ่าย");
        rdbOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbOutMouseClicked(evt);
            }
        });
        jPanel1.add(rdbOut);
        rdbOut.setBounds(261, 63, 130, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(143, 60, 16));
        jLabel4.setText("รายการ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(29, 109, 100, 20);

        cmbType.setForeground(new java.awt.Color(143, 60, 16));
        jPanel1.add(cmbType);
        cmbType.setBounds(140, 110, 190, 30);

        cmdType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search20x20.png"))); // NOI18N
        cmdType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTypeActionPerformed(evt);
            }
        });
        jPanel1.add(cmdType);
        cmdType.setBounds(350, 110, 40, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setForeground(new java.awt.Color(143, 60, 16));
        jLabel5.setText("จำนวนเงิน");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(29, 152, 100, 20);

        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 15));
        txtAmount.setForeground(new java.awt.Color(143, 60, 16));
        jPanel1.add(txtAmount);
        txtAmount.setBounds(140, 150, 190, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setForeground(new java.awt.Color(143, 60, 16));
        jLabel6.setText("บาท");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(350, 150, 27, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setForeground(new java.awt.Color(143, 60, 16));
        jLabel7.setText("หมายเหตุ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(29, 189, 100, 20);

        txtDetail.setColumns(20);
        txtDetail.setFont(new java.awt.Font("Tahoma", 0, 13));
        txtDetail.setForeground(new java.awt.Color(143, 60, 16));
        txtDetail.setRows(5);
        jScrollPane1.setViewportView(txtDetail);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 190, 290, 136);

        cmdClear.setForeground(new java.awt.Color(143, 60, 16));
        cmdClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clearlist20x20.png"))); // NOI18N
        cmdClear.setText("ล้างข้อมูล");
        cmdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClearActionPerformed(evt);
            }
        });
        jPanel1.add(cmdClear);
        cmdClear.setBounds(310, 340, 120, 29);

        cmdSave.setForeground(new java.awt.Color(143, 60, 16));
        cmdSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save20x20.png"))); // NOI18N
        cmdSave.setText("บันทึกรายการ");
        cmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveActionPerformed(evt);
            }
        });

        cmdEdit.setForeground(new java.awt.Color(143, 60, 16));
        cmdEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit20x20.png"))); // NOI18N
        cmdEdit.setText("แก้ไขรายการ");
        cmdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditActionPerformed(evt);
            }
        });

        cmdDelete.setForeground(new java.awt.Color(143, 60, 16));
        cmdDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete20x20.png"))); // NOI18N
        cmdDelete.setText("ลบรายการ");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmdClose.setForeground(new java.awt.Color(143, 60, 16));
        cmdClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit20x20.png"))); // NOI18N
        cmdClose.setText("ปิดหน้าต่าง");
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setForeground(new java.awt.Color(143, 60, 16));
        jLabel8.setText("ค้นหาวันที่ทำรายการ");

        chkDocNo.setFont(new java.awt.Font("Tahoma", 1, 14));
        chkDocNo.setForeground(new java.awt.Color(143, 60, 16));
        chkDocNo.setText("เอกสารประจำวัน");
        chkDocNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkDocNoMouseClicked(evt);
            }
        });

        dtpSearch.setForeground(new java.awt.Color(143, 60, 16));
        dtpSearch.setFont(new java.awt.Font("Tahoma", 1, 14));

        cmdSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search20x20.png"))); // NOI18N
        cmdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSearchActionPerformed(evt);
            }
        });

        dgvShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่เอกสาร", "วันที่", "รายการ", "จำนวนเงิน", "สถานะ"
            }
        ));
        dgvShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgvShowMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dgvShow);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdClose, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDocNo, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(chkDocNo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtpSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dtpSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(cmdSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkDocNo)
                        .addComponent(lblDocNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdEdit)
                            .addComponent(cmdSave)
                            .addComponent(cmdDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(cmdClose))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cmdCloseActionPerformed

    private void cmdTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTypeActionPerformed
        // TODO add your handling code here:
        FrmType Frm = new FrmType(null, true);

        if (rdbIn.isSelected() == true) {

            Frm.psCheck = "1";
        } else {

            Frm.psCheck = "2";
        }

        Frm.setModal(true);
        Frm.setVisible(true);
        showdataType();
    }//GEN-LAST:event_cmdTypeActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        showdataType();
        lblDocNo.setText(AutoId());
        showdata(" Where datecreate=' " + datDate.format(dNow).toString().trim() + " ' ");
        chkDocNo.setText("เอกสารวันที่ : " + datDateTitle.format(dNow).toString().trim());
        //dtpDate.setDate(datDateTitle.format(dNow).toString().trim());
    }//GEN-LAST:event_formInternalFrameOpened

    private void rdbInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbInMouseClicked
        // TODO add your handling code here:
        showdataType();
    }//GEN-LAST:event_rdbInMouseClicked

    private void rdbOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbOutMouseClicked
        // TODO add your handling code here:
        showdataType();
    }//GEN-LAST:event_rdbOutMouseClicked

    private void cmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveActionPerformed
        // TODO add your handling code here:
        try {
            if (cmbType.getSelectedItem().toString().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "กรุณากรอก ประเภทการเบิก", "ตรวจสอบ", JOptionPane.WARNING_MESSAGE, null);
                return;
            }

            if (txtAmount.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "กรุณากรอก จำนวนเงิน", "ตรวจสอบ", JOptionPane.WARNING_MESSAGE, null);
                return;
            }

            formatter = new SimpleDateFormat("yyyy/MM/dd");
            dateFormat = dtpDate.getDate();
            resultDateFrom = formatter.format(dateFormat);

            double dAmount = 0;
            String sStatus = "";
            if (rdbIn.isSelected() == true) {
                dAmount = Double.parseDouble(txtAmount.getText().trim());
                sStatus = "1";
            } else {
                dAmount = Double.parseDouble(txtAmount.getText().trim()) * (-1);
                sStatus = "2";
            }

            String sSql = "insert into bninout(docno,dateinout,typeinout,detail,amount,amountstatus,status,datecreate) "
                    + " values (' " + lblDocNo.getText().trim() + " ' ,' " + resultDateFrom + " ',' " + cmbType.getSelectedItem().toString().trim() + " ' "
                    + ",' " + txtDetail.getText().trim() + " ',' " + txtAmount.getText().trim() + " ',' " + dAmount + " ',' " + sStatus + " ',' " + datDate.format(dNow).toString().trim() + " ')";
            PreparedStatement pre = conn.prepareStatement(sSql);
            if (pre.executeUpdate() != -1) {
                JOptionPane.showMessageDialog(rootPane, "เพิ่มข้อมูลเรียบร้อย", "ตรวจสอบ", JOptionPane.INFORMATION_MESSAGE, null);
            }

            showdata(" Where datecreate=' " + datDate.format(dNow).toString().trim() + " ' ");
            txtAmount.setText("");
            txtDetail.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage().toString(), "ตรวจสอบ", JOptionPane.ERROR_MESSAGE, null);
        }
        lblDocNo.setText(AutoId());
    }//GEN-LAST:event_cmdSaveActionPerformed

    private void chkDocNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkDocNoMouseClicked
        // TODO add your handling code here:
        if (chkDocNo.isSelected() == true) {
            chkDocNo.setText("เอกสารทั้งหมด");
            showdata("");
        } else {
            showdata(" where datecreate='" + datDate.format(dNow).toString().trim() + " ' ");
            chkDocNo.setText("เอกสารวันที่ : " + datDateTitle.format(dNow).toString().trim());
        }
    }//GEN-LAST:event_chkDocNoMouseClicked

    private void cmdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSearchActionPerformed
        // TODO add your handling code here:
        showdata(" where datecreate='" + datDate.format(dtpSearch.getDate()).toString().trim() + " ' ");
    }//GEN-LAST:event_cmdSearchActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
        try {

            if (JOptionPane.showConfirmDialog(this, "คุณต้องการลบใช่หรือไม่?", "ตรวจสอบ", JOptionPane.YES_NO_OPTION)
                    == JOptionPane.NO_OPTION) {
                return;
            }

            String sSql = "delete from bninout where docno=' " + lblDocNo.getText().trim() + " ' ";
            PreparedStatement pre = conn.prepareStatement(sSql);
            if (pre.executeUpdate() != -1) {
                JOptionPane.showMessageDialog(rootPane, "ลบข้อมูลเรียบร้อย", "ตรวจสอบ", JOptionPane.INFORMATION_MESSAGE, null);
            }
            showdata(" Where datecreate=' " + datDate.format(dNow).toString().trim() + " ' ");
            lblDocNo.setText(AutoId());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage().toString(), "ตรวจสอบ", JOptionPane.ERROR_MESSAGE, null);
        }
   
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmdEditActionPerformed

    private void cmdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearActionPerformed
        // TODO add your handling code here:
            lblDocNo.setText(AutoId());
    }//GEN-LAST:event_cmdClearActionPerformed

    private void dgvShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgvShowMouseClicked
        // TODO add your handling code here:
                try {
            int nSelect = dgvShow.getSelectedRow();
            String sDocNo = dgvShow.getValueAt(nSelect, 0).toString();
            lblDocNo.setText(sDocNo);

        } catch (Exception ex) {
        }
    }//GEN-LAST:event_dgvShowMouseClicked

    //--------------------------------Autorun-----------------------------------//
    private String AutoId() {

        String sDocNo = "";
        try {

            Date dNow = new Date();
            DateFormat datMonth = new SimpleDateFormat("MM");
            DateFormat datYear = new SimpleDateFormat("yy");

            int nId = 0;
            String sHead = "DOC" + datYear.format(dNow).trim() + datMonth.format(dNow);
            String sId = "";
            DecimalFormat df1 = new DecimalFormat("0000");

            String sSql;
            Object[] oData = new Object[0];

            sSql = "select * from bninout where docno Like '%" + sHead + "%' Order by docno desc";
            //String sSql = "select * from bntypereceive";
            ResultSet rs = conn.createStatement().executeQuery(sSql);

            int nRow = 0;
            if (rs.next()) {
                sId = rs.getString("docno");
                sId = sId.replace(sHead, "");

                nId = Integer.parseInt(sId);
                sDocNo = sHead + df1.format(nId);

                return sDocNo;

            } else {

                nId = Integer.parseInt("0000") + 1;
                sDocNo = sHead + df1.format(nId);
            }

            return sDocNo;

        } catch (Exception ex) {

            return sDocNo;
        }

    }
    DateFormat datDate = new SimpleDateFormat("yyyy/MM/dd");
    DateFormat datDateTitle = new SimpleDateFormat("dd/MM/yyyy");
    Date dateFormat;
    Date dNow = new Date();
    String resultDateFrom;
    SimpleDateFormat formatter;
    String sCheck = "";

    private void showdataType() {

        try {
            cmbType.removeAllItems();
            if (rdbIn.isSelected() == true) {

                sCheck = "1";
            } else {

                sCheck = "2";
            }

            String sSql;
            String sName;

            Object[] oData = new Object[0];

            sSql = "select * from bntypereceive where status='" + sCheck + " ' ";
            //String sSql = "select * from bntypereceive";
            ResultSet rs = conn.createStatement().executeQuery(sSql);

            int nRow = 0;
            while (rs.next()) {
                sName = rs.getString("name");
                cmbType.addItem(sName);
                nRow++;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage().toString());
        }
    }

    private void showdata(String _sSqlWhere) {
        try {
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel = (DefaultTableModel) dgvShow.getModel();

            dgvShow.getTableHeader().setFont(new Font("tahoma", Font.BOLD, 14));
            dgvShow.getTableHeader().setForeground(new Color(143, 60, 16));
            dgvShow.setFont(new Font("tahoma", Font.PLAIN, 14));
            dgvShow.setForeground(new Color(143, 60, 16));
            //dgvShow.setAutoResizeMode(dgvShow.AUTO_RESIZE_OFF);

            int nRowDel = dgvShow.getRowCount() - 1;
            while (nRowDel > -1) {
                tableModel.removeRow(nRowDel);
                nRowDel--;
            }

            String sDocNo, sDateInOut, sTypeInOut, sAmount, sStatus;

            Object[] oData = new Object[0];

            String sSql = "select docno,dateinout,typeinout,amount,case when status='1' then 'รายรับ' else 'รายจ่าย' end as status from bninout" + _sSqlWhere + " Order by docno desc";
            ResultSet rs = conn.createStatement().executeQuery(sSql);

            int nRow = 0;

            while (rs.next()) {

                sDocNo = rs.getString("docno");
                sDateInOut = rs.getString("dateinout");
                sTypeInOut = rs.getString("typeinout");
                sAmount = rs.getString("amount");
                sStatus = rs.getString("status");
                sDateInOut = rs.getString("dateinout");

                tableModel.addRow(oData);
                dgvShow.setValueAt(sDocNo, nRow, 0);
                dgvShow.setValueAt(sDateInOut, nRow, 1);
                dgvShow.setValueAt(sTypeInOut, nRow, 2);
                dgvShow.setValueAt(sAmount, nRow, 3);
                dgvShow.setValueAt(sStatus, nRow, 4);

                nRow++;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage().toString());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkDocNo;
    private javax.swing.JComboBox cmbType;
    private javax.swing.JButton cmdClear;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdEdit;
    private javax.swing.JButton cmdSave;
    private javax.swing.JButton cmdSearch;
    private javax.swing.JButton cmdType;
    private javax.swing.JTable dgvShow;
    private org.jdesktop.swingx.JXDatePicker dtpDate;
    private org.jdesktop.swingx.JXDatePicker dtpSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDocNo;
    private javax.swing.JRadioButton rdbIn;
    private javax.swing.JRadioButton rdbOut;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextArea txtDetail;
    // End of variables declaration//GEN-END:variables
}
