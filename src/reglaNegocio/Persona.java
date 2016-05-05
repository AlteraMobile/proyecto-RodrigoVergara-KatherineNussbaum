
package reglaNegocio;

import enumeraciones.Rol;
import excepciones.PersonaException;

/**
 * Clase Abstracta Persona
 * 
 * @author Katherine Nussbaum - Rodrigo Vergara
 * @version 2.0 ==> 05-05-2016 
 */

public abstract class Persona implements GlobalUsuario {

    private String rut;
    private char dv;
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private Rol rol;
    private boolean esAdmin;

    /**
     * Constructor para Persona sin parámetros
     * 
     * @throws PersonaException 
     */
    
    Persona() throws PersonaException {
        setRut( "15258964" );
        setDv( '1' );
        setNombre( "Constanza" );
        setApellido( "Martinez" );
        setUsuario( "cmartinez" );
        setPassword( "123456" );
        setRol( Rol.PERSONAL );
        setEsAdmin( false );
    }

    /**
     * Constructor para Persona con dos parámetros
     * 
     * @param usuario
     * @param password
     * 
     * @throws PersonaException 
     */
    Persona(String usuario, String password) throws PersonaException {
        setRut( "15258964" );
        setDv( '1' );
        setNombre( "Constanza" );
        setApellido( "Martinez" );
        setUsuario( usuario );
        setPassword( password );
        setRol( Rol.PERSONAL );
        setEsAdmin( false );
    }
    
    /**
     * Constructor para Persona con todos los parámetros
     * 
     * @param rut
     * @param dv
     * @param nombre
     * @param apellido
     * @param usuario
     * @param password
     * @param rol
     * @param esAdmin
     * 
     * @throws PersonaException
     */
    Persona(String rut, char dv, String nombre, String apellido, String usuario, String password, Rol rol, boolean esAdmin) throws PersonaException {
        setRut( rut );
        setDv( dv );
        setNombre( nombre );
        setApellido( apellido );
        setUsuario( usuario );
        setPassword( password );
        setRol( rol );
        setEsAdmin( esAdmin );
    }
    
    /**
     * Accesador para rut
     * @return String
     */
     public String getRut() {
        return rut;
    }
    
    /**
     * Accesador para dv
     * @return char
     */
    public char getDv() {
        return dv;
    }

    /**
     * Accesador para nombre
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Accesador para Apellido
     * @return String
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Accesador para usuario
     * @return String
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Accesador para password
     * @return String
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Accesador para rol
     * @return Rol
     */
    public Rol getRol() {
        return rol;
    }

    /**
     * Accesador para esAdmin
     * @return boolean
     */
    public boolean getEsAdmin() {
        return esAdmin;
    }

    /**
     * Mutador para rut
     * @param rut
     * @throws PersonaException 
     */
    public void setRut(String rut) throws PersonaException {
        try{
            if(rut.trim().length() >= 3 && rut.trim().length() < 9){
                this.rut = rut;
            }
            else{
                throw new PersonaException("Rut ingresado es inválido.");
            }
        }
        catch(NullPointerException ex){
            throw new NullPointerException("Rut no puede ser null.");
        }
    }

    /**
     * Mutador para dv
     * @param dv
     */
    public void setDv(char dv) {
        try{
            this.dv = dv;
        }
        catch(NullPointerException ex){
            throw new NullPointerException("El digito verificador ingresado no puede ser null.");
        }
    }

    /**
     * Mutador para nombre
     * @param nombre
     * @throws PersonaException 
     */
    public void setNombre(String nombre) throws PersonaException {
       try{
           if(nombre.trim().length() >= 0 && nombre.trim().length() <= 45){
               this.nombre = nombre;
           }
           else{
               throw new PersonaException("Nombre ingresado es inválido.");
           }
       }
       catch(NullPointerException ex){
           throw new NullPointerException("El nombre ingresado no puede ser null.");
       }
    }

    /**
     * Mutador para apellido
     * @param apellido
     * @throws PersonaException
     */
    public void setApellido(String apellido) throws PersonaException {
        try{
            if(apellido.trim().length() >= 0 && apellido.trim().length() <= 30){
                this.apellido = apellido;
            }
            else{
                throw new PersonaException("Apellido ingresado es inválido.");
            }
        }
        catch(NullPointerException ex){
            throw new NullPointerException("El apellido no puede ser null.");
        }
    }

    /**
     * Mutador para usuario
     * @param usuario
     * @throws PersonaException
     */
    public void setUsuario(String usuario) throws PersonaException {
        try{
            if(usuario.trim().length() > 3){
                this.usuario = usuario;
            }
            else{
                throw new PersonaException("Usuario ingresado es inválido.");
            }
        }
        catch(NullPointerException ex){
            throw new NullPointerException("El usuario ingresado no puede ser null.");
        }
    }

    /**
     * Mutador para password
     * @param password
     * @throws PersonaException
     */
    public void setPassword(String password) throws PersonaException {
        try{
            if(password.trim().length() > 3){
                this.password = password;
            }
            else{
                throw new PersonaException("Password ingresado es inválido.");
            }
        }
        catch(NullPointerException ex){
            throw new NullPointerException("El password ingresado no puede ser null.");
        }
    }

    /**
     * Mutador para rol
     * @param rol
     */
    public void setRol(Rol rol) {
         if(rol != null){
             this.rol = rol;
         }
         else{
             throw new NullPointerException("El Rol ingresado no puede ser null.");
         }
    }

    /**
     * Mutador para esAdmin
     * @param esAdmin 
     */
    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    /**
     * Método de sobre escritura to String
     * @return String
     */
    @Override
    public String toString(){
        return "Rut: " + getRut() + "-" + getDv() + ", Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Usuario: " + getUsuario() + ", Password: " + getPassword() + ", esAdmin: " + getEsAdmin() + rol.toString();
    }
    
    /**
     *Método de sobreescritura, implementado desde GlobalUsuario
     * @return boolean
     * @throws PersonaException
     */
    @Override
    public boolean login() throws PersonaException{
        return false;
    }
}
