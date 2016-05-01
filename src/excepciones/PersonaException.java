package excepciones;

/**
 * Clase PersonaException
 * 
 * @author Katherine Nussbaum - Rodrigo Vergara
 * @version 1.0 ==> 14-04-2016 
 */
public class PersonaException extends Exception
{
    private String msg;
    
    /**
     * Constructor para PersonaException
     * @param msg String
     */
    public PersonaException( String msg )
    {
        super( msg );
    }
}
