
package covid;

import java.awt.Component;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableData extends javax.swing.JFrame {

    public TableData() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1_330 = new javax.swing.JPopupMenu();
        Hapus_330 = new javax.swing.JMenuItem();
        jToolBar1_330 = new javax.swing.JToolBar();
        Tambah_330 = new javax.swing.JButton();
        Keluar_330 = new javax.swing.JButton();
        jPanel1_330 = new javax.swing.JPanel();
        jScrollPane1_330 = new javax.swing.JScrollPane();
        Table_330 = new javax.swing.JTable();
        Logo = new javax.swing.JLabel();
        Bacground = new javax.swing.JLabel();
        jMenuBar1_330 = new javax.swing.JMenuBar();
        Menu_330 = new javax.swing.JMenu();
        Pilihan_330 = new javax.swing.JMenu();
        MenuItem1_330 = new javax.swing.JMenuItem();
        MenuItem_330 = new javax.swing.JMenuItem();
        Tentang_330 = new javax.swing.JMenuItem();

        Hapus_330.setForeground(new java.awt.Color(0, 0, 0));
        Hapus_330.setMnemonic('h');
        Hapus_330.setText("Hapus");
        Hapus_330.setEnabled(false);
        Hapus_330.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hapus_330MouseClicked(evt);
            }
        });
        Hapus_330.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hapus_330ActionPerformed(evt);
            }
        });
        jPopupMenu1_330.add(Hapus_330);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu_Aplikasi");
        setMinimumSize(new java.awt.Dimension(1900, 1085));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                onClosingWindow(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1_330.setRollover(true);

        Tambah_330.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/PlusIcon.png"))); // NOI18N
        Tambah_330.setFocusable(false);
        Tambah_330.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tambah_330.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Tambah_330.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tambah_330MouseClicked(evt);
            }
        });
        jToolBar1_330.add(Tambah_330);

        Keluar_330.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/exitIcon.png"))); // NOI18N
        Keluar_330.setFocusable(false);
        Keluar_330.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Keluar_330.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Keluar_330.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Keluar_330MouseClicked(evt);
            }
        });
        Keluar_330.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Keluar_330ActionPerformed(evt);
            }
        });
        jToolBar1_330.add(Keluar_330);

        getContentPane().add(jToolBar1_330, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1880, 25));

        jPanel1_330.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1_330.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1_330.setMaximumSize(new java.awt.Dimension(433, 458));
        jPanel1_330.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_330.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Table_330.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Alamat", "No Hp", "Jenis Kelamin", "Status"
            }
        ));
        Table_330.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Table_330.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_330MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Table_330MouseReleased(evt);
            }
        });
        jScrollPane1_330.setViewportView(Table_330);

        jPanel1_330.add(jScrollPane1_330, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 1480, 380));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/images.jpg"))); // NOI18N
        jPanel1_330.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        Bacground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Kesehatan.jpeg"))); // NOI18N
        jPanel1_330.add(Bacground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1880, 1250));

        getContentPane().add(jPanel1_330, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, 1880, 1250));

        Menu_330.setMnemonic('m');
        Menu_330.setText("MENU");
        Menu_330.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Menu_330.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_330MousePressed(evt);
            }
        });

        Pilihan_330.setBackground(new java.awt.Color(255, 255, 255));
        Pilihan_330.setForeground(new java.awt.Color(0, 0, 0));
        Pilihan_330.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/DataIcon.png"))); // NOI18N
        Pilihan_330.setMnemonic('p');
        Pilihan_330.setText("Pilihan");
        Pilihan_330.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        MenuItem1_330.setBackground(new java.awt.Color(255, 255, 255));
        MenuItem1_330.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        MenuItem1_330.setForeground(new java.awt.Color(0, 0, 0));
        MenuItem1_330.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/PlusIcon.png"))); // NOI18N
        MenuItem1_330.setMnemonic('+');
        MenuItem1_330.setText("Tambah Data");
        MenuItem1_330.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuItem1_330MousePressed(evt);
            }
        });
        MenuItem1_330.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem1_330ActionPerformed(evt);
            }
        });
        Pilihan_330.add(MenuItem1_330);

        MenuItem_330.setBackground(new java.awt.Color(255, 255, 255));
        MenuItem_330.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        MenuItem_330.setForeground(new java.awt.Color(0, 0, 0));
        MenuItem_330.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/exitIcon.png"))); // NOI18N
        MenuItem_330.setText("Keluar ");
        MenuItem_330.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuItem_330MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuItem_330MousePressed(evt);
            }
        });
        MenuItem_330.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_330ActionPerformed(evt);
            }
        });
        Pilihan_330.add(MenuItem_330);

        Menu_330.add(Pilihan_330);

        Tentang_330.setBackground(new java.awt.Color(255, 255, 255));
        Tentang_330.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Tentang_330.setForeground(new java.awt.Color(0, 0, 0));
        Tentang_330.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/ProfilIcon.png"))); // NOI18N
        Tentang_330.setText("Tentang");
        Tentang_330.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Tentang_330MousePressed(evt);
            }
        });
        Tentang_330.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tentang_330ActionPerformed(evt);
            }
        });
        Menu_330.add(Tentang_330);

        jMenuBar1_330.add(Menu_330);

        setJMenuBar(jMenuBar1_330);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItem_330MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem_330MouseClicked

    }//GEN-LAST:event_MenuItem_330MouseClicked

    private void MenuItem_330MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem_330MousePressed
        // TODO add your handling code here:
        String tanya = " Apakah Anda Yankin Ingin Keluar? ";
        boolean yakin = JOptionPane.showConfirmDialog(this, tanya, " Konfirmasi ", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.YES_OPTION;
        if (yakin) {
            dispose();
        }
    }//GEN-LAST:event_MenuItem_330MousePressed

    private void Tentang_330MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tentang_330MousePressed
        About a;
        a = new About();
        a.setVisible(true);

    }//GEN-LAST:event_Tentang_330MousePressed

    private void Tentang_330ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tentang_330ActionPerformed

    }//GEN-LAST:event_Tentang_330ActionPerformed

    private void Menu_330MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_330MousePressed

    }//GEN-LAST:event_Menu_330MousePressed

    private void onClosingWindow(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onClosingWindow
        if (JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Keluar?", "Konfirmasi", 
                JOptionPane.YES_NO_OPTION) == 0) {
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_onClosingWindow

    private void Keluar_330MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Keluar_330MouseClicked
        String tanya = " Apakah Anda Yankin Ingin Keluar? ";
        boolean yakin = JOptionPane.showConfirmDialog(this, tanya, " Konfirmasi ", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.YES_OPTION;
        if (yakin) {
            dispose();
        }
    }//GEN-LAST:event_Keluar_330MouseClicked

    private void MenuItem1_330ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem1_330ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MenuItem1_330ActionPerformed

    private void MenuItem1_330MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem1_330MousePressed
        InputData a;
        a = new InputData();        //Membuat kelas inputData
        a.setVisible(true);         
    }//GEN-LAST:event_MenuItem1_330MousePressed

    private void Tambah_330MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tambah_330MouseClicked
        InputData a;
        a = new InputData();       // Membuat Kelas inputData
        a.setVisible(true);
    }//GEN-LAST:event_Tambah_330MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void Hapus_330MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hapus_330MouseClicked
        DefaultTableModel model = (DefaultTableModel) Table_330.getModel();
        if (Table_330.getSelectedRow() == -1) {
            if (Table_330.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, " Maaf Tidak Ada Data Apapun ", "Pesan", 
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            int a = Table_330.getSelectedRow();
            model.removeRow(a);
        }
    }//GEN-LAST:event_Hapus_330MouseClicked

    private void Table_330MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_330MouseClicked

    }//GEN-LAST:event_Table_330MouseClicked

    private void Table_330MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_330MouseReleased
        // TODO add your handling code here:
        if (evt.isPopupTrigger()) {
            JTable source = (JTable) evt.getSource();
            int row = source.rowAtPoint(evt.getPoint());
            int coloum = source.columnAtPoint(evt.getPoint());

            if (!source.isRowSelected(row)) {
                source.changeSelection(row, coloum, false, false);
            }

            jPopupMenu1_330.show(evt.getComponent(), evt.getX(), evt.getY());

        }
    }//GEN-LAST:event_Table_330MouseReleased

    private void Hapus_330ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hapus_330ActionPerformed

    }//GEN-LAST:event_Hapus_330ActionPerformed

    private void Keluar_330ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Keluar_330ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Keluar_330ActionPerformed

    private void MenuItem_330ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_330ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItem_330ActionPerformed
    public static void AddTable(Object[] dataRow) {
        DefaultTableModel model = (DefaultTableModel) Table_330.getModel();
        model.addRow(dataRow);
    }

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
            java.util.logging.Logger.getLogger(TableData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bacground;
    private javax.swing.JMenuItem Hapus_330;
    private javax.swing.JButton Keluar_330;
    private javax.swing.JLabel Logo;
    private javax.swing.JMenuItem MenuItem1_330;
    private javax.swing.JMenuItem MenuItem_330;
    private javax.swing.JMenu Menu_330;
    private javax.swing.JMenu Pilihan_330;
    private static javax.swing.JTable Table_330;
    private javax.swing.JButton Tambah_330;
    private javax.swing.JMenuItem Tentang_330;
    private javax.swing.JMenuBar jMenuBar1_330;
    private javax.swing.JPanel jPanel1_330;
    private javax.swing.JPopupMenu jPopupMenu1_330;
    private javax.swing.JScrollPane jScrollPane1_330;
    private javax.swing.JToolBar jToolBar1_330;
    // End of variables declaration//GEN-END:variables
}
