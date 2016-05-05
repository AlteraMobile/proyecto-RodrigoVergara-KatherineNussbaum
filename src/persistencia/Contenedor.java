package persistencia;
import java.util.ArrayList;
import reglaNegocio.*;
import enumeraciones.*;
import excepciones.*;
/**
 * Clase Contenedor
 * 
 * @author (PROFE) 
 * @version :1.0
 */
public class Contenedor
{
    
   private final ArrayList<Ejecutivo> listadoEjecutivo;

   /**
    * Constructor para Contenedor sin parámetros
    * @throws PersonaException
    */
   public Contenedor() throws PersonaException 
   {
        // initialise instance variables
        listadoEjecutivo = new ArrayList<>();
        listadoEjecutivo.add(new Ejecutivo("16777400",'k',"Felipe","contreras","fcontreras","123456","Santiago",Rol.PERSONAL,true));
        listadoEjecutivo.add(new Ejecutivo("14587965",'3',"Camilo","Cofre","ccofre","654321","Santiago",Rol.ADMIN,false));
        listadoEjecutivo.add(new Ejecutivo("15258964",'1',"Constanza","Martinez","cmartinez","123456","Santiago",Rol.PERSONAL,false));
        listadoEjecutivo.add(new Ejecutivo("10403861",'1',"Katherine","Nussbaum","knuss","lola","Santiago",Rol.ADMIN,false));
   }
    
   /**
    * Método que devuelve el Array List
    * @return ArrayList
    */
   public ArrayList listadoEjecutivos(){
        return listadoEjecutivo ;    
    }
   /*
   public void agregarEjecutivo(String rut, char dv, String nombre, String apellido, String usuario, String password) throws PersonaException{
       listadoEjecutivo.add(new Ejecutivo(rut, dv, nombre, apellido, usuario, password));
   }*/
}
