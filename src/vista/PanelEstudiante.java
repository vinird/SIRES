/**
 * panel estudiante de la ventana GUIEstudiantes
 */
package vista;

import controlador.ControlEstudiante;

/**
 *
 * @author vini
 */
public class PanelEstudiante extends javax.swing.JPanel {

    /**
     * Creates new form PanelEstudiante
     */
    public PanelEstudiante() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jB_BBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(156, 163, 228));

        jLabel1.setFont(new java.awt.Font("Droid Sans Fallback", 3, 22)); // NOI18N
        jLabel1.setText("Registro Estudiante");

        jLabel2.setFont(new java.awt.Font("Droid Sans Fallback", 1, 13)); // NOI18N
        jLabel2.setText("Carnet:");

        jLabel3.setFont(new java.awt.Font("Droid Sans Fallback", 1, 13)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Droid Sans Fallback", 1, 13)); // NOI18N
        jLabel4.setText("Edad:");

        txtCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarnetActionPerformed(evt);
            }
        });

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        jB_BBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1426204169_xmag.png"))); // NOI18N
        jB_BBuscar.setText("buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCarnet)
                                .addGap(33, 33, 33)
                                .addComponent(jB_BBuscar))
                            .addComponent(txtNombre))
                        .addGap(109, 109, 109))))
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_BBuscar))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarnetActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char tipoEntrada = evt.getKeyChar();
        if (tipoEntrada < '0' || tipoEntrada > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_BBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * ************* metodos sets & gets *****************
     */
    public String getTxtCarnet() {
        return this.txtCarnet.getText().toString().trim().toUpperCase();
    }

    public int getTxtEdad() {

        if (this.txtEdad.getText().equalsIgnoreCase("")) {
            return 0;
        }
        return Integer.parseInt(this.txtEdad.getText().toString().trim());
    }

    public String getTxtNombre() {
        return this.txtNombre.getText().toString().trim();
    }

    public void setTxtCarnet(String carnet) {
        this.txtCarnet.setText(carnet);
    }

    public void setTxtEdad(int edad) {
        this.txtEdad.setText(String.valueOf(edad));
    }

    public void setTxtNombre(String nombre) {
        this.txtNombre.setText(nombre);
    }

    /**
     *
     */
    public void limpiar() {
        this.txtCarnet.setText("");
        this.txtEdad.setText("");
        this.txtNombre.setText("");
    }

    /**
     *
     */
    public static final String JBTN_BUSCAR = "buscar";

    /**
     *
     * @param controlador
     */
    public void escucharConsulta(ControlEstudiante controlador) {
        this.jB_BBuscar.addActionListener(controlador);
    }

}