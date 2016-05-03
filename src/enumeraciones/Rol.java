package enumeraciones;

/**
 * Clase enumeración Rol
 * 
 * @author Katherine Nussbaum - Rodrigo Vergara
 * @version 1.0 ==> 14-04-2016
 */
public enum Rol {
    ADMIN("Administrador"),
    PERSONAL("Ejecutivo");
    
    private String perfil;
    
    /**
     * Constructor para Rol privado con parámetro
     * @param perfil String
     */
    private Rol(String perfil){
        setPerfil(perfil);
    }
    
    /**
     * Accesador para perfil
     * @return String
     */
    public String getPerfil(){
        return this.perfil;
    }

    /**
     * Mutador para perfil
     * @param perfil
     */
    private void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    /**
     * Método de sobreescritura toString
     * @return String
     */
    @Override
    public String toString(){
        return "Rol: " + this.name() + ", Perfil: " + getPerfil();
    }         
}
