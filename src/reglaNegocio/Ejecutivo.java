
package reglaNegocio;

import enumeraciones.Rol;
import excepciones.PersonaException;
import gui.jfrmLogin;
import static gui.jfrmLogin.contenedor;
import static gui.jfrmLogin.txtPassword;
import static gui.jfrmLogin.txtUsuario;
import java.io.BufferedWriter;
import java.util.Iterator;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * Clase Ejecutivo 
 * 
 * @author Katherine Nussbaum - Rodrigo Vergara
 * @version 3.0 ==> 02-06-2016 
 */
public class Ejecutivo extends Persona {

    private boolean obsoleto;
    private String sucursal;
    private String cadena;

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
     * @param obsoleto
     * @param esAdmin
     * @throws PersonaException
     */
    public Ejecutivo(String rut, char dv, String nombre, String apellido, String usuario, String password, String sucursal, Rol rol, boolean obsoleto ) throws PersonaException {
        setRut( rut );
        setDv( dv );
        setNombre( nombre );
        setApellido( apellido );
        setUsuario( usuario );
        setPassword( password );
        setSucursal( sucursal );
        setRol( rol );
        setEsAdmin( true );
        setObsoleto( obsoleto );
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
    public void setObsoleto(boolean obsoleto) {
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
       // Contenedor contenedor = new Contenedor();
        Iterator existe = contenedor.listadoEjecutivos().iterator();
        
        while(existe.hasNext()){
            Ejecutivo ejecutivoTmp;
            ejecutivoTmp = (Ejecutivo)existe.next();
            
            if(txtUsuario.getText().equals(ejecutivoTmp.getUsuario())
                    && txtPassword.getText().equals(ejecutivoTmp.getPassword())
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
    
    /**
     * Método que agregar Ejecutivo a la lista ejecutivo
     * @param rut
     * @param dv
     * @param nombre
     * @param apellido
     * @param usuario
     * @param password
     * @throws PersonaException
     * @throws java.io.IOException
     */
    public void agregarEjecutivoFormulario(String rut, char dv, String nombre, String apellido, String usuario, String password) throws PersonaException, IOException{
        contenedor.agregarEjecutivo(rut, dv, nombre, apellido, usuario, password);
        
        // crear carpeta archivosEjecutivos si es que no existe
        crearArchivo(rut);
        escribirArchivo(rut, dv, nombre, apellido, usuario, password);
    }
    
     /**
     * Revisar si carpeta existe, sino crea carpeta archivosEjecutivos
     * 
     * @param rut
     * 
     * @throws java.io.IOException
     */

    public void crearArchivo(String rut) throws IOException{
        try{
            File ruta = new File("src/archivosEjecutivos");
            File f = new File(ruta, rut + ".txt");
            if (!f.exists()) {
                if (!ruta.exists()) {
                    if (ruta.mkdir()) {
                        if (f.createNewFile()) {
                            JOptionPane.showMessageDialog(null, "Archivo creado correctamente.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ocurrio un error, no se pudo crear el archvio.");
                    }
                } else {
                    if (!f.createNewFile()) {
                        JOptionPane.showMessageDialog(null, "Ocurrio un error, no se pudo crear la carpeta.");
                    }
                }
            } else { 
                JOptionPane.showMessageDialog(null, "Error, este archivo ya existe.");
            }
        }
        catch(IOException ex){
            throw new IOException("Ocurrio un error al crear el archivo.");
        }
    }

    public void escribirArchivo(String rut, char dv, String nombre, String apellido, String usuario, String password) throws IOException{
        try (
            BufferedWriter escritura = new BufferedWriter(new FileWriter("src/archivosEjecutivos/" + rut + ".txt"))) {
            escritura.write("Rut: " + rut + "-" + dv + ", Nombre: " + nombre + ", Apellidos: " + apellido + ", Usuario: " + usuario + ", Password: " + password);
            escritura.flush();
        } 
        catch(IOException ex) {
            throw new IOException("Ocurrio un error al escribir el archivo.");
        }
    }
    

}
