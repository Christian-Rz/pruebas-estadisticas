/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arturo Campos
 */
public class ProductosMedios extends javax.swing.JDialog {

    DefaultTableModel modelo;

    /**
     * Creates new form NewJDialog
     */
    public ProductosMedios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("Iteraccion");
        modelo.addColumn("Semilla Xi0");
        modelo.addColumn("Iteraccion");
        modelo.addColumn("Semilla Xi1");
        modelo.addColumn("Semilla^2");
        modelo.addColumn("Semilla Xi+1");
        modelo.addColumn("Pseudonumero");
        this.jTable1.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        direccionGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        rbtnIzq = new javax.swing.JRadioButton();
        rbtnDer = new javax.swing.JRadioButton();
        txtSem1 = new javax.swing.JTextField();
        txtRep = new javax.swing.JTextField();
        txtSem2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 42, 54));

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Interacion", "Semilla Xi0", "Interacion", "Semilla Xi1", "Semilla ^2", "Semilla Xi+1", "Pseudonumero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Regresar");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGenerar.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerar.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerar.setText("Generar");
        btnGenerar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerar.setPreferredSize(new java.awt.Dimension(35, 20));
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        rbtnIzq.setBackground(new java.awt.Color(40, 42, 54));
        direccionGroup.add(rbtnIzq);
        rbtnIzq.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        rbtnIzq.setForeground(new java.awt.Color(255, 255, 255));
        rbtnIzq.setText("Izquierda");

        rbtnDer.setBackground(new java.awt.Color(40, 42, 54));
        direccionGroup.add(rbtnDer);
        rbtnDer.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        rbtnDer.setForeground(new java.awt.Color(255, 255, 255));
        rbtnDer.setText("Derecha");

        txtSem1.setBackground(new java.awt.Color(255, 255, 255));
        txtSem1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtSem1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtRep.setBackground(new java.awt.Color(255, 255, 255));
        txtRep.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtRep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtSem2.setBackground(new java.awt.Color(255, 255, 255));
        txtSem2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtSem2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Semilla 1");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Repeticiones");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Semilla 2");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Productos Medios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(txtSem2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(rbtnIzq)
                            .addGap(18, 18, 18)
                            .addComponent(rbtnDer)
                            .addGap(21, 21, 21)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(155, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnIzq)
                        .addComponent(rbtnDer))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        String se = txtSem1.getText();
        String re = txtRep.getText();
        String se1 = txtSem2.getText();
        String snum, snum2, snum3, snum4;
        int ciclo = Integer.parseInt(re);
        int dato = se.length();
        int dato2, i, pch;
        long num1, num2, num3;
        double num4;

        if (dato < 4) {
            JOptionPane.showMessageDialog(null, "Debe indicar un numero mayor de 3 cifras.");
        }
        if (se.isEmpty() || re.isEmpty()) {
            JOptionPane.showMessageDialog(null, "no debe dejar ningun campo vacio.");
        }
        if (!rbtnIzq.isSelected() && !rbtnDer.isSelected()) {
            JOptionPane.showMessageDialog(null, "Seleccione en donde quiere el cero", "Falta el cero", HEIGHT);
        } else if (rbtnIzq.isSelected()) {
            try {
                int b = jTable1.getRowCount();
                for (int n = b - 1; n >= 0;) {
                    modelo.removeRow(n);
                    n = n - 1;
                }
            } catch (Exception e) {
            }
            direccionGroup.clearSelection();
            num1 = Long.parseLong(se);
            num2 = Long.parseLong(se1);

            String[] fila = new String[6];
            for (i = 0; i < Integer.parseInt(re); i++) {
                num3 = (long) (num1 * num2);
                snum3 = Long.toString(num3);
                dato2 = snum3.length();
                pch = (dato2 - dato) / 2;
                snum4 = snum3.substring(pch, pch + dato);
                num4 = Double.parseDouble(snum4) / (Math.pow(10, dato));
                snum = Long.toString(num1);
                snum2 = Long.toString(num2);
                fila[0] = Integer.toString(i);
                fila[1] = snum;
                fila[2] = snum2;
                fila[3] = snum3;
                fila[4] = snum4;
                fila[5] = Double.toString(num4);
                modelo.addRow(fila);
                num1 = Long.parseLong(snum2);
                num2 = Long.parseLong(snum4);

            }
        } else if (rbtnDer.isSelected()) {
            try {
                int b = jTable1.getRowCount();
                for (int n = b - 1; n >= 0;) {
                    modelo.removeRow(n);
                    n = n - 1;
                }
            } catch (Exception e) {
            }
            direccionGroup.clearSelection();
            num1 = Long.parseLong(se);
            num2 = Long.parseLong(se1);
            String[] fila = new String[6];
            if (dato % 2 == 0) {
                for (i = 0; i < Integer.parseInt(re); i++) {
                    num3 = (long) (num1 * num2);
                    snum3 = Long.toString(num3);
                    dato2 = snum3.length();
                    pch = (dato2 - dato) / 2;
                    if (dato % 2 != 0) {
                        snum4 = snum3.substring(pch + 1, (pch + 1) + dato);
                    } else {
                        snum4 = snum3.substring(pch, pch + dato);
                    }
                    num4 = Double.parseDouble(snum4) / (Math.pow(10, dato));
                    snum = Long.toString(num1);
                    snum2 = Long.toString(num2);
                    fila[0] = Integer.toString(i);
                    fila[1] = snum;
                    fila[2] = snum2;
                    fila[3] = snum3;
                    fila[4] = snum4;
                    fila[5] = Double.toString(num4);
                    modelo.addRow(fila);
                    num1 = Long.parseLong(snum2);
                    num2 = Long.parseLong(snum4);
                }
            }
            if (dato % 2 != 0) {
                for (i = 0; i < Integer.parseInt(re); i++) {
                    num3 = (long) (num1 * num2);
                    snum3 = Long.toString(num3);
                    dato2 = snum3.length();
                    pch = (dato2 - dato) / 2;
                    if (dato % 2 == 0) {
                        snum4 = snum3.substring(pch + 1, (pch + 1) + dato);
                    } else {
                        snum4 = snum3.substring(pch, pch + dato);
                    }
                    num4 = Double.parseDouble(snum4) / (Math.pow(10, dato));
                    snum = Long.toString(num1);
                    snum2 = Long.toString(num2);
                    fila[0] = Integer.toString(i);
                    fila[1] = snum;
                    fila[2] = snum2;
                    fila[3] = snum3;
                    fila[4] = snum4;
                    fila[5] = Double.toString(num4);
                    modelo.addRow(fila);
                    num1 = Long.parseLong(snum2);
                    num2 = Long.parseLong(snum4);
                }
            }
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        try {
                int b = jTable1.getRowCount();
                for (int n = b - 1; n >= 0;) {
                    modelo.removeRow(n);
                    n = n - 1;
                }
            } catch (Exception e) {
            }
        direccionGroup.clearSelection();
        txtSem1.setText("");
        txtSem2.setText("");
        txtRep.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        MenuNoCongruencial VP = new MenuNoCongruencial();
        VP.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
   // public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
   //     try {
   //         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
   //             if ("Nimbus".equals(info.getName())) {
   //                 javax.swing.UIManager.setLookAndFeel(info.getClassName());
   //                 break;
   //             }
   //         }
    //    } catch (ClassNotFoundException ex) {
    //        java.util.logging.Logger.getLogger(ProductosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     //   } catch (InstantiationException ex) {
     //       java.util.logging.Logger.getLogger(ProductosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     //   } catch (IllegalAccessException ex) {
     //       java.util.logging.Logger.getLogger(ProductosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     //   } catch (javax.swing.UnsupportedLookAndFeelException ex) {
     //       java.util.logging.Logger.getLogger(ProductosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     //   }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        //java.awt.EventQueue.invokeLater(new Runnable() {
          //  public void run() {
          //      ProductosMedios dialog = new ProductosMedios(new javax.swing.JFrame(), true);
          //      dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          //          @Override
          //          public void windowClosing(java.awt.event.WindowEvent e) {
          //              System.exit(0);
           //         }
            //    });
            //    dialog.setVisible(true);
            //}
        //});
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup direccionGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbtnDer;
    private javax.swing.JRadioButton rbtnIzq;
    private javax.swing.JTextField txtRep;
    private javax.swing.JTextField txtSem1;
    private javax.swing.JTextField txtSem2;
    // End of variables declaration//GEN-END:variables
}
