/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emanuelegargiulo.calcolaobiettivomedia;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.TableModel;

/**
 * Finestra principale dell'applicazione
 * @author emanuelegargiulo
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new Main Window
     */
    public MainWindow() {
        initComponents();
        setLocationRelativeTo(null); //Centra la finestra
        this.setTitle("Calcola obiettivo media");
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
        CFUTotField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CFUCurrField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MediaAttField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        VotoTargetField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        examTable = new javax.swing.JTable();
        CalcolaButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        finalAvgField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        resultAvgField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("CFU Totali Esami ");

        CFUTotField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CFUTotFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("CFU Attuali Esami ");

        CFUCurrField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CFUCurrFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Media Ponderata Attuale");

        MediaAttField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediaAttFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Voto Partenza Target");

        VotoTargetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VotoTargetFieldActionPerformed(evt);
            }
        });

        examTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Esame", "CFU", "Voto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(examTable);
        if (examTable.getColumnModel().getColumnCount() > 0) {
            examTable.getColumnModel().getColumn(0).setResizable(false);
            examTable.getColumnModel().getColumn(1).setResizable(false);
            examTable.getColumnModel().getColumn(2).setResizable(false);
        }

        CalcolaButton1.setText("Calcola ");
        CalcolaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcolaButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Media ponderata da mantenere sugli esami restanti ");

        finalAvgField.setEditable(false);
        finalAvgField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalAvgFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Puoi aggiungere degli esami per calcolare come varierebbe la situazione ottenendo determinati risultati");

        jLabel7.setText("Media finale risultante");

        resultAvgField.setEditable(false);
        resultAvgField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultAvgFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CalcolaButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CFUTotField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CFUCurrField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(MediaAttField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VotoTargetField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(finalAvgField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(resultAvgField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CFUTotField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(CFUCurrField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(MediaAttField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(VotoTargetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(resultAvgField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalAvgField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CalcolaButton1)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CFUTotFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CFUTotFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CFUTotFieldActionPerformed

    private void CFUCurrFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CFUCurrFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CFUCurrFieldActionPerformed

    private void MediaAttFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediaAttFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MediaAttFieldActionPerformed

    private void VotoTargetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VotoTargetFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VotoTargetFieldActionPerformed

    private void CalcolaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcolaButton1ActionPerformed
        calculateRemainingAvg();
    }//GEN-LAST:event_CalcolaButton1ActionPerformed

    private void finalAvgFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalAvgFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalAvgFieldActionPerformed

    private void resultAvgFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultAvgFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultAvgFieldActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        System.out.println(NumbersCruncher.mpFromStartingVote(104));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new MainWindow().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    /**
     * Calcola la media da mantenere sui futuri esami per raggiungere l'obiettivo di media ponderata prefissato
     */
    private void calculateRemainingAvg() {
        int CFUTot = 0;
        int CFUCurr = 0;
        double mediaAttuale = 0;
        double mediaTarget = 0;
        int votoTarget = 0;
        
        try {
            CFUTot = Integer.parseInt(CFUTotField.getText());
            CFUCurr = Integer.parseInt(CFUCurrField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Controlla di aver inserito numeri interi per i CFU");
        }

        try {
            mediaAttuale = Double.parseDouble(MediaAttField.getText());
            votoTarget = Integer.parseInt(VotoTargetField.getText());
            mediaTarget = NumbersCruncher.mpFromStartingVote(votoTarget);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Controlla di aver inserito numeri in un formato valido per la media");
        }
        
        ArrayList<Esame> esami = retrieveTableValues(examTable);
        
        for(Esame esame: esami) {
            CFUCurr += esame.getCfu();
            mediaAttuale = mediaAttuale + ((esame.getVoto() - mediaAttuale) / CFUCurr);    
        }
        
        
        System.out.println("CFU TOTALI : " + CFUTot + "\n CFU Correnti: " + CFUCurr + "\n Media Attuale: " + mediaAttuale + "\n MediaTarget: " + mediaTarget);
        Carriera carriera = new Carriera(mediaAttuale, mediaTarget, CFUTot, CFUCurr);
        double targetAverage = NumbersCruncher.getTargetAvg(carriera);
        System.out.println("TargetAverage: " + targetAverage);
        resultAvgField.setText(String.format("%.2f", targetAverage));
        finalAvgField.setText(String.format("%.2f", mediaTarget));
    }

    /**
     * Recupera i valori degli esami inseriti dall'utente all'interno della tabella
     * @param table
     * @return 
     */
    public ArrayList<Esame> retrieveTableValues(JTable table) {
        ArrayList<Esame> toReturn = new ArrayList<>();
        TableModel model = table.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            if ((model.getValueAt(i, 1) != null) && (model.getValueAt(i, 2) != null) && (model.getValueAt(i, 0) != null)) {
                String cfuS = model.getValueAt(i, 1).toString();
                String votoS = model.getValueAt(i, 2).toString();
                int cfu = Integer.parseInt(cfuS);
                int voto = Integer.parseInt(votoS);
                String nome = model.getValueAt(i, 0).toString();
                toReturn.add(new Esame(voto, cfu, nome));
            }
        }
        return toReturn;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CFUCurrField;
    private javax.swing.JTextField CFUTotField;
    private javax.swing.JButton CalcolaButton1;
    private javax.swing.JTextField MediaAttField;
    private javax.swing.JTextField VotoTargetField;
    private javax.swing.JTable examTable;
    private javax.swing.JTextField finalAvgField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField resultAvgField;
    // End of variables declaration//GEN-END:variables
}
