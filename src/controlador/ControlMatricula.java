/**
 * Clase que se encarga de resibir la GUIEMatricula y PanelMatricula agrega los
 * datos de la vista a un ArrayList de tipo Matricula
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import modelo.Curso;
import modelo.Estudiante;
import modelo.Matricula;
import modelo.Registro;
import modelo.RegistroCursos;
import modelo.RegistroMatricula;
import vista.GUIECursos;
import vista.GUIEMatriculas;
import vista.GUIEstudiantes;
import vista.GUISIRES;
import vista.PanelMatriculas;

/**
 *
 * @author vini
 */
public class ControlMatricula implements ActionListener, ItemListener {
    
    private Registro registroEstudiante;
    private RegistroCursos registroCursos;
    private RegistroMatricula reguistroMatricula;
    private GUIEMatriculas guieMatricula;
    private PanelMatriculas panelMatriculas;
    private Estudiante estudiante;
    private Matricula matricula;
    private int totalCreditos = 0;
    private GUIECursos gUIECursos;
    private GUIEstudiantes gUIEstudiantes;
    private GUISIRES guisires;
    private String matriz [][];

    private Curso vectorCursos [];
    
    private ArrayList<Curso> listaCursos;
    
//-----------------------------------------------------------------------------------------------------------

    public ControlMatricula(Registro registroEstudiantes, RegistroCursos registroCursos, RegistroMatricula registroMatricula, GUIEMatriculas guieMatricula, PanelMatriculas panelMatriculas,
            GUIECursos gUIECursos, GUIEstudiantes gUIEEstudiante, GUISIRES guiesires) {
        
        this.registroEstudiante = registroEstudiantes;
        this.registroCursos = registroCursos;
        this.reguistroMatricula = registroMatricula;
        this.guieMatricula = guieMatricula;
        this.panelMatriculas = panelMatriculas;
        this.gUIECursos = gUIECursos;
        this.gUIEstudiantes = gUIEEstudiante;
        this.guisires = guiesires;
        this.listaCursos = new ArrayList<Curso>();
        
    }
//----------------------------------------------------------------------------------------------------------

////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * @param evento
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getActionCommand().equalsIgnoreCase(PanelMatriculas.JBTNBUSCAR_CARNET)) {
            
            estudiante = registroEstudiante.consultar(panelMatriculas.getjTxtCarnetMatricula());
            if (estudiante != null) {
                panelMatriculas.setjTXTNombreEstudianteMatricula(estudiante.getNombre());
                panelMatriculas.setjTxtCarnetEstudianteMatricula(estudiante.getCarnet());
                panelMatriculas.setjTextEdadMatricula(estudiante.getEdad() + "");
            }
            setEstado_Boton_Matricula();
        }

        //////////////////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(PanelMatriculas.JBTN_RECARGAR)) {
            panelMatriculas.agregarItemsComboBox(registroCursos);
        }
        //////////////////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(PanelMatriculas.JBTNAGREGAR_CURSO_MATRICULA)) {
            Curso curso = registroCursos.buscar(registroCursos.getCursoSiglas((panelMatriculas.getComboIndex())-1));
            
            for (int index = 0; index < listaCursos.size(); index++) {
                if (listaCursos.get(index) == curso) {
                    listaCursos.remove(index);
                }
            }
            listaCursos.add(curso);
            totalCreditos = 0;
            
            for (int index = 0; index < listaCursos.size(); index++) {
                totalCreditos += listaCursos.get(index).getCreditos();
            }
            
            matriz = new String[listaCursos.size()][Curso.getNumeroAtributos()];
            
            for (int fila=0; fila<matriz.length;  fila++) {
                for (int columna=0;  columna < matriz[fila].length;  columna++) {
                    matriz [fila][columna] = listaCursos.get(fila).getAtributos(columna);
                }
            }
            
            panelMatriculas.setItemsTable(matriz, Curso.getEtiquetas());
            
            panelMatriculas.setjTextFieldTotalCursos(listaCursos.size());
            panelMatriculas.setjTextFieldTotalCreditos(totalCreditos);
            panelMatriculas.setBotonesEstadoAgregar(false);
            
            setEstado_Boton_Matricula();
        }

        ////////////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(PanelMatriculas.JBTNLIMPIAR_CURSOS)) {
            panelMatriculas.limpiarCursos();
            totalCreditos = 0;
            listaCursos.removeAll(listaCursos);
            panelMatriculas.setItemsTable(null, Curso.getEtiquetas());
            panelMatriculas.setBotonEstadoMatriculas(false);
        }

        ///////////////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(PanelMatriculas.JBTN_MATRICULAR)) {
            
            vectorCursos = new Curso [listaCursos.size()];
            for (int index=0; index<vectorCursos.length;  index++) {
                vectorCursos [index] = listaCursos.get(index);
            }
            
            matricula = new Matricula(vectorCursos, estudiante, totalCreditos);
            
            gUIEstudiantes.mensaje(reguistroMatricula.agregar(matricula));
            
            panelMatriculas.limpiarCursos();
            panelMatriculas.limpiarEstudiantes();
            totalCreditos = 0;
            listaCursos.removeAll(listaCursos);
            panelMatriculas.setItemsTable(null, Curso.getEtiquetas());
            panelMatriculas.setBotonEstadoMatriculas(false);
        }

        ///////////////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(PanelMatriculas.JBTNATRAS_MATRICULA)) {
            panelMatriculas.limpiarCursos();
            panelMatriculas.limpiarEstudiantes();
            guieMatricula.dispose();

            
            
        }

        /////////////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(PanelMatriculas.JBTNSALIR_MATRICULA)) {
            System.exit(0);  
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////
        if (evento.getActionCommand().equalsIgnoreCase(PanelMatriculas.JBTN_INGRESAR_CURSO)) {
            this.gUIECursos.show();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////\
        if (evento.getActionCommand().equalsIgnoreCase(PanelMatriculas.JBTN_INGRESAR_ESTUDIANTE)) {
            gUIEstudiantes.show();
        }
    }
    
    @Override
    public void itemStateChanged(ItemEvent event) {
        if (event.getStateChange() == ItemEvent.SELECTED) {
            
            if (event.getStateChange() == 1) {
                panelMatriculas.setBotonesEstadoAgregar(true);
            }
            
            if (event.getItem().toString().equalsIgnoreCase("-- Seleccione --")) {
                panelMatriculas.setBotonesEstadoAgregar(false);
            }
            
        }
        
    }
    
    public void setEstado_Boton_Matricula () {
       if (!panelMatriculas.getjTxtCarnetEstudianteMatricula().equalsIgnoreCase("")) {
           if (!panelMatriculas.getjTXTNombreEstudianteMatricula().equalsIgnoreCase("")) {
               if (!panelMatriculas.getjTextEdadMatricula().equalsIgnoreCase("")) {
                   if (listaCursos.isEmpty() == false) {
                       panelMatriculas.setBotonEstadoMatriculas(true);
                   }
               }
           }
       }
    }
}
