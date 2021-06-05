package moneyinout;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;

public class SQLBackupAndRestore extends javax.swing.JInternalFrame {

    /** Creates new form SQLBackupAndRestore */
    public SQLBackupAndRestore() {
        initComponents();
    }
        String path = null;
        String filename;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpath1 = new javax.swing.JTextField();
        btnbrowse1 = new javax.swing.JButton();
        btnbackup = new javax.swing.JButton();
        txtrec1 = new javax.swing.JLabel();
        txtpath2 = new javax.swing.JTextField();
        btnbrowse2 = new javax.swing.JButton();
        btnrestore = new javax.swing.JButton();
        txtrec2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1070, 725));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 5, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 480));
        jPanel1.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 50)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(143, 60, 16));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Backup And Restore ฐานข้อมูล");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(5, 15, 1040, 80);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(143, 60, 16));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("โปรแกรมรายรับ - รายจ่าย");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(182, 102, 561, 51);

        txtpath1.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtpath1.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(txtpath1);
        txtpath1.setBounds(247, 160, 346, 30);

        btnbrowse1.setFont(new java.awt.Font("Tahoma", 1, 16));
        btnbrowse1.setForeground(new java.awt.Color(143, 60, 16));
        btnbrowse1.setText("Browse");
        btnbrowse1.setPreferredSize(new java.awt.Dimension(90, 30));
        btnbrowse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowse1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnbrowse1);
        btnbrowse1.setBounds(605, 160, 100, 30);

        btnbackup.setFont(new java.awt.Font("Tahoma", 1, 16));
        btnbackup.setForeground(new java.awt.Color(143, 60, 16));
        btnbackup.setText("Backup");
        btnbackup.setPreferredSize(new java.awt.Dimension(90, 30));
        btnbackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackupActionPerformed(evt);
            }
        });
        jPanel1.add(btnbackup);
        btnbackup.setBounds(247, 197, 100, 30);

        txtrec1.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtrec1.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(txtrec1);
        txtrec1.setBounds(357, 197, 234, 30);

        txtpath2.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtpath2.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(txtpath2);
        txtpath2.setBounds(247, 263, 345, 30);

        btnbrowse2.setFont(new java.awt.Font("Tahoma", 1, 16));
        btnbrowse2.setForeground(new java.awt.Color(143, 60, 16));
        btnbrowse2.setText("Browse");
        btnbrowse2.setPreferredSize(new java.awt.Dimension(90, 30));
        btnbrowse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowse2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnbrowse2);
        btnbrowse2.setBounds(604, 263, 100, 30);

        btnrestore.setFont(new java.awt.Font("Tahoma", 1, 16));
        btnrestore.setForeground(new java.awt.Color(143, 60, 16));
        btnrestore.setText("Restore");
        btnrestore.setPreferredSize(new java.awt.Dimension(90, 30));
        btnrestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestoreActionPerformed(evt);
            }
        });
        jPanel1.add(btnrestore);
        btnrestore.setBounds(247, 300, 100, 30);

        txtrec2.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtrec2.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(txtrec2);
        txtrec2.setBounds(357, 300, 234, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1054, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbrowse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrowse1ActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

        try {
            File f = fc.getSelectedFile();
            path = f.getAbsolutePath();
            path = path.replace('\\', '/');
            path = path + "_" + date + ".sql";
            txtpath1.setText(path);

        } catch (Exception e) {
            e.printStackTrace();
        }
}//GEN-LAST:event_btnbrowse1ActionPerformed

    private void btnbackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackupActionPerformed

        Process p = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            p = runtime.exec("D:/xampp/mysql/bin/mysqldump.exe -uroot --add-drop-database -B lbdatabase -r" + path);
            //p=runtime.exec("C:/xampp/mysql/bin/mysqldump.exe -uroot -p --add-drop-database -B lbdatabase -r"+path);
            int processComplete = p.waitFor();
            if (processComplete == 0) {
                txtrec1.setText("Backup Created Succuss");
            } else {
                txtrec1.setText("Can't Create backup");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
}//GEN-LAST:event_btnbackupActionPerformed

    private void btnbrowse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrowse2ActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        try {
            File f = fc.getSelectedFile();
            path = f.getAbsolutePath();
            path = path.replace('\\', '/');

            txtpath2.setText(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
}//GEN-LAST:event_btnbrowse2ActionPerformed

    private void btnrestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestoreActionPerformed
        String dbUserName = "root";// username
        String dbPassword = "";

        String[] restoreCmd = new String[]{"D:/xampp/mysql/bin/mysql.exe ", "--user=" + dbUserName, "-e", "source " + path};
        //String[] restoreCmd = new String[]{"C:/xampp/mysql/bin/mysql.exe ", "--user=" + dbUserName, "--password=" + dbPassword, "-e", "source " + path};
        Process runtimProcess;
        try {
            runtimProcess = Runtime.getRuntime().exec(restoreCmd);
            int proceCom = runtimProcess.waitFor();

            if (proceCom == 0) {
                txtrec2.setText("Restored Succuss");
            } else {
                txtrec2.setText("Can't Restored");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
}//GEN-LAST:event_btnrestoreActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbackup;
    private javax.swing.JButton btnbrowse1;
    private javax.swing.JButton btnbrowse2;
    private javax.swing.JButton btnrestore;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtpath1;
    private javax.swing.JTextField txtpath2;
    private javax.swing.JLabel txtrec1;
    private javax.swing.JLabel txtrec2;
    // End of variables declaration//GEN-END:variables
}
