/**
 * Se encarga de crear los JFrames GUIECursos, GUIEstudiantes, GUIEMatriculas y
 * GUIEReporteMatricula
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Registro;
import modelo.RegistroCursos;
import modelo.RegistroMatricula;
import vista.GUIECursos;
import vista.GUIEMatriculas;
import vista.GUIEReporteMatricula;
import vista.GUIETablaEstudiante;
import vista.GUIEstudiantes;
import vista.GUISIRES;

/**
 *
 * @author vini
 */
public class ControlSIRES implements ActionListener {

    private Registro registroEstudiante;
    private RegistroCursos registroCursos;
    private RegistroMatricula registroMatricula;
    private GUIEMatriculas guieMatricula;
    private GUIEReporteMatricula guieReporteMatricula;
    private GUIETablaEstudiante guieTablaEstudiante;
    private GUISIRES guisires;
    private GUIECursos guieCursos;
    private GUIEstudiantes guiEstudiantes;

//--------------------------------------------------------------
    public ControlSIRES(GUISIRES guisires) {

        registroEstudiante = new Registro();
        registroCursos = new RegistroCursos();
        registroMatricula = new RegistroMatricula();

        guieCursos = new GUIECursos(registroCursos);
        guiEstudiantes = new GUIEstudiantes(registroEstudiante);
        

        this.guisires = guisires;
    }
//--------------------------------------------------------------

//////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////
    /**
     *
     * @param evento
     */
    public void actionPerformed(ActionEvent evento) {
        if (evento.getActionCommand().equalsIgnoreCase(GUISIRES.MNI_SALIR)) {
            System.exit(0);
        }
        ////////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(GUISIRES.MNI_REGISTRO_ESTUDIANTES)) {
            guiEstudiantes.show();
        }
        ////////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(GUISIRES.MNI_REGISTRO_CURSOS)) {
            guieCursos.show();
        }
        /////////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(GUISIRES.MNI_SISTEMA_MATRICULAS)) {
            guieMatricula = new GUIEMatriculas(registroEstudiante, registroCursos, registroMatricula, guieCursos, guiEstudiantes, guisires);
            guieMatricula.show();
        }
        ////////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(GUISIRES.MNI_INFORME_MATRICULA)) {
            guieReporteMatricula = new GUIEReporteMatricula(registroMatricula);
            guieReporteMatricula.show();
        }

        /////////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(GUISIRES.MNI_TABLA_ESTUDIANTE)) {
            guieTablaEstudiante = new GUIETablaEstudiante(registroEstudiante);
            guieTablaEstudiante.show();
        }

    }

}
