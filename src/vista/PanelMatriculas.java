/**
 * panel matricula de la ventana GUIEMatricula
 */
package vista;

import controlador.ControlMatricula;
import javax.swing.table.DefaultTableModel;
import modelo.RegistroCursos;

/**
 *
 * @author vini
 */
public class PanelMatriculas extends javax.swing.JPanel {

    /**
     * Creates new form PanelMatricula
     */
    public PanelMatriculas() {
        initComponents();
        limpiarCursos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTxtCarnetMatricula = new javax.swing.JTextField();
        jBTNBuscar = new javax.swing.JButton();
        jComboBoxCursosMatricula = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTXTNombreEstudianteMatricula = new javax.swing.JTextField();
        jTxtCarnetEstudianteMatricula = new javax.swing.JTextField();
        jTextEdadMatricula = new javax.swing.JTextField();
        jButtonLimpiarCursos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTotalCursos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTotalCreditos = new javax.swing.JTextField();
        jButtonMATRICULAR = new javax.swing.JButton();
        jButtonSalirMatricula = new javax.swing.JButton();
        jButtonAtrasMatricula = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton_Ingresar_estudiante = new javax.swing.JButton();
        jButton_Ingresar_curso = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton_recargar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Cursos = new javax.swing.JTable();
        jButton_Agregar_Curso = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setBackground(new java.awt.Color(177, 213, 236));

        jLabel1.setFont(new java.awt.Font("Droid Sans Fallback", 1, 15)); // NOI18N
        jLabel1.setText("Carnet de Estudiante:");

        jTxtCarnetMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCarnetMatriculaActionPerformed(evt);
            }
        });

        jBTNBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1426204169_xmag.png"))); // NOI18N
        jBTNBuscar.setText("Buscar");

        jComboBoxCursosMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCursosMatriculaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Droid Sans Fallback", 1, 15)); // NOI18N
        jLabel2.setText("Cursos:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Carnet:");

        jLabel5.setText("Edad:");

        jTXTNombreEstudianteMatricula.setEditable(false);
        jTXTNombreEstudianteMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTXTNombreEstudianteMatriculaActionPerformed(evt);
            }
        });

        jTxtCarnetEstudianteMatricula.setEditable(false);

        jTextEdadMatricula.setEditable(false);
        jTextEdadMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEdadMatriculaActionPerformed(evt);
            }
        });
        jTextEdadMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextEdadMatriculaKeyTyped(evt);
            }
        });

        jButtonLimpiarCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1427793023_edit-clear-24.png"))); // NOI18N
        jButtonLimpiarCursos.setText("Limpiar");
        jButtonLimpiarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCursosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Droid Sans Fallback", 3, 13)); // NOI18N
        jLabel6.setText("Cantidad de cursos:");

        jTextFieldTotalCursos.setEditable(false);
        jTextFieldTotalCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalCursosActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Droid Sans Fallback", 3, 13)); // NOI18N
        jLabel7.setText("Total de creditos:");

        jTextFieldTotalCreditos.setEditable(false);

        jButtonMATRICULAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1427101440_clean.png"))); // NOI18N
        jButtonMATRICULAR.setText("Matricular");
        jButtonMATRICULAR.setEnabled(false);

        jButtonSalirMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1426203938_Close_Box_Red.png"))); // NOI18N
        jButtonSalirMatricula.setText("   Salir  ");
        jButtonSalirMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirMatriculaActionPerformed(evt);
            }
        });

        jButtonAtrasMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1427101796_back.png"))); // NOI18N
        jButtonAtrasMatricula.setText("Atras");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel8.setText("Sistema de Matriculas");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel9.setText("Agregar Estudiante >");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel10.setText("Agregar Curso >");

        jButton_Ingresar_estudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1427762043_user-group-new.png"))); // NOI18N
        jButton_Ingresar_estudiante.setText("Ingresar");

        jButton_Ingresar_curso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1427762109_699303-icon-33-clipboard-add-32.png"))); // NOI18N
        jButton_Ingresar_curso.setText("Ingresar ");

        jLabel11.setFont(new java.awt.Font("Droid Sans Fallback", 1, 15)); // NOI18N
        jLabel11.setText("Recargar lista de cursos:");

        jButton_recargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1427770164_reload.png"))); // NOI18N
        jButton_recargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_recargarActionPerformed(evt);
            }
        });

        jTable_Cursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable_Cursos.setEnabled(false);
        jScrollPane4.setViewportView(jTable_Cursos);

        jButton_Agregar_Curso.setText("Agregar");
        jButton_Agregar_Curso.setEnabled(false);
        jButton_Agregar_Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Agregar_CursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jButton_Ingresar_estudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jButton_Ingresar_curso)
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTXTNombreEstudianteMatricula)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextEdadMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtCarnetEstudianteMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 119, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonMATRICULAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSalirMatricula))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCarnetMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBTNBuscar)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxCursosMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldTotalCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTotalCreditos)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonLimpiarCursos)
                            .addComponent(jButton_Agregar_Curso))
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel11))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_recargar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jButtonAtrasMatricula)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jButton_Ingresar_estudiante)
                    .addComponent(jLabel10)
                    .addComponent(jButton_Ingresar_curso))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTXTNombreEstudianteMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtCarnetEstudianteMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextEdadMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonSalirMatricula)
                                    .addComponent(jButtonMATRICULAR))
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel1)
                                    .addComponent(jTxtCarnetMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBTNBuscar))
                                .addGap(360, 360, 360))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton_recargar)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxCursosMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jButton_Agregar_Curso))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonLimpiarCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextFieldTotalCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextFieldTotalCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButtonAtrasMatricula, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCarnetMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCarnetMatriculaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTxtCarnetMatriculaActionPerformed

    private void jTXTNombreEstudianteMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTXTNombreEstudianteMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTXTNombreEstudianteMatriculaActionPerformed

    private void jComboBoxCursosMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCursosMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCursosMatriculaActionPerformed

    private void jTextFieldTotalCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalCursosActionPerformed

    private void jButtonSalirMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirMatriculaActionPerformed

    private void jButtonLimpiarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimpiarCursosActionPerformed

    private void jTextEdadMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEdadMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEdadMatriculaActionPerformed

    private void jTextEdadMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextEdadMatriculaKeyTyped
        char tipoEntrada = evt.getKeyChar();
        if (tipoEntrada < '0' || tipoEntrada > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextEdadMatriculaKeyTyped

    private void jButton_recargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_recargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_recargarActionPerformed

    private void jButton_Agregar_CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Agregar_CursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Agregar_CursoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTNBuscar;
    private javax.swing.JButton jButtonAtrasMatricula;
    private javax.swing.JButton jButtonLimpiarCursos;
    private javax.swing.JButton jButtonMATRICULAR;
    private javax.swing.JButton jButtonSalirMatricula;
    private javax.swing.JButton jButton_Agregar_Curso;
    private javax.swing.JButton jButton_Ingresar_curso;
    private javax.swing.JButton jButton_Ingresar_estudiante;
    private javax.swing.JButton jButton_recargar;
    private javax.swing.JComboBox jComboBoxCursosMatricula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTXTNombreEstudianteMatricula;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable_Cursos;
    private javax.swing.JTextField jTextEdadMatricula;
    private javax.swing.JTextField jTextFieldTotalCreditos;
    private javax.swing.JTextField jTextFieldTotalCursos;
    private javax.swing.JTextField jTxtCarnetEstudianteMatricula;
    private javax.swing.JTextField jTxtCarnetMatricula;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * *********** metodos sets & gets ********************
     */
    public String getjTxtCarnetMatricula() {
        return jTxtCarnetMatricula.getText().trim().toUpperCase();
    }

    public void setjTxtCarnetMatricua(String jTxtCarnetMatricua) {
        this.jTxtCarnetMatricula.setText(jTxtCarnetMatricua.trim());
    }

    public String getjTXTNombreEstudianteMatricula() {
        return jTXTNombreEstudianteMatricula.getText();
    }

    public void setjTXTNombreEstudianteMatricula(String jTXTNombreEstudianteMatricula) {
        this.jTXTNombreEstudianteMatricula.setText(jTXTNombreEstudianteMatricula);
    }

    public String getjTextEdadMatricula() {
        return jTextEdadMatricula.getText().trim();
    }

    public void setjTextEdadMatricula(String jTextEdadMatricula) {
        this.jTextEdadMatricula.setText(jTextEdadMatricula);
    }

    public String getjTxtCarnetEstudianteMatricula() {
        return jTxtCarnetEstudianteMatricula.getText().trim();
    }

    public void setjTxtCarnetEstudianteMatricula(String jTxtCarnetEstudianteMatricula) {
        this.jTxtCarnetEstudianteMatricula.setText(jTxtCarnetEstudianteMatricula.trim());
    }

    public int getjTextFieldTotalCreditos() {
        return Integer.parseInt(jTextFieldTotalCreditos.toString().trim());
    }

    public void setjTextFieldTotalCreditos(int jTextFieldTotalCreditos) {
        this.jTextFieldTotalCreditos.setText(jTextFieldTotalCreditos + "".trim());
    }

    public String getjTextFieldTotalCursos() {
        return jTextFieldTotalCursos.getText();
    }

    public void setjTextFieldTotalCursos(int jTextFieldTotalCursos) {
        this.jTextFieldTotalCursos.setText(jTextFieldTotalCursos + "".trim());
    }

////////////////////////////////////////////////////////////////////////////////
    public static final String JBTNBUSCAR_CARNET = "Buscar";
    public static final String JBTNAGREGAR_CURSO_MATRICULA = "Agregar";
    public static final String JBTNLIMPIAR_CURSOS = "Limpiar";
    public static final String JBTNATRAS_MATRICULA = "Atras";
    public static final String JBTNSALIR_MATRICULA = "   Salir  ";
    public static final String JBTN_MATRICULAR = "Matricular";
    public static final String JBTN_INGRESAR_CURSO = "Ingresar ";
    public static final String JBTN_INGRESAR_ESTUDIANTE = "Ingresar";
    public static final String JBTN_RECARGAR = "recargar";

    /**
     *
     * @param controlMatricula
     */
    public void escucharMatricula(ControlMatricula controlMatricula) {
        jButton_recargar.setActionCommand("recargar");

        this.jButton_recargar.addActionListener(controlMatricula);
        this.jBTNBuscar.addActionListener(controlMatricula);
        this.jButton_Agregar_Curso.addActionListener(controlMatricula);
        this.jButtonLimpiarCursos.addActionListener(controlMatricula);
        this.jButtonAtrasMatricula.addActionListener(controlMatricula);
        this.jButtonMATRICULAR.addActionListener(controlMatricula);
        this.jButtonSalirMatricula.addActionListener(controlMatricula);
        this.jButton_Ingresar_curso.addActionListener(controlMatricula);
        this.jButton_Ingresar_estudiante.addActionListener(controlMatricula);
        this.jComboBoxCursosMatricula.addItemListener(controlMatricula);

    }

    /**
     *
     * @param registroCursos
     */
    public void agregarItemsComboBox(RegistroCursos registroCursos) {
        this.jComboBoxCursosMatricula.removeAllItems();
        this.jComboBoxCursosMatricula.addItem("-- Seleccione --");
        if (registroCursos.getTamano() != 0) {
            for (int index = 0; index < registroCursos.getTamano(); index++) {
                this.jComboBoxCursosMatricula.addItem(registroCursos.getCursoNombre(index));
            }
        }
    }

    /**
     *
     * @return String
     */
    public String getComboboxCurso() {
        return this.jComboBoxCursosMatricula.getSelectedItem().toString().trim();
    }

    /**
     *
     * @return int
     */
    public int getComboIndex() {
        return this.jComboBoxCursosMatricula.getSelectedIndex();
    }

    /**
     *
     */
    public void limpiarCursos() {
        this.setjTextFieldTotalCreditos(0);
        this.setjTextFieldTotalCursos(0);
    }

    /**
     *
     */
    public void limpiarEstudiantes() {
        this.jTXTNombreEstudianteMatricula.setText("");
        this.jTextEdadMatricula.setText("");
        this.jTxtCarnetEstudianteMatricula.setText("");
        this.jTxtCarnetMatricula.setText("");
    }

    /**
     *
     * @param estado
     */
    public void setBotonesEstadoAgregar(boolean estado) {
        this.jButton_Agregar_Curso.setEnabled(estado);
    }

    /**
     *
     * @param estado
     */
    public void setBotonEstadoMatriculas(boolean estado) {
        this.jButtonMATRICULAR.setEnabled(estado);
    }

    /**
     *
     * @param datos [][]
     * @param etiquetas []
     */
    public void setItemsTable(String[][] datos, String[] etiquetas) {
        if (etiquetas != null) {
            this.jTable_Cursos.setModel(new DefaultTableModel(datos, etiquetas));
        }

    }
}
