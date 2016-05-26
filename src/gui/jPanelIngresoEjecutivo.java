
package gui;

import excepciones.PersonaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import reglaNegocio.Ejecutivo;
import reglaNegocio.ValidacionIngresoEjecutivo;

/**
 * Panel jPanelIngresoEjecutivo
 * 
 * @author Katherine Nussbaum - Rodrigo Vergara
 * @version 3.0 ==> 29-05-2016 
 */
public class jPanelIngresoEjecutivo extends javax.swing.JPanel {

    /**
     * Constructor jPanelIngresoEjecutivo
     */
    public jPanelIngresoEjecutivo() {
        initComponents();
        txtCorreo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        lblRut1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblGuion = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmaPassword = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        txtDv = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmaPassword = new javax.swing.JPasswordField();
        txtCorreo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblCorreo = new javax.swing.JLabel();
        btnLimpiarNuevoEjecutivo = new javax.swing.JButton();

        lblTitulo.setText("Ingreso Ejecutivo");

        lblNombres.setText("Nombres");

        lblApellidos.setText("Apellidos");

        lblRut.setText("Rut");

        lblRut1.setText("-");

        lblUsuario.setText("Usuario");

        lblGuion.setText("-");

        lblPassword.setText("Password");

        lblConfirmaPassword.setText("Confirma Password");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtDv.setEditable(false);

        txtCorreo.setEditable(false);
        txtCorreo.setOpaque(false);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiarNuevoEjecutivo.setText("Limpiar");
        btnLimpiarNuevoEjecutivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarNuevoEjecutivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarNuevoEjecutivo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblRut1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblConfirmaPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCorreo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreo)
                            .addComponent(txtUsuario)
                            .addComponent(txtPassword)
                            .addComponent(txtConfirmaPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(151, 151, 151)
                    .addComponent(lblGuion)
                    .addContainerGap(421, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombres)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidos)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRut)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRut1)
                            .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConfirmaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConfirmaPassword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiarNuevoEjecutivo))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(lblGuion)
                    .addContainerGap(89, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            String mensaje;
            mensaje = "";
    
            if(txtNombre.getText().trim().equals("")){
                mensaje = "Nombre";
                //JOptionPane.showMessageDialog(null, "Ingrese Nombre.");
            }
            if(txtApellido.getText().trim().equals("")){
                if( !"".equals(mensaje) ){
                    mensaje = mensaje + ", ";
                }
                mensaje = mensaje + "Apellido";
                //JOptionPane.showMessageDialog(null, "Ingrese Apellido.");
            }
            if(txtRut.getText().trim().equals("")){
                 if( !"".equals(mensaje) ){
                    mensaje = mensaje + ", ";
                }
                mensaje = mensaje + "Rut";
               //JOptionPane.showMessageDialog(null, "Ingrese Rut.");
            }
            if(txtUsuario.getText().trim().equals("")){
                
                //JOptionPane.showMessageDialog(null, "Ingrese Usuario.");
            }
            if(new String(txtPassword.getPassword()).equals("")){
                 if( !"".equals(mensaje) ){
                    mensaje = mensaje + ", ";
                }
                mensaje = mensaje + "Password";
                //JOptionPane.showMessageDialog(null, "Ingrese Password.");
            }
            if(new String(txtConfirmaPassword.getPassword()).equals("")){
                 if( !"".equals(mensaje) ){
                    mensaje = mensaje + ", ";
                }
                mensaje = mensaje + "Confirma Password";
                //JOptionPane.showMessageDialog(null, "Ingrese Confirma Password.");
            }
            if ( !"".equals(mensaje) ){
                JOptionPane.showMessageDialog(null, "Campo Vacío: " + mensaje);
            }
            else if( "".equals(mensaje) ){
                
                if( txtNombre.getText().trim().length() < 3 ){
                    mensaje = "El Nombre debe tener al menos 3 letras.";
                }
                
            }
            else{
                
                char dv = txtDv.getText().charAt(0);
                String nombre = txtNombre.getText().trim();
                String apellido = txtApellido.getText().trim();
                String rut = txtRut.getText().trim();
                String usuario = txtUsuario.getText().trim();
                String password = new String(txtPassword.getPassword());
                String confirmaPassword = new String(txtConfirmaPassword.getPassword());
                
                ValidacionIngresoEjecutivo val = new ValidacionIngresoEjecutivo(rut, password, confirmaPassword, usuario);
                
                if(val.existeRut(rut)){
                    JOptionPane.showMessageDialog(null, "El rut ingresado ya esta registrado.");
                }
                else if(val.passSonIguales(password, confirmaPassword)){
                    JOptionPane.showMessageDialog(null, "Los passwords ingresados no son iguales.");
                }
                else if(val.existeUsuario(usuario)){
                    JOptionPane.showMessageDialog(null, "El usuario ingresado ya existe, escoja otro.");
                }
                else{
                    
                    Ejecutivo ejecutivoNuevo = new Ejecutivo(rut, dv, nombre, apellido, usuario, password);
                    ejecutivoNuevo.agregarEjecutivoFormulario(rut, dv, nombre, apellido, usuario, password);
                    //add(txtCorreo);
                    txtCorreo.setText(val.mostrarCorreo(rut, nombre, apellido));
                    txtCorreo.setVisible(true);
                    txtCorreo.setEditable(false);
                    lblCorreo.setText("Correo");
                    this.revalidate();
                    this.repaint();
                }
            }
        } catch (PersonaException ex) {
            Logger.getLogger(jPanelIngresoEjecutivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarNuevoEjecutivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarNuevoEjecutivoActionPerformed
        txtDv.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtRut.setText(null);
        txtUsuario.setText(null);
        txtPassword.setText(null);
        txtConfirmaPassword.setText(null);
    }//GEN-LAST:event_btnLimpiarNuevoEjecutivoActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char car = evt.getKeyChar();
        String cadena = (""+car).toLowerCase();
        car = cadena.charAt(0);
        evt.setKeyChar(car);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char car = evt.getKeyChar();
        String cadena = (""+car).toLowerCase();
        car = cadena.charAt(0);
        evt.setKeyChar(car);
    }//GEN-LAST:event_txtApellidoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiarNuevoEjecutivo;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblConfirmaPassword;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblGuion;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblRut1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtConfirmaPassword;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDv;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
