/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Estudiante;
import modelo.Registro;
import vista.GUIETablaEstudiante;
import vista.PanelTablaEstudiante;

/**
 *
 * @author vini
 */
public class ControlTablaEstudiante implements ActionListener, ItemListener, MouseListener {

    private Registro registroEstudiante;
    private PanelTablaEstudiante panelTablaEstudiante;
    private Estudiante estudiante;
    private GUIETablaEstudiante gUIETablaEstudiante;

    public ControlTablaEstudiante(Registro registroEstudiante, PanelTablaEstudiante panelTablaEstudiante, GUIETablaEstudiante gUIETablaEstudiante) {
        this.registroEstudiante = registroEstudiante;
        this.panelTablaEstudiante = panelTablaEstudiante;
        this.gUIETablaEstudiante = gUIETablaEstudiante;
        panelTablaEstudiante.escuchar(this);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * 
     * @param evento 
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getActionCommand().equalsIgnoreCase(PanelTablaEstudiante.JBTN_BUSCAR_CATEGORIA)) {
            
            if (panelTablaEstudiante.getjLabel_variableCategoria().equalsIgnoreCase("carnet:")) {
                panelTablaEstudiante.setValores(registroEstudiante.getMatrizEstudianteIndividual(panelTablaEstudiante.getjTextField_Agregar_Categoria(), 1), Estudiante.getEtiquetas());
                panelTablaEstudiante.setjTextField_Agregar_Categoria("");
            }
            if (panelTablaEstudiante.getjLabel_variableCategoria().equalsIgnoreCase("nombre:")) {
                panelTablaEstudiante.setValores(registroEstudiante.getMatrizEstudianteIndividual(panelTablaEstudiante.getjTextField_Agregar_Categoria(), 2), Estudiante.getEtiquetas());
                panelTablaEstudiante.setjTextField_Agregar_Categoria("");
            }
            if (panelTablaEstudiante.getjLabel_variableCategoria().equalsIgnoreCase("edad:")) {
                panelTablaEstudiante.setValores(registroEstudiante.getMatrizEstudianteIndividual(panelTablaEstudiante.getjTextField_Agregar_Categoria(), 3), Estudiante.getEtiquetas());
                panelTablaEstudiante.setjTextField_Agregar_Categoria("");
            }
        }
        
        if (evento.getActionCommand().equalsIgnoreCase(PanelTablaEstudiante.JBTN_ATRAS)) {
            this.panelTablaEstudiante.setjTextField_Agregar_Categoria("");
            this.gUIETablaEstudiante.dispose();
        }
        

    }
//============================================================================================================================================

   /**
    * 
    * @param ie 
    */
    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getStateChange() == ItemEvent.SELECTED) {

            if (panelTablaEstudiante.getjComboBoxSeleccionarCategoria().equalsIgnoreCase("All")) {
                panelTablaEstudiante.setjLabel_variableCategoria("All:");
                panelTablaEstudiante.setValores(registroEstudiante.getMatrizEstudiante(), Estudiante.getEtiquetas());
            }

            if (panelTablaEstudiante.getjComboBoxSeleccionarCategoria().equalsIgnoreCase("Nombre")) {
                panelTablaEstudiante.setjLabel_variableCategoria("Nombre:");
            }

            if (panelTablaEstudiante.getjComboBoxSeleccionarCategoria().equalsIgnoreCase("Carnet")) {
                panelTablaEstudiante.setjLabel_variableCategoria("Carnet:");
            }

            if (panelTablaEstudiante.getjComboBoxSeleccionarCategoria().equalsIgnoreCase("Edad")) {
                panelTablaEstudiante.setjLabel_variableCategoria("Edad:".trim());
            }

        }
    }
//============================================================================================================================================

    /**
     * 
     * @param me 
     */
    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
