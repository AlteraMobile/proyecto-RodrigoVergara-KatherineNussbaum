package reglaNegocio;
import enumeraciones.*;
import excepciones.*;

/**
 * Clase Abstracta Persona
 * 
 * @author Katherine Nussbaum - Rodrigo Vergara
 * @version 1.0 ==> 14-04-2016 
 */

public abstract class Persona implements GlobalUsuario
{
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
     * @throws PersonaException
     * @throws Exception
     */
    Persona() throws PersonaException, Exception
    {
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
     * @param usuario String
     * @param password String
     * @throws PersonaException
     * @throws Exception
     */
    Persona( String usuario, String password ) throws PersonaException, Exception
    {
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
     * Constructor para Persona con parámetros
     * @param rut String
     * @param dv char
     * @param nombre String
     * @param apellido String
     * @param usuario String
     * @param password String
     * @param rol Rol
     * @param esAdmin boolean
     * @throws PersonaException
     * @throws Exception
     */
    Persona( String rut, char dv, String nombre, String apellido, String usuario, String password, Rol rol, boolean esAdmin ) throws PersonaException, Exception
    {
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
     * @return String rut
     */
    public String getRut()
    {
        return this.rut;
    }
    
    /**
     * Accesador para dv
     * @return char dv
     */
    public char getDv()
    {
        return this.dv;
    }
    
    /**
     * Accesador para nombre
     * @return String nombre
     */
    public String getNombre()
    {
        return this.nombre;
    }
    
    /**
     * Accesador para apellido
     * @return String apellido
     */
    public String getApellido()
    {
        return this.apellido;
    }
    
    /**
     * Accesador para usuario
     * @return String usuario
     */
    public String getUsuario()
    {
        return this.usuario;
    }
    
    /**
     * Accesador para password
     * @return String password
     */
    public String getPassword()
    {
        return this.password;
    }
    
    /**
     * Accesador para esAdmin
     * @return  boolean esAdmin
     */
    public boolean getEsAdmin()
    {
        return this.esAdmin;
    }
    
    /**
     * Accesador para rol
     * @return Rol rol
     */
    public Rol getRol()
    {
        return this.rol;
    }
    
    /**
     * Mutador para rut
     * @param rut String
     * @throws PersonaException
     * @throws Exception
     */
    public void setRut( String rut ) throws PersonaException, Exception
    {
        try
        {
            if ( rut.trim().length() >= 3 && rut.trim().length() < 9 )
            {
                this.rut = rut; 
            }
            else
            {
                throw new PersonaException( "Rut ingresado es inválido." );
            }
        }
        catch ( NullPointerException ex )
        {
            throw new NullPointerException ( "Rut no puede ser null." );
        }
        catch ( Exception ex )
        {
            throw new Exception( "Se produjo un error: " + ex.getMessage() );
        }
    }
    
    /**
     * Mutador para dv
     * @param char dv
     * @throws Exception
     */
    public void setDv( char dv ) throws Exception
    {
        try
        {
            this.dv = dv;
        }
        catch (NullPointerException ex)
        {
            throw new NullPointerException( "El digito verificador ingresado no puede ser null." );
        }
        catch( Exception ex )
        {
            throw new Exception( "Se produjo un error: " + ex.getMessage() );
        }
    }
    
    /**
     * Mutador para nombre
     * @param nombre String
     * @throws PersonaException
     * @throws Exception
     */
    public void setNombre( String nombre ) throws PersonaException, Exception
    {
        try
        {
            if ( nombre.trim().length() >= 0 && nombre.trim().length() <= 45 )
            {
                this.nombre = nombre;   
            }
            else
            {
                throw new PersonaException( "Nombre ingresado es inválido." );
            }
        }
        catch ( NullPointerException ex )
        {
            throw new NullPointerException( "El nombre ingresado no puede ser null." );
        }
        catch ( Exception ex )
        {
            throw new Exception( "Se produjo un error: " + ex.getMessage() );
        }
    }
    
    /**
     * Mutador para apellido
     * @param apellido String
     * @throws PersonaException
     * @throws Exception
     */
    public void setApellido( String apellido ) throws PersonaException, Exception
    {
        try
        {
            if (apellido.trim().length() >= 0 && apellido.trim().length() <= 30 )
            {
                this.apellido = apellido;   
            }
            else
            {
                throw new PersonaException( "Apellido ingresado es inválido." );
            }
        }
        catch ( NullPointerException ex )
        {
            throw new NullPointerException( "El apellido no puede ser null." );
        }
        catch ( Exception ex )
        {
            throw new Exception( "Se produjo un error: " + ex.getMessage() );
        }
    }
    
    /**
     * Mutador para usuario
     * @param usuario String
     * @throws PersonaException
     * @throw Exception
     */
    public void setUsuario( String usuario ) throws PersonaException, Exception
    {
        try
        {
            if ( usuario.trim().length() > 3 )
            {
                this.usuario = usuario; 
            }
            else
            {
                throw new PersonaException( "Usuario ingresado es inválido." );
            }
        }
        catch ( PersonaException ex )
        {
            throw new PersonaException( "El usuario ingresado es inválido." );
        }
        catch ( Exception ex )
        {
            throw new Exception( "Se produjo un error." + ex.getMessage() );
        }
    }
    
    /**
     * Mutador para password
     * @param password String
     * @throws PersonaException
     * @thorws Exception
     */
    public void setPassword( String password ) throws PersonaException, Exception
    {
        try
        {
            if ( password.trim().length() > 3 )
            {
                this.password = password;   
            }
            else
            {
                throw new PersonaException( "Password ingresado es inválido." );
            }
        }
        catch ( PersonaException ex )
        {
            throw new PersonaException( "El password ingresado es inválido." );
        }
        catch ( Exception ex )
        {
            throw new Exception( "Se produjo un error: " + ex.getMessage() );
        }
    }
    
    /**
     * Mutador para esAdmin
     * @param esAdmin boolean
     */
    public void setEsAdmin( boolean esAdmin )
    {
         this.esAdmin = esAdmin;
     }
    
    /**
     * Mutador para rol
     * @param rol Rol
     * @throws Exception
     */
    public void setRol( Rol rol ) throws Exception
    {
        if(rol!=null)
        {
            this.rol = rol;
        } 
        else
        {
            throw new NullPointerException( "El Rol ingresado no puede ser null." );
        }
        }
    
    
    /**
     * Método de sobreescritura toString
     * @return String
     */
    public String toString()
    {
        return "Rut: " + getRut() + "-" + getDv() + ", Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Usuario: " + getUsuario() + ", Password: " + getPassword() + ", esAdmin: " + getEsAdmin() + rol.toString() ; 
    }

    /**
     * Método implementado desde GlobalUsuario
     * @return boolean
     * @throws Exception
     */
    @Override
    public boolean login() throws Exception
    {
        return false;
    }
}
