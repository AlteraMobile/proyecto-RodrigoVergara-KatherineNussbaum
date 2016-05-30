
package reglaNegocio;
import excepciones.PersonaException;
import static gui.jfrmLogin.contenedor;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Clase Validación de Ingreso de Ejecutivo
 * 
 * @author Katherine Nussbaum - Rodrigo Vergara
 * @version 2.0 ==> 07-05-2016 
 */
public class ValidacionIngresoEjecutivo {
    //Contenedor cont = new Contenedor();
    ArrayList lista; 
    
    String rut;
    String password;
    String confirmaPassword;
    String usuario;

    /**
     * Constructor para ValidacionIngresoEjecutivo con 4 parámetros
     * 
     * @param rut
     * @param password
     * @param confirmaPassword
     * @param usuario
     * @throws PersonaException
     */
    public ValidacionIngresoEjecutivo(String rut, String password, String confirmaPassword, String usuario) throws PersonaException {
        setRut(rut);
        setPassword(password);
        setConfirmaPassword(confirmaPassword);
        setUsuario(usuario);  
    }
    
    /**
     * Accesador para rut
     * @return String
     */
    public String getRut() {
        return rut;
    }
    
    /**
     * Accesador para password
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /**
     * Accesador para confirmaPassword
     * @return String
     */
    public String getConfirmaPassword() {
        return confirmaPassword;
    }
    
    /**
     * Accesador para usuario
     * @return String
     */
    public String getUsuario() {
        return usuario;
    }
    
    /**
     * Mutador para rut
     * @param rut
     */
    public void setRut(String rut) {
        this.rut = rut;
    }
    
    /**
     * Mutador para password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Mutador para usuario
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    /**
     * Mutador para confirmaPassword
     * @param confirmaPassword
     */
    public void setConfirmaPassword(String confirmaPassword) {
        this.confirmaPassword = confirmaPassword;
    }
    
    /**
     * Método para validar si el rut ingresado es nuevo
     * 
     * @param rut
     * @return boolean
     */
    public boolean existeRut(String rut){
        boolean resultado = false;
        lista = contenedor.listadoEjecutivos();
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
    
    /**
     * Metodo que revisa si las contraseñas ingresadas son iguales
     * 
     * @param password
     * @param confirmaPassword
     * @return boolean
     */
    public boolean passSonIguales(String password, String confirmaPassword){
        boolean resultado;
        resultado = !password.equals(confirmaPassword);
        return resultado;
    }

    /**
     * Metodo que revisa si el usuario ingresado ya existe en la lista de ejecutivos
     * 
     * @param usuario
     * @return boolean
     */
    public boolean existeUsuario(String usuario){
           boolean resultado = false;
           lista = contenedor.listadoEjecutivos();
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
    
    /**
     * Metodo que crear el correo a mostrar de ejecutivo
     * 
     * @param rut
     * @param nombre
     * @param apellido
     * 
     * @return String
     * 
     * @throws PersonaException
     */
    public String mostrarCorreo(String rut, String nombre, String apellido) throws PersonaException{
        String correo;
        String partRut;
        String partNombre;
        String partApellido;
        int pos = apellido.length();
        
        partRut = rut.substring(rut.length()-3, rut.length());
        partNombre = nombre.substring(0, 1).toLowerCase();
        
        for(int i=0; i < apellido.length(); i++){
            char letra = apellido.charAt(i);
                if (letra == ' '){
                    pos = i;
                    break;
                }
            }
        
        partApellido = apellido.substring(0, pos).toLowerCase();
       
        correo = partRut + "." + partNombre + partApellido + "@javaCars.cl";
        
        return correo;
    }
    /**
     * Metodo para validar rut
     * @param rut
     * @return String
     */
     public static String crearDigito(String rut)
    {        
        int cantidad = rut.length();
        int factor = 2;
        int suma = 0;
        int verificador;
        String dv;
        for(int i = cantidad; i > 0; i--)
        {
            if(factor > 7)
            {
                factor = 2;
            }
            suma += (Integer.parseInt(rut.substring((i-1), i)))*factor;
            factor++;

        }
        verificador = 11 - suma%11;
        if(verificador >= 1 && verificador <= 9 )
        {
            dv = String.valueOf(verificador);
        }
        else
        {
            if(verificador == 10)
            {
                dv = "K";
            }
            else
            {
                 dv = "0";
            }
        }
        return dv;
    }  
     
     /**
      * Método para crear usuario
      * @param nombre
      * @param apellido
      * @return String
      */
    public static String crearUsuario(String nombre, String apellido){
        String usuario;
        String primerApellido;
        int numeroRandom;
        
        primerApellido = "";
        for(int i = 0; i < apellido.length(); i++){
            char espacio;
            espacio = apellido.charAt(i);
            if (espacio == ' '){
                break;
            }
            else{
                primerApellido = primerApellido + espacio;
            }
        }
        
        numeroRandom = (int) (Math.random() * 100);
        
        usuario = nombre.substring(0, 1);
        usuario = usuario + primerApellido;
        usuario = usuario + numeroRandom;
        usuario = usuario.toLowerCase();
        
        return usuario;
    }
}
