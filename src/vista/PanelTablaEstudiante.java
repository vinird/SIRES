/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControlTablaEstudiante;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vini
 */
public class PanelTablaEstudiante extends javax.swing.JPanel {

    /**
     * Creates new form PanelTablaEstudiante
     */
    public PanelTablaEstudiante() {
        initComponents();
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
        jComboBoxSeleccionarCategoria = new javax.swing.JComboBox();
        jLabel_variableCategoria = new javax.swing.JLabel();
        jTextField_Agregar_Categoria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Buscar_Carnet = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(164, 225, 178));

        jLabel1.setFont(new java.awt.Font("Droid Sans Fallback", 1, 13)); // NOI18N
        jLabel1.setText("Filtro:");

        jComboBoxSeleccionarCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccionar--", "All", "Nombre", "Carnet", "Edad" }));

        jLabel_variableCategoria.setFont(new java.awt.Font("Droid Sans Fallback", 1, 13)); // NOI18N
        jLabel_variableCategoria.setText("Seleccionar:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Carnet", "Edad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton_Buscar_Carnet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1426204169_xmag.png"))); // NOI18N
        jButton_Buscar_Carnet.setText("Buscar");

        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1427101796_back.png"))); // NOI18N
        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel2.setText("Lista de Estudiantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAtras))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxSeleccionarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel_variableCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Agregar_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Buscar_Carnet)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxSeleccionarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_variableCategoria)
                    .addComponent(jTextField_Agregar_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Buscar_Carnet))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButtonAtras)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButton_Buscar_Carnet;
    private javax.swing.JComboBox jComboBoxSeleccionarCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_variableCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Agregar_Categoria;
    // End of variables declaration//GEN-END:variables

    public String getjComboBoxSeleccionarCategoria() {
        return jComboBoxSeleccionarCategoria.getSelectedItem().toString();
    }

    public void setjComboBoxSeleccionarCategoria(JComboBox jComboBoxSeleccionarCategoria) {
        this.jComboBoxSeleccionarCategoria = jComboBoxSeleccionarCategoria;
    }

    public String getjLabel_variableCategoria() {
        return jLabel_variableCategoria.getText().trim();
    }

    public void setjLabel_variableCategoria(String jLabel_variableCategoria) {
        this.jLabel_variableCategoria.setText(jLabel_variableCategoria+"".trim());
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public String getjTextField_Agregar_Categoria() {
        return jTextField_Agregar_Categoria.getText().trim();
    }

    public void setjTextField_Agregar_Categoria(String jTextField_Agregar_Categoria) {
        this.jTextField_Agregar_Categoria.setText(jTextField_Agregar_Categoria+"".trim());
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void setValores(String[][] datosFilas, String etiquetas[]) {
        if (datosFilas != null) {
            jTable1.setModel(new DefaultTableModel(datosFilas, etiquetas));
            jScrollPane1.setViewportView(jTable1);
        }
    }
    
    public static final String JBTN_BUSCAR_CATEGORIA = "Buscar";
    public static final String JBTN_ATRAS = "Atras";

    public void escuchar(ControlTablaEstudiante control) {
        this.jButton_Buscar_Carnet.addActionListener(control);
        this.jButtonAtras.addActionListener(control);
        this.jComboBoxSeleccionarCategoria.addItemListener(control);
    }
}