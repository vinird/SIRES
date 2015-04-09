/**
 * Resive la informcion de PanelEstudiante, PanelBotones y GUIEstudiante utiliza
 * los datos en el registro estudiante
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Estudiante;
import modelo.Registro;
import vista.GUIEInforme;
import vista.GUIEstudiantes;
import vista.PanelBotones;
import vista.PanelEstudiante;

/**
 *
 * @author vini
 */
public class ControlEstudiante implements ActionListener, MouseListener {

    private Registro registroEstudiantes;
    private PanelEstudiante panelData;
    private PanelBotones panelBtn;
    private GUIEstudiantes guiEstudiantes;
    private GUIEInforme informe;

//-------------------------------------------------------------------------------------------------
    public ControlEstudiante(PanelEstudiante panelEstudiante, PanelBotones panelBtn, Registro registroEstudiantes, GUIEstudiantes guiEstudiante) {
        this.guiEstudiantes = guiEstudiante;
        this.registroEstudiantes = registroEstudiantes;
        this.panelData = panelEstudiante;
        this.panelBtn = panelBtn;
    }
//------------------------------------------------------------------------------------------------

///////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////    
    /**
     *
     * @param ActionEvent evento
     */
    public void actionPerformed(ActionEvent evento) {
        if (evento.getActionCommand().equalsIgnoreCase(PanelBotones.BTN_AGREGAR)) {

            if (panelData.getTxtCarnet().equalsIgnoreCase("")) {

                GUIEstudiantes.mensaje("El campo carnet no tiene informacion,por favor agrege el carnet del estudiante");

            } else if (panelData.getTxtNombre().equalsIgnoreCase("")) {

                GUIEstudiantes.mensaje("El campo nombre no tiene informacion, por favor agrege el nombre del estudiante");

            } else if (panelData.getTxtEdad() == 0) {

                GUIEstudiantes.mensaje("El campo edad no tiene informacion, por favor agregue la edad del estudiante");

            } else {

                GUIEstudiantes.mensaje(
                        registroEstudiantes.agregar(new Estudiante(panelData.getTxtNombre(), panelData.getTxtEdad(), panelData.getTxtCarnet())));
                panelData.limpiar();

            }

        }

        //////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(PanelBotones.BTN_SALIR)) {
            guiEstudiantes.dispose();
        }

        //////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(PanelBotones.BTN_CONSULTAR)) {
            informe = new GUIEInforme();
            informe.setValores(registroEstudiantes.getMatrizEstudiante(), Estudiante.getEtiquetas());
            informe.show();
            informe.escucharTabla(this);
        }

        ////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(PanelBotones.BTN_MODIFICAR)) {
            Estudiante estudiante2 = new Estudiante(panelData.getTxtNombre(), panelData.getTxtEdad(), panelData.getTxtCarnet());
            GUIEstudiantes.mensaje(registroEstudiantes.modificar(estudiante2));

            panelData.limpiar();
            panelBtn.enableButtons(false);
        }

        ////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(PanelBotones.BTN_ELIMINAR)) {
            Estudiante estudiante = new Estudiante(panelData.getTxtNombre(), panelData.getTxtEdad(), panelData.getTxtCarnet());
            GUIEstudiantes.mensaje(registroEstudiantes.eliminar(estudiante));
            panelData.limpiar();
            panelBtn.enableButtons(false);
        }

        /////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(PanelEstudiante.JBTN_BUSCAR)) {
            Estudiante estudiante = registroEstudiantes.consultar(panelData.getTxtCarnet());
            if (estudiante != null) {
                panelData.setTxtCarnet(estudiante.getCarnet());
                panelData.setTxtNombre(estudiante.getNombre());
                panelData.setTxtEdad(estudiante.getEdad());
                panelBtn.enableButtons(true);
            } else {
                GUIEstudiantes.mensaje("El estudiante no se encuentra registrado");
                panelData.limpiar();
            }
        }
    }

///////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }
}
