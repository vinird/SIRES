/**
 * Clase que se recibe el PanelReporteMatricula y GUIReporte busca los datos de
 * matricula de un estudiante y los muestras
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Matricula;
import modelo.RegistroMatricula;
import vista.GUIEReporteMatricula;
import vista.GUIEstudiantes;
import vista.PanelReporteMatricula;

/**
 *
 * @author vini
 */
public class ControlReporteMatricula implements ActionListener {

    private RegistroMatricula registroMatricula;
    private PanelReporteMatricula panelReporteMatricula;
    private Matricula matricula;
    private GUIEReporteMatricula gUIEReporteMatricula;
    private String matriz[][];

//-------------------------------------------------------------------------------------------------
    public ControlReporteMatricula(PanelReporteMatricula panelReporteMatricula1, RegistroMatricula registroMatricula, GUIEReporteMatricula guieReporteMatricula) {
        this.registroMatricula = registroMatricula;
        this.panelReporteMatricula = panelReporteMatricula1;
        this.gUIEReporteMatricula = guieReporteMatricula;
    }
//--------------------------------------------------------------------------------------------------

/////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equalsIgnoreCase(PanelReporteMatricula.JBTN_BUSCAR_INFORME)) {

            matricula = registroMatricula.buscar(panelReporteMatricula.getjTextFieldCarnerInforme().trim());
            if (matricula != null) {

                matriz = new String[matricula.getCantidadCursos()][Matricula.getCantidadEtiquetas()];

                panelReporteMatricula.setjLabelNombre(matricula.getEstudiante().getNombre());
                panelReporteMatricula.setjLabelCarnet(matricula.getEstudiante().getCarnet());
                panelReporteMatricula.setjLabelEdad(matricula.getEstudiante().getEdad());
                panelReporteMatricula.setjLabelCantidadCursos(matricula.getCantidadCursos());
                panelReporteMatricula.setjLabelTotalCreditos(matricula.getCreditos());

                for (int fila = 0; fila < matriz.length; fila++) {
                    for (int columna = 0; columna < matriz[fila].length; columna++) {
                        matriz[fila][columna] = matricula.getAtributo(fila, columna);
                    }
                }
                panelReporteMatricula.setTable(matriz, Matricula.getEtiquetas());
            } else {
                GUIEstudiantes.mensaje("El estudiante no ha realizado el proceso de matricula");
                limpiarPanel();
            }

        }
        ///////////////////////////////////////////////////////////////////////////////////////////
        if (event.getActionCommand().equalsIgnoreCase(PanelReporteMatricula.JBTN_ATRAS_INFORME)) {
            gUIEReporteMatricula.dispose();
        }
    }

    /**
     * 
     */
    public void limpiarPanel() {
        panelReporteMatricula.setjLabelNombre("");
        panelReporteMatricula.setjLabelCarnet("");
        panelReporteMatricula.setjLabelEdad(0);
        panelReporteMatricula.setjLabelCantidadCursos(0);
        panelReporteMatricula.setjLabelTotalCreditos(0);

        panelReporteMatricula.setTable(null, Matricula.getEtiquetas());
    }

}
