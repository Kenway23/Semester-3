/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodepolimorfisme;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author Rifki
 */


class AlatMusikGUI1 {
    void mainkan() {
        System.out.println("Memainkan alat musik umum.");
    }
}

// Kelas turunan Gitar
class GitarGUI1 extends AlatMusikGUI1 {
    @Override
    void mainkan() {
        System.out.println("Memainkan suara Gitar.");
    }

     public String getFilePath() {
            return "C:\\gitar.wav";  // Ganti dengan path yang sesuai
        }
}

// Kelas turunan Piano
class PianoGUI1 extends AlatMusikGUI1 {
    @Override
    void mainkan() {
        System.out.println("Memainkan suara Piano.");
    }

     public String getFilePath() {
            return "C:\\piano.wav";  // Ganti dengan path yang sesuai
        }
}

// Kelas turunan Drum
class DrumGUI1 extends AlatMusikGUI1 {
    @Override
    void mainkan() {
        System.out.println("Memainkan suara Drum.");
    }

    public String getFilePath() {
            return "C:\\drum.wav";  // Ganti dengan path yang sesuai
        }
}

public class instanceofStatementsGUI extends javax.swing.JFrame {

    /**
     * Creates new form instanceofStatementsGUI
     */
    public instanceofStatementsGUI() {
        initComponents();
    }
    
    private void playSound(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                JOptionPane.showMessageDialog(this, "File musik tidak ditemukan: " + file.getAbsolutePath());
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            while (!clip.isRunning()) {
                Thread.sleep(10);
            }

            while (clip.isRunning()) {
                Thread.sleep(10);
            }

            clip.close();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException | InterruptedException e) {
            JOptionPane.showMessageDialog(this, "Gagal memutar suara: " + e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Alat Musik");

        jLabel2.setText("Pilih Alat Musik");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gitar", "Piano", "Drum" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mainkan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButton2)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String pilihan = (String) jComboBox1.getSelectedItem();
    AlatMusikGUI1 alatMusik = null;
    String filePath = "";  // Variabel untuk menyimpan path file audio

    // Tentukan objek alat musik berdasarkan pilihan
    if (pilihan != null) {
        switch (pilihan) {
            case "Gitar":
                alatMusik = new GitarGUI1();
                filePath = ((GitarGUI1) alatMusik).getFilePath();  // Ambil path file suara Gitar
                break;
            case "Piano":
                alatMusik = new PianoGUI1();
                filePath = ((PianoGUI1) alatMusik).getFilePath();  // Ambil path file suara Piano
                break;
            case "Drum":
                alatMusik = new DrumGUI1();
                filePath = ((DrumGUI1) alatMusik).getFilePath();  // Ambil path file suara Drum
                break;
            default:
                JOptionPane.showMessageDialog(this, "Alat musik tidak dikenal.");
                return;
        }

        // Mainkan suara berdasarkan alat musik yang dipilih
        alatMusik.mainkan();  // Memanggil metode mainkan untuk menampilkan pesan

        // Panggil metode playSound untuk memutar suara berdasarkan path
        playSound(filePath);
    }// TODO add your handling code here:  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(instanceofStatementsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instanceofStatementsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instanceofStatementsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instanceofStatementsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new instanceofStatementsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
