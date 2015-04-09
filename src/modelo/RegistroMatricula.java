/**
 * Se encarga de agregar y modificar los datos del objeto matricula en una lista
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author vini
 */
public class RegistroMatricula {

    private ArrayList<Matricula> listaMatricula;

//------------------------------------------------
    public RegistroMatricula() {
        listaMatricula = new ArrayList<Matricula>();
    }
//-------------------------------------------------

    ///////////////////////////////////////////////////
    /**
     *
     * @param matricula
     * @return String mensaje
     */
    public String agregar(Matricula matricula) {
        int index = 0;
            for ( index = 0; index < listaMatricula.size(); index++) {
                if (listaMatricula.get(index).getEstudiante().getCarnet().equalsIgnoreCase(matricula.getEstudiante().getCarnet())) {
                    return "Este estudiante ya se encuentra matriculado";
                }
            }
            listaMatricula.add(index, matricula);
                        
        return "Matricula realizada";
    }

    /////////////////////////////////////////////////////
    /**
     *
     * @param carnet
     * @return objeto Matricula
     */
    public Matricula buscar(String carnet) {
        if (listaMatricula.isEmpty() == false) {
            for (int index = 0; index < listaMatricula.size(); index++) {
                if (listaMatricula.get(index).getEstudiante().getCarnet().equalsIgnoreCase(carnet)) {
                    return listaMatricula.get(index);
                }
            }
        }
        return null;
    }

}
