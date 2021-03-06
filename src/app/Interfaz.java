/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import java.nio.file.Path;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asdrubal
 */
public class Interfaz extends javax.swing.JFrame {
    
    Shapes pizarra;
    
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        setTitle("Dibujo de figuras primitivas");
        JOptionPane.showMessageDialog(new JFrame(), "Para dibujar deja el boton derecho del mouse presionado");
        pizarra = new Shapes(jPanel1.getSize());
        jPanel1.add(pizarra);
        repaint();
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cuadrado = new javax.swing.JButton();
        btn_circulo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_lineas = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        btn_triangulos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_cuadrado.setBackground(new java.awt.Color(255, 255, 255));
        btn_cuadrado.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btn_cuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cuadrado.png"))); // NOI18N
        btn_cuadrado.setToolTipText("Cuadrados");
        btn_cuadrado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuadradoActionPerformed(evt);
            }
        });

        btn_circulo.setBackground(new java.awt.Color(255, 255, 255));
        btn_circulo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btn_circulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/circulo.png"))); // NOI18N
        btn_circulo.setToolTipText("Circulos");
        btn_circulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_circulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_circuloActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        btn_lineas.setBackground(new java.awt.Color(255, 255, 255));
        btn_lineas.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btn_lineas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/linea.png"))); // NOI18N
        btn_lineas.setToolTipText("Lineas");
        btn_lineas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_lineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lineasActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Guardar.gif"))); // NOI18N
        guardar.setToolTipText("Guardar Lista de figuras");
        guardar.setBorderPainted(false);
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        btn_triangulos.setBackground(new java.awt.Color(255, 255, 255));
        btn_triangulos.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btn_triangulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/triangulo.png"))); // NOI18N
        btn_triangulos.setToolTipText("Triangulos");
        btn_triangulos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_triangulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_triangulosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                        .addComponent(btn_lineas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_triangulos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cuadrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_circulo)
                        .addGap(19, 19, 19)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_lineas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_triangulos)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_cuadrado)
                        .addComponent(btn_circulo)
                        .addComponent(guardar)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_circuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_circuloActionPerformed
        // TODO add your handling code here:
        pizarra.selectFigura("Circulo");
        
    }//GEN-LAST:event_btn_circuloActionPerformed

    private void btn_lineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lineasActionPerformed
        // TODO add your handling code here:
        pizarra.selectFigura("Linea");
    }//GEN-LAST:event_btn_lineasActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        JFileChooser guardar = new JFileChooser();
        guardar.showSaveDialog(null);
        guardar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        File archivo = guardar.getSelectedFile();
        String nombreArchivo  = archivo.getAbsolutePath();
        if (pizarra.guardar(nombreArchivo)) {
            JOptionPane.showMessageDialog(new JFrame(), "Los datos fueron guardados en " +nombreArchivo);
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Los datos no pudieron ser guardados, NO EXISTEN DATOS");
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void btn_triangulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_triangulosActionPerformed
        // TODO add your handling code here:
        pizarra.selectFigura("Triangulo");
    }//GEN-LAST:event_btn_triangulosActionPerformed

    private void btn_cuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuadradoActionPerformed
        // TODO add your handling code here:
        pizarra.selectFigura("Cuadrado");

    }//GEN-LAST:event_btn_cuadradoActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_circulo;
    private javax.swing.JButton btn_cuadrado;
    private javax.swing.JButton btn_lineas;
    private javax.swing.JButton btn_triangulos;
    private javax.swing.JButton guardar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
