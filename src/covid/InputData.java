package covid;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class InputData extends javax.swing.JFrame {

    private Object jeniskelamin;

    public InputData() {
        initComponents();

    }

    public void Submit() {
        try {
            TableData.AddTable(new Object[]{
                Nama_330.getText(), Alamat_330.getText(), Hp_330.getText(), jeniskelamin, Setatus_330.getSelectedItem()
            });
            JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan", " Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1_330 = new javax.swing.JPanel();
        Sts = new javax.swing.JLabel();
        jeneng = new javax.swing.JLabel();
        tujuan = new javax.swing.JLabel();
        telepon = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        Hp_330 = new javax.swing.JTextField();
        Nama_330 = new javax.swing.JTextField();
        Alamat_330 = new javax.swing.JTextField();
        Perempuan_330 = new javax.swing.JRadioButton();
        Laki_302 = new javax.swing.JRadioButton();
        Setatus_330 = new javax.swing.JComboBox<>();
        Keluar_330 = new javax.swing.JButton();
        Submit_330 = new javax.swing.JButton();
        Clear_330 = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Aplikasa Data Pasien Covid19");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                onClosingWindow(evt);
            }
        });

        jPanel1_330.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1_330.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sts.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Sts.setForeground(new java.awt.Color(0, 0, 0));
        Sts.setText("Status");
        jPanel1_330.add(Sts, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 100, 30));

        jeneng.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jeneng.setForeground(new java.awt.Color(0, 0, 0));
        jeneng.setText("Nama");
        jPanel1_330.add(jeneng, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 100, 30));

        tujuan.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tujuan.setForeground(new java.awt.Color(0, 0, 0));
        tujuan.setText("Alamat");
        jPanel1_330.add(tujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 100, 30));

        telepon.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        telepon.setForeground(new java.awt.Color(0, 0, 0));
        telepon.setText("No. HP");
        jPanel1_330.add(telepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 100, 30));

        gender.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 0, 0));
        gender.setText("Jenis Kelamin");
        jPanel1_330.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 200, 30));

        Hp_330.setBackground(new java.awt.Color(255, 255, 255));
        Hp_330.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Hp_330.setForeground(new java.awt.Color(0, 0, 0));
        Hp_330.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hp_330ActionPerformed(evt);
            }
        });
        Hp_330.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Hp_330KeyTyped(evt);
            }
        });
        jPanel1_330.add(Hp_330, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 590, 30));

        Nama_330.setBackground(new java.awt.Color(255, 255, 255));
        Nama_330.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Nama_330.setForeground(new java.awt.Color(0, 0, 0));
        Nama_330.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Nama_330MousePressed(evt);
            }
        });
        Nama_330.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama_330ActionPerformed(evt);
            }
        });
        Nama_330.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Nama_330KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nama_330KeyTyped(evt);
            }
        });
        jPanel1_330.add(Nama_330, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 590, 30));

        Alamat_330.setBackground(new java.awt.Color(255, 255, 255));
        Alamat_330.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Alamat_330.setForeground(new java.awt.Color(0, 0, 0));
        Alamat_330.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Alamat_330KeyTyped(evt);
            }
        });
        jPanel1_330.add(Alamat_330, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 590, 30));

        Perempuan_330.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Perempuan_330.setForeground(new java.awt.Color(0, 0, 0));
        Perempuan_330.setText("Perempuan");
        Perempuan_330.setOpaque(false);
        Perempuan_330.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perempuan_330ActionPerformed(evt);
            }
        });
        jPanel1_330.add(Perempuan_330, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        Laki_302.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Laki_302.setForeground(new java.awt.Color(0, 0, 0));
        Laki_302.setText("Laki-Laki");
        Laki_302.setOpaque(false);
        Laki_302.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Laki_302ActionPerformed(evt);
            }
        });
        jPanel1_330.add(Laki_302, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        Setatus_330.setBackground(new java.awt.Color(255, 255, 255));
        Setatus_330.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        Setatus_330.setForeground(new java.awt.Color(0, 0, 0));
        Setatus_330.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------- Pilih ----------", "ODP", "PDP", "Positif Corona" }));
        Setatus_330.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Setatus_330ActionPerformed(evt);
            }
        });
        jPanel1_330.add(Setatus_330, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 200, -1));

        Keluar_330.setBackground(new java.awt.Color(255, 255, 255));
        Keluar_330.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        Keluar_330.setForeground(new java.awt.Color(0, 0, 0));
        Keluar_330.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/exitIcon.png"))); // NOI18N
        Keluar_330.setText("Keluar");
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
        jPanel1_330.add(Keluar_330, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, 170, 50));

        Submit_330.setBackground(new java.awt.Color(255, 255, 255));
        Submit_330.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        Submit_330.setForeground(new java.awt.Color(0, 0, 0));
        Submit_330.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/PlusIcon.png"))); // NOI18N
        Submit_330.setText("Submit");
        Submit_330.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Submit_330.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Submit_330MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Submit_330MousePressed(evt);
            }
        });
        Submit_330.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_330ActionPerformed(evt);
            }
        });
        jPanel1_330.add(Submit_330, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 180, 50));

        Clear_330.setBackground(new java.awt.Color(255, 255, 255));
        Clear_330.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        Clear_330.setForeground(new java.awt.Color(0, 0, 0));
        Clear_330.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/ClearIcon.png"))); // NOI18N
        Clear_330.setText("Clear");
        Clear_330.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clear_330MouseClicked(evt);
            }
        });
        Clear_330.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_330ActionPerformed(evt);
            }
        });
        jPanel1_330.add(Clear_330, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 620, 180, 50));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/images.jpg"))); // NOI18N
        jPanel1_330.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/PicsArt_06-03-04.11.08.jpg"))); // NOI18N
        jPanel1_330.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_330, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_330, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void onClosingWindow(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onClosingWindow
        if (JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Keluar?", "Konfirmasi", 
                JOptionPane.YES_NO_OPTION) == 0) {
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_onClosingWindow

    private void Keluar_330MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Keluar_330MouseClicked
        String tanya = " Apakah Anda Yankin Ingin Keluar? ";
        boolean yakin = JOptionPane.showConfirmDialog(this, tanya, " Konfirmasi ", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.YES_OPTION;
        if (yakin) {
            dispose();
        }
    }//GEN-LAST:event_Keluar_330MouseClicked

    private void Submit_330MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Submit_330MouseClicked
        Submit();
    }//GEN-LAST:event_Submit_330MouseClicked

    private void Submit_330MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Submit_330MousePressed

    }//GEN-LAST:event_Submit_330MousePressed

    private void Laki_302ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Laki_302ActionPerformed
        // TODO add your handling code here:
        if (Laki_302.isSelected()) {
            Perempuan_330.setSelected(false);
            jeniskelamin = "Laki-Laki";

        }
    }//GEN-LAST:event_Laki_302ActionPerformed

    private void Perempuan_330ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perempuan_330ActionPerformed
        // TODO add your handling code here:
        if (Perempuan_330.isSelected()) {
            Laki_302.setSelected(false);
            jeniskelamin = "Perempuan";
        }
    }//GEN-LAST:event_Perempuan_330ActionPerformed

    private void Clear_330MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clear_330MouseClicked
        // TODO add your handling code here:
        Nama_330.setText("");
        Alamat_330.setText("");
        Hp_330.setText("");
        Setatus_330.setSelectedItem(">>Pilih<<");
        Laki_302.setSelected(false);
        Perempuan_330.setSelected(false);
    }//GEN-LAST:event_Clear_330MouseClicked

    private void Nama_330KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nama_330KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c) || Character.isWhitespace(c)) 
                || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_Nama_330KeyTyped

    private void Alamat_330KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Alamat_330KeyTyped

    }//GEN-LAST:event_Alamat_330KeyTyped

    private void Hp_330KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Hp_330KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_Hp_330KeyTyped

    private void Nama_330MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nama_330MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_Nama_330MousePressed

    private void Nama_330KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nama_330KeyPressed
        // TODO add your handling code here:  
    }//GEN-LAST:event_Nama_330KeyPressed

    private void Setatus_330ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Setatus_330ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Setatus_330ActionPerformed

    private void Nama_330ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama_330ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama_330ActionPerformed

    private void Submit_330ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_330ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Submit_330ActionPerformed

    private void Clear_330ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_330ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Clear_330ActionPerformed

    private void Keluar_330ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Keluar_330ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Keluar_330ActionPerformed

    private void Hp_330ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hp_330ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hp_330ActionPerformed

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
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat_330;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Clear_330;
    private javax.swing.JTextField Hp_330;
    private javax.swing.JButton Keluar_330;
    private javax.swing.JRadioButton Laki_302;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField Nama_330;
    private javax.swing.JRadioButton Perempuan_330;
    private javax.swing.JComboBox<String> Setatus_330;
    private javax.swing.JLabel Sts;
    private javax.swing.JButton Submit_330;
    private javax.swing.JLabel gender;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1_330;
    private javax.swing.JLabel jeneng;
    private javax.swing.JLabel telepon;
    private javax.swing.JLabel tujuan;
    // End of variables declaration//GEN-END:variables
}
