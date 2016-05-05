
package persistencia;

import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 * Clase LlenadoComboBox
 * 
 * @author Katherine Nussbaum - Rodrigo Vergara
 * @version 2.0 ==> 05-05-2016 
 */

public class  LlenadoComboBox{
    private final ArrayList<String> listaColor;
    private final ArrayList<String> listaMarca;
    
    /**
     * Constructor de LlenadoComboBox sin parámetros
     */
    public LlenadoComboBox(){
        listaColor = new ArrayList<>();
        listaMarca = new ArrayList<>();
    }
    
    /**
     * Creador llenadoColor
     * @return ArrayList
     */
    public ArrayList llenadoColor(){
        listaColor.add("rojo");
        listaColor.add("azul");
        listaColor.add("verde");
        listaColor.add("negro");
        return listaColor;
    }
    /**
     * Creador llenadMarca
     * @return ArrayList
     */
    public ArrayList llenadoMarca(){
        listaMarca.add("Audi");
        listaMarca.add("Volkswagen");
        listaMarca.add("Fiat");
        listaMarca.add("Honda");
        return listaMarca;
    }
    
    /**
     * Carga lista color en comboBox a eleccion
     * @param cbbx
     */
    public void cargaComboBoxColor(JComboBox cbbx){
        ArrayList<String> auto = llenadoColor();

        for(int x = 0; x < auto.size(); x++){
           cbbx.addItem(auto.get(x));
        }
    }
    /**
     * Carga lista marca en comboBox a eleccion
     * @param cbbx
     */
    public void cargaComboBoxMarca(JComboBox cbbx){
        ArrayList<String> auto = llenadoMarca();

        for(int x = 0; x < auto.size(); x++){
           cbbx.addItem(auto.get(x));
        }
    }
}
