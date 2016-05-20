package persistencia;
import java.util.ArrayList;
import reglaNegocio.*;
import enumeraciones.*;
import excepciones.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * Clase de persistencia que permite controlar el manejo de datos 
 * de los ejecutivos .
 * 
 * @author (EL PROFE L.L.M.M) 
 * @version (1.0)
 */
public class EjecutivoContenedor
{
    // instance variables - replace the example below with your own
    private   static ArrayList<Ejecutivo> listadoEjecutivo = new ArrayList<Ejecutivo>();
    ArrayList<Ejecutivo> login ;
    
    /**
     * Constructor for objects of class Contenedor
     * @throws excepciones.PersonaException
     */
    public EjecutivoContenedor()throws PersonaException
    {
        
    }
    
    /**
     * Método que  carga los ejecutivos  inciiales de arrayList
	  y  retorna todos los ejecutivos en un ArrayList
     * @return 
     * @throws excepciones.PersonaException 
     */
    public ArrayList cargaInicial() throws PersonaException{
        login = new ArrayList<Ejecutivo>();
        login.add(new Ejecutivo("16777400",'k',"Felipe","contreras","fcontreras","123456",Rol.PERSONAL,"Santiago",false)); 
        login.add(new Ejecutivo("14587965",'3',"Camilo","Cofre","ccofre","654321",Rol.PERSONAL,"Santiago",true));
        login.add(new Ejecutivo("15258964",'1',"Constanza","Martinez","cmartinez","123456",Rol.ADMIN,"Santiago",false));
        
        return login;
    }
    
 
     /**
     * Método que  permite cargar a los nuevos ejecutivos que se agreguen
     * @return ArrayList
     * @throws excepciones.PersonaException
     */
    public  static  ArrayList listadoEjecutivos() throws PersonaException{
        
        //System.err.println(" Metodo listadoEjecutivo EjecutivoContenedor *   "+listadoEjecutivo.size());
        return listadoEjecutivo ;    
    }
    /**
	*Método que carga a todos los ejecutivo, los de carga inicial
	*como los agregados correctamente
	* @return  ArrayList devuelve todos los ejecutivos en ArrayList
	*/
    public ArrayList llenadoCompleto(){
        ArrayList<Ejecutivo> completo = new ArrayList<Ejecutivo>();
        try {
            if(cargaInicial().size() >0){
                completo =cargaInicial() ;
                completo.addAll(EjecutivoContenedor.listadoEjecutivos());
            }
            else {
                completo =  cargaInicial();
            }
          
        } catch (PersonaException ex) {
            Logger.getLogger(EjecutivoContenedor.class.getName()).log(Level.SEVERE, null, ex);
        }
          return completo;
    }
   /**
    * 
    * @param user
    * @param password
    * @return 
     * @throws excepciones.PersonaException 
    */
   public boolean login(String user,String password) throws PersonaException{
       
      
       // System.out.println("login "+llenarLogin() .size());
       boolean conectado=false;
       try{
        for(int x = 0 ;  x < llenadoCompleto().size();x++ ){
           Ejecutivo eje = (Ejecutivo)llenadoCompleto().get(x);
           if(eje.getUsuario().equals(user) && eje.getPassword().equals(password)){

               conectado =true;
               break;
            }
        }
       }
       catch (OutOfMemoryError ex){
           ex.printStackTrace();
       }
     
        return conectado;
   }
   /**
    * 
    * @param ejecutivo
    * @return
    * @throws PersonaException 
    */ 
   public  boolean agregarEjecutivo(Ejecutivo ejecutivo) {
        
       return true;

    }
     
    
    public  boolean buscarPorRut(String rut) throws PersonaException{
        boolean bandera=false;
         for(int x = 0 ;  x < llenadoCompleto().size();x++ ){
           Ejecutivo eje = (Ejecutivo)llenadoCompleto().get(x);
           if(!eje.getRut().equals(rut) ){
               bandera =true;
               break;
             
            }
            
               
        }
        if(bandera){
            JOptionPane.showMessageDialog(null,"Rut ya Existe");
            return bandera;
        }
        else {
            return bandera;
        }

    }
    /**
     * Método que permite validar el usuario en el array list
		Clase EjecutivoContenedor package Persistencia
     * @param usuario que se recibe desde la clase Ejecutivo
     * @return true si el ejecutivo es distinto al que existe en el ArrayList
     *          false si el ejecutivo existe
     * @throws PersonaException  lanza excepcion  personalizada
     */ 
    public  boolean buscarUsuario(String usuario) throws PersonaException{
        boolean buscar=false;
        for(int x = 0 ;  x < llenadoCompleto().size();x++ ){
           Ejecutivo eje = (Ejecutivo)llenadoCompleto().get(x);
            
           if(!eje.getUsuario().equals(usuario) ){
               buscar =true;
               break;
            }
        }
        if(!buscar){
            JOptionPane.showMessageDialog(null," Usuario ya existe");
            return buscar;
        }
        else {
            return buscar;
        }

    }

}
 