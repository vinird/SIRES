/**
 * Clase encargada de resivir los datos GUIECursos y PanelCuros
 * utiliza los datos en el RegistroCursos
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Curso;
import modelo.RegistroCursos;
import vista.GUIECursos;
import vista.GUIEInformeCursos;
import vista.GUIEstudiantes;
import vista.PanelCursos;

/**
 *
 * @author vini
 */
public class ControlCursos implements ActionListener {

    private RegistroCursos registroCursos;
    private PanelCursos panelcursos;
    private GUIECursos gUIECursos;
    private GUIEInformeCursos informeCursos;

//------------------------------------------------------------------------------
    public ControlCursos(RegistroCursos registroCursos, GUIECursos guieCursos, PanelCursos panelCursos) {
        this.registroCursos = registroCursos;
        this.gUIECursos = guieCursos;
        this.panelcursos = panelCursos;
    }
//---------------------------------------------------------------------------------

////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * @param ActionEvent evento
    */
    public void actionPerformed(ActionEvent evento) {
        if (evento.getActionCommand().equalsIgnoreCase(panelcursos.BTNAGREGAR_CURSOS)) {
            Curso curso;
            if (panelcursos.getjTxtCursos_nombre().equalsIgnoreCase("")) {
                GUIEstudiantes.mensaje("Ingrese el nombre del curso");
            } else {
                if (panelcursos.getjTxtCursos_Siglas().equalsIgnoreCase("")) {
                    GUIEstudiantes.mensaje("Ingrese las siglas del curso");
                } else {
                    if (panelcursos.getjTxtCursos_Creditos() == 0) {
                        GUIEstudiantes.mensaje("Ingrese la cantidad de creditos del curso");
                    } else {
                        GUIEstudiantes.mensaje(registroCursos.agregar(curso = new Curso(panelcursos.getjTxtCursos_nombre(), panelcursos.getjTxtCursos_Siglas(), panelcursos.getjTxtCursos_Creditos())));
                        panelcursos.limpiar();

                    }
                }
            }
        }

        ////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(panelcursos.BTNBUSCAR_CURSOS)) {
            Curso curso = registroCursos.buscar(panelcursos.getjTxtCursos_Siglas());
            if (curso != null) {
                panelcursos.setjTxtCursos_nombre(curso.getNombre());
                panelcursos.setjTxtCursos_Creditos(curso.getCreditos() + "");

                panelcursos.enableButtons(true);
            } else {
                GUIEstudiantes.mensaje("No ha ingresado ninguna sigla de cursos");
            }
        }

        //////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(panelcursos.BTNCONSULTAR_CURSOS)) {
            informeCursos = new GUIEInformeCursos();
            informeCursos.setValores(registroCursos.getMatrizCuros(), Curso.getEtiquetas());
            informeCursos.show();
        }

        //////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(panelcursos.BTNATRAS_CURSOS)) {
            gUIECursos.dispose();
        }

        ///////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(panelcursos.BTNMODIFICAR_CURSOS)) {
            Curso curso = new Curso(panelcursos.getjTxtCursos_nombre(), panelcursos.getjTxtCursos_Siglas(), panelcursos.getjTxtCursos_Creditos());
            GUIEstudiantes.mensaje(registroCursos.modificar(curso));
            panelcursos.limpiar();
            panelcursos.enableButtons(false);
        }

        //////////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(panelcursos.BTNELIMINAR_CURSOS)) {
            Curso curso = new Curso(panelcursos.getjTxtCursos_nombre(), panelcursos.getjTxtCursos_Siglas(), panelcursos.getjTxtCursos_Creditos());
            GUIEstudiantes.mensaje(registroCursos.eliminar(curso));
            panelcursos.enableButtons(false);
        }
    }

}
