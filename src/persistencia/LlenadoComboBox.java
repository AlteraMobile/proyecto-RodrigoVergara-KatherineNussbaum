
package persistencia;

import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Katherine Nussbaum
 */

public class  LlenadoComboBox{
    private final ArrayList<String> listaColor;
    private final ArrayList<String> listaMarca;
    
    public LlenadoComboBox(){
        listaColor = new ArrayList<>();
        listaMarca = new ArrayList<>();
    }
    
    public ArrayList llenadoColor(){
        listaColor.add("rojo");
        listaColor.add("azul");
        listaColor.add("verde");
        listaColor.add("negro");
        return listaColor;
    }
    
    public ArrayList llenadoMarca(){
        listaMarca.add("Audi");
        listaMarca.add("Volkswagen");
        listaMarca.add("Fiat");
        listaMarca.add("Honda");
        return listaMarca;
    }
    
    public void cargaComboBoxColor(JComboBox cbbx){
        ArrayList<String> auto = llenadoColor();

        for(int x = 0; x < auto.size(); x++){
           cbbx.addItem(auto.get(x));
        }
    }
    
    public void cargaComboBoxMarca(JComboBox cbbx){
        ArrayList<String> auto = llenadoMarca();

        for(int x = 0; x < auto.size(); x++){
           cbbx.addItem(auto.get(x));
        }
    }
    
}
