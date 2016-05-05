
package reglaNegocio;

import enumeraciones.Rol;
import excepciones.PersonaException;
import java.util.Iterator;
import persistencia.Contenedor;

/**
 * Clase Ejecutivo 
 * 
 * @author Katherine Nussbaum - Rodrigo Vergara
 * @version 1.0 ==> 14-04-2016 
 */
public class Ejecutivo extends Persona {

    private boolean obsoleto;
    private String sucursal;

    /**
     * Constructor para Ejecutivo sin parámetros
     * @throws PersonaException
     */
    Ejecutivo() throws PersonaException {
        super();
        setObsoleto(false);
        setSucursal("Santiago");
    }
    
    /**
     * Constructor para Ejecutivo con dos parámetros
     * @param usuario
     * @param password
     * @throws PersonaException
     */
    public Ejecutivo(String usuario, String password) throws PersonaException{
        super(usuario, password);
        setObsoleto(false);
        setSucursal("Santiago");
    }

    /**
     * Constructor para Ejecutivo con 6 parámetros
     * Usado para formulario de ingreso de ejecutivos nuevos
     * 
     * @param rut
     * @param dv
     * @param nombre
     * @param apellido
     * @param usuario
     * @param password
     * @throws PersonaException
     */
    public Ejecutivo(String rut, char dv, String nombre, String apellido, String usuario, String password) throws PersonaException{
        setRut( rut );
        setDv( dv );
        setNombre( nombre );
        setApellido( apellido );
        setUsuario( usuario );
        setPassword( password );
        setSucursal("Santiago");
        setRol( Rol.PERSONAL );
        setEsAdmin( false );
        setObsoleto( false );        
    }
    /**
     * Constructor para Ejecutivo con todos los parámetros
     * @param rut
     * @param dv
     * @param nombre
     * @param apellido
     * @param usuario
     * @param password
     * @param sucursal
     * @param rol
     * @param esAdmin
     * @throws PersonaException
     */
    public Ejecutivo(String rut, char dv, String nombre, String apellido, String usuario, String password, String sucursal, Rol rol, boolean esAdmin) throws PersonaException {
        setRut( rut );
        setDv( dv );
        setNombre( nombre );
        setApellido( apellido );
        setUsuario( usuario );
        setPassword( password );
        setSucursal( sucursal );
        setRol( rol );
        setEsAdmin( esAdmin );
        setObsoleto( false );
    }
    

    /**
     * Accesador para obsoleto
     * @return boolean
     */
    public boolean getObsoleto() {
        return obsoleto;
    }

    /**
     * Accesador para sucursal
     * @return String
     */
    public String getSucursal() {
        return sucursal;
    }

    /**
     * Mutador para obsoleto
     * @param obsoleto 
     */
    private void setObsoleto(boolean obsoleto) {
        this.obsoleto = obsoleto;
    }
    
    /**
     * Mutador para sucursal
     * @param sucursal 
     */
    private void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    /**
     * Método de sobreescritura, implementado desde GlobalUsuario
     * @return boolean
     * @throws PersonaException
     */
    @Override
    public boolean login() throws PersonaException {
        
        boolean retorno = false;
        Contenedor contenedor = new Contenedor();
        Iterator existe = contenedor.listadoEjecutivos().iterator();
        
        while(existe.hasNext()){
            Ejecutivo ejecutivoTmp;
            ejecutivoTmp = (Ejecutivo)existe.next();
            
            if(getUsuario().equals(ejecutivoTmp.getUsuario())
                    && getPassword().equals(ejecutivoTmp.getPassword())
                    && ejecutivoTmp.getObsoleto() == false){
                retorno =  true;
                break;
            }
            else{
                retorno = false;
            }
        }
        return retorno;
    }
    
    /**
     * Método que rescata rol y lo muestra
     * 
     * @return String
     * @throws PersonaException
     */
    public String rescatarPerfil() throws PersonaException {
        
        String muestraPerfil;
        
        if(login() == true){
            muestraPerfil = getRol().getPerfil();
            
            if(muestraPerfil.equals("Administrador")){
                setEsAdmin(true);
            }
            else{
                setEsAdmin(false);
            }
            return muestraPerfil;
        }
        else {
            return "error en rescatar el perfil";
        }
    }
    
    public void agregarEjecutivoFormulario(){
        
    }

}
