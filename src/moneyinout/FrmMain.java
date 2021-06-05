package moneyinout;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hiro-11
 */
public class FrmMain extends javax.swing.JFrame {

    Connection conn;

    public FrmMain() {
        initComponents();
        conn = (Connection) My_CNX.getConnect();
        // Center The Form
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskMain = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnConfig = new javax.swing.JMenu();
        mnLimit = new javax.swing.JMenuItem();
        mnDocno = new javax.swing.JMenu();
        mnInOut = new javax.swing.JMenuItem();
        mnReport = new javax.swing.JMenu();
        mnReportDay = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnReportMonth = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnReportYear = new javax.swing.JMenuItem();
        mnBackup = new javax.swing.JMenu();
        mnExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("โปรแกมบันทึก รายรับ-รายจ่าย");
        setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        dskMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dskMain.setPreferredSize(new java.awt.Dimension(1077, 735));

        mnConfig.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnConfig.setForeground(new java.awt.Color(143, 60, 16));
        mnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admin20x20.png"))); // NOI18N
        mnConfig.setText("กำหนดค่า");
        mnConfig.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        mnLimit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        mnLimit.setForeground(new java.awt.Color(143, 60, 16));
        mnLimit.setText("กำหนดสิทธิ์การใช้งาน");
        mnLimit.setBorder(null);
        mnLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLimitActionPerformed(evt);
            }
        });
        mnConfig.add(mnLimit);

        jMenuBar1.add(mnConfig);

        mnDocno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnDocno.setForeground(new java.awt.Color(143, 60, 16));
        mnDocno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/doc2 20x20.png"))); // NOI18N
        mnDocno.setText("จัดการเอกสาร");
        mnDocno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        mnInOut.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        mnInOut.setForeground(new java.awt.Color(143, 60, 16));
        mnInOut.setText("ลงบันทึก รายรับ-รายจ่าย");
        mnInOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnInOutActionPerformed(evt);
            }
        });
        mnDocno.add(mnInOut);

        jMenuBar1.add(mnDocno);

        mnReport.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnReport.setForeground(new java.awt.Color(143, 60, 16));
        mnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/print20x20.png"))); // NOI18N
        mnReport.setText("รายงาน");
        mnReport.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        mnReportDay.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        mnReportDay.setForeground(new java.awt.Color(143, 60, 16));
        mnReportDay.setText("รายงานประจำวัน");
        mnReportDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReportDayActionPerformed(evt);
            }
        });
        mnReport.add(mnReportDay);
        mnReport.add(jSeparator1);

        mnReportMonth.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        mnReportMonth.setForeground(new java.awt.Color(143, 60, 16));
        mnReportMonth.setText("รายงานประจำเดือน");
        mnReport.add(mnReportMonth);
        mnReport.add(jSeparator2);

        mnReportYear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        mnReportYear.setForeground(new java.awt.Color(143, 60, 16));
        mnReportYear.setText("รายงานประจำปี");
        mnReport.add(mnReportYear);

        jMenuBar1.add(mnReport);

        mnBackup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnBackup.setForeground(new java.awt.Color(143, 60, 16));
        mnBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/backup_and_restore20x20.png"))); // NOI18N
        mnBackup.setText("Backup & Restore");
        mnBackup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mnBackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnBackupMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnBackup);

        mnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnExit.setForeground(new java.awt.Color(143, 60, 16));
        mnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit20x20.png"))); // NOI18N
        mnExit.setText("ออกจากโปรแกรม");
        mnExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1069, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskMain, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1087, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnExitMouseClicked

        //ออกจากโปรแกม
        JLabel txt1 = new JLabel("คุณต้องการออกจากโปรแกรมใช่หรือไม่?");
        txt1.setFont(new Font("tahoma", Font.BOLD, 16));
        txt1.setForeground(Color.red);

        if (JOptionPane.showConfirmDialog(this, txt1, "ตรวจสอบ", JOptionPane.YES_NO_OPTION)
                == JOptionPane.NO_OPTION) {
            return;
        }
        System.exit(0);
    }//GEN-LAST:event_mnExitMouseClicked

    private void mnLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLimitActionPerformed
        // เปิดหน้าต่างกำหนดสิทธิ์การใช้งาน
        dskMain.removeAll();
        FrmFix_User frm = new FrmFix_User();
        Wprv_ScreenForm(frm,true);
        dskMain.add(frm);
        //frm.setVisible(true);
    }//GEN-LAST:event_mnLimitActionPerformed

    private void mnBackupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnBackupMouseClicked
        // เปิดหน้าต่าง Backup Restore
        dskMain.removeAll();
        SQLBackupAndRestore frm = new SQLBackupAndRestore();
        Wprv_ScreenForm(frm,true);
        dskMain.add(frm);
        //frm.setVisible(true);
    }//GEN-LAST:event_mnBackupMouseClicked

    private void mnInOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnInOutActionPerformed
        // เปิดหน้าต่าง รายรับ-รายจ่าย
        dskMain.removeAll();
        FrmInOut frm = new FrmInOut();
        Wprv_ScreenForm(frm,true);
        dskMain.add(frm);
        //frm.setVisible(true);
    }//GEN-LAST:event_mnInOutActionPerformed

    private void mnReportDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReportDayActionPerformed
        // เปิดหน้าต่าง รายงานประจำวัน
        dskMain.removeAll();
        FrmReportDay frm = new FrmReportDay();
        Wprv_ScreenForm(frm,true);
        dskMain.add(frm);
        //frm.setVisible(true);
    }//GEN-LAST:event_mnReportDayActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }
        private void Wprv_ScreenForm(JInternalFrame _Frm,boolean _bCheck){
            Dimension dimScreen = Toolkit.getDefaultToolkit().getScreenSize();

            int nWidth = _Frm.getSize().width;
            int nHeight = _Frm.getSize().height;

            int nScreenX = (dimScreen.width-nWidth)/2;
            int nScreenY = ((dimScreen.height-nHeight)/2)-120;

           // _Frm.setLocation(nScreenX, nScreenY);
            _Frm.setVisible(_bCheck);
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskMain;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnBackup;
    private javax.swing.JMenu mnConfig;
    private javax.swing.JMenu mnDocno;
    private javax.swing.JMenu mnExit;
    private javax.swing.JMenuItem mnInOut;
    private javax.swing.JMenuItem mnLimit;
    private javax.swing.JMenu mnReport;
    private javax.swing.JMenuItem mnReportDay;
    private javax.swing.JMenuItem mnReportMonth;
    private javax.swing.JMenuItem mnReportYear;
    // End of variables declaration//GEN-END:variables
}
