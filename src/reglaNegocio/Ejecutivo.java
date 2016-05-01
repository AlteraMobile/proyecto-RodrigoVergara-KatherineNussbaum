package reglaNegocio;
import enumeraciones.*;
import persistencia.*;
import excepciones.*;
import java.util.*;

/**
 * Clase Ejecutivo 
 * 
 * @author Katherine Nussbaum - Rodrigo Vergara
 * @version 1.0 ==> 14-04-2016 
 */
public class Ejecutivo extends Persona
{
    private boolean obsoleto;
    private String sucursal;
    
    /**
     * Constructor sin parámetros para Ejecutivo
     * @throws PersonaException
     * @throws Exception
     */
    Ejecutivo() throws PersonaException, Exception
    {
        super();
        setObsoleto( false );
        setSucursal( "Santiago" );
    }
    
    /**
     * Cosntructor para Ejecutivo con dos parámetros
     * @param usuario String
     * @param password String
     * @throws PersonaException
     * @throws Exception
     */
    Ejecutivo( String usuario, String password ) throws PersonaException, Exception
    {
        super( usuario, password );
        setObsoleto( false );
        setSucursal( "Santiago" );
    }

    /**
     * Constructor para Ejecutivo con parámetros
     *  @param rut String
     *  @param dv char
     *  @param nombre String
     *  @param apellido String
     *  @param usuario String
     *  @param password String
     *  @param sucursal String
     *  @param rol Rol
     *  @param esAdmin boolean
     *  @throws PersonaException
     *  @throws Exception
     */
    public Ejecutivo( String rut, char dv, String nombre, String apellido, String usuario, String password, String sucursal, Rol rol, boolean esAdmin ) throws PersonaException, Exception
    {
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
     * @return boolean obsoleto
     */
    public boolean getObsoleto()
    {
        return this.obsoleto;
    }
    
    /**
     * Accesador para sucursal
     * @return String sucursal
     */
    public String getSucursal()
    {
        return this.sucursal;
    }
    
    /**
     * Mutador para obsoleto 
     * @param obsoleto boolean
     */
    public void setObsoleto( boolean obsoleto )
    {
        this.obsoleto = obsoleto;
    }
    
    /**
     * Mutador para sucursal
     * @param sucursal String
     */
    public void setSucursal( String sucursal )
    {
        this.sucursal = sucursal;
    }

    /**
     * Método de sobreescritura toString
     * @return String
     */
    @Override
    public String toString()
    {
        return super.toString() + ", Obsoleto: " + getObsoleto() + ", Sucursal: " + getSucursal();
    }

    /**
     * Método implementado desde GlobalUsuario
     * @return boolean
     * @throws PersonaException
     * @throws Exception
     */
    @Override
    public boolean login() throws PersonaException, Exception
    {
        boolean retorno = false;
        Contenedor contenedor = new Contenedor();
        Iterator existe = contenedor.listadoEjecutivos().iterator();
        while( existe.hasNext() )
        {
            Ejecutivo ejecutivoTmp;
            ejecutivoTmp = ( Ejecutivo )existe.next();
            
            if( getUsuario().equals( ejecutivoTmp.getUsuario() ) 
             && getPassword().equals( ejecutivoTmp.getPassword() ) 
             && ejecutivoTmp.getObsoleto() == false )
            {
                retorno = true;
                break;
            }
            else
            {
                retorno = false;
            }
        }
        return retorno;
    }
    
    /**
     * Método que rescata rol y mostrarlo
     * @return String
     * @throws PersonaException
     * @throws Exception
     */
    public String rescatarPerfil() throws PersonaException, Exception
    {
        String muestraPerfil;
        
        if( login()== true )
        {
           muestraPerfil = getRol().getPerfil();
        
           if( muestraPerfil.equals("Administrador") )
           {
               setEsAdmin( true );                
           }
           else
           {
               setEsAdmin( false ); 
           }
           return muestraPerfil;
        }
        
        return "error en rescatar el perfil";
    }
}
