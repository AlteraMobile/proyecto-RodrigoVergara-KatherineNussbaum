
package reglaNegocio;
import excepciones.PersonaException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import persistencia.Contenedor;
/**
 *
 * @author KTY
 */
public class ValidacionIngresoEjecutivo {
    Contenedor cont = new Contenedor();
    ArrayList lista; 

    public ValidacionIngresoEjecutivo(String rut, String password, String confirmaPassword, String usuario) throws PersonaException {
        
        if(existeRut(rut)){
            JOptionPane.showMessageDialog(null, "El rut ingresado ya esta registrado.");
        }
        else if(passSonIguales(password, confirmaPassword)){
            JOptionPane.showMessageDialog(null, "Los passwords ingresados no son iguales.");
        }
        else if(existeUsuario(usuario)){
            JOptionPane.showMessageDialog(null, "El usuario ingresado ya existe, escoja otro.");
        }
        else{
             
        }
    }

    public boolean existeRut(String rut){
        boolean resultado = false;
        lista = cont.listadoEjecutivos();
        Iterator<Ejecutivo> it = lista.iterator();
        while(it.hasNext()){
            Ejecutivo ejecutivo= it.next();
            if(ejecutivo.getRut().equals(rut)){
                resultado = true;
                break;
            }
            else{
                resultado = false;
            }
        }
        return resultado;
    }
    
    public boolean passSonIguales(String password, String confirmaPassword){
        boolean resultado = false;
        if(password.equals(confirmaPassword)){
            resultado = false;
        }
        else{
            resultado = true;
        }
        return resultado;
    }

    public boolean existeUsuario(String usuario){
           boolean resultado = false;
           lista = cont.listadoEjecutivos();
           Iterator<Ejecutivo> it = lista.iterator();
           while(it.hasNext()){
               Ejecutivo ejecutivo= it.next();
               if(ejecutivo.getUsuario().equals(usuario)){
                   resultado = true;
                   break;
               }
               else{
                   resultado = false;
               }
           }
           return resultado;
       }
}
