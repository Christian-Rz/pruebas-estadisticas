package vistas;

import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import test.Main;

/**
 *
 * @author Equipo 3
 */
public class ChiCuadrada extends javax.swing.JDialog {

    DefaultTableModel modelo1;
    DefaultTableModel modelo2;

    
//    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//    String connectionURL ="jdbc:sqlserver://localhost:1433;databaseName=tabla;user=loginsql;password=123456;";
//    Connection conex = DriverManager.getConnection(connectionURL);

    /**
     * Creates new form ChiCuadrada
     */
    public ChiCuadrada(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Fo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Fe = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        xt = new javax.swing.JLabel();
        xc = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Realizar = new javax.swing.JButton();
        hipotesis = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        pregunta = new javax.swing.JTextField();
        MError = new javax.swing.JComboBox<>();
        x2Tabla = new javax.swing.JTextField();
        x2Cal = new javax.swing.JTextField();
        VRes = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(40, 42, 54));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Frecuencias Observadas:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        Fo.setBackground(new java.awt.Color(51, 51, 51));
        Fo.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Fo.setForeground(new java.awt.Color(255, 255, 255));
        Fo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        jScrollPane1.setViewportView(Fo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 100));

        Fe.setBackground(new java.awt.Color(51, 51, 51));
        Fe.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Fe.setForeground(new java.awt.Color(255, 255, 255));
        Fe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        jScrollPane2.setViewportView(Fe);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, 100));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Frecuencias Esperadas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Margen de error:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Escribe tu pregunta:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Segun tus resultados:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        xt.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        xt.setForeground(new java.awt.Color(255, 255, 255));
        xt.setText("x2 Tabla:");
        jPanel1.add(xt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, -1, -1));

        xc.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        xc.setForeground(new java.awt.Color(255, 255, 255));
        xc.setText("x2 Calculadora:");
        jPanel1.add(xc, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hipotesis Nula:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hipotesis Alternativa:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        Realizar.setBackground(new java.awt.Color(0, 0, 0));
        Realizar.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        Realizar.setForeground(new java.awt.Color(255, 255, 255));
        Realizar.setText("Realizar Algoritmo");
        Realizar.setBorder(null);
        Realizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarActionPerformed(evt);
            }
        });
        jPanel1.add(Realizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 180, 40));

        hipotesis.setBackground(new java.awt.Color(255, 255, 255));
        hipotesis.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        hipotesis.setForeground(new java.awt.Color(0, 0, 0));
        hipotesis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(hipotesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 710, 30));

        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextField2.setText("SI");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, -1, -1));

        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextField3.setText("NO");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

        pregunta.setBackground(new java.awt.Color(255, 255, 255));
        pregunta.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        pregunta.setForeground(new java.awt.Color(0, 0, 0));
        pregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 340, -1));

        MError.setBackground(new java.awt.Color(255, 255, 255));
        MError.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        MError.setForeground(new java.awt.Color(0, 0, 0));
        MError.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "0.001", "0.0025", "0.005", "0.01", "0.025", "0.05", "0.1", "0.15", "0.2", "0.25", "0.3", "0.35", "0.4", "0.45", "0.5", "0.55", "0.6", "0.65", "0.7", "0.75", "0.8", "0.85", "0.9", "0.95", "0.975", "0.99", "0.995", "0.9975", "0.999" }));
        jPanel1.add(MError, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        x2Tabla.setBackground(new java.awt.Color(255, 255, 255));
        x2Tabla.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        x2Tabla.setForeground(new java.awt.Color(0, 0, 0));
        x2Tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(x2Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 110, -1));

        x2Cal.setBackground(new java.awt.Color(255, 255, 255));
        x2Cal.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        x2Cal.setForeground(new java.awt.Color(0, 0, 0));
        x2Cal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(x2Cal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 110, -1));

        VRes.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        VRes.setForeground(new java.awt.Color(255, 255, 255));
        VRes.setText("V:");
        jPanel1.add(VRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        Limpiar.setBackground(new java.awt.Color(0, 0, 0));
        Limpiar.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(255, 255, 255));
        Limpiar.setText("Limpiar");
        Limpiar.setBorder(null);
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, 110, 40));

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 39)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Algoritmo de Chi ^2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarActionPerformed
if(pregunta.getText().isEmpty()  || MError.getSelectedItem().equals("Selecciona")){
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        }else{
            
                int col=0, fil=0, v, margen, o, co2;
                double mar, e;
                double tc, tf, tt, tm, sumaf, sumac, sumatf, sumatc;        

                DecimalFormat objFormato = new DecimalFormat("#.###");      
                String t;


                modelo1 = (DefaultTableModel) this.Fo.getModel();
                modelo2 = (DefaultTableModel) this.Fe.getModel();           

                col = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de columnas"));
                fil = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de fila"));
                                             
                v = (fil - 1) * (col - 1);              

                VRes.setText("v:" + v);

                sumaf = 0;
                sumac = 0;                  
                co2 = col + 2;

                int datos[] = new int[col];
                String suc[] = new String[co2];
                String datas1[] = new String[co2];           
                String datas2[] = new String[co2];
                double Frecu[] = new double[co2];

                margen = MError.getSelectedIndex();
                float margen2 = Float.parseFloat(MError.getItemAt(margen));
                System.out.println(margen2);
                
                try {                  

                    for (int i = 0; i < col; i++) {
                        t = JOptionPane.showInputDialog(null, "Ingrese el nombre de la columna");
                        modelo1.addColumn(t);
                        modelo2.addColumn(t);
                    }

                    sumatc = 0;
                    sumatf = 0;
                    sumaf = 0;
                    sumatc = 0;
                    modelo1.addColumn("Total");
                    modelo2.addColumn("Total");             

                    for (int i = 0; i < fil; i++) {
                        t = JOptionPane.showInputDialog(null, "Ingrese el nombre de la fila");
                        datas1[0] = t;
                        sumaf = 0;

                        for (int j = 0; j < col; j++) {
                            datos[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el valor de la celda"));
                            datas1[j + 1] = Integer.toString(datos[j]);
                            sumaf = sumaf + datos[j];               
                        }
                        sumatf = sumatf + sumaf;
                        datas1[col + 1] = Double.toString(sumaf);
                        modelo1.addRow(datas1);
                    }

                    for (int i = 1; i < Fo.getColumnCount(); i++) {
                        sumatc = 0;
                        for (int j = 0; j < Fo.getRowCount(); j++) {
                            sumac = Double.parseDouble((String) Fo.getValueAt(j, i));
                            sumatc += sumac;
                        }
                        suc[i] = Double.toString(sumatc);
                    }

                    suc[0] = "Total";
                    modelo1.addRow(suc);
                    tt = Double.parseDouble((String) Fo.getValueAt(fil, col));
                    for (int i = 0; i < fil; i++) {

                        sumaf = 0;
                        tf = Double.parseDouble((String) Fo.getValueAt(i, col));
                        datas2[0] = (String) Fo.getValueAt(i, 0);
                        for (int j = 0; j < col; j++) {
                            tc = Double.parseDouble((String) Fo.getValueAt(fil, j + 1));
                            tm = tf * tc;
                            Frecu[j] = tm / tt;
                            datas2[j + 1] = Double.toString(Frecu[j]);
                            sumaf = sumaf + Frecu[j];
                        }
                        sumatf = sumatf + sumaf;
                        datas2[col + 1] = Double.toString(sumaf);
                        modelo2.addRow(datas2);
                    }

                    for (int i = 1; i < Fe.getColumnCount(); i++) {
                        sumatc = 0;
                        for (int j = 0; j < Fe.getRowCount(); j++) {
                            sumac = Double.parseDouble((String) Fe.getValueAt(j, i));
                            sumatc += sumac;
                        }
                        suc[i] = Double.toString(sumatc);
                    }

                    suc[0] = "Total";
                    modelo2.addRow(suc);
                    double K = 0;

                    for (int i = 0; i < fil; i++) {
                        for (int j = 0; j < col; j++) {
                            o = Integer.parseInt((String) Fo.getValueAt(i, j + 1));
                            e = Double.parseDouble((String) Fe.getValueAt(i, j + 1));
                            K += Math.pow((o - e), 2) / e;
                        }
                    }

                    mar = K;
                    String columnaa= Float.toString(margen2);
                    
                    float vp = 0;
//                    int v1 = col - 1;
                    //consulta
                    try {
                        Statement stat = Main.getConnection().createStatement();
                        ResultSet res = stat.executeQuery("SELECT * FROM Distribuccion.dbo.Chi");
                        for(int i=0;i<v;i++){
                            res.next();
                            vp = res.getFloat(col-2);  
                        }
                    } catch (SQLException ex) {
                        System.out.println("Error de consulta " + ex);
                    }
                    
                    x2Cal.setText("" + objFormato.format(mar));
                    x2Tabla.setText("" + vp);

                    if (Double.parseDouble(x2Cal.getText()) > Double.parseDouble(x2Tabla.getText())) {
                        hipotesis.setText("En base a los resultados, la hipotesis nula ¿" + pregunta.getText() + "?\n no aplica o influye en los resultados");
                    } else {
                        hipotesis.setText("En base a los resultados, la hipotesis alternativa ¿" + pregunta.getText() + "?\n aplica o influye en los resultados");
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ha habido un error en " + ex);              
                }  
            
        }
    }//GEN-LAST:event_RealizarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed

        MError.setSelectedIndex(0);
        pregunta.setText("");
        x2Cal.setText("");
        x2Tabla.setText("");
        hipotesis.setText("");
        Fo.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{""}));
        Fe.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{""}));

    }//GEN-LAST:event_LimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ChiCuadrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ChiCuadrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ChiCuadrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ChiCuadrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ChiCuadrada dialog = new ChiCuadrada(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Fe;
    private javax.swing.JTable Fo;
    private javax.swing.JButton Limpiar;
    private javax.swing.JComboBox<String> MError;
    private javax.swing.JButton Realizar;
    private javax.swing.JLabel VRes;
    private javax.swing.JTextField hipotesis;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField pregunta;
    private javax.swing.JTextField x2Cal;
    private javax.swing.JTextField x2Tabla;
    private javax.swing.JLabel xc;
    private javax.swing.JLabel xt;
    // End of variables declaration//GEN-END:variables
}
