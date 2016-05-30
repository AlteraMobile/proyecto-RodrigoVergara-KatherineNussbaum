/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import excepciones.PersonaException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import persistencia.Contenedor;
import reglaNegocio.Ejecutivo;


/**
 *
 * @author rvergara
 */
public class JtableModelo extends AbstractTableModel  {
    ArrayList<Ejecutivo> todosEjecutivos;  
    String[] nombrecolumna = {"Nombre","Apellido","RUT","Usuario","Eliminado"};

/**
    * Constructor para JtableModelo sin parametros
    */
   public JtableModelo(){
       todosEjecutivos = Contenedor.listadoEjecutivos();
   }   
    
    
    @Override
    public int getRowCount() {
       return todosEjecutivos.size();
    }

    @Override
    public int getColumnCount() {
        return nombrecolumna.length;
            }
    /**
     *
     * @author rvergara
     * @param rowIndex
     * @param columnIndex
     * @return 
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ejecutivo tmpEjecutivo=(Ejecutivo) todosEjecutivos.get(rowIndex);
        switch(columnIndex){
            case 0:
                return tmpEjecutivo.getNombre();
            case 1:
                return tmpEjecutivo.getApellido();
            case 2:
                return tmpEjecutivo.getRut();
            case 3:
                return tmpEjecutivo.getUsuario();
            case 4:
                return  tmpEjecutivo.getObsoleto();
            default:
                return null;
        }
    }
    
 /**
 *
 * @author rvergara
     * @param col
     * @return 
 */        
@Override
    public Class getColumnClass(int col){
     return getValueAt(0,col).getClass();
    }
 /**
 *
 * @author rvergara
 * @param col
 * @return 
 */   
    @Override
   public String getColumnName(int col){
       return nombrecolumna [col];
   } 
      /**
     *
     * @author rvergara
     * @param dato
     */
    @Override
    public void setValueAt(Object dato, int rowIndex, int columnIndex) {
        try {
            Ejecutivo tmpEjecutivo=(Ejecutivo) todosEjecutivos.get(rowIndex);
            switch(columnIndex){
                case 0:
                    tmpEjecutivo.setNombre(dato.toString());
                case 1:
                    tmpEjecutivo.setApellido(dato.toString());
                case 2:
                    tmpEjecutivo.setRut(dato.toString());
                case 3:
                    tmpEjecutivo.setUsuario(dato.toString());
                case 4:
                    tmpEjecutivo.setObsoleto(Boolean.parseBoolean(dato.toString()));
            }
            fireTableCellUpdated(rowIndex, columnIndex);
        } catch (PersonaException ex) {
            Logger.getLogger(JtableModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     /**
 *
 * @author rvergara
 * @param col
 * @param row
 * @return 
 */   
    @Override
   public boolean isCellEditable(int row,int col){
       return (col==4);
       
   }
}


